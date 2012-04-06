package bowling.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllWeeks", query = "select myWeek from Week myWeek"),
		@NamedQuery(name = "findWeekByDate", query = "select myWeek from Week myWeek where myWeek.date = ?1"),
		@NamedQuery(name = "findWeekByDateAfter", query = "select myWeek from Week myWeek where myWeek.date > ?1"),
		@NamedQuery(name = "findWeekByDateBefore", query = "select myWeek from Week myWeek where myWeek.date < ?1"),
		@NamedQuery(name = "findWeekById", query = "select myWeek from Week myWeek where myWeek.id = ?1"),
		@NamedQuery(name = "findWeekByPrimaryKey", query = "select myWeek from Week myWeek where myWeek.id = ?1"),
		@NamedQuery(name = "findWeekByTeamId", query = "select myWeek from Week myWeek where myWeek.teamId = ?1"),
		@NamedQuery(name = "findWeekByWeekNumber", query = "select myWeek from Week myWeek where myWeek.weekNumber = ?1") })
@Table(catalog = "bowling", name = "week")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Week")
public class Week implements Serializable {
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

	@Column(name = "weekNumber", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer weekNumber;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar date;
	/**
	 */

	@Column(name = "team_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer teamId;

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
	public void setWeekNumber(Integer weekNumber) {
		this.weekNumber = weekNumber;
	}

	/**
	 */
	public Integer getWeekNumber() {
		return this.weekNumber;
	}

	/**
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 */
	public Calendar getDate() {
		return this.date;
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
	public Week() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Week that) {
		setId(that.getId());
		setWeekNumber(that.getWeekNumber());
		setDate(that.getDate());
		setTeamId(that.getTeamId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("weekNumber=[").append(weekNumber).append("] ");
		buffer.append("date=[").append(date).append("] ");
		buffer.append("teamId=[").append(teamId).append("] ");

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
		if (!(obj instanceof Week))
			return false;
		Week equalCheck = (Week) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
