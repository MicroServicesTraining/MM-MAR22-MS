/**
 * 
 */
package com.mm.cb.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mm.cb.demo.models.Employee;
import com.mm.cb.demo.responses.CBResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author dorak
 *
 */
@Service
public class AccountService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "callAccountsServiceAndGetData_Fallback")
	public CBResponse<Employee> callAccountsServiceAndGetData() {
		System.out.println("Getting All Accounts Details ");
		List<Employee> employees = restTemplate
		.getForObject("http://localhost:8081/ems/employees", List.class);
		CBResponse<Employee> response = new CBResponse<Employee>();
		response.setResponseData(employees);
		return response ;
		}	
	
	
	@SuppressWarnings("unused")
	private CBResponse<Employee> callAccountsServiceAndGetData_Fallback() {
		System.out.println("CIRCUIT BREAKER ENABLED!!! No Response From Accounts Service at this moment. " +
		" Service will be back shortly - " + new Date());
		/*return "CIRCUIT BREAKER ENABLED!!! No Response From Job Postings Service at this moment. " +
				" Service will be back shortly - " + new Date();*/
		CBResponse<Employee> response = new CBResponse<>();
		response.setMessage("CIRCUIT BREAKER ENABLED!!! No Response From Accounts Service at this moment. " +
		" Service will be back shortly - " + new Date());
		return response;
		}
}
