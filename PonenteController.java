package mx.uatx.sipeeec.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import mx.uatx.sipeeec.dto.PonenteDTO;
import mx.uatx.sipeeec.service.PonenteService;

@Controller
@SessionScoped
@ManagedBean(name = "ponenteController")
public class PonenteController {

	@Autowired
	private PonenteService ponenteService;
	
	private List<PonenteDTO> ponentes= new ArrayList<PonenteDTO>();
	 @PostConstruct
	    public void init(){
	    	ponentes=ponenteService.findPonentes();
	    }
	 
	 public List<PonenteDTO> getPonentes() {
			return ponentes;
		}
		public void setPonentes(List<PonenteDTO> ponentes) {
			this.ponentes = ponentes;
		}
}
