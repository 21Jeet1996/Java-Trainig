package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SciCalculator {
	
	@Autowired
	private Calculator clc;
	private static int result=0;
	
	public int add(int ...a) {
		result= 0;
		for(int n:a) {
			result=clc.add(result, n);
		}
		return result;
	}
	
	public int sub(int a, int b) {
		return clc.sub(a, b);
	}
	
	public int mul(int ...a) {
		result=1;
		for(int n:a) {
			result=clc.mul(result, n);
		}
		return result;	}
	
	public int div(int a, int b) {
		return clc.sub(a, b);
	}
}
