package com.parafarmacia.pablo.parafarmacia.model;

public class Usuario {
	private int id;
	private String nombre;
	private String password;
	
	private String email;
	private String codpostal;
	private String direccion;
	private String ciudad;
	private String provincia;

	public Usuario(){}

	public Usuario(int id, String nombre, String email, String codpostal, String direccion, String ciudad, String provincia) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.codpostal = codpostal;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodpostal() {
		return codpostal;
	}
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}