package qsp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void registeruser(){
		Assert.fail();
		Reporter.log("register....", true);
	}
	
	@Test(dependsOnMethods="registeruser")
	public void deleteuser(){
		Reporter.log("delete.... ", true);
	}

}
