/**
 * 
 */
package com.mm.jp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name = "jobseeker_profile")
public class JobSeekerProfile {
		
	@Id
	@Column(name = "jsp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long profileId;
	
	/*@Column(name = "jsp_js_id")
	private Long jobSeekerId;*/
	
	@Column(name = "jsp_qualification")
	private String qualification;
	
	@Column(name = "jsp_specialization")
	private String specialization;
	
	@Column(name = "jsp_experiance")
	private int experience;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="jsp_js_id", referencedColumnName = "js_id", nullable = false )
	private JobSeeker jobSeeker;
	
		
	public JobSeekerProfile() {}
	
	/**
	 * @param qualification
	 * @param specialization
	 * @param experience
	 * @param jobSeeker
	 */
	public JobSeekerProfile(String qualification, String specialization, int experience,
			JobSeeker jobSeeker) {
		this.qualification = qualification;
		this.specialization = specialization;
		this.experience = experience;
		this.jobSeeker = jobSeeker;
	}

	/**
	 * @return the profileId
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

	/**
	 * @return the jobSeeker
	 */
/*	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}*/

	/**
	 * @param jobSeeker the jobSeeker to set
	 */
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

}
