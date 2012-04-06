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
		@NamedQuery(name = "findAllPlayers", query = "select myPlayer from Player myPlayer"),
		@NamedQuery(name = "findPlayerByExternalId", query = "select myPlayer from Player myPlayer where myPlayer.externalId = ?1"),
		@NamedQuery(name = "findPlayerById", query = "select myPlayer from Player myPlayer where myPlayer.id = ?1"),
		@NamedQuery(name = "findPlayerByName", query = "select myPlayer from Player myPlayer where myPlayer.name = ?1"),
		@NamedQuery(name = "findPlayerByNameContaining", query = "select myPlayer from Player myPlayer where myPlayer.name like ?1"),
		@NamedQuery(name = "findPlayerByPrimaryKey", query = "select myPlayer from Player myPlayer where myPlayer.id = ?1"),
		@NamedQuery(name = "findPlayerByTeamId", query = "select myPlayer from Player myPlayer where myPlayer.teamId = ?1") })
@Table(catalog = "bowling", name = "player")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Player")
public class Player implements Serializable {
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

	@Column(name = "team_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer teamId;
	/**
	 */

	@Column(name = "name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
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
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	/**
	 */
	public Integer getTeamId() {
		return this.teamId;
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
	public Player() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Player that) {
		setId(that.getId());
		setTeamId(that.getTeamId());
		setName(that.getName());
		setExternalId(that.getExternalId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("teamId=[").append(teamId).append("] ");
		buffer.append("name=[").append(name).append("] ");
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
		if (!(obj instanceof Player))
			return false;
		Player equalCheck = (Player) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
