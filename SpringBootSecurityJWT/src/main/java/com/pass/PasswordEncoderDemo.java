package com.pass;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderDemo {

	public static void main(String[] args) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		
		List<String> pwds = Arrays.asList("admin@123", "manager@123", "owner@123");
		
		for(String pwd: pwds) {
			String encodedStr = encoder.encode("admin@123");
			System.out.println(pwd+"=>"+encodedStr);
		}
	}
}
