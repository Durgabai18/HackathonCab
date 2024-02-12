package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import testBase.baseclass;

public class TC_001 extends baseclass {
	
	@Test(priority= 1)
	
	public void SearchServices()throws InterruptedException
	{
		Homepage MY=new Homepage(driver);
		MY.cabs();
		MY.clickfrom();
		MY.enterdelhi();
		MY.clickto();
		MY.entermanali();
		MY.selectdate();
		MY.selecthour();
		MY.selectmin();
		MY.selectam();
		MY.clickapply();
		MY.clicksearch();
		MY.clicksuv();
		MY.clickfilter();
		MY.selectlow();
		MY.carlist();
	}

}
