package mx.uatx.sipeeec.dto;

import java.util.Date;

public class RegistroAlumnoDTO {
	private String Matricula;
	private String Nombre;
	private String Apaterno;
	private String Amaterno;
	private String Semestre;
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApaterno() {
		return Apaterno;
	}
	public void setApaterno(String apaterno) {
		Apaterno = apaterno;
	}
	public String getAmaterno() {
		return Amaterno;
	}
	public void setAmaterno(String amaterno) {
		Amaterno = amaterno;
	}
	public String getSemestre() {
		return Semestre;
	}
	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
	

}
