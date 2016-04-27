package mx.uatx;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class EventosService {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void register(EventosDTO eventos){
		
		// Acquire session
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		// Save employee, saving behavior get done in a transactional manner
		session.persist(convert(eventos));
		session.getTransaction().commit();
	}
	
	private Eventos convert(EventosDTO eventos){
		Eventos e=new Eventos();
		e.setEventosFechayhora(eventos.getEventosFechayhora());
		e.setEventosId(eventos.getEventosId());
		e.setEventosTipo(eventos.getEventosTipo());
		e.setEventosNombre(eventos.getEventosNombre());
		e.setEventosLugar(eventos.getEventosLugar());
		e.setEventosAudiencia(eventos.getEventosAudiencia());
		e.setEventosPeriodo(eventos.getEventosPeriodo());
		
		e.setResponsable(eventos.getResponsable());
		
		return e;
	}
}