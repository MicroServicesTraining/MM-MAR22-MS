/**
 * 
 */
package com.mm.jp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name="job_seeker")
public class JobSeeker {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="js_id")
	private Long jsId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "address")
	private String address;
	
	@OneToOne(mappedBy = "jobSeeker", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private JobSeekerProfile profile;
	
	@OneToMany(mappedBy = "jobSeeker", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Skill> skillSet;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable( name = "job_applications",
				joinColumns = {
						@JoinColumn(name = "ja_js_id", referencedColumnName = "js_id", nullable = false, updatable = false),
				},
				inverseJoinColumns = {
						@JoinColumn(name = "ja_jp_id", referencedColumnName = "jp_id",  nullable = false, updatable = false),
				}				
			)
	private Set<JobPosting> jobPostings = new HashSet<>();

	/**
	 * @return the jsId
	 */
	public Long getJsId() {
		return jsId;
	}

	/**
	 * @param jsId the jsId to set
	 */
	public void setJsId(Long jsId) {
		this.jsId = jsId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the profile
	 */
	public JobSeekerProfile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(JobSeekerProfile profile) {
		this.profile = profile;
	}

	/**
	 * @return the skillSet
	 */
	public Set<Skill> getSkillSet() {
		return skillSet;
	}

	/**
	 * @param skillSet the skillSet to set
	 */
	public void setSkillSet(Set<Skill> skillSet) {
		this.skillSet = skillSet;
	}
	
	/**
	 * @return the jobPostings
	 */
	public Set<JobPosting> getJobPostings() {
		return jobPostings;
	}

	/**
	 * @param jobPostings the jobPostings to set
	 */
	public void setJobPostings(Set<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}
	
}