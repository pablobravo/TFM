package com.tfm.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Carrito {
		
		HashMap<Producto, Integer> productos;
		int totalproductos;
		double preciototal;
		public Carrito() {
			productos = new HashMap<Producto, Integer>();
			totalproductos = 0;
			preciototal = 0.0;
		}
		
		@SuppressWarnings("rawtypes")
		public void addProductos(Producto producto){
			Iterator it = productos.entrySet().iterator();
			boolean existe = false;
			while (it.hasNext()) {
			    Map.Entry e = (Map.Entry)it.next();
			    if(((Producto) e.getKey()).getId()==producto.getId()){
			    	totalproductos += 1;
					preciototal += producto.getPrecio(); 
					preciototal = Math.round(preciototal*100.0)/100.0;
			    	productos.put((Producto) e.getKey(), productos.get((Producto) e.getKey()) + 1);
			    	existe = true;
			    }
			}
			
			if(!existe){
				totalproductos += 1;
				preciototal += producto.getPrecio(); 
				
				preciototal = Math.round(preciototal*100.0)/100.0;
				productos.put(producto, 1);
			
			}
			
		}
		
		@SuppressWarnings("rawtypes")
		public void removeProductos(Producto producto){
			
			Iterator it = productos.entrySet().iterator();
			while (it.hasNext()) {
			    Map.Entry e = (Map.Entry)it.next();
			    if(((Producto) e.getKey()).getId()==producto.getId()){
			    	int count = productos.get((Producto) e.getKey());
			    	if(count<=1){
			    		totalproductos -= 1;
						preciototal -= producto.getPrecio();
						preciototal = Math.round(preciototal*100.0)/100.0;
						productos.remove((Producto) e.getKey());
						
			    	}
					else{
						totalproductos -= 1;
						preciototal -= producto.getPrecio();
						preciototal = Math.round(preciototal*100.0)/100.0;
						productos.put((Producto) e.getKey(), productos.get((Producto) e.getKey()) - 1);		
					
					}
			    }
			}
			
		}

		public HashMap<Producto, Integer> getProductos() {
			return productos;
		}

		public int getTotalproductos() {
			return totalproductos;
		}

		public double getPreciototal() {
			return Math.round(preciototal*100.0)/100.0;
		}

	
		
	
}
