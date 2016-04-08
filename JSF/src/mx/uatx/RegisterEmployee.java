package mx.uatx;

 
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
 

@Controller
@ManagedBean
@SessionScoped
public class RegisterEmployee {
	
	private List<EventoDTO> eventos=new ArrayList<EventoDTO>();
 
    //@ManagedProperty(value="#{employeeService}")
	@Autowired
    private EmployeeService employeeService;
 
    private EmployeeDTO employee = new EmployeeDTO();
 
    public EmployeeService getEmployeeService() {
        return employeeService;
    }
    
    
    
    @PostConstruct
    public void init(){
    	employee = new EmployeeDTO();
    	EventoDTO evento = new EventoDTO();
    	evento.setNombre("Marco");
    	evento.setEventos("JAVA");
    	evento.setStatus("activo");
    	evento.setUsuario("Ingeniería");
    	evento.setContrasena("Password");
    	
    	eventos.add(evento);
    	eventos.add(evento);
    	eventos.add(evento);

    }
 
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
 
    public EmployeeDTO getEmployee() {
        return employee;
    }
 
    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }
 
    public String register() {
        // Calling Business Service
        employeeService.register(employee);
        // Add message
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The Employee "+this.employee.getEmployeeName()+" Is Registered Successfully"));
        return "";
    }
    
   
	public List<EventoDTO> getEventos() {
		return eventos;
	}


	public void setEventos(List<EventoDTO> eventos) {
		this.eventos = eventos;
	}
}