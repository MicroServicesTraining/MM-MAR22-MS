/**
 * 
 */
package com.mm.sec.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author dorak
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	@Bean 
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication()
		.withUser("sekhar").password("{noop}1234").roles("ADMIN")
		.and().withUser("ravi").password("{bcrypt}$2a$10$.T/XGuVSFa8jFvEE0C3DgOzs9niLd7xWrKfIO1VvyT8OIEo74xa0e").roles("SELLER")
		.and().withUser("raju").password("{pbkdf2}991a0e757c4a5e2b5a354c07cf19c91bdeefff917fc7413c0a6bb015c226e8c462cd49077b3898db").roles("CUSTOMER");
	*/
		/*auth.inMemoryAuthentication()
		.withUser("sekhar").password("{bcrypt}$2a$10$VbxxxM7ukaey/vs6Rp2sc.H3sgOBJxQDZnEL7yN8BXfG5IVonAfYW").roles("ADMIN")
		.and().withUser("ravi").password("{bcrypt}$2a$10$.T/XGuVSFa8jFvEE0C3DgOzs9niLd7xWrKfIO1VvyT8OIEo74xa0e").roles("SELLER")
		.and().withUser("raju").password("{bcrypt}$2a$10$0x4jfxkbXjFA.S1S1F5qW.I5J67tjedVUcvSHT0UWZudr6hS91oGq").roles("CUSTOMER");
	*/
		/*auth.inMemoryAuthentication()
		.withUser("sekhar").password("$2a$10$VbxxxM7ukaey/vs6Rp2sc.H3sgOBJxQDZnEL7yN8BXfG5IVonAfYW").roles("ADMIN")
		.and().withUser("ravi").password("$2a$10$.T/XGuVSFa8jFvEE0C3DgOzs9niLd7xWrKfIO1VvyT8OIEo74xa0e").roles("SELLER")
		.and().withUser("raju").password("$2a$10$0x4jfxkbXjFA.S1S1F5qW.I5J67tjedVUcvSHT0UWZudr6hS91oGq").roles("CUSTOMER")
		.and().passwordEncoder(new BCryptPasswordEncoder());*/
		
		auth.inMemoryAuthentication()
		.withUser("sekhar").password("$2a$10$VbxxxM7ukaey/vs6Rp2sc.H3sgOBJxQDZnEL7yN8BXfG5IVonAfYW").roles("ADMIN")
		.and().withUser("ravi").password("$2a$10$.T/XGuVSFa8jFvEE0C3DgOzs9niLd7xWrKfIO1VvyT8OIEo74xa0e").roles("SELLER")
		.and().withUser("raju").password("$2a$10$0x4jfxkbXjFA.S1S1F5qW.I5J67tjedVUcvSHT0UWZudr6hS91oGq").roles("CUSTOMER");
	
	}

	
	
}
