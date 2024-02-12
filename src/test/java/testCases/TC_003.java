package testCases;

import org.testng.annotations.Test;

import pageObjects.hotels;
import testBase.baseclass;

public class TC_003 extends baseclass{
	@Test(priority = 2)
	public void thirdcase() throws InterruptedException {

		hotels hs=new hotels(driver);
		hs.clkHotels();
 


 

	}
}
 


