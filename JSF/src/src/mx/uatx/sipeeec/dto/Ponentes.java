package entities;
// Generated 26/04/2016 08:49:32 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ponentes generated by hbm2java
 */
@Entity
@Table(name = "ponentes", catalog = "sipeeec")
public class Ponentes implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String ap;
	private String am;
	private String correo;
	private String tel;

	public Ponentes() {
	}

	public Ponentes(String nombre, String ap, String am, String correo, String tel) {
		this.nombre = nombre;
		this.ap = ap;
		this.am = am;
		this.correo = correo;
		this.tel = tel;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 250)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ap", nullable = false, length = 250)
	public String getAp() {
		return this.ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	@Column(name = "am", nullable = false, length = 250)
	public String getAm() {
		return this.am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	@Column(name = "correo", nullable = false, length = 250)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "tel", nullable = false, length = 25)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}