package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest; 

@SpringBootTest
public class TestCalculator {
	
	@Autowired
	private Calculator clc;

	@Test
	public void shouldmul2Num() {
		int x=4, y=15;
		int actual=clc.mul(x, y);
		int expected=60;
		Assertions.assertEquals(expected, actual);
	}
	
//	@Test
//	public void shouldDivideByZero() {
//		int x=20, y=0;
//		int actual=clc.div(x, y);
//		int expected=4;
//		Assertions.assertEquals(expected, actual,"Calculator is not dividing");
//	}
	
	@Test
	public void shouldDivideByZero() {
	
		Assertions.assertThrows(ArithmeticException.class, ()->{
			clc.div(5,0);
		});
	}
}
