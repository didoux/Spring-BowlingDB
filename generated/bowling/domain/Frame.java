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
		@NamedQuery(name = "findAllFrames", query = "select myFrame from Frame myFrame"),
		@NamedQuery(name = "findFrameByGameId", query = "select myFrame from Frame myFrame where myFrame.gameId = ?1"),
		@NamedQuery(name = "findFrameById", query = "select myFrame from Frame myFrame where myFrame.id = ?1"),
		@NamedQuery(name = "findFrameByLaneNbr", query = "select myFrame from Frame myFrame where myFrame.laneNbr = ?1"),
		@NamedQuery(name = "findFrameByNbr", query = "select myFrame from Frame myFrame where myFrame.nbr = ?1"),
		@NamedQuery(name = "findFrameByNotes", query = "select myFrame from Frame myFrame where myFrame.notes = ?1"),
		@NamedQuery(name = "findFrameByNotesContaining", query = "select myFrame from Frame myFrame where myFrame.notes like ?1"),
		@NamedQuery(name = "findFrameByPrimaryKey", query = "select myFrame from Frame myFrame where myFrame.id = ?1") })
@Table(catalog = "bowling", name = "frame")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Frame")
public class Frame implements Serializable {
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

	@Column(name = "game_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer gameId;
	/**
	 */

	@Column(name = "nbr", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer nbr;
	/**
	 */

	@Column(name = "lane_nbr", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer laneNbr;
	/**
	 */

	@Column(name = "notes")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String notes;

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
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	/**
	 */
	public Integer getGameId() {
		return this.gameId;
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
	public void setLaneNbr(Integer laneNbr) {
		this.laneNbr = laneNbr;
	}

	/**
	 */
	public Integer getLaneNbr() {
		return this.laneNbr;
	}

	/**
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 */
	public String getNotes() {
		return this.notes;
	}

	/**
	 */
	public Frame() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Frame that) {
		setId(that.getId());
		setGameId(that.getGameId());
		setNbr(that.getNbr());
		setLaneNbr(that.getLaneNbr());
		setNotes(that.getNotes());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("gameId=[").append(gameId).append("] ");
		buffer.append("nbr=[").append(nbr).append("] ");
		buffer.append("laneNbr=[").append(laneNbr).append("] ");
		buffer.append("notes=[").append(notes).append("] ");

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
		if (!(obj instanceof Frame))
			return false;
		Frame equalCheck = (Frame) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
