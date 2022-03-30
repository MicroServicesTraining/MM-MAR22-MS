/**
 * 
 */
package com.mm.jp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mm.jp.dao.JobSeekerDao;
import com.mm.jp.entities.JobSeeker;
import com.mm.jp.entities.JobSeekerProfile;
import com.mm.jp.repositories.JobSeekerProfileRepository;
import com.mm.jp.repositories.JobSeekerRepository;

/**
 * @author dorak
 *
 */
@Component
public class JobSeekerDaoImpl implements JobSeekerDao {

	@Autowired
	private JobSeekerRepository jobSeekerRepository;
	private JobSeekerProfileRepository jobSeekerProfileRepository;
	/* (non-Javadoc)
	 * @see com.mm.jp.dao.JobSeekerDao#getJobSeekersList()
	 */
	@Override
	public List<JobSeeker> getJobSeekersList() {
		return jobSeekerRepository.findAll();
	}
	@Override
	public List<JobSeekerProfile> findAllJobSeekersProfiles() {
		return jobSeekerProfileRepository.findAll();
	}
	@Override
	public JobSeeker findJobSeekerById(Long jsId) {
		return jobSeekerRepository.findById(jsId).orElse(null);
	}

}
