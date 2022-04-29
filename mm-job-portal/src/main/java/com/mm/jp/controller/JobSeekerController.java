/**
 * 
 */
package com.mm.jp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.jp.entities.JobSeeker;
import com.mm.jp.entities.JobSeekerProfile;
import com.mm.jp.service.JobSeekerService;

import io.swagger.annotations.ApiOperation;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/api/jobportal/jobseekers")
public class JobSeekerController {
	
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@ApiOperation(value = "List All Job Seekers")
	@GetMapping
	public List<JobSeeker> getJobSeekersList(){
		return jobSeekerService.getJobSeekersList();
	}
	
	@ApiOperation(value = "List All Job Seeker Profiles")
	@GetMapping("profiles")
	public List<JobSeekerProfile> findAllJobSeekersProfiles(){
		return jobSeekerService.findAllJobSeekersProfiles();
	}
	
	@ApiOperation(value = "Job Seeker Information By ID")
	@GetMapping("byId")
	public JobSeeker findJobSeekerById(@RequestParam(name="jobSeekerId") Long jsId){
		return jobSeekerService.findJobSeekerById(jsId);
	}
	
}
