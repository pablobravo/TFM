package com.tfm.model;


import org.hibernate.validator.constraints.NotEmpty;

public class Usuario {
	private int id;
	private String nombre;
	@NotEmpty(message = "El campo de la contraseña no puede estar vacío")
	private String password;
	private String passwordrepeat;
	@NotEmpty(message = "El campo del email no puede ser vacío")
	private String email;
	private String codpostal;
	private String direccion;
	private String ciudad;
	private String provincia;
	private boolean terminos;
	
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
	public String getPasswordrepeat() {
		return passwordrepeat;
	}
	public void setPasswordrepeat(String passwordrepeat) {
		this.passwordrepeat = passwordrepeat;
	}
	public boolean isTerminos() {
		return terminos;
	}
	public void setTerminos(boolean terminos) {
		this.terminos = terminos;
	}
	
	
	
}
