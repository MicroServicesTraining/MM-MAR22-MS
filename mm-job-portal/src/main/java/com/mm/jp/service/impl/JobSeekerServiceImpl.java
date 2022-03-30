/**
 * 
 */
package com.mm.jp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.jp.dao.JobSeekerDao;
import com.mm.jp.entities.JobSeeker;
import com.mm.jp.entities.JobSeekerProfile;
import com.mm.jp.service.JobSeekerService;

/**
 * @author dorak
 *
 */
@Service
public class JobSeekerServiceImpl implements JobSeekerService {

	@Autowired
	private JobSeekerDao jobSeekerDao;
	
	/* (non-Javadoc)
	 * @see com.mm.jp.service.JobSeekerService#getJobSeekersList()
	 */
	@Override
	public List<JobSeeker> getJobSeekersList() {
		return jobSeekerDao.getJobSeekersList();
	}

	@Override
	public List<JobSeekerProfile> findAllJobSeekersProfiles() {
		return jobSeekerDao.findAllJobSeekersProfiles();
	}

	@Override
	public JobSeeker findJobSeekerById(Long jsId) {
		return jobSeekerDao.findJobSeekerById(jsId);
	}

}
