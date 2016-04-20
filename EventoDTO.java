package mx.uatx.sipeeec.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENTO")
public class EventoDTO {
	@Id @GeneratedValue
	@Column(name = "EVENTO_ID")
    private int id;
	@Column(name = "NOMBRE_EVENTO")
	private String nombre_evento;
	@Column(name = "FECHA")
	private String fecha;
	@Column(name = "NOMBRE_PONENTE")
	private String nombre_ponente;
	@Column(name = "ESTATUS")
	private String estatus;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "CONTRASENA")
	private String contrasena;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre_ponente() {
		return nombre_ponente;
	}
	public void setNombre_ponente(String nombre_ponente) {
		this.nombre_ponente = nombre_ponente;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
