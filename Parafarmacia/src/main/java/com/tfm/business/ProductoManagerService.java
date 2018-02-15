package com.tfm.business;

import java.util.Vector;

import com.tfm.model.Producto;

public interface ProductoManagerService {
	public Vector<Producto> getProductos() throws Exception;

	public Producto updateProducto(Producto producto) throws Exception;
	
	public Producto newProducto(Producto producto) throws Exception;
	
	public void removeProducto(int id) throws Exception;

}
