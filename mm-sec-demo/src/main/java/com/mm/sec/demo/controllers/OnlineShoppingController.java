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
public class OnlineShoppingController {
	@GetMapping
	public String showHomePage() {
		return "<h1>Welcome To Online Shoppe</h1>";
	}
}
