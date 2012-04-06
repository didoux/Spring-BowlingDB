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
		@NamedQuery(name = "findAllLeagues", query = "select myLeague from League myLeague"),
		@NamedQuery(name = "findLeagueByExternalId", query = "select myLeague from League myLeague where myLeague.externalId = ?1"),
		@NamedQuery(name = "findLeagueById", query = "select myLeague from League myLeague where myLeague.id = ?1"),
		@NamedQuery(name = "findLeagueByName", query = "select myLeague from League myLeague where myLeague.name = ?1"),
		@NamedQuery(name = "findLeagueByNameContaining", query = "select myLeague from League myLeague where myLeague.name like ?1"),
		@NamedQuery(name = "findLeagueByPrimaryKey", query = "select myLeague from League myLeague where myLeague.id = ?1"),
		@NamedQuery(name = "findLeagueByStartDt", query = "select myLeague from League myLeague where myLeague.startDt = ?1") })
@Table(catalog = "bowling", name = "league")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "League")
public class League implements Serializable {
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

	@Column(name = "name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_dt")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar startDt;
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
	public void setStartDt(Calendar startDt) {
		this.startDt = startDt;
	}

	/**
	 */
	public Calendar getStartDt() {
		return this.startDt;
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
	public League() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(League that) {
		setId(that.getId());
		setName(that.getName());
		setStartDt(that.getStartDt());
		setExternalId(that.getExternalId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("startDt=[").append(startDt).append("] ");
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
		if (!(obj instanceof League))
			return false;
		League equalCheck = (League) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
