/**
 * 
 */
package com.mm.cb.demo.responses;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mm.cb.demo.models.Account;

/**
 * @author dorak
 *
 */
public class CBResponse<T> {
	
	private String message;
	private List<T> responseData;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the responseData
	 */
	public List<T> getResponseData() {
		return responseData;
	}
	/**
	 * @param responseData the responseData to set
	 */
	public void setResponseData(List<T> responseData) {
		this.responseData = responseData;
	}
	
	
}
