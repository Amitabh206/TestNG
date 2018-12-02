package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=1)
	public void registeruser(){
		Reporter.log("register....", true);
	}
	
	@Test(priority=2)
	public void deleteuser(){
		Reporter.log("delete.... ", true);
	}

}
