/**
 * 
 */
package com.mm.sec.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerContorller {

	@GetMapping
	public String getCustomerHomePage() {
		return "<h1>Welcome Customer</h1>";
	}
}
