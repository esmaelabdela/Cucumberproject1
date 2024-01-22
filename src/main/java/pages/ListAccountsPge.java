package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ListAccountsPge extends TestBase{

	WebDriver driver;

	public ListAccountsPge(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	public WebElement ListAccounts;
	@FindBy(how = How.XPATH, using = "//button[text()='Add Account']")
	public WebElement AddAccount;
	@FindBy(how = How.XPATH, using = "//h5[@id='accountModalLabel']")
	public WebElement addAccountWindow;
	@FindBy(how = How.XPATH, using = "//strong[text()='Dashboard']")
	public WebElement dashboard;
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
	@FindBy(how = How.XPATH, using = "//*[text()='Account Added Successfully.']")
	WebElement successAddAlertElement;

	
	
	// Methods to interact with the elements
	public void clickListAccounts() {
		ListAccounts.click();
		
	}

	public void clickAddAccounts() {
		AddAccount.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void validateAddAccountWindow(String expected ) {
		TestBase.validateElement("window is not available", expected, addAccountWindow.getText());
	}
	public void validatedashboardPage(String expected ) {
		TestBase.validateElement("Dashboard is not available", expected, dashboard.getText());
	}
	
	public void enterAccountName(String accountName) {
		AccountName.sendKeys(accountName);	
	}

	public void enterDescription(String description) {
		Description.sendKeys(description);
	}

	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	
	}

	public void clickOnSaveButton() {
		SaveButton.click();
	}
	
	public void validateAddSuccessAlertPopup(String msg) {
		TestBase.waitMethod();
		TestBase.validateDisplayElement(msg, successAddAlertElement);
        String actual = successAddAlertElement.getText();
        System.out.println(actual); 
	}
	
	
	String beforeXpath ="//tbody/tr[";
	String  afterXpath= "]/td[2]";
	
	public void validateListAccountsPage(String expected) {	
		for(int i = 1; i<=5; i++) {
				
			String actualName = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			TestBase.validateElement("element is not available", expected, actualName);
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
