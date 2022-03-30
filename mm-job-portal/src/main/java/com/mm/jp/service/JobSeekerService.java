/**
 * 
 */
package com.mm.jp.service;

import java.util.List;

import com.mm.jp.entities.JobSeeker;
import com.mm.jp.entities.JobSeekerProfile;

/**
 * @author dorak
 *
 */
public interface JobSeekerService {

	List<JobSeeker> getJobSeekersList();

	List<JobSeekerProfile> findAllJobSeekersProfiles();

	JobSeeker findJobSeekerById(Long jsId);

}
