package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class TestSciCalculator {
	@Autowired
	private SciCalculator sclc;
	
	@MockBean //removing the calculator
	private Calculator clc;

	@Test
	public void shouldAdd2Nums() {
		Mockito.when(clc.add(0, 1)).thenReturn(1);
		Mockito.when(clc.add(1, 2)).thenReturn(3);

		Assertions.assertEquals(6,sclc.add(1,2,3));
	}
}