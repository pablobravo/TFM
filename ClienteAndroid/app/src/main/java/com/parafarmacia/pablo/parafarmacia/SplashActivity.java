package com.parafarmacia.pablo.parafarmacia;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.parafarmacia.pablo.parafarmacia.model.Pedido;
import com.parafarmacia.pablo.parafarmacia.model.Producto;
import com.parafarmacia.pablo.parafarmacia.model.Usuario;
import com.parafarmacia.pablo.parafarmacia.persistence.PedidosDataSource;
import com.parafarmacia.pablo.parafarmacia.persistence.ProductosDataSource;
import com.parafarmacia.pablo.parafarmacia.persistence.UsuariosDataSource;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 5000;
    private static final String NAMESPACE = "http://parafarmacia.business.ws.impl/";

    private static final String URL ="http://156.35.98.11:8800/WS.Parafarmacia/parafarmacia?wsdl";
    private static final String SOAP_ACTION_PEDIDOS = "http://parafarmacia.business.ws.impl/IParafarmaciaWS/getPedidosRequest";
    private static final String SOAP_ACTION_PRODUCTOS = "http://parafarmacia.business.ws.impl/IParafarmaciaWS/getProductosRequest";
    private static final String SOAP_ACTION_USUARIOS = "http://parafarmacia.business.ws.impl/IParafarmaciaWS/getUsuariosRequest";
    private static final String METHOD_NAME_PEDIDOS = "getPedidos";
    private static final String METHOD_NAME_PRODUCTOS = "getProductos";
    private static final String METHOD_NAME_USUARIOS = "getUsuarios";

    private String TAG ="Vik";
    private String resultadoPedidos;
    private String resultadoProductos;
    private String resultadoUsuarios;
    private String servicioActivo;

    private TextView tv;


    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private List<Producto> productos = new ArrayList<Producto>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        tv = (TextView) findViewById(R.id.textView);
        servicioActivo = "true";

        if(compruebaConexion(this)) {
            AsyncCallWS task = new AsyncCallWS();
            task.execute();
        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                mainIntent.putExtra("activo", servicioActivo);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private class AsyncCallWS extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Log.i(TAG, "doInBackground");
            getAll();
            parsePedidos(resultadoPedidos);
            parseProductos(resultadoProductos);
            parseUsuarios(resultadoUsuarios);

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

        }

        @Override
        protected void onPreExecute() {
            Log.i(TAG, "onPreExecute");
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            Log.i(TAG, "onProgressUpdate");
        }

        private void parsePedidos(String result) {

            String [] cargarDatos=result.split("return=anyType\\{");

            PedidosDataSource pds = new PedidosDataSource(getApplicationContext());
            pds.open();

            for (int i = 1; i < cargarDatos.length; i++) {
                String datosEvento[]=cargarDatos[i].split(";");

                String campoEvento[]=datosEvento[0].split("=");
                String campoEvento2[]=datosEvento[1].split("=");
                String campoEvento3[]=datosEvento[2].split("=");
                String campoEvento4[]=datosEvento[3].split("=");
                String campoEvento5[]=datosEvento[4].split("=");
                String campoEvento6[]=datosEvento[5].split("=");

                Pedido pedido= new Pedido(Integer.parseInt(campoEvento3[1]),
                        Integer.parseInt(campoEvento5[1]), Integer.parseInt(campoEvento4[1]),
                        Integer.parseInt(campoEvento6[1]), campoEvento2[1], campoEvento[1]);
                pedidos.add(pedido);


            }

            if(pedidos.size()>0) {
                pds.deleteAllPedidos();

                for (int i = 0; i < pedidos.size(); i++) {
                    pds.insertPedido(pedidos.get(i));
                }
            }
            else{
                servicioActivo = "false";
            }
            pds.close();
        }

        private void parseProductos(String result) {
            String [] cargarDatos=result.split("return=anyType\\{");

            ProductosDataSource pds = new ProductosDataSource(getApplicationContext());
            pds.open();

            for (int i = 1; i < cargarDatos.length; i++) {
                String datosEvento[]=cargarDatos[i].split(";");

                String campoEvento[]=datosEvento[0].split("=");
                String campoEvento2[]=datosEvento[1].split("=");
                String campoEvento3[]=datosEvento[2].split("=");
                String campoEvento4[]=datosEvento[3].split("=");
                String campoEvento5[]=datosEvento[4].split("=");
                String campoEvento6[]=datosEvento[5].split("=");

                Producto producto= new Producto(Integer.parseInt(campoEvento4[1]),
                        campoEvento5[1], campoEvento3[1],
                        Double.parseDouble(campoEvento6[1]), Integer.parseInt(campoEvento[1]), campoEvento2[1]);
                productos.add(producto);


            }
            if(productos.size()>0) {
                pds.deleteAllProductos();

                for (int i = 0; i < productos.size(); i++) {
                    pds.insertProducto(productos.get(i));
                }
            }
            else{
                servicioActivo = "false";
            }
            pds.close();
        }

        private void parseUsuarios(String result) {
            String [] cargarDatos=result.split("return=anyType\\{");

            UsuariosDataSource pds = new UsuariosDataSource(getApplicationContext());
            pds.open();

            for (int i = 1; i < cargarDatos.length; i++) {
                String datosEvento[]=cargarDatos[i].split(";");

                String campoEvento[]=datosEvento[0].split("=");
                String campoEvento2[]=datosEvento[1].split("=");
                String campoEvento3[]=datosEvento[2].split("=");
                String campoEvento4[]=datosEvento[3].split("=");
                String campoEvento5[]=datosEvento[4].split("=");
                String campoEvento6[]=datosEvento[5].split("=");
                String campoEvento8[]=datosEvento[7].split("=");

                Usuario usuario= new Usuario(Integer.parseInt(campoEvento5[1]),
                        campoEvento6[1], campoEvento4[1], campoEvento2[1],
                        campoEvento3[1], campoEvento[1], campoEvento8[1]);
                usuarios.add(usuario);
            }

            if(usuarios.size()>0) {
                pds.deleteAllUsuarios();

                for (int i = 0; i < usuarios.size(); i++) {
                    pds.insertUsuario(usuarios.get(i));
                }
                pds.close();
            }
            else{
                servicioActivo = "false";
            }
        }
    }

    public void getAll(){
        SoapObject requestPedidos = new SoapObject(NAMESPACE, METHOD_NAME_PEDIDOS);
        SoapObject requestUsuarios = new SoapObject(NAMESPACE, METHOD_NAME_USUARIOS);
        SoapObject requestProductos = new SoapObject(NAMESPACE, METHOD_NAME_PRODUCTOS);


        SoapSerializationEnvelope envelopePedidos = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelopePedidos.setOutputSoapObject(requestPedidos);

        SoapSerializationEnvelope envelopeUsuarios = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelopeUsuarios.setOutputSoapObject(requestUsuarios);

        SoapSerializationEnvelope envelopeProductos = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelopeProductos.setOutputSoapObject(requestProductos);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {

            androidHttpTransport.call(SOAP_ACTION_USUARIOS, envelopeUsuarios);
            SoapObject resultsRequestSOAPUsuarios = (SoapObject) envelopeUsuarios.bodyIn;

            resultadoUsuarios =resultsRequestSOAPUsuarios.toString();

            androidHttpTransport.call(SOAP_ACTION_PEDIDOS, envelopePedidos);
            SoapObject resultsRequestSOAPPedidos = (SoapObject) envelopePedidos.bodyIn;

            resultadoPedidos =resultsRequestSOAPPedidos.toString();

            androidHttpTransport.call(SOAP_ACTION_PRODUCTOS, envelopeProductos);
            SoapObject resultsRequestSOAPProductos = (SoapObject) envelopeProductos.bodyIn;

            resultadoProductos =resultsRequestSOAPProductos.toString();


        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public static boolean compruebaConexion(Context context) {

        boolean connected = false;

        ConnectivityManager connec = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        // Recupera todas las redes (tanto móviles como wifi)
        NetworkInfo[] redes = connec.getAllNetworkInfo();

        for (int i = 0; i < redes.length; i++) {
            // Si alguna red tiene conexión, se devuelve true
            if (redes[i].getState() == NetworkInfo.State.CONNECTED) {
                connected = true;
            }
        }
        return connected;
    }
}
