package com.parafarmacia.pablo.parafarmacia.model;


import java.util.HashMap;
import java.util.Map;

public class Pedido {
	private int id;
	private int idUsuario;
	private int idProducto;

	private int unidades;
	private String fecha;
	private String estado;

	private Map<Integer, Integer> productos = new HashMap<>();

	public Pedido(){}

	public Pedido(int id, int idUsuario, int idProducto, int unidades, String fecha, String estado) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.unidades = unidades;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Map<Integer, Integer> getProductos() {
		return productos;
	}

	public void setProductos(Map<Integer, Integer> productos) {
		this.productos = productos;
	}
}
