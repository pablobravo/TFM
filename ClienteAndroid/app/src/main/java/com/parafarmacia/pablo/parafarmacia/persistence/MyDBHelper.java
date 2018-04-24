package com.parafarmacia.pablo.parafarmacia.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Clase con la base de datos
 */
public class MyDBHelper extends SQLiteOpenHelper {

        public static final String DATABASE_NAME="parafarmacia.db";
        public static final int DATABASE_VERSION=1;

        public static  final String TABLA_PEDIDOS ="pedidos";
        public static final String COLUMN_IDPEDIDO="_id";
        public static final String COLUMN_IDUSUARIO="_idusuario";
        public static final String COLUMN_IDPRODUCTO="_idproducto";
        public static final String COLUMN_UNIDADES="_unidades";
        public static final String COLUMN_FECHA="_fecha";
        public static final String COLUMN_ESTADO="_estado";

        public static  final String TABLA_USUARIOS ="usuarios";
        public static final String COLUMN_ID_USUARIO="_id";
        public static final String COLUMN_NOMBRE_USUARIO="_nombre";
        public static final String COLUMN_EMAIL="_email";
        public static final String COLUMN_CODPOSTAL="_codpostal";
        public static final String COLUMN_DIRECCION="_direccion";
        public static final String COLUMN_CIUDAD="_ciudad";
        public static final String COLUMN_PROVINCIA="_provincia";

        public static  final String TABLA_PRODUCTOS ="productos";
        public static final String COLUMN_ID_PRODUCTO="_id";
        public static final String COLUMN_NOMBRE="_nombre";
        public static final String COLUMN_DESCRIPCION="_descripcion";
        public static final String COLUMN_PRECIO="_precio";
        public static final String COLUMN_CANTIDAD="_cantidad";
        public static final String COLUMN_CATEGORIA="_categoria";


        private static final String DATABASE_CREATE_PEDIDOS = "create table " + TABLA_PEDIDOS + "( " + COLUMN_IDPEDIDO +" " +
                "integer primary key autoincrement,"  + COLUMN_IDUSUARIO +
                " integer not null, "  + COLUMN_IDPRODUCTO+ " integer not null, "+ COLUMN_UNIDADES+ " integer not null, " +
                COLUMN_FECHA+ " text, "+ COLUMN_ESTADO+ " text)";

        private static final String DATABASE_CREATE_USUARIOS = "create table " + TABLA_USUARIOS + "( "+  COLUMN_ID_USUARIO +" " +
                "integer primary key autoincrement," + COLUMN_NOMBRE_USUARIO + " text not null, "
                + COLUMN_EMAIL+ " text not null, " +
                COLUMN_CODPOSTAL + " text not null, "  + COLUMN_DIRECCION + " text not null, "  +
                COLUMN_CIUDAD + " text not null, "  + COLUMN_PROVINCIA + " text not null)" ;

        private static final String DATABASE_CREATE_PRODUCTOS = "create table " + TABLA_PRODUCTOS + "( " + COLUMN_ID_PRODUCTO +" " +
                "integer primary key autoincrement,"  + COLUMN_NOMBRE +
                " text not null, "  + COLUMN_DESCRIPCION+ " text not null, "+ COLUMN_PRECIO+ " double not null, " +
                COLUMN_CANTIDAD+ " integer not null, "+ COLUMN_CATEGORIA+ " text)";


        private static final String DATABASE_DROP_PEDIDOS = "drop table if exists " + TABLA_PEDIDOS;
        private static final String DATABASE_DROP_USUARIOS = "drop table if exists " + TABLA_USUARIOS;
        private static final String DATABASE_DROP_PRODUCTOS = "drop table if exists " + TABLA_PRODUCTOS;


        public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version ){
                super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
                db.execSQL(DATABASE_CREATE_PEDIDOS);
                db.execSQL(DATABASE_CREATE_USUARIOS);
                db.execSQL(DATABASE_CREATE_PRODUCTOS);



        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                db.execSQL(DATABASE_DROP_PEDIDOS);
                db.execSQL(DATABASE_DROP_USUARIOS);
                db.execSQL(DATABASE_DROP_PRODUCTOS);
                this.onCreate(db);
        }
}
