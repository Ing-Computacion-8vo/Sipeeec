package mx.uatx.sipeeec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.uatx.sipeeec.dao.PonenteDAO;
import mx.uatx.sipeeec.dto.PonenteDTO;
import mx.uatx.sipeeec.service.PonenteService;

public class PonenteServiceImpl implements PonenteService {
	
	@Autowired
	private PonenteDAO ponenteDAO;
	
	public void setPonenteDAO(PonenteDAO ponenteDAO) {
		this.ponenteDAO = ponenteDAO;
	}

	@Override
	public List<PonenteDTO> findPonentes() {
		// TODO Auto-generated method stub   eventoDao.getEventos();
		return ponenteDAO.getPonentes();
	}
	
	

}
