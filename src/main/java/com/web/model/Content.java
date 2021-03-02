package com.web.model;

import java.io.Serializable;

public class Content implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String titulo;
	
	private String contenido;
	
	private String categoria;

	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Content(String titulo, String contenido, String categoria) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
