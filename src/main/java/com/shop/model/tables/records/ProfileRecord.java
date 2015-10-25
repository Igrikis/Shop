/**
 * This class is generated by jOOQ
 */
package com.shop.model.tables.records;


import com.shop.model.tables.Profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "profile", schema = "shop")
public class ProfileRecord extends UpdatableRecordImpl<ProfileRecord> implements Record6<Integer, String, String, String, String, String> {

	private static final long serialVersionUID = -60408405;

	/**
	 * Setter for <code>shop.profile.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>shop.profile.id</code>.
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>shop.profile.login</code>.
	 */
	public void setLogin(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>shop.profile.login</code>.
	 */
	@Column(name = "login", nullable = false, length = 20)
	public String getLogin() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>shop.profile.password</code>.
	 */
	public void setPassword(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>shop.profile.password</code>.
	 */
	@Column(name = "password", nullable = false, length = 30)
	public String getPassword() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>shop.profile.firstname</code>.
	 */
	public void setFirstname(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>shop.profile.firstname</code>.
	 */
	@Column(name = "firstname", nullable = false, length = 30)
	public String getFirstname() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>shop.profile.lastname</code>.
	 */
	public void setLastname(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>shop.profile.lastname</code>.
	 */
	@Column(name = "lastname", nullable = false, length = 30)
	public String getLastname() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>shop.profile.email</code>.
	 */
	public void setEmail(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>shop.profile.email</code>.
	 */
	@Column(name = "email", nullable = false, length = 255)
	public String getEmail() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Profile.PROFILE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Profile.PROFILE.LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Profile.PROFILE.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Profile.PROFILE.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Profile.PROFILE.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Profile.PROFILE.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getLogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value2(String value) {
		setLogin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value3(String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value4(String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value5(String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord value6(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProfileRecord
	 */
	public ProfileRecord() {
		super(Profile.PROFILE);
	}

	/**
	 * Create a detached, initialised ProfileRecord
	 */
	public ProfileRecord(Integer id, String login, String password, String firstname, String lastname, String email) {
		super(Profile.PROFILE);

		setValue(0, id);
		setValue(1, login);
		setValue(2, password);
		setValue(3, firstname);
		setValue(4, lastname);
		setValue(5, email);
	}
}
