package mx.uatx;

 
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 

@Controller
@ManagedBean
@SessionScoped
public class RegisterEventos { 
 
    //@ManagedProperty(value="#{eventosService}")
	@Autowired
    private EventosService eventosService;
 
    private EventosDTO eventos = new EventosDTO();
 
    public EventosService getEventosService() {
        return eventosService;
    }
    
    
    @PostConstruct
    public void init(){
    	eventos = new EventosDTO();
    }
 
    public void setEventosService(EventosService eventosService) {
        this.eventosService = eventosService;
    }
 
    public EventosDTO getEventos() { 
        return eventos;
    }
 
    public void setEventos(EventosDTO eventos) {
        this.eventos = eventos;
    }
 
    public String register() {
        // Calling Business Service
        eventosService.register(eventos);
        // Add message
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The Evento "+this.eventos.getEventosNombre()+" Is Registered Successfully"));
        return "";
    }
}