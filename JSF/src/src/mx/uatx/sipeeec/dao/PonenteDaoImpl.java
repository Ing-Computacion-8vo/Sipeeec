package mx.uatx.sipeeec.daoImpl;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import mx.uatx.sipeeec.dto.PonenteDTO;
import mx.uatx.sipeeec.util.FileCodecBase64;
import mx.uatx.sipeeec.util.FileConstructor;

@ManagedBean
@SessionScoped
public class PonenteDaoImpl {
	
	String file;
	String sourceFile =  "C:/codec64/" + file + ".pdf";
	
	FileConstructor fc = new FileConstructor();
	String result = fc.getCode64(sourceFile);
	

		String querySQL = "INSERT INTO EVENTOS (PONENTES_CV)" 
				+ " VALUES (RESULT)";
} 