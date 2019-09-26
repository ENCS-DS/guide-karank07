package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestGreeter {
	
	@Test
	public void testSayHello() {
		Greeter myGreeter = new Greeter();
		assertEquals("hi!", myGreeter.SayHello());
	}
}