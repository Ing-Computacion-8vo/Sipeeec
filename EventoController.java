package mx.uatx.sipeeec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
		@Autowired
		private EventoService eventoService;
		
		
		private List<EventoDTO> filteredEventos = new ArrayList<EventoDTO>();
		private List<EventoDTO> eventos= new ArrayList<EventoDTO>();
		 @PostConstruct
		    public void init(){
		    	eventos=eventoService.findEventos();
		    	filteredEventos=eventoService.findEventos();

		    }
		public List<EventoDTO> getEventos() {
			return eventos;
		}
		public void setEventos(List<EventoDTO> eventos) {
			this.eventos = eventos;
		}
		
		
		public List<EventoDTO> getFilteredEventos(){
			return filteredEventos;
		}
		public void setFilteredEventos(List<EventoDTO> filteredEventos){
			this.filteredEventos = filteredEventos;
		}
		 

}
