package mx.uatx.sipeeec.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.uatx.sipeeec.util.ReporteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.uatx.EmployeeDTO;
import mx.uatx.sipeeec.dto.EventoDTO;
import mx.uatx.sipeeec.service.EventoService;
import mx.uatx.sipeeec.service.impl.EventoServiceImpl;

@Controller
@SessionScoped
@ManagedBean(name = "eventoController")
public class EventoController {
	private String grupo;
	private String periodo;
	private String nombreEvento;
	private String conferencista;
	private String lugar;
	private String fecha;

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getConferencista() {
		return conferencista;
	}

	public void setConferencista(String conferencista) {
		this.conferencista = conferencista;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public EventoService getEventoService() {
		return eventoService;
	}

	public void setEventoService(EventoService eventoService) {
		this.eventoService = eventoService;
	}
	@Autowired
		private EventoService eventoService;

	public void generaReporte(ActionEvent event) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Generando reporte", ""));


		try {
			Map<String,Object> parms = new HashMap<String,Object>();
			parms.put("grupo",this.grupo );
			parms.put("periodo", this.periodo);
			parms.put("nombre_evento", this.nombreEvento);
			parms.put("conferencista", this.conferencista);
			parms.put("lugar", this.lugar);
			parms.put("fecha", this.fecha);
			ReporteUtils.generaReporte(parms, "reportes/400c-RG-17.jasper", "ListaEventos");
			System.out.println("Lo genero");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR::::::::::::::::::: "+e.getMessage());
		}
	}
		
		
		private List<EventoDTO> eventos= new ArrayList<EventoDTO>();
		 @PostConstruct
		    public void init(){
		    	eventos=eventoService.findEventos();
		    }
		public List<EventoDTO> getEventos() {
			return eventos;
		}
		public void setEventos(List<EventoDTO> eventos) {
			this.eventos = eventos;
		}
		 
		 

}
