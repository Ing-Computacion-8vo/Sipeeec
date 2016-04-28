package mx.uatx;

import java.util.Date;

public class EventosDTO {
	private long eventosId;
	private String eventosTipo;
	private String eventosNombre;
	private String eventosLugar;
	private Date eventosFechayhora;
	private String eventosAudiencia;
	private String eventosPeriodo;
	
	private String responsable;

	public long getEventosId() {
		return eventosId;
	}

	public void setEventosId(long eventosId) {
		this.eventosId = eventosId;
	}

	public String getEventosTipo() {
		return eventosTipo;
	}

	public void setEventosTipo(String eventosTipo) {
		this.eventosTipo = eventosTipo;
	}

	public String getEventosNombre() {
		return eventosNombre;
	}

	public void setEventosNombre(String eventosNombre) {
		this.eventosNombre = eventosNombre;
	}

	public String getEventosLugar() {
		return eventosLugar;
	}

	public void setEventosLugar(String eventosLugar) {
		this.eventosLugar = eventosLugar;
	}

	public Date getEventosFechayhora() {
		return eventosFechayhora;
	}

	public void setEventosFechayhora(Date eventosFechayhora) {
		this.eventosFechayhora = eventosFechayhora;
	}

	public String getEventosAudiencia() {
		return eventosAudiencia;
	}

	public void setEventosAudiencia(String eventosAudiencia) {
		this.eventosAudiencia = eventosAudiencia;
	}

	public String getEventosPeriodo() {
		return eventosPeriodo;
	}

	public void setEventosPeriodo(String eventosPeriodo) {
		this.eventosPeriodo = eventosPeriodo;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}	
}