package mx.uatx.sipeeec.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import mx.uatx.sipeeec.dao.EventoDao;
import mx.uatx.sipeeec.dto.EventoDTO;

@Component
public class EventoDaoImpl implements EventoDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<EventoDTO> getEventos() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("select e from EventoDTO e");
		return q.list();
		
	}
	

}
