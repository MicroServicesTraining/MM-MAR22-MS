/**
 * 
 */
package com.mm.jp.util;

import org.springframework.beans.factory.annotation.Value;
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
	//@PropertySource("classpath:jobportalconfig.properties")
	@PropertySource("file:D:\\OnlineClass\\Mindmajix\\jobportalconfig.properties")
})
@ConfigurationProperties( prefix = "jobportal" )
public class JobPortalPropsUtil {
	
	//@Value("${title}")
	private String title;
	
	@Value("${jobportal.title}")
	private String jobPortalTitle;
	private String admin;
	private String phone;
	private Integer jobsMaxLimit;
	private Integer jobseekersMaxLimit;
	private Double fee;
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
	public Integer getJobsMaxLimit() {
		return jobsMaxLimit;
	}
	/**
	 * @param jobsMaxLimit the jobsMaxLimit to set
	 */
	public void setJobsMaxLimit(Integer jobsMaxLimit) {
		this.jobsMaxLimit = jobsMaxLimit;
	}
	/**
	 * @return the jobseekersMaxLimit
	 */
	public Integer getJobseekersMaxLimit() {
		return jobseekersMaxLimit;
	}
	/**
	 * @param jobseekersMaxLimit the jobseekersMaxLimit to set
	 */
	public void setJobseekersMaxLimit(Integer jobseekersMaxLimit) {
		this.jobseekersMaxLimit = jobseekersMaxLimit;
	}
	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}
	/**
	 * @return the jobPortalTitle
	 */
	public String getJobPortalTitle() {
		return jobPortalTitle;
	}
	/**
	 * @param jobPortalTitle the jobPortalTitle to set
	 */
	public void setJobPortalTitle(String jobPortalTitle) {
		this.jobPortalTitle = jobPortalTitle;
	}
	
}