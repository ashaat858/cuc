package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashPage {

	WebDriver driver;

	public BankCashPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANKCASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement ACCOUNT_TITLE;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement ACCOUNT_DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement PHONE_NUMBER;
	@FindBy(how = How.XPATH, using = "//input[@name='ib_url']")
	WebElement BANK_URL;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SUBMITBUTTON_ELEMENT;
	
	
}
