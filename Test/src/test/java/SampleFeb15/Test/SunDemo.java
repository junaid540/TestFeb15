package SampleFeb15.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SunDemo {

	@Before
	public void login()
	{
		System.out.println("Login Window of Web");
	}
	
	
	@Test
	public void addToCart() 
	{
		System.out.println("Add to Shopping Cart");
	}
	
	@After
	public void logout()
	{
		System.out.println("Logout WIndow of web");
	}
}
