package org.web.entity;
 

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class EProduct implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "descripcion",   length = 100)
	private String descripcion;
	@Column(name = "stock")
	private int stock;
	@Column(name = "categoria")
	private String categoria;
	
	
	
	public EProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EProduct(Long id, String descripcion, int stock, String categoria) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.stock = stock;
		this.categoria = categoria;
	}


	public EProduct(String descripcion, int stock, String categoria) {
		super();
		this.descripcion = descripcion;
		this.stock = stock;
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
 

}
