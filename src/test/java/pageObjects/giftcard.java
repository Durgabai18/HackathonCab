package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class giftcard extends basePage {
	
	String filePath = "C:\\Users\\2303483\\eclipse-workspace\\HackathonCab\\TestData\\Hackathon.xlsx";
	
	public giftcard(WebDriver driver) {
		super(driver);
 
	}
 
	// For clicking on Gifts card
	@FindBy(xpath = "//li[@data-cy='tertiaryRowItem_Gift Cards']")
	WebElement clkgift;
 
	// For getting names of all giftcards
 
	@FindBy(xpath = "//h3[@class='lato-black black-text']")
	List<WebElement> allCards;
 
	// For clicking on birthday card
 
	@FindBy(xpath = "//img[@alt='giftcard']")
	WebElement diwaliCard;
 
	@FindBy(xpath = "//div[@class='deliver__content']")
	WebElement box;
 
	
 
	// Actions
	public void clkgift() throws InterruptedException {
		clkgift.click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		String parent = driver.getWindowHandle();
 
		Set<String> s = driver.getWindowHandles();
 
		Iterator<String> I1 = s.iterator();
 
		while (I1.hasNext()) {
 
			String child_window = I1.next();
 
			if (!parent.equals(child_window)) {
 
				driver.switchTo().window(child_window);
 
				System.out.println(driver.switchTo().window(child_window).getTitle());
 
				System.out.println("GIFT CARD");
 
				for (WebElement j : allCards) {
 
					System.out.println(j.getText());
 
					System.out.println(" ");
 
				}
				System.out.println(diwaliCard.getText()+" is selected");
				diwaliCard.click();
 
				Thread.sleep(5000);
 
			}
 
		}
 
	}
 
}