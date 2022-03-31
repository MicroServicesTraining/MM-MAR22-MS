/**
 * 
 */
package com.mm.jp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name = "job_postings")
public class JobPosting {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jp_id")
	 private Long jpId;
	 
	 @Column(name = "jp_title")
	 private String jpTitle;
	 
	 @Column(name = "jp_salary")
	 private Double jpSalary;
	 
	 @ManyToMany(mappedBy = "jobPostings", fetch = FetchType.LAZY)
	 private Set<JobSeeker> jobSeekers = new HashSet<>();
	 
	 public JobPosting() {}
	 

	/**
	 * @param jpTitle
	 * @param jpSalary
	 */
	public JobPosting(String jpTitle, Double jpSalary) {
		this.jpTitle = jpTitle;
		this.jpSalary = jpSalary;
	}

	/**
	 * @return the jpId
	 */
	public Long getJpId() {
		return jpId;
	}

	/**
	 * @param jpId the jpId to set
	 */
	public void setJpId(Long jpId) {
		this.jpId = jpId;
	}

	/**
	 * @return the jpTitle
	 */
	public String getJpTitle() {
		return jpTitle;
	}

	/**
	 * @param jpTitle the jpTitle to set
	 */
	public void setJpTitle(String jpTitle) {
		this.jpTitle = jpTitle;
	}

	/**
	 * @return the jpSalary
	 */
	public Double getJpSalary() {
		return jpSalary;
	}

	/**
	 * @param jpSalary the jpSalary to set
	 */
	public void setJpSalary(Double jpSalary) {
		this.jpSalary = jpSalary;
	}


	/**
	 * @return the jobSeekers
	 */
	/*public Set<JobSeeker> getJobSeekers() {
		return jobSeekers;
	}*/


	/**
	 * @param jobSeekers the jobSeekers to set
	 */
	public void setJobSeekers(Set<JobSeeker> jobSeekers) {
		this.jobSeekers = jobSeekers;
	}
	
}

