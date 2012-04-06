package bowling.dao;

import bowling.domain.Team;

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
 * DAO to manage Team entities.
 * 
 */
@Repository("TeamDAO")
@Transactional
public class TeamDAOImpl extends AbstractJpaDao<Team> implements TeamDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Team.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TeamDAOImpl
	 *
	 */
	public TeamDAOImpl() {
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
	 * JPQL Query - findTeamByTeamNbr
	 *
	 */
	@Transactional
	public Set<Team> findTeamByTeamNbr(String teamNbr) throws DataAccessException {

		return findTeamByTeamNbr(teamNbr, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByTeamNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByTeamNbr(String teamNbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByTeamNbr", startResult, maxRows, teamNbr);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamByTeamNbrContaining
	 *
	 */
	@Transactional
	public Set<Team> findTeamByTeamNbrContaining(String teamNbr) throws DataAccessException {

		return findTeamByTeamNbrContaining(teamNbr, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByTeamNbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByTeamNbrContaining(String teamNbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByTeamNbrContaining", startResult, maxRows, teamNbr);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamByLeagueId
	 *
	 */
	@Transactional
	public Set<Team> findTeamByLeagueId(Integer leagueId) throws DataAccessException {

		return findTeamByLeagueId(leagueId, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByLeagueId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByLeagueId(Integer leagueId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByLeagueId", startResult, maxRows, leagueId);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamByExternalId
	 *
	 */
	@Transactional
	public Set<Team> findTeamByExternalId(Integer externalId) throws DataAccessException {

		return findTeamByExternalId(externalId, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByExternalId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByExternalId", startResult, maxRows, externalId);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamByNameContaining
	 *
	 */
	@Transactional
	public Set<Team> findTeamByNameContaining(String name) throws DataAccessException {

		return findTeamByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamById
	 *
	 */
	@Transactional
	public Team findTeamById(Integer id) throws DataAccessException {

		return findTeamById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTeamById
	 *
	 */

	@Transactional
	public Team findTeamById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTeamById", startResult, maxRows, id);
			return (bowling.domain.Team) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllTeams
	 *
	 */
	@Transactional
	public Set<Team> findAllTeams() throws DataAccessException {

		return findAllTeams(-1, -1);
	}

	/**
	 * JPQL Query - findAllTeams
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findAllTeams(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTeams", startResult, maxRows);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * JPQL Query - findTeamByPrimaryKey
	 *
	 */
	@Transactional
	public Team findTeamByPrimaryKey(Integer id) throws DataAccessException {

		return findTeamByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByPrimaryKey
	 *
	 */

	@Transactional
	public Team findTeamByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTeamByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Team) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTeamByName
	 *
	 */
	@Transactional
	public Set<Team> findTeamByName(String name) throws DataAccessException {

		return findTeamByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTeamByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Team> findTeamByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTeamByName", startResult, maxRows, name);
		return new LinkedHashSet<Team>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Team entity) {
		return true;
	}
}
