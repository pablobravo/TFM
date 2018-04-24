package com.parafarmacia.pablo.parafarmacia.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.parafarmacia.pablo.parafarmacia.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDataSource {
    private SQLiteDatabase database;

    private MyDBHelper dbHelper;

    private final String[] allComuns = {MyDBHelper.COLUMN_ID_USUARIO,
            MyDBHelper.COLUMN_NOMBRE_USUARIO, MyDBHelper.COLUMN_EMAIL, MyDBHelper.COLUMN_CODPOSTAL,
            MyDBHelper.COLUMN_DIRECCION, MyDBHelper.COLUMN_CIUDAD, MyDBHelper.COLUMN_PROVINCIA};

    public UsuariosDataSource(Context context) {
        dbHelper = new MyDBHelper(context, null, null, 0);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertUsuario(final Usuario usuario) {
        final ContentValues values = new ContentValues();
        values.put(MyDBHelper.COLUMN_ID_USUARIO, usuario.getId());
        values.put(MyDBHelper.COLUMN_NOMBRE_USUARIO, usuario.getNombre());
        values.put(MyDBHelper.COLUMN_EMAIL, usuario.getEmail());
        values.put(MyDBHelper.COLUMN_CODPOSTAL, usuario.getCodpostal());
        values.put(MyDBHelper.COLUMN_DIRECCION, usuario.getDireccion());
        values.put(MyDBHelper.COLUMN_CIUDAD, usuario.getCiudad());
        values.put(MyDBHelper.COLUMN_PROVINCIA, usuario.getProvincia());

        final long insertId = database.insert(MyDBHelper.TABLA_USUARIOS, null, values);

        return  insertId;
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Cursor cursor = database.query(MyDBHelper.TABLA_USUARIOS,allComuns,null,null,null,null,null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            final Usuario usuario = new Usuario();
            usuario.setId(cursor.getInt(0));
            usuario.setNombre(cursor.getString(1));
            usuario.setEmail(cursor.getString(2));
            usuario.setCodpostal(cursor.getString(3));
            usuario.setDireccion(cursor.getString(4));
            usuario.setCiudad(cursor.getString(5));
            usuario.setProvincia(cursor.getString(6));

            usuarios.add(usuario);
            cursor.moveToNext();
        }
        cursor.close();
        return usuarios;
    }

    public Usuario getUsuario(int id) {
        Usuario usuario = new Usuario();
        Cursor cursor = database.rawQuery("SELECT * FROM "+MyDBHelper.TABLA_USUARIOS+" WHERE "+MyDBHelper.COLUMN_ID_USUARIO+"="+id, null );
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            usuario.setId(cursor.getInt(0));
            usuario.setNombre(cursor.getString(1));
            usuario.setEmail(cursor.getString(2));
            usuario.setCodpostal(cursor.getString(3));
            usuario.setDireccion(cursor.getString(4));
            usuario.setCiudad(cursor.getString(5));
            usuario.setProvincia(cursor.getString(6));
            cursor.moveToNext();
        }
        cursor.close();
        return usuario;
    }

    public void deleteAllUsuarios(){
        database.execSQL("delete from "+MyDBHelper.TABLA_USUARIOS);
    }
}
