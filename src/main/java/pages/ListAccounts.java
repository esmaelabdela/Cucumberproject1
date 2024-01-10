package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ListAccounts {

	WebDriver driver;

	public ListAccounts(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	public WebElement ListAccounts;
	@FindBy(how = How.XPATH, using = "//button[text()='Add Account']")
	public WebElement AddAccount;
	@FindBy(how = How.XPATH, using = "//input[@id ='account_name']")
	public WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	public WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]")
	public WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	public WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]")
	public WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//button[@id=\"accountSave\"]")
	public WebElement SaveButton;

	// Methods to interact with the elements
	public void clickListAccounts() {
		ListAccounts.click();
		;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickAddAccounts() {
		AddAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterAccountName(String accountName) {
		AccountName.sendKeys(accountName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterDescription(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSaveButton() {
		SaveButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

	String beforeXpath ="//tbody/tr[";
	String  afterXpath= "]/td[2]";
	
	public void validateInsertedAccountName() {
		
	for(int i = 1; i<=5; i++) {
		String expected = "ESMAEL account";
		String actualName = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
		System.out.println(actualName);
		
	if(actualName. contains(expected)) {
	    System.out.println("AccountName Exist");
	
		  }
		 break;
	 } 
	
  }
	
	
	
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
