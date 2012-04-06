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
		@NamedQuery(name = "findAllThrows", query = "select myThrow from Throw myThrow"),
		@NamedQuery(name = "findThrowBy10pin", query = "select myThrow from Throw myThrow where myThrow.10pin = ${10pin}"),
		@NamedQuery(name = "findThrowBy1pin", query = "select myThrow from Throw myThrow where myThrow.1pin = ${1pin}"),
		@NamedQuery(name = "findThrowBy2pin", query = "select myThrow from Throw myThrow where myThrow.2pin = ${2pin}"),
		@NamedQuery(name = "findThrowBy3pin", query = "select myThrow from Throw myThrow where myThrow.3pin = ${3pin}"),
		@NamedQuery(name = "findThrowBy4pin", query = "select myThrow from Throw myThrow where myThrow.4pin = ${4pin}"),
		@NamedQuery(name = "findThrowBy5pin", query = "select myThrow from Throw myThrow where myThrow.5pin = ${5pin}"),
		@NamedQuery(name = "findThrowBy6pin", query = "select myThrow from Throw myThrow where myThrow.6pin = ${6pin}"),
		@NamedQuery(name = "findThrowBy7pin", query = "select myThrow from Throw myThrow where myThrow.7pin = ${7pin}"),
		@NamedQuery(name = "findThrowBy8pin", query = "select myThrow from Throw myThrow where myThrow.8pin = ${8pin}"),
		@NamedQuery(name = "findThrowBy9pin", query = "select myThrow from Throw myThrow where myThrow.9pin = ${9pin}"),
		@NamedQuery(name = "findThrowByBallNameTxt", query = "select myThrow from Throw myThrow where myThrow.ballNameTxt = ?1"),
		@NamedQuery(name = "findThrowByBallNameTxtContaining", query = "select myThrow from Throw myThrow where myThrow.ballNameTxt like ?1"),
		@NamedQuery(name = "findThrowByFrameId", query = "select myThrow from Throw myThrow where myThrow.frameId = ?1"),
		@NamedQuery(name = "findThrowById", query = "select myThrow from Throw myThrow where myThrow.id = ?1"),
		@NamedQuery(name = "findThrowByNbr", query = "select myThrow from Throw myThrow where myThrow.nbr = ?1"),
		@NamedQuery(name = "findThrowByNbrOfPinsDown", query = "select myThrow from Throw myThrow where myThrow.nbrOfPinsDown = ?1"),
		@NamedQuery(name = "findThrowByNoteTxt", query = "select myThrow from Throw myThrow where myThrow.noteTxt = ?1"),
		@NamedQuery(name = "findThrowByNoteTxtContaining", query = "select myThrow from Throw myThrow where myThrow.noteTxt like ?1"),
		@NamedQuery(name = "findThrowByPinBinaryArray", query = "select myThrow from Throw myThrow where myThrow.pinBinaryArray = ?1"),
		@NamedQuery(name = "findThrowByPosition", query = "select myThrow from Throw myThrow where myThrow.position = ?1"),
		@NamedQuery(name = "findThrowByPrimaryKey", query = "select myThrow from Throw myThrow where myThrow.id = ?1"),
		@NamedQuery(name = "findThrowByTarget", query = "select myThrow from Throw myThrow where myThrow.target = ?1") })
@Table(catalog = "bowling", name = "throw")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Spring-BowlingDB/bowling/domain", name = "Throw")
public class Throw implements Serializable {
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

	@Column(name = "frame_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer frameId;
	/**
	 */

	@Column(name = "nbr", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer nbr;
	/**
	 */

	@Column(name = "nbrOfPinsDown", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer nbrOfPinsDown;
	/**
	 */

	@Column(name = "1PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin;
	/**
	 */

	@Column(name = "2PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_1;
	/**
	 */

	@Column(name = "3PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_2;
	/**
	 */

	@Column(name = "4PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_3;
	/**
	 */

	@Column(name = "5PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_4;
	/**
	 */

	@Column(name = "6PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_5;
	/**
	 */

	@Column(name = "7PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_6;
	/**
	 */

	@Column(name = "8PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_7;
	/**
	 */

	@Column(name = "9PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _pin_8;
	/**
	 */

	@Column(name = "10PIN")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean _0pin;
	/**
	 */

	@Column(name = "pinBinaryArray")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer pinBinaryArray;
	/**
	 */

	@Column(name = "ballNameTxt")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ballNameTxt;
	/**
	 */

	@Column(name = "target")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer target;
	/**
	 */

	@Column(name = "position")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer position;
	/**
	 */

	@Column(name = "noteTxt")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String noteTxt;

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
	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}

	/**
	 */
	public Integer getFrameId() {
		return this.frameId;
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
	public void setNbrOfPinsDown(Integer nbrOfPinsDown) {
		this.nbrOfPinsDown = nbrOfPinsDown;
	}

	/**
	 */
	public Integer getNbrOfPinsDown() {
		return this.nbrOfPinsDown;
	}

	/**
	 */
	public void set_pin(Boolean _pin) {
		this._pin = _pin;
	}

	/**
	 */
	public Boolean get_pin() {
		return this._pin;
	}

	/**
	 */
	public void set_pin_1(Boolean _pin_1) {
		this._pin_1 = _pin_1;
	}

	/**
	 */
	public Boolean get_pin_1() {
		return this._pin_1;
	}

	/**
	 */
	public void set_pin_2(Boolean _pin_2) {
		this._pin_2 = _pin_2;
	}

	/**
	 */
	public Boolean get_pin_2() {
		return this._pin_2;
	}

	/**
	 */
	public void set_pin_3(Boolean _pin_3) {
		this._pin_3 = _pin_3;
	}

	/**
	 */
	public Boolean get_pin_3() {
		return this._pin_3;
	}

	/**
	 */
	public void set_pin_4(Boolean _pin_4) {
		this._pin_4 = _pin_4;
	}

	/**
	 */
	public Boolean get_pin_4() {
		return this._pin_4;
	}

	/**
	 */
	public void set_pin_5(Boolean _pin_5) {
		this._pin_5 = _pin_5;
	}

	/**
	 */
	public Boolean get_pin_5() {
		return this._pin_5;
	}

	/**
	 */
	public void set_pin_6(Boolean _pin_6) {
		this._pin_6 = _pin_6;
	}

	/**
	 */
	public Boolean get_pin_6() {
		return this._pin_6;
	}

	/**
	 */
	public void set_pin_7(Boolean _pin_7) {
		this._pin_7 = _pin_7;
	}

	/**
	 */
	public Boolean get_pin_7() {
		return this._pin_7;
	}

	/**
	 */
	public void set_pin_8(Boolean _pin_8) {
		this._pin_8 = _pin_8;
	}

	/**
	 */
	public Boolean get_pin_8() {
		return this._pin_8;
	}

	/**
	 */
	public void set_0pin(Boolean _0pin) {
		this._0pin = _0pin;
	}

	/**
	 */
	public Boolean get_0pin() {
		return this._0pin;
	}

	/**
	 */
	public void setPinBinaryArray(Integer pinBinaryArray) {
		this.pinBinaryArray = pinBinaryArray;
	}

	/**
	 */
	public Integer getPinBinaryArray() {
		return this.pinBinaryArray;
	}

	/**
	 */
	public void setBallNameTxt(String ballNameTxt) {
		this.ballNameTxt = ballNameTxt;
	}

	/**
	 */
	public String getBallNameTxt() {
		return this.ballNameTxt;
	}

	/**
	 */
	public void setTarget(Integer target) {
		this.target = target;
	}

	/**
	 */
	public Integer getTarget() {
		return this.target;
	}

	/**
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}

	/**
	 */
	public Integer getPosition() {
		return this.position;
	}

	/**
	 */
	public void setNoteTxt(String noteTxt) {
		this.noteTxt = noteTxt;
	}

	/**
	 */
	public String getNoteTxt() {
		return this.noteTxt;
	}

	/**
	 */
	public Throw() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Throw that) {
		setId(that.getId());
		setFrameId(that.getFrameId());
		setNbr(that.getNbr());
		setNbrOfPinsDown(that.getNbrOfPinsDown());
		set_pin(that.get_pin());
		set_pin_1(that.get_pin_1());
		set_pin_2(that.get_pin_2());
		set_pin_3(that.get_pin_3());
		set_pin_4(that.get_pin_4());
		set_pin_5(that.get_pin_5());
		set_pin_6(that.get_pin_6());
		set_pin_7(that.get_pin_7());
		set_pin_8(that.get_pin_8());
		set_0pin(that.get_0pin());
		setPinBinaryArray(that.getPinBinaryArray());
		setBallNameTxt(that.getBallNameTxt());
		setTarget(that.getTarget());
		setPosition(that.getPosition());
		setNoteTxt(that.getNoteTxt());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("frameId=[").append(frameId).append("] ");
		buffer.append("nbr=[").append(nbr).append("] ");
		buffer.append("nbrOfPinsDown=[").append(nbrOfPinsDown).append("] ");
		buffer.append("_pin=[").append(_pin).append("] ");
		buffer.append("_pin_1=[").append(_pin_1).append("] ");
		buffer.append("_pin_2=[").append(_pin_2).append("] ");
		buffer.append("_pin_3=[").append(_pin_3).append("] ");
		buffer.append("_pin_4=[").append(_pin_4).append("] ");
		buffer.append("_pin_5=[").append(_pin_5).append("] ");
		buffer.append("_pin_6=[").append(_pin_6).append("] ");
		buffer.append("_pin_7=[").append(_pin_7).append("] ");
		buffer.append("_pin_8=[").append(_pin_8).append("] ");
		buffer.append("_0pin=[").append(_0pin).append("] ");
		buffer.append("pinBinaryArray=[").append(pinBinaryArray).append("] ");
		buffer.append("ballNameTxt=[").append(ballNameTxt).append("] ");
		buffer.append("target=[").append(target).append("] ");
		buffer.append("position=[").append(position).append("] ");
		buffer.append("noteTxt=[").append(noteTxt).append("] ");

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
		if (!(obj instanceof Throw))
			return false;
		Throw equalCheck = (Throw) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
