package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class baseclass {
	public WebDriver driver;
	public Properties p;
	public Logger logger;

	@BeforeClass(groups = { "cabs", "giftcards", "hotels" })
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException, InterruptedException {

		FileReader file = new FileReader(
				"C:\\Users\\2303483\\eclipse-workspace\\HackathonCab\\src\\test\\resources\\config.properties");
		// Loading properties file
		p = new Properties();
		p.load(file);

		// Loading log4j file
		logger = LogManager.getLogger(this.getClass());
		if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();

			// os

			if (os.equalsIgnoreCase("window")) {

				capabilities.setPlatform(Platform.WIN11);

			} else if (os.equalsIgnoreCase("mac")) {

				capabilities.setPlatform(Platform.MAC);

			} else {

				System.out.println("No matching os..");

				return;

			}

			// browser

			switch (br.toLowerCase()) {

			case "chrome":

				capabilities.setBrowserName("chrome");

				break;

			case "edge":

				capabilities.setBrowserName("MicrosoftEdge");

				break;

			default:

				System.out.println("No matching browser..");

				return;

			}

			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		} else if (p.getProperty("execution_env").equalsIgnoreCase("local")) {

			// launching browser based on condition - locally

			switch (br.toLowerCase()) {

			case "chrome":

				ChromeOptions options = new ChromeOptions();

				options.addArguments("--disable-notifications");

				driver = new ChromeDriver();

				break;

			case "edge":

				EdgeOptions options1 = new EdgeOptions();

				options1.addArguments("--disable-notifications");

				driver = new EdgeDriver();

				break;

			default:

				System.out.println("No matching browser..");

				return;

			}

		}

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get(p.getProperty("PageURL"));
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']/i"))
				.click();
		driver.switchTo().defaultContent();

	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath = System.getProperty("user.dir") + "\\screenshot\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;

	}

	@AfterClass(groups = { "cabs", "giftcards", "hotels" })
	public void teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}