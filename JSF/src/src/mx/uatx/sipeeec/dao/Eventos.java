package mx.uatx;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENTOS")

public class Eventos {
	
	@Id @GeneratedValue
	@Column(name = "EVENTOS_ID")
	private long eventosId;
	@Column(name = "EVENTOS_TIPO")
	private String eventosTipo;
	@Column(name = "EVENTOS_NOMBRE")
	private String eventosNombre;
	@Column(name = "EVENTOS_Lugar")
	private String eventosLugar;
	@Column(name = "EVENTOS_FECHAYHORA")
	private Date eventosFechayhora;
	@Column(name = "EVENTOS_AUDIENCIA")
	private String eventosAudiencia;
	@Column(name = "EVENTOS_PERIODO")
	private String eventosPeriodo;
	
	@Column(name = "RESPONSABLE")
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
