/**
 * 
 */
package com.mm.jp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.jp.util.JobPortalProperties;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/props")
public class PropertiesDemoController {

	/*@Value("${jobportal.title}")
	private String title;
	@Value("${jobportal.admin}")
	private String admin;
	@Value("${jobportal.phone}")
	private String phone;
	@Value("${jobportal.jobsMaxLimit}")
	private String jobsMaxLimit;
	@Value("${jobportal.jobseekersMaxLimit}")
	private String jobseekersMaxLimit;
	@Value("${jobportal.fee}")
	private String fee;*/

	@Autowired
	private JobPortalProperties props;
	
	@GetMapping
	public String showProperties() {
		/*return "<h1>"
				+ "Title :: " + title +"<br />"
				+ "Admin :: " + admin +"<br />"
				+ "Phone :: " + phone +"<br />"
				+ "Jobs Max Limit :: " + jobsMaxLimit +"<br />"
				+ "JobSeekers Max Limit " + jobseekersMaxLimit +"<br />"
				+ "Job Portal Fee :: " + fee +"<br />"
				+ "</h1>";*/
		return "<h1>"
		+ "Title :: " + props.getTitle() +"<br />"
		+ "Admin :: " + props.getAdmin() +"<br />"
		+ "Phone :: " + props.getPhone() +"<br />"
		+ "Jobs Max Limit :: " + props.getJobsMaxLimit() +"<br />"
		+ "JobSeekers Max Limit " + props.getJobseekersMaxLimit() +"<br />"
		+ "Job Portal Fee :: " + props.getFee() +"<br />"
		+ "</h1>";
	}
	
}
