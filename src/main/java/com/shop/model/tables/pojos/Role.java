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
@Table(name = "role", schema = "shop")
public class Role implements Serializable {

	private static final long serialVersionUID = 700976128;

	private Integer id;
	private String  name;
	private String  description;

	public Role() {}

	public Role(Role value) {
		this.id = value.id;
		this.name = value.name;
		this.description = value.description;
	}

	public Role(
		Integer id,
		String  name,
		String  description
	) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false, length = 20)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}