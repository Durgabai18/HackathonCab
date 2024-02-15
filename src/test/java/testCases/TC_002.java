package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.giftcard;
import pageObjects.userdetails;
import testBase.baseclass;
import utilities.TakeScreenshot;

public class TC_002 extends baseclass {
	@Test(priority = 8, groups = {"giftcards"})
	public void secondcase() throws InterruptedException {
		
		logger.info("-----Starting TC2-----");
		logger.debug("-----Application log starts-----");
		 
 try {
		
		giftcard gc=new giftcard(driver);
		//MY.home();
		gc.clkgift();
		logger.info("-----Clicked on giftcard-----");
		 
		userdetails ud = new userdetails(driver);
		ud.sndrname();
		logger.info("-----Random sender name is created-----");
		
		ud.etrphno();
		logger.info("-----Random phone number is created-----");
		
		ud.etrmail();
		logger.info("-----Random email id  is created-----");
		
		ud.clkbuynow();
		logger.info("-----Random clicked on buy now and captured error message-----");
		
		TakeScreenshot ts=new TakeScreenshot(driver);
		ts.takeScreenshot(driver,"gifts shot.png");
		
 }
 catch(Exception e) {
	 logger.error("test failed");
	 logger.debug("debug logs");
	 Assert.fail();
	 
 }
		logger.debug("application log ends");
		logger.info("Finished TC2");

 
	}
 
}


