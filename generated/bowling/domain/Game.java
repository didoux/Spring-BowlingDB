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
		@NamedQuery(name = "findAllGames", query = "select myGame from Game myGame"),
		@NamedQuery(name = "findGameById", query = "select myGame from Game myGame where myGame.id = ?1"),
		@NamedQuery(name = "findGameByNbr", query = "select myGame from Game myGame where myGame.nbr = ?1"),
		@NamedQuery(name = "findGameByPlayerId", query = "select myGame from Game myGame where myGame.playerId = ?1"),
		@NamedQuery(name = "findGameByPrimaryKey", query = "select myGame from Game myGame where myGame.id = ?1"),
		@NamedQuery(name = "findGameByScore", query = "select myGame from Game myGame where myGame.score = ?1"),
		@NamedQuery(name = "findGameByStartingLaneNbr", query = "select myGame from Game myGame where myGame.startingLaneNbr = ?1"),
		@NamedQuery(name = "findGameByWeekId", query = "select myGame from Game myGame where myGame.weekId = ?1") })
@Table(catalog = "bowling", name = "game")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Game")
public class Game implements Serializable {
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

	@Column(name = "player_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer playerId;
	/**
	 */

	@Column(name = "week_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer weekId;
	/**
	 */

	@Column(name = "nbr", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer nbr;
	/**
	 */

	@Column(name = "starting_lane_nbr", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer startingLaneNbr;
	/**
	 */

	@Column(name = "score")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer score;

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
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 */
	public Integer getPlayerId() {
		return this.playerId;
	}

	/**
	 */
	public void setWeekId(Integer weekId) {
		this.weekId = weekId;
	}

	/**
	 */
	public Integer getWeekId() {
		return this.weekId;
	}

	/**
	 */
	public void setNbr(Integer nbr) {
		this.nbr = nbr;
	}

	/**
	 */
	public Integer getNbr() {
		return this.nbr;
	}

	/**
	 */
	public void setStartingLaneNbr(Integer startingLaneNbr) {
		this.startingLaneNbr = startingLaneNbr;
	}

	/**
	 */
	public Integer getStartingLaneNbr() {
		return this.startingLaneNbr;
	}

	/**
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 */
	public Integer getScore() {
		return this.score;
	}

	/**
	 */
	public Game() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Game that) {
		setId(that.getId());
		setPlayerId(that.getPlayerId());
		setWeekId(that.getWeekId());
		setNbr(that.getNbr());
		setStartingLaneNbr(that.getStartingLaneNbr());
		setScore(that.getScore());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("playerId=[").append(playerId).append("] ");
		buffer.append("weekId=[").append(weekId).append("] ");
		buffer.append("nbr=[").append(nbr).append("] ");
		buffer.append("startingLaneNbr=[").append(startingLaneNbr).append("] ");
		buffer.append("score=[").append(score).append("] ");

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
		if (!(obj instanceof Game))
			return false;
		Game equalCheck = (Game) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
