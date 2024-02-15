package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.hotels;
import testBase.baseclass;
import utilities.TakeScreenshot;

public class TC_003 extends baseclass{
	@Test(priority = 9, groups = {"hotels"})
	public void thirdcase() throws InterruptedException {
		logger.info("Starting TC3");
		logger.debug("application logs started");
		
		try {
			hotels hs=new hotels(driver);
			hs.clkHotels();
			logger.info("-----Clicked on hotels------");
			
			hs.clkGuests();
			logger.info("-----Clicked on Guests and rooms------");
			
			hs.clkadults();
			logger.info("-----Clicked on hotels------");
			
			hs.getcount();
			logger.info("-----Capture the count and it is displayed------");
			
			TakeScreenshot ts=new TakeScreenshot(driver);
			ts.takeScreenshot(driver,"hotels shot.png");
			
		}catch(Exception e) {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.fail();	
		}
		
		logger.debug("applictaion logs end");
		logger.info("Finished TC3"); 

	}
}
 


