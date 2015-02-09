// default package
// Generated 08-feb-2015 19:33:35 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Score.
 * @see .Score
 * @author Hibernate Tools
 */
@Stateless
public class ScoreHome {

	private static final Log log = LogFactory.getLog(ScoreHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Score transientInstance) {
		log.debug("persisting Score instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Score persistentInstance) {
		log.debug("removing Score instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Score merge(Score detachedInstance) {
		log.debug("merging Score instance");
		try {
			Score result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Score findById(ScoreId id) {
		log.debug("getting Score instance with id: " + id);
		try {
			Score instance = entityManager.find(Score.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
