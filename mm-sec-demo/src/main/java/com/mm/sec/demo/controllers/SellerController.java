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
@RequestMapping("/sellers")
public class SellerController {

	@GetMapping
	public String getSellerHomePage() {
		return "<h1>Welcome Seller</h1>";
	}
}
