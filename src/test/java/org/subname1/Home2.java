package org.subname1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Home2 

{

	@Test(groups="Having")
	public void t10() {
		
		System.out.println("T10");
	}
	
	@Ignore
	@Test(enabled = false,groups = "Doing")
	public void t20() {
		
		System.out.println("T20");
	}
	
	@Test(dependsOnGroups = "Having")
	public void t30() {
		
		System.out.println("T30");
	}
	
   
}
