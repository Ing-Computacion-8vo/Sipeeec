package mx.uatx.sipeeec.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
 

@Controller
@ManagedBean
@SessionScoped
public class RegistroAlumno {
 
    //@ManagedProperty(value="#{employeeService}")
	@Autowired
    private RegistroAlumnoService registroAlumnoService;
 
	@Autowired
	RegistroAlumnoDAO registroAlumnoServicio;
	
    private EmployeeDTO employee = new EmployeeDTO();
 
    public RegistroAlumnoService getEmployeeService() {
        return employeeService;
    }
    
    
    @PostConstruct
    public void init(){
    	employee = new EmployeeDTO();
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
        //employeeService.register(employee);
    	empleadoServicio.insertar(employee);
        // Add message
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The Employee "+this.employee.getEmployeeName()+" Is Registered Successfully"));
        return "";
    }
}