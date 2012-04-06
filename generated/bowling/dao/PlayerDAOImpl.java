package bowling.dao;

import bowling.domain.Player;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Player entities.
 * 
 */
@Repository("PlayerDAO")
@Transactional
public class PlayerDAOImpl extends AbstractJpaDao<Player> implements PlayerDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Player.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PlayerDAOImpl
	 *
	 */
	public PlayerDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findPlayerByTeamId
	 *
	 */
	@Transactional
	public Set<Player> findPlayerByTeamId(Integer teamId) throws DataAccessException {

		return findPlayerByTeamId(teamId, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerByTeamId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Player> findPlayerByTeamId(Integer teamId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPlayerByTeamId", startResult, maxRows, teamId);
		return new LinkedHashSet<Player>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllPlayers
	 *
	 */
	@Transactional
	public Set<Player> findAllPlayers() throws DataAccessException {

		return findAllPlayers(-1, -1);
	}

	/**
	 * JPQL Query - findAllPlayers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Player> findAllPlayers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPlayers", startResult, maxRows);
		return new LinkedHashSet<Player>(query.getResultList());
	}

	/**
	 * JPQL Query - findPlayerByPrimaryKey
	 *
	 */
	@Transactional
	public Player findPlayerByPrimaryKey(Integer id) throws DataAccessException {

		return findPlayerByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerByPrimaryKey
	 *
	 */

	@Transactional
	public Player findPlayerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPlayerByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Player) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPlayerById
	 *
	 */
	@Transactional
	public Player findPlayerById(Integer id) throws DataAccessException {

		return findPlayerById(id, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerById
	 *
	 */

	@Transactional
	public Player findPlayerById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPlayerById", startResult, maxRows, id);
			return (bowling.domain.Player) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPlayerByExternalId
	 *
	 */
	@Transactional
	public Set<Player> findPlayerByExternalId(Integer externalId) throws DataAccessException {

		return findPlayerByExternalId(externalId, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerByExternalId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Player> findPlayerByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPlayerByExternalId", startResult, maxRows, externalId);
		return new LinkedHashSet<Player>(query.getResultList());
	}

	/**
	 * JPQL Query - findPlayerByNameContaining
	 *
	 */
	@Transactional
	public Set<Player> findPlayerByNameContaining(String name) throws DataAccessException {

		return findPlayerByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Player> findPlayerByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPlayerByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Player>(query.getResultList());
	}

	/**
	 * JPQL Query - findPlayerByName
	 *
	 */
	@Transactional
	public Set<Player> findPlayerByName(String name) throws DataAccessException {

		return findPlayerByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findPlayerByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Player> findPlayerByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPlayerByName", startResult, maxRows, name);
		return new LinkedHashSet<Player>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Player entity) {
		return true;
	}
}
