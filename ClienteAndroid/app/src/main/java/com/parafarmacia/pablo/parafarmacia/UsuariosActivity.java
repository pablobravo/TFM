package com.parafarmacia.pablo.parafarmacia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.parafarmacia.pablo.parafarmacia.model.Pedido;
import com.parafarmacia.pablo.parafarmacia.model.Usuario;
import com.parafarmacia.pablo.parafarmacia.persistence.PedidosDataSource;
import com.parafarmacia.pablo.parafarmacia.persistence.UsuariosDataSource;

import java.util.ArrayList;
import java.util.List;

public class UsuariosActivity extends AppCompatActivity {

    private TextView cantidad;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cantidad = (TextView) findViewById(R.id.tvCantidad);


        UsuariosDataSource pds = new UsuariosDataSource(getApplicationContext());
        pds.open();
        List<Usuario> usuariosBD = pds.getUsuarios();
        List<String> usuarios = new ArrayList<String>();
        for(Usuario p : usuariosBD){
            System.out.println(p.getId()+ ", "+p.getNombre()+", "+p.getEmail()+", "+p.getCiudad()+", "+p.getDireccion()+", "+p.getProvincia());
            usuarios.add(p.getNombre()+": "+p.getEmail());
        }
        pds.close();
        cantidad.setText("Número de usuarios: "+usuariosBD.size());

        ArrayAdapter<String> adaptador;

        lista = (ListView)findViewById(R.id.lvUsuarios);

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, usuarios);

        lista.setAdapter(adaptador);
    }
}
