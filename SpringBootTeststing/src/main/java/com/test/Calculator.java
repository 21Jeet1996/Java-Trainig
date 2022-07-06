package com.test;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int add(int a, int b) {
		int output=a+b+b;
		System.out.println("addition of :"+a+" and "+b+" is "+output);
		return output;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}
