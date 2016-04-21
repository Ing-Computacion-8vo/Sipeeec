package mx.uatx.sipeeec.dto;

import java.sql.Blob;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PONENTES")

public class PonenteDTO {
	
	@Id @GeneratedValue
	@Column(name = "PONENTES_ID")
    private int ponentes_id;
	@Column(name = "PONENTES_NOMBRE")
	private String ponentes_nombre;
	@Column(name = "PONENTES_LUGAR")
	private String ponentes_lugar;
	@Column(name = "PONENTES_FECHAYHORA")
	private String ponentes_fechayhora;
	@Column(name = "PONENTES_ESTATUS")
	private Set ponentes_estatus;
	@Column(name = "PONENTES_CV")
	private Blob ponentes_cv;
	
	public int getPonentes_id() {
		return ponentes_id;
	}
	public void setPonentes_id(int ponentes_id) {
		this.ponentes_id = ponentes_id;
	}
	public String getPonentes_nombre() {
		return ponentes_nombre;
	}
	public void setPonentes_nombre(String ponentes_nombre) {
		this.ponentes_nombre = ponentes_nombre;
	}
	public String getPonentes_lugar() {
		return ponentes_lugar;
	}
	public void setPonentes_lugar(String ponentes_lugar) {
		this.ponentes_lugar = ponentes_lugar;
	}
	public String getPonentes_fechayhora() {
		return ponentes_fechayhora;
	}
	public void setPonentes_fechayhora(String ponentes_fechayhora) {
		this.ponentes_fechayhora = ponentes_fechayhora;
	}
	public Set getPonentes_estatus() {
		return ponentes_estatus;
	}
	public void setPonentes_estatus(Set ponentes_estatus) {
		this.ponentes_estatus = ponentes_estatus;
	}
	public Blob getPonentes_cv() {
		return ponentes_cv;
	}
	public void setPonentes_cv(Blob ponentes_cv) {
		this.ponentes_cv = ponentes_cv;
	}
	
}
