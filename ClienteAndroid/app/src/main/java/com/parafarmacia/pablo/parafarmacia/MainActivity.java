package com.parafarmacia.pablo.parafarmacia;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.parafarmacia.pablo.parafarmacia.model.Pedido;
import com.parafarmacia.pablo.parafarmacia.model.Producto;
import com.parafarmacia.pablo.parafarmacia.model.Usuario;
import com.parafarmacia.pablo.parafarmacia.persistence.PedidosDataSource;
import com.parafarmacia.pablo.parafarmacia.persistence.ProductosDataSource;
import com.parafarmacia.pablo.parafarmacia.persistence.UsuariosDataSource;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void pedidos(View v) {
        Intent intent = new Intent(MainActivity.this, PedidosActivity.class);

        startActivity(intent);
    }

    public void productos(View v) {
        Intent intent = new Intent(MainActivity.this, ProductosActivity.class);
        intent.putExtra("activo", getIntent().getStringExtra("activo"));
        startActivity(intent);
    }

    public void usuarios(View v) {
        Intent intent = new Intent(MainActivity.this, UsuariosActivity.class);
        startActivity(intent);
    }

}
