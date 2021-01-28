package com.cassiomolin.example.common;

import com.cassiomolin.example.security.service.PasswordEncoder;

public class TestMain {

	public static void main(String[] args) {
		
		PasswordEncoder pswCy = new PasswordEncoder();
		
		String encrypt = pswCy.hashPassword("123");
		
		System.out.println(encrypt);

	}
}
