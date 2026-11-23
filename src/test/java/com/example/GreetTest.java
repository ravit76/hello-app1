package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class GreetTest {

	@Test
	public void helloEqualsTest() {
		Greet g= new Greet();
		assertEquals("Hello Ravi", g.hello("Ravi"));
		
	}
	@Test
	public void helloNotEqualsTest() {
		Greet g= new Greet();
		assertNotEquals("Hello Ravi", g.hello("ravi"));
		
	}
}
