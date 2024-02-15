package testCases;
 
import org.testng.Assert;
import org.testng.annotations.Test;
 
import pageObjects.Homepage;
import pageObjects.cabs;
import testBase.baseclass;
import utilities.TakeScreenshot;
 
public class TC_001 extends baseclass {
	@Test(priority= 1, groups = {"cabs"})
	public void SearchServices()throws InterruptedException
	{
		logger.info("Starting of TC1");
		logger.info("Application log starts");
		try {
			
		Homepage MY=new Homepage(driver);
		
		MY.cabs();
		logger.info("-----Clicked on cabs-----");

		MY.clickfrom();
		logger.info("-----Clicked on from-----");
		
		MY.enterdelhi();
		logger.info("-----Entered as Delhi-----");
		
		MY.clickto();
		logger.info("-----Clicked on to-----");
		
		MY.entermanali();
		logger.info("-----Entered as Manali,Himachal Pradesh-----");
		
		MY.selectdate();
		logger.info("-----date is selected-----");
		
		MY.selecthour();
		logger.info("-----Selected hour as 6-----");
		
		MY.selectmin();
		logger.info("-----selected minute as 30-----");
		
		MY.selectam();
		logger.info("-----Selected as AM-----");
		
		MY.clickapply();
		logger.info("-----clicked on Apply-----");
		
		MY.clicksearch();
		logger.info("-----Clicked on Search-----");
		
		cabs ca = new cabs(driver);
		
		ca.clicksuv();
		logger.info("-----clicked on SUV");
		
		ca.clickfilter();
		logger.info("-----clicked on filter-----");
		
		ca.selectlow();
		logger.info("-----selected on lowest to highest-----");
		
		ca.carlist();
		logger.info("-----carlist is displayed-----");
		
		ca.lowstprice();
		logger.info("-----Lowest price is displayed-----");
		
		TakeScreenshot ts=new TakeScreenshot(driver);
		ts.takeScreenshot(driver,"Cabs shot.png");
		}
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("Debug logs");
			Assert.fail();
		}
		logger.debug("application logs end");
		logger.info("-----finished TC1-----");
	}
}