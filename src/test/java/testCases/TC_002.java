package testCases;

import org.testng.annotations.Test;

import pageObjects.giftcard;
import testBase.baseclass;

public class TC_002 extends baseclass {
	@Test(priority = 2)
	public void secondcase() throws InterruptedException {
 
		
		giftcard gc=new giftcard(driver);
		//MY.home();
		gc.clkgift();
		gc.sndrname();
		gc.etrphno();
		gc.etrmail();
		gc.clkbuynow();
 
		

 
	}
 
}


