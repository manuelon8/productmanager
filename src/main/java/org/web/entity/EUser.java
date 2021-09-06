package org.web.entity;

import java.io.Serializable;
//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

 

@Entity
@Table(name="usuarios")
public class EUser implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",   length = 150)
	private String nombre;
	
	private int documento;
	
	private String email;
	
	private String password;
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	public EUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EUser(Long id, String nombre, int documento, String email, String password, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}
