package com.parafarmacia.pablo.parafarmacia.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.parafarmacia.pablo.parafarmacia.ActualizarProductoActivity;
import com.parafarmacia.pablo.parafarmacia.ImagenProductoActivity;
import com.parafarmacia.pablo.parafarmacia.ProductosActivity;
import com.parafarmacia.pablo.parafarmacia.R;
import com.parafarmacia.pablo.parafarmacia.model.Producto;
import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 19/03/2018.
 */

public class ProductoArrayAdapter extends ArrayAdapter<Producto> implements
        View.OnClickListener
{
    private LayoutInflater layoutInflater;
    private Context context;

    public ProductoArrayAdapter(Context context, List<Producto> objects)
    {
        super(context, 0, objects);
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Holder holder = null;
        if (convertView == null)
        {
            holder = new Holder();

            convertView = layoutInflater.inflate(R.layout.row_productos, null);
            holder.setTvNombre((TextView) convertView.findViewById(R.id.tvNombre));
            holder.setTvCategoria((TextView) convertView.findViewById(R.id.tvCategoria));
            holder.setTvPrecio((TextView) convertView.findViewById(R.id.tvPrecio));
            holder.setImgProducto((ImageView) convertView.findViewById(R.id.imgProducto));
            holder.setAddImagen((Button) convertView.findViewById(R.id.btImagen));
            holder.setBtActualizar((Button) convertView.findViewById(R.id.btActualizar));
            convertView.setTag(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }

        Producto row = getItem(position);
        holder.getTvNombre().setText(row.getNombre());
        holder.getTvCategoria().setText(row.getCategoria().toUpperCase());
        holder.getTvPrecio().setText(row.getPrecio()+" €");
        final String nombre= row.getNombre();
        final int posicion = position;
        final int idproducto = row.getId();


        Picasso.with(context).load("http://156.35.98.11:8085/parafarmacia/resources/product/" + (row.getNombre().replace(" ", "")).toUpperCase() + ".JPG").fit().into(holder.getImgProducto());

        holder.getAddImagen().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, ImagenProductoActivity.class);
                intent.putExtra("nombre", nombre);
                context.startActivity(intent);
            }
        });
        holder.getBtActualizar().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, ActualizarProductoActivity.class);
                intent.putExtra("idproducto", String.valueOf(idproducto));
                context.startActivity(intent);
            }
        });




        return convertView;
    }

    @Override
    public void onClick(View v) {

    }


    static class Holder
    {
        TextView tvNombre;
        TextView tvPrecio;
        TextView tvCategoria;
        ImageView imgProducto;
        Button addImagen;
        Button btActualizar;

        public TextView getTvNombre() {
            return tvNombre;
        }

        public void setTvNombre(TextView tvNombre) {
            this.tvNombre = tvNombre;
        }

        public TextView getTvPrecio() {
            return tvPrecio;
        }

        public void setTvPrecio(TextView tvPrecio) {
            this.tvPrecio = tvPrecio;
        }

        public TextView getTvCategoria() {
            return tvCategoria;
        }

        public void setTvCategoria(TextView tvCategoria) {
            this.tvCategoria = tvCategoria;
        }

        public ImageView getImgProducto() {
            return imgProducto;
        }

        public void setImgProducto(ImageView imgProducto) {
            this.imgProducto = imgProducto;
        }

        public Button getAddImagen() {
            return addImagen;
        }

        public void setAddImagen(Button addImagen) {
            this.addImagen = addImagen;
        }

        public Button getBtActualizar() {
            return btActualizar;
        }

        public void setBtActualizar(Button btActualizar) {
            this.btActualizar = btActualizar;
        }
    }
}
