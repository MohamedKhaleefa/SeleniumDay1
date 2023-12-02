package org.subname1;


import org.testng.annotations.Optional;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Home1 
{

	@Test(invocationCount = 5)
	public void t100() {
		System.out.println("T100");
	}
	
	@Parameters({"Userame","Password"})
	@Test(groups="Having",priority = 2,invocationCount = 2)
	public void t200(@Optional("Invalid UserName")String username,String Password) {   //@Optional("Give a Message to user") 
		System.out.println(username + " " + Password);
	}
	
	@Test(priority = 0)
	public void t300() {
		System.out.println("T300");
	}
	
	
		
  
}
