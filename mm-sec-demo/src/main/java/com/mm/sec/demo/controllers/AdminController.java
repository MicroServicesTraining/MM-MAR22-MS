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
@RequestMapping("/admins")
public class AdminController {
	
	@GetMapping
	public String getAdminHomePage() {
		return "<h1>Welcome Admin</h1>";
	}
}
