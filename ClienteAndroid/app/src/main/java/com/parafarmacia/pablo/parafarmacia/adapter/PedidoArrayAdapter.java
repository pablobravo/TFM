package com.parafarmacia.pablo.parafarmacia.adapter;

import android.content.Context;

import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


import com.parafarmacia.pablo.parafarmacia.R;
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

import java.util.List;
import java.util.Map;

/**
 * Created by pablo on 19/03/2018.
 */

public class PedidoArrayAdapter extends ArrayAdapter<Pedido> implements
        View.OnClickListener {
    private LayoutInflater layoutInflater;
    protected String estado;
    protected int idusuario;
    protected String fecha;

    private static final String NAMESPACE = "http://parafarmacia.business.ws.impl/";

    private static final String URL ="http://156.35.98.11:8800/WS.Parafarmacia/parafarmacia?wsdl";
    private static final String SOAP_ACTION = "http://parafarmacia.business.ws.impl/IParafarmaciaWS/updatePedido";
    private static final String METHOD_NAME = "updatePedido";

    private String TAG ="Vik";

    public PedidoArrayAdapter(Context context, List<Pedido> objects) {
        super(context, 0, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if (convertView == null) {
            holder = new Holder();

            convertView = layoutInflater.inflate(R.layout.row_pedidos, null);
            holder.setTvFecha((TextView) convertView.findViewById(R.id.tvFecha));
            holder.setTvEstado((TextView) convertView.findViewById(R.id.tvEstado));
            holder.setTvProductos((TextView) convertView.findViewById(R.id.tvProductos));
            holder.setTvDatosEnvio((TextView) convertView.findViewById(R.id.tvDatosEnvio));
            holder.setBtPreparando((Button) convertView.findViewById(R.id.btPreparando));
            holder.setBtEnviado((Button) convertView.findViewById(R.id.btEnviado));
            holder.setBtEntregado((Button) convertView.findViewById(R.id.btEntregado));
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        final Pedido row = getItem(position);
        holder.getTvFecha().setText(row.getFecha());
        holder.getTvEstado().setText("Estado: " + row.getEstado());

        String listaProductos = "";


        ProductosDataSource pds = new ProductosDataSource(convertView.getContext());
        pds.open();
        Map<Integer, Integer> productos = row.getProductos();
        for (Map.Entry<Integer, Integer> prs : productos.entrySet()) {
            Integer idproducto = prs.getKey();
            Integer cantidad = prs.getValue();
            Producto producto = pds.getProducto(idproducto);
            listaProductos += cantidad + " X " + producto.getNombre() + "\nSubtotal: " + producto.getPrecio() * cantidad + "€ \n\n";
        }
        pds.close();

        holder.getTvProductos().setText(listaProductos);

        UsuariosDataSource pdsu = new UsuariosDataSource(convertView.getContext());
        pdsu.open();
        Usuario usuario = pdsu.getUsuario(row.getIdUsuario());
        pdsu.close();

        holder.getTvDatosEnvio().setText("Nombre:\t" + usuario.getNombre() + " \nProvincia:\t" + usuario.getProvincia() +
                " \nCiudad:\t" + usuario.getCiudad() + " \nDirección:\t" + usuario.getDireccion() + " \nC.P.: \t" + usuario.getCodpostal());


        final Holder finalHolder = holder;
        final View finalConvertView = convertView;
        holder.getBtPreparando().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                idusuario=row.getIdUsuario();
                fecha = row.getFecha();
                estado = "Preparando";
                finalHolder.getTvEstado().setText("Estado: preparando");
                PedidosDataSource pds = new PedidosDataSource(finalConvertView.getContext());
                pds.open();
                pds.updateEstadoPedido(estado, idusuario, fecha);
                pds.close();
                AsyncCallWS task = new AsyncCallWS();
                task.execute();
            }
        });


        holder.getBtEnviado().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                idusuario=row.getIdUsuario();
                fecha = row.getFecha();
                estado = "Enviado";
                finalHolder.getTvEstado().setText("Estado: enviado");
                PedidosDataSource pds = new PedidosDataSource(finalConvertView.getContext());
                pds.open();
                pds.updateEstadoPedido(estado, idusuario, fecha);
                pds.close();
                AsyncCallWS task = new AsyncCallWS();
                task.execute();
            }
        });

        holder.getBtEntregado().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                idusuario=row.getIdUsuario();
                fecha = row.getFecha();
                estado = "Entregado";
                finalHolder.getTvEstado().setText("Estado: entregado");
                PedidosDataSource pds = new PedidosDataSource(finalConvertView.getContext());
                pds.open();
                pds.updateEstadoPedido(estado, idusuario, fecha);
                pds.close();
                AsyncCallWS task = new AsyncCallWS();
                task.execute();
            }
        });


        return convertView;
    }


    @Override
    public void onClick(View v) {

    }


    static class Holder {
        TextView tvFecha;
        TextView tvEstado;
        TextView tvProductos;
        TextView tvDatosEnvio;
        Button btPreparando;
        Button btEnviado;
        Button btEntregado;

        public TextView getTvFecha() {
            return tvFecha;
        }

        public void setTvFecha(TextView tvFecha) {
            this.tvFecha = tvFecha;
        }

        public TextView getTvEstado() {
            return tvEstado;
        }

        public void setTvEstado(TextView tvEstado) {
            this.tvEstado = tvEstado;
        }

        public TextView getTvProductos() {
            return tvProductos;
        }

        public void setTvProductos(TextView tvProductos) {
            this.tvProductos = tvProductos;
        }

        public TextView getTvDatosEnvio() {
            return tvDatosEnvio;
        }

        public void setTvDatosEnvio(TextView tvDatosEnvio) {
            this.tvDatosEnvio = tvDatosEnvio;
        }

        public Button getBtPreparando() {
            return btPreparando;
        }

        public void setBtPreparando(Button btPreparando) {
            this.btPreparando = btPreparando;
        }

        public Button getBtEnviado() {
            return btEnviado;
        }

        public void setBtEnviado(Button btEnviado) {
            this.btEnviado = btEnviado;
        }

        public Button getBtEntregado() {
            return btEntregado;
        }

        public void setBtEntregado(Button btEntregado) {
            this.btEntregado = btEntregado;
        }
    }

    private class AsyncCallWS extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Log.i(TAG, "doInBackground");
            updatePedido();

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


        public void updatePedido() {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);

            request.addProperty("id", idusuario);
            request.addProperty("fecha", fecha);
            request.addProperty("estado", estado);



            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(request);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);


            try {

                androidHttpTransport.call(SOAP_ACTION, envelope);

            } catch (Exception e) {
                System.out.println("Error updatePedido: " + e);
            }
        }
    }
}
