/**
 * 
 */
package com.mm.sb.jpa.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ADMIN
 *
 */
@Entity
@Table(name = "movies")
public class Movie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4555471596598973751L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 10)
	private Long id;
	
	@Column(name = "name", length = 45, updatable = true)
	private String name;
	
	@Column(name = "gener", length = 20, updatable = true)
	private String gener;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gener
	 */
	public String getGener() {
		return gener;
	}

	/**
	 * @param gener the gener to set
	 */
	public void setGener(String gener) {
		this.gener = gener;
	}
}
