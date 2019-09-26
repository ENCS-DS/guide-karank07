package com.company.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestGreeter {
	
	@Test
	public void testSayHello() {
		Greeter myGreeter = new Greeter();
		assertEquals("hello", myGreeter.SayHello());
	}
}