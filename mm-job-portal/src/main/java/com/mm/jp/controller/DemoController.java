/**
 * 
 */
package com.mm.jp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.jp.util.JobPortalPropsUtil;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
	
	/*@Value("${jobportal.title}")
	private String jobportalTitle;
	
	@Value("${jobportal.admin}")
	private String jobportalAdmin;
	
	@Value("${jobportal.phone}")
	private String jobportalPhone;
	
	@Value("${jobportal.jobs.max.limit}")
	private Integer jobsMaxLimit;
	
	@Value("${jobportal.jobseekers.max.limit}")
	private Integer jobseekersMaxLimit;
	
	@Value("${jobportal.fee}")
	private Double jobportalFee;
	*/
	
	@Autowired
	private JobPortalPropsUtil props;
	
	@GetMapping
	public String getPropertyValue() {
	/*	return "<h1>Title :: " + jobportalTitle + "<br />"
				+ "Admin :: " + jobportalAdmin + "<br />"
						+ "Phone :: " + jobportalPhone + "<br />"
								+ "Jobs Max Limit :: " + jobsMaxLimit + "<br />"
										+ "Job Seekers Max Limit :: " + jobseekersMaxLimit + "<br />"
												+ "Job Portal Membership Fee :: " + jobportalFee + "</h1>";
*/
		LOGGER.trace("TRACE log :: Admin Name - " + props.getAdmin());
		LOGGER.debug("DEBUG log :: Admin Name - " + props.getAdmin() );
		LOGGER.info("INFO log :: Admin Name - " + props.getAdmin() );
		LOGGER.warn("WARN log :: Admin Name - " + props.getAdmin() );
		LOGGER.error("ERROR log :: Admin Name - " + props.getAdmin() );
		
		return "<h1>Title :: " + props.getJobPortalTitle() + "<br />"
		+ "Admin :: " + props.getAdmin() + "<br />"
				+ "Phone :: " + props.getPhone() + "<br />"
						+ "Jobs Max Limit :: " + props.getJobsMaxLimit() + "<br />"
								+ "Job Seekers Max Limit :: " + props.getJobseekersMaxLimit() + "<br />"
										+ "Job Portal Membership Fee :: " + props.getFee() + "</h1>";
}
	
}
