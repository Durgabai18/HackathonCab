package pageObjects;
 
import java.util.ArrayList;
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class hotels extends basePage {
 
	public hotels(WebDriver driver) {
		super(driver);
	}
	// Elements
 
	// For clicking on hotels
	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/hotels/']")
	WebElement clkHotels;
 
	// For clicking on Rooms&guests
	@FindBy(xpath = "//input[@id='guest']")
	WebElement clkGuests;
 
	// For clicking on Adults
	@FindBy(xpath = "//div[@class='makeFlex primaryTraveler']//div[2]//div[2]//div[1]")
	WebElement clkadults;
 
	// For capturing number of adults
	@FindBy(xpath = "//li[@data-cy='GuestSelect$$_323']")
	List<WebElement> getcount;
 
	// Actions
	public void clkHotels() {
		clkHotels.click();
		clkGuests.click();
		clkadults.click();
		List<String> count=new ArrayList();
		for (WebElement k : getcount) {
			count.add(k.getText());
		}
		System.out.println("Number of Adults allowed are: "+count.size());
		System.out.println("The list: " +count);
 
	}
 
}


