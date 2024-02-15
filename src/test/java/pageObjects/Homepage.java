package pageObjects;

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

	// For selecting the date 7th Mar 2024
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


}
