package com.parafarmacia.pablo.parafarmacia;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.parafarmacia.pablo.parafarmacia.adapter.PedidoArrayAdapter;
import com.parafarmacia.pablo.parafarmacia.model.Pedido;
import com.parafarmacia.pablo.parafarmacia.persistence.PedidosDataSource;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;

public class PedidosActivity extends AppCompatActivity {

    private ListView lvPedidos;
    PedidoArrayAdapter currentAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        PedidosDataSource pds = new PedidosDataSource(getApplicationContext());
        pds.open();
        List<Pedido> pedidosBD = pds.getPedidos();
        pds.close();

        List<Pedido> pedidos = new ArrayList<Pedido>();
        for(int i=0; i<pedidosBD.size(); i++){
            pedidosBD.get(i).getProductos().put(pedidosBD.get(i).getIdProducto(),pedidosBD.get(i).getUnidades());
            int j=i+1;
            while(j<pedidosBD.size()){
                if(pedidosBD.get(i).getIdUsuario()==pedidosBD.get(j).getIdUsuario() && pedidosBD.get(i).getFecha().equals(pedidosBD.get(j).getFecha()))
                {
                    if(pedidosBD.get(i).getProductos().containsKey(pedidosBD.get(j).getIdProducto()))
                    {
                        pedidosBD.get(i).getProductos().put(pedidosBD.get(j).getIdProducto(), pedidosBD.get(i).getProductos().get(pedidosBD.get(j).getIdProducto()) + 1);
                    }
                    else
                    {
                        pedidosBD.get(i).getProductos().put(pedidosBD.get(j).getIdProducto(), pedidosBD.get(j).getUnidades());
                    }
                    pedidosBD.remove(pedidosBD.get(j));
                    j--;
                }
                j++;
            }
            pedidos.add(pedidosBD.get(i));
        }

        //Instanciamos el listView
        lvPedidos = (ListView) findViewById(R.id.lvPedidos);

        //Instanciamos el adaptador, le pasamos el arraylist y al listview la pasamos nuestro adapter como adaptador de contenido
        currentAdaptador = new PedidoArrayAdapter(this, pedidos);
        lvPedidos.setAdapter(currentAdaptador);

    }


}
