/**
 * 
 */
package com.mm.jp.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author dorak
 *
 */
@Configuration
@PropertySources({
	@PropertySource("classpath:jobportalconfig.properties")
	//@PropertySource("file:D:\\OnlineClass\\Mindmajix\\jobportalconfig.properties")
})
@ConfigurationProperties(prefix = "jobportal")
public class JobPortalProperties {
/*	@Value("${jobportal.title}")
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
	
	private String title;
	private String admin;
	private String phone;
	private String jobsMaxLimit;
	private String jobseekersMaxLimit;
	private String fee;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the admin
	 */
	public String getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the jobsMaxLimit
	 */
	public String getJobsMaxLimit() {
		return jobsMaxLimit;
	}
	/**
	 * @param jobsMaxLimit the jobsMaxLimit to set
	 */
	public void setJobsMaxLimit(String jobsMaxLimit) {
		this.jobsMaxLimit = jobsMaxLimit;
	}
	/**
	 * @return the jobseekersMaxLimit
	 */
	public String getJobseekersMaxLimit() {
		return jobseekersMaxLimit;
	}
	/**
	 * @param jobseekersMaxLimit the jobseekersMaxLimit to set
	 */
	public void setJobseekersMaxLimit(String jobseekersMaxLimit) {
		this.jobseekersMaxLimit = jobseekersMaxLimit;
	}
	/**
	 * @return the fee
	 */
	public String getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(String fee) {
		this.fee = fee;
	}
	
}
