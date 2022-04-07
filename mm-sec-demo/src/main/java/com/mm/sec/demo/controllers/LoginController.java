/**
 * 
 */
package com.mm.sec.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dorak
 *
 */
@RestController
public class LoginController {

	@GetMapping("/login")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
	
}
