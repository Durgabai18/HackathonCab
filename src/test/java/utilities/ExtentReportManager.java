package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	public void onStart(ITestContext testContext) {
		
		sparkReporter = new ExtentSparkReporter("C:\\Users\\2303483\\eclipse-workspace\\HackathonCab\\reports");// specify location of the report

		sparkReporter.config().setDocumentTitle("Cab Booking"); // Title of report
		sparkReporter.config().setReportName("Location and date selection");// name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer_Name", "HP EliteBook");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Tester Name", "Durga V");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
	
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.PASS,result.getName()+" got successfully executed");
		
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		
		test.log(Status.FAIL,result.getName()+" got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());	
	}
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		
		test.log(Status.SKIP, result.getName()+" got skipped");
	}

	public void onFinish(ITestContext testContext) {
		
		extent.flush();
	}

}
