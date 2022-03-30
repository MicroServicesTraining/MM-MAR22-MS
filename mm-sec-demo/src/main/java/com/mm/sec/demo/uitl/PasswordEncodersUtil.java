/**
 * 
 */
package com.mm.sec.demo.uitl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

/**
 * @author dorak
 *
 */
public class PasswordEncodersUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String password = "1234";
		String encodedPassword = "";
		NoOpPasswordEncoder noOpPasswordEncoder = (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
		encodedPassword = noOpPasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {NoOpPasswordEncoder}::: " + encodedPassword);
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		password = "abcd";
		encodedPassword = bCryptPasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {BCryptPasswordEncoder}::: " + encodedPassword);
		password = "1234";
		encodedPassword = bCryptPasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {BCryptPasswordEncoder}::: " + encodedPassword);
		password = "ab12";
		encodedPassword = bCryptPasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {BCryptPasswordEncoder}::: " + encodedPassword);
		
		/*SCryptPasswordEncoder sCryptPasswordEncoder = new SCryptPasswordEncoder();
		password = "ab12";
		encodedPassword = sCryptPasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {SCryptPasswordEncoder}::: " + encodedPassword);*/
		
		/*Pbkdf2PasswordEncoder pbkdf2PasswordEncoder = new Pbkdf2PasswordEncoder();
		password = "ab12";
		encodedPassword = pbkdf2PasswordEncoder.encode(password);
		System.out.println("Plain Text Password ::: " + password);
		System.out.println("Encoded Password - {Pbkdf2PasswordEncoder}::: " + encodedPassword);*/
		
	}

}
