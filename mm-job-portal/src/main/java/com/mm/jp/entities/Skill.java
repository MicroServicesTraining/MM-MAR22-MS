/**
 * 
 */
package com.mm.jp.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author dorak
 *
 */
@Entity
@Table(name = "skills")
public class Skill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7549606793464412219L;

	@Id
	@Column(name = "sk_id")
	private Long id;
	@Column(name = "sk_name")
	private String name;
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "sk_js_id", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private JobSeeker jobSeeker;

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
	 * @return the jobSeekerId
	 */
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	/**
	 * @param jobSeekerId the jobSeekerId to set
	 */
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

}
