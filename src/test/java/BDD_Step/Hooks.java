package BDD_Step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	
	@Before("@Release2")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	
	@After("@SeleniumTest")
	public void Aftervaldiation()
	{
		myD.close();
	}
		
		@Before("@WebTest")
		public void beforeWebvaldiation()
		{
			System.out.println("Before Web  hook");
		}
		
		@After("@WebTest")
		public void AfterWebvaldiation()
		{
			System.out.println("  After Web before hook");
		}
	}

