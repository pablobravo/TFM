package com.parafarmacia.pablo.parafarmacia.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.parafarmacia.pablo.parafarmacia.model.Producto;

import java.util.ArrayList;
import java.util.List;


public class ProductosDataSource {
    private SQLiteDatabase database;

    private MyDBHelper dbHelper;

    private final String[] allComuns = {MyDBHelper.COLUMN_ID_PRODUCTO,
            MyDBHelper.COLUMN_NOMBRE, MyDBHelper.COLUMN_DESCRIPCION, MyDBHelper.COLUMN_PRECIO,
            MyDBHelper.COLUMN_CANTIDAD, MyDBHelper.COLUMN_CATEGORIA};

    public ProductosDataSource(Context context) {
        dbHelper = new MyDBHelper(context, null, null, 0);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertProducto(final Producto producto) {
        final ContentValues values = new ContentValues();
        values.put(MyDBHelper.COLUMN_ID_PRODUCTO, producto.getId());
        values.put(MyDBHelper.COLUMN_NOMBRE, producto.getNombre());
        values.put(MyDBHelper.COLUMN_DESCRIPCION, producto.getDescripcion());
        values.put(MyDBHelper.COLUMN_PRECIO, producto.getPrecio());
        values.put(MyDBHelper.COLUMN_CANTIDAD, producto.getCantidad());
        values.put(MyDBHelper.COLUMN_CATEGORIA, producto.getCategoria());

        final long insertId = database.insert(MyDBHelper.TABLA_PRODUCTOS, null, values);

        return  insertId;
    }

    public List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<Producto>();
        Cursor cursor = database.query(MyDBHelper.TABLA_PRODUCTOS, allComuns,null,null,null,null,null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            final Producto producto = new Producto();
            producto.setId(cursor.getInt(0));
            producto.setNombre(cursor.getString(1));
            producto.setDescripcion(cursor.getString(2));
            producto.setPrecio(cursor.getDouble(3));
            producto.setCantidad(cursor.getInt(4));
            producto.setCategoria(cursor.getString(5));

            productos.add(producto);
            cursor.moveToNext();
        }
        cursor.close();
        return productos;
    }

    public Producto getProducto(int id) {
        Producto producto = new Producto();
        Cursor cursor = database.rawQuery("SELECT * FROM "+MyDBHelper.TABLA_PRODUCTOS+" WHERE "+MyDBHelper.COLUMN_ID_PRODUCTO+"="+id, null );
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            producto.setId(cursor.getInt(0));
            producto.setNombre(cursor.getString(1));
            producto.setDescripcion(cursor.getString(2));
            producto.setPrecio(cursor.getDouble(3));
            producto.setCantidad(cursor.getInt(4));
            producto.setCategoria(cursor.getString(5));
            cursor.moveToNext();
        }
        cursor.close();
        return producto;
    }

    public void updateProducto(Producto producto){
        database.execSQL("UPDATE "+ MyDBHelper.TABLA_PRODUCTOS+ " SET "+MyDBHelper.COLUMN_NOMBRE+"='"+producto.getNombre()+
                "', "+MyDBHelper.COLUMN_DESCRIPCION+"='"+producto.getDescripcion()+"',"+MyDBHelper.COLUMN_PRECIO+"='"+producto.getPrecio()+
                "', "+MyDBHelper.COLUMN_CANTIDAD+"='"+producto.getCantidad()+ "', "+MyDBHelper.COLUMN_CATEGORIA+"='"+producto.getCategoria()+
                "' WHERE "+MyDBHelper.COLUMN_ID_PRODUCTO+"=" + producto.getId());
    }

    public void deleteProducto(int id){
        database.execSQL("DELETE FROM "+MyDBHelper.TABLA_PRODUCTOS+ " WHERE ID="+id);
    }

    public void deleteAllProductos(){
        database.execSQL("DELETE FROM "+MyDBHelper.TABLA_PRODUCTOS);
    }
}
