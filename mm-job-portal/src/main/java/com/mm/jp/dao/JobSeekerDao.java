/**
 * 
 */
package com.mm.jp.dao;

import java.util.List;

import com.mm.jp.entities.JobSeeker;
import com.mm.jp.entities.JobSeekerProfile;

/**
 * @author dorak
 *
 */
public interface JobSeekerDao {

	List<JobSeeker> getJobSeekersList();

	List<JobSeekerProfile> findAllJobSeekersProfiles();

	JobSeeker findJobSeekerById(Long jsId);

}
