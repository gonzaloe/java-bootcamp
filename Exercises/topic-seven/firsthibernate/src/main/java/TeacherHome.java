// default package
// Generated 08-feb-2015 19:33:35 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Teacher.
 * @see .Teacher
 * @author Hibernate Tools
 */
@Stateless
public class TeacherHome {

	private static final Log log = LogFactory.getLog(TeacherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Teacher transientInstance) {
		log.debug("persisting Teacher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Teacher persistentInstance) {
		log.debug("removing Teacher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Teacher merge(Teacher detachedInstance) {
		log.debug("merging Teacher instance");
		try {
			Teacher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Teacher findById(String id) {
		log.debug("getting Teacher instance with id: " + id);
		try {
			Teacher instance = entityManager.find(Teacher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
