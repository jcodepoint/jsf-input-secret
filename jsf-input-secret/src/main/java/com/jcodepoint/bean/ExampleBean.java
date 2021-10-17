package com.jcodepoint.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("exampleBean")
@RequestScoped
public class ExampleBean {

	private String nombreUsuario;
	private String contrasena;
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}

