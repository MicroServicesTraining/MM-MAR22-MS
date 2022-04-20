/**
 * 
 */
package com.mm.sb.jwt.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sb.jwt.demo.model.Account;

/**
 * @author dorak
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
}
