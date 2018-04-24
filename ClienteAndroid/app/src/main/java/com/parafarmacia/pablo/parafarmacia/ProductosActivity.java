package com.parafarmacia.pablo.parafarmacia;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.parafarmacia.pablo.parafarmacia.adapter.ProductoArrayAdapter;
import com.parafarmacia.pablo.parafarmacia.model.Producto;
import com.parafarmacia.pablo.parafarmacia.persistence.ProductosDataSource;
import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class ProductosActivity extends AppCompatActivity {

    private ListView lvProductos;
    private ProductoArrayAdapter currentAdaptador;
    private List<Producto> productosBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ProductosDataSource pds = new ProductosDataSource(getApplicationContext());
        pds.open();
        productosBD = pds.getProductos();
        pds.close();


        //Instanciamos el listView
        lvProductos = (ListView) findViewById(R.id.lvProductos);

        //Instanciamos el adaptador, le pasamos el arraylist y al listview la pasamos nuestro adapter como adaptador de contenido
        currentAdaptador = new ProductoArrayAdapter(this, productosBD);
        lvProductos.setAdapter(currentAdaptador);

    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    public void nuevoProducto(View v) {
        Intent intent = new Intent(ProductosActivity.this, NuevoProductoActivity.class);
        startActivity(intent);
    }

    private Bitmap get_imagen(String url) {
        Bitmap bm = null;
        try {
            URL _url = new URL(url);
            URLConnection con = _url.openConnection();
            con.connect();
            InputStream is = con.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            bm = BitmapFactory.decodeStream(bis);
            bis.close();
            is.close();
        } catch (IOException e) {
        }
        return bm;
    }


}
