package mx.uatx.sipeeec.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.uatx.sipeeec.dao.PonenteDAO;
import mx.uatx.sipeeec.dto.PonenteDTO;

@Component
public class PonenteDaoImpl implements PonenteDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<PonenteDTO> getPonentes() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query q=session.createQuery("select p from PonenteDTO p");
		return q.list();
	}

}
