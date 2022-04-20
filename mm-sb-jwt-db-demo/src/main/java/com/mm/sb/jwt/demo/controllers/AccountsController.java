/**
 * 
 */
package com.mm.sb.jwt.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.jwt.demo.model.Account;
import com.mm.sb.jwt.demo.repositories.AccountRepository;

/**
 * @author dorak
 *
 */
@RestController
public class AccountsController {

	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/accounts")
	public List<Account> findAllAccounts() {
		return accountRepository.findAll();
	}

}
