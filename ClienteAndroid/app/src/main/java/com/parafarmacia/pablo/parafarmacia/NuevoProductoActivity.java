package com.parafarmacia.pablo.parafarmacia;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.parafarmacia.pablo.parafarmacia.model.Producto;
import com.parafarmacia.pablo.parafarmacia.persistence.ProductosDataSource;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class NuevoProductoActivity extends AppCompatActivity {

    private static final String NAMESPACE = "http://parafarmacia.business.ws.impl/";

    private static final String URL ="http://156.35.98.11:8800/WS.Parafarmacia/parafarmacia?wsdl";
    private static final String SOAP_ACTION_ADD_PRODUCTO = "http://parafarmacia.business.ws.impl/IParafarmaciaWS/newProductoDatos";
    private static final String METHOD_NAME_ADD_PRODUCTO = "newProductoDatos";

    private String TAG ="Vik";

    TextView nombre, descripcion, precio;
    Switch cantidad;
    Spinner categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_producto);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nombre = (TextView) findViewById(R.id.etNombre);
        descripcion = (TextView) findViewById(R.id.etDescripcion);
        precio = (TextView) findViewById(R.id.etPrecio);
        cantidad = (Switch) findViewById(R.id.swDisponible);
        categoria = (Spinner) findViewById(R.id.spCategoria);
    }

    public void addProducto(View v) {
        AsyncCallWS task = new AsyncCallWS();
        task.execute();
        Toast.makeText(this.getApplicationContext(), "Producto añadido correctamente", Toast.LENGTH_SHORT).show();
    }


    private class AsyncCallWS extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Log.i(TAG, "doInBackground");
            addProducto();

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


        public void addProducto() {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME_ADD_PRODUCTO);

            request.addProperty("nombre", nombre.getText().toString());
            request.addProperty("descripcion", descripcion.getText().toString());
            request.addProperty("precio", precio.getText().toString());
            int valor = 0;
            if(cantidad.isChecked()) {
                request.addProperty("cantidad", "1");
                valor = 1;
            }
            else{
                request.addProperty("cantidad", "0");
            }
            request.addProperty("categoria", String.valueOf(categoria.getSelectedItem()));

            ProductosDataSource pds = new ProductosDataSource(getApplicationContext());
            pds.open();
            pds.insertProducto(new Producto(nombre.getText().toString(), descripcion.getText().toString(), Double.parseDouble(precio.getText().toString()), valor, String.valueOf(categoria.getSelectedItem())));
            pds.close();


            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(request);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);


            try {

                androidHttpTransport.call(SOAP_ACTION_ADD_PRODUCTO, envelope);

            } catch (Exception e) {
                System.out.println("Error addProducto: " + e);
            }
        }
    }
}
