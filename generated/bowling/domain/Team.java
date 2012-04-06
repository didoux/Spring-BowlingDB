package bowling.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTeams", query = "select myTeam from Team myTeam"),
		@NamedQuery(name = "findTeamByExternalId", query = "select myTeam from Team myTeam where myTeam.externalId = ?1"),
		@NamedQuery(name = "findTeamById", query = "select myTeam from Team myTeam where myTeam.id = ?1"),
		@NamedQuery(name = "findTeamByLeagueId", query = "select myTeam from Team myTeam where myTeam.leagueId = ?1"),
		@NamedQuery(name = "findTeamByName", query = "select myTeam from Team myTeam where myTeam.name = ?1"),
		@NamedQuery(name = "findTeamByNameContaining", query = "select myTeam from Team myTeam where myTeam.name like ?1"),
		@NamedQuery(name = "findTeamByPrimaryKey", query = "select myTeam from Team myTeam where myTeam.id = ?1"),
		@NamedQuery(name = "findTeamByTeamNbr", query = "select myTeam from Team myTeam where myTeam.teamNbr = ?1"),
		@NamedQuery(name = "findTeamByTeamNbrContaining", query = "select myTeam from Team myTeam where myTeam.teamNbr like ?1") })
@Table(catalog = "bowling", name = "team")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Team")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "league_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer leagueId;
	/**
	 */

	@Column(name = "name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "team_nbr", length = 2, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String teamNbr;
	/**
	 */

	@Column(name = "external_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer externalId;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	/**
	 */
	public Integer getLeagueId() {
		return this.leagueId;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setTeamNbr(String teamNbr) {
		this.teamNbr = teamNbr;
	}

	/**
	 */
	public String getTeamNbr() {
		return this.teamNbr;
	}

	/**
	 */
	public void setExternalId(Integer externalId) {
		this.externalId = externalId;
	}

	/**
	 */
	public Integer getExternalId() {
		return this.externalId;
	}

	/**
	 */
	public Team() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Team that) {
		setId(that.getId());
		setLeagueId(that.getLeagueId());
		setName(that.getName());
		setTeamNbr(that.getTeamNbr());
		setExternalId(that.getExternalId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("leagueId=[").append(leagueId).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("teamNbr=[").append(teamNbr).append("] ");
		buffer.append("externalId=[").append(externalId).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Team))
			return false;
		Team equalCheck = (Team) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
