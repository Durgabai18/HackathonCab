package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends basePage {

	public WebDriver driver;

	// constructor
	public Homepage(WebDriver driver) {
		super(driver);

	}

	// Locators

	// For clicking on cabs
	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/cabs/']")
	WebElement cabs;

	// For clicking on from
	@FindBy(xpath = "//span[normalize-space()='From']")
	WebElement clickfrom;

	// For selecting Delhi in from section
	@FindBy(xpath = "//ul[@class='react-autosuggest__suggestions-list']/li[2]")
	WebElement enterdelhi;

	// For clicking on To and type manali
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement clickto;

	// For clicking on manali,himachal pradesh
	@FindBy(xpath = "//span[normalize-space()='Manali, Himachal Pradesh, India']")
	WebElement entermanali;

	// For selecting the date 9th Mar 2024
	@FindBy(xpath = "//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Week'][2]//div[2]")
	WebElement selectdate;

	// For selecting the hour as 6
	@FindBy(xpath = "//span[contains(text(),'06')]")
	WebElement selecthour;

	// For selecting the min as 30
	@FindBy(xpath = "//span[contains(text(),'30')]")
	WebElement selectmin;

	// For selecting AM
	@FindBy(xpath = "//span[@class='meridianSlotItemChild meridianSlotItemChild_sel']")
	WebElement selectam;

	// For clicking on Apply
	@FindBy(xpath = "//span[@class='applyBtnText']")
	WebElement clickapply;

	// For clicking on Search button
	@FindBy(xpath = "//a[normalize-space()='Search']")
	WebElement clicksearch;

	// For selecting SUV
	@FindBy(xpath = "//label[normalize-space()='SUV']")
	WebElement clicksuv;

	// For clicking filters
	@FindBy(xpath = "//span[@class='cursorPointer dodgerBlueColor']")
	WebElement clickfilter;

	// For selecting price lowest to highest
	@FindBy(xpath = "//div[@class='makeAbsolute sortOptionsPopup makeFlex column']//div[1]//p[1]")
	WebElement selectlow;

	// Get all the details
	@FindBy(xpath = "//*[@id=\"List\"]")
	WebElement carlist;

	@FindBy(xpath = "//span[@class='latoBlack font20 appendRight5']")
	List<WebElement> carlistAll;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[1]")
	WebElement lowestprice;
	// div[@id='List']//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//p[1]

	// Action Methods

	public void cabs() {
		cabs.click();
	}

	public void clickfrom() {
		clickfrom.click();
	}

	public void enterdelhi() {
		enterdelhi.click();
	}

	public void clickto() {
		clickto.click();
		clickto.sendKeys("Manali,Himachal Pradesh");
	}

	public void entermanali() {
		entermanali.click();
	}

	public void selectdate() {
		selectdate.click();
	}

	public void selecthour() {
		selecthour.click();
	}

	public void selectmin() {
		selectmin.click();
	}

	public void selectam() {
		selectam.click();
	}

	public void clickapply() {
		clickapply.click();
	}

	public void clicksearch() {
		clicksearch.click();
	}

	public void clicksuv() {
		clicksuv.click();
	}

	public void clickfilter() {
		clickfilter.click();
	}

	public void selectlow() {
		selectlow.click();
	}

	public void carlist() {
		for (WebElement i : carlistAll) {
			System.out.println(i.getText());

		}

	}

	public void lowestprice() {
		// fluentWait(lowestprice);
		System.out.println("lowest price is :" + lowestprice.getText());
	}

}
