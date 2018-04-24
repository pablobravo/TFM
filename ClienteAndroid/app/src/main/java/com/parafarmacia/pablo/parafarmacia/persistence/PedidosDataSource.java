package com.parafarmacia.pablo.parafarmacia.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.parafarmacia.pablo.parafarmacia.model.Pedido;

import java.util.ArrayList;
import java.util.List;


public class PedidosDataSource {
    private SQLiteDatabase database;

    private MyDBHelper dbHelper;

    private final String[] allComuns = {MyDBHelper.COLUMN_IDPEDIDO,
            MyDBHelper.COLUMN_IDUSUARIO, MyDBHelper.COLUMN_IDPRODUCTO, MyDBHelper.COLUMN_UNIDADES,
            MyDBHelper.COLUMN_FECHA, MyDBHelper.COLUMN_ESTADO};

    public PedidosDataSource(Context context) {
        dbHelper = new MyDBHelper(context, null, null, 0);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertPedido(final Pedido pedido) {
        final ContentValues values = new ContentValues();
        values.put(MyDBHelper.COLUMN_IDPEDIDO, pedido.getId());
        values.put(MyDBHelper.COLUMN_IDUSUARIO, pedido.getIdUsuario());
        values.put(MyDBHelper.COLUMN_IDPRODUCTO, pedido.getIdProducto());
        values.put(MyDBHelper.COLUMN_UNIDADES, pedido.getUnidades());
        values.put(MyDBHelper.COLUMN_FECHA, pedido.getFecha());
        values.put(MyDBHelper.COLUMN_ESTADO, pedido.getEstado());

        final long insertId = database.insert(MyDBHelper.TABLA_PEDIDOS, null, values);

        return  insertId;
    }

    public List<Pedido> getPedidos() {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        Cursor cursor = database.query(MyDBHelper.TABLA_PEDIDOS,allComuns,null,null,null,null,null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            final Pedido pedido = new Pedido();
            pedido.setId(cursor.getInt(0));
            pedido.setIdUsuario(cursor.getInt(1));
            pedido.setIdProducto(cursor.getInt(2));
            pedido.setUnidades(cursor.getInt(3));
            pedido.setFecha(cursor.getString(4));
            pedido.setEstado(cursor.getString(5));

            pedidos.add(pedido);
            cursor.moveToNext();
        }
        cursor.close();
        return pedidos;
    }

    public void updateEstadoPedido(String estado, int idusuario, String fecha){
        database.execSQL("UPDATE "+ MyDBHelper.TABLA_PEDIDOS+ " SET "+MyDBHelper.COLUMN_ESTADO+"='"+estado+"' WHERE "+MyDBHelper.COLUMN_IDUSUARIO+"=" + idusuario+ " AND "+MyDBHelper.COLUMN_FECHA+"=" + fecha);
    }

    public void deleteAllPedidos(){
        database.execSQL("DELETE FROM "+MyDBHelper.TABLA_PEDIDOS);
    }
}
