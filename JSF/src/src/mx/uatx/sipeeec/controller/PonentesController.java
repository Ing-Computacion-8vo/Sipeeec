package controller;

import javax.faces.bean.*;
import entities.*;
import model.*;
import java.util.*;

@ManagedBean(name = "ponentesController")
@SessionScoped
public class PonentesController {
	
	private PonentesModel pm = new PonentesModel();
	private Ponentes p = new Ponentes();
	
	//Geters y Seters de "p"		
	public Ponentes getP() {
		return p;
	}
	public void setP(Ponentes p) {
		this.p = p;
	}
	//END Geters y Seters de "p"
	
	// Metodo listar
	public List<Ponentes> findAll(){
		return pm.findAll();
	}
	
	//Metodo Agregar
	public String add(){
		this.pm.create(this.p);
		this.p = new Ponentes();
		return "index";
	}
	
	//Metodo eliminar
	public void delete(Ponentes p){
		this.pm.delete(p);
	}
	
	//Metodo editar
	public String edit(Ponentes p){
		this.p = p;
		return "edit";
	}
	
	public String edit(){
		this.pm.update(this.p);
		return "index";
	}
	

}
