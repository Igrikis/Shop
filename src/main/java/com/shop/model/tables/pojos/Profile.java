/**
 * This class is generated by jOOQ
 */
package com.shop.model.tables.pojos;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "profile", schema = "shop")
public class Profile implements Serializable {

	private static final long serialVersionUID = 408844720;

	private Integer id;
	private String  login;
	private String  password;
	private String  firstname;
	private String  lastname;

	public Profile() {}

	public Profile(Profile value) {
		this.id = value.id;
		this.login = value.login;
		this.password = value.password;
		this.firstname = value.firstname;
		this.lastname = value.lastname;
	}

	public Profile(
		Integer id,
		String  login,
		String  password,
		String  firstname,
		String  lastname
	) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "login", nullable = false, length = 20)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "password", nullable = false, length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "firstname", nullable = false, length = 30)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false, length = 30)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}