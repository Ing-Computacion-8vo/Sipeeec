package mx.uatx;

public class EventoDTO {
	private String  nombre;
	private String  eventos;
	private String  status;
	private String  usuario;
	private String  contrasena;
	
	public  String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEventos() {
		return eventos;
	}
	public void setEventos(String eventos) {
		this.eventos = eventos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
