package mx.uatx.sipeeec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.uatx.sipeeec.dao.EventoDao;
import mx.uatx.sipeeec.dto.EventoDTO;
import mx.uatx.sipeeec.service.EventoService;

public class EventoServiceImpl implements EventoService {

	@Autowired
	private EventoDao eventoDao;
	
	public void setEventoDao(EventoDao eventoDao) {
		this.eventoDao = eventoDao;
	}

	@Override
	public List<EventoDTO> findEventos() {
		return eventoDao.getEventos();
	}

}
