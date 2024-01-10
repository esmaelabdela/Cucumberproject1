package steps;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.ListAccounts;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {

	LoginPage  loginPage;
	ListAccounts listAccounts;
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		listAccounts = PageFactory.initElements(driver, ListAccounts.class);
	}
	
	@Given ("User is on the codefios login page")
	public void user_is_on_the_techfios_login_page() {
		
		driver.get("https://cert.codefios.com/login");
		
		}
	
	@When ("User enter the userName as {string}")
    public void userEnterTheUserNameAs(String userName){
		loginPage.enterUserName(userName);
	}
	
	@When("User enter the password as {string}")
	public void user_enter_the_password_as(String password) {
		loginPage.enterPassword(password);
	}
	
	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		loginPage.clickSignInButton();
	}
	
	@Then("User should be able to land dashBoard page")
	public void user_should_be_able_to_land_dashBoard_page() {
		
		String expectedTitle ="Codefios Cert";
		String actualTitle =loginPage.getPageTitle();
		takeScreenshot(driver);
		Assert.assertEquals("page Title are not matching!", expectedTitle, actualTitle);	
		
	}
	
	@When("User click on list accounts")
	public void user_click_on_list_accounts() {
		listAccounts.clickListAccounts();
	}

	@Then("User should be able to land on list account page")
	public void user_should_be_able_to_land_on_list_account_page() {
		String expectedTitle ="Manage Account";
		String actualTitle =listAccounts.getPageTitle();
		Assert.assertEquals("page Title are not matching!", expectedTitle, actualTitle);	
	
	}
	@When("User click on add account")
	public void user_click_on_add_account() {
		listAccounts.clickAddAccounts();
	}

	@When("User enter the account name as {string}")
	public void user_enter_the_account_name(String accountName) {
		listAccounts.enterAccountName(accountName);
	}

	@When("User enter the descriptin as {string}")
	public void user_enter_the_descriptin(String description) {
	   listAccounts.enterDescription(description);
	}

	@When("User entert the initial balance as {string}")
	public void user_entert_the_initial_balance(String initialBalance) {
	    listAccounts.enterInitialBalance(initialBalance);
	}

	@When("User enter the account number as {string}")
	public void user_enter_the_account_number(String accountNumber ) {
		listAccounts.enterAccountNumber(accountNumber);
	}

	@When("User enter the contact person as {string}")
	public void user_enter_the_contact_person(String contactPerson ) {
		listAccounts.enterContactPerson(contactPerson);
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
		listAccounts.clickOnSaveButton();;
	}
	
	@Then("User should be able to create an account")
	public void user_should_be_able_to_create_an_account() {
	   listAccounts.validateInsertedAccountName();
	   takeScreenshot(driver);
	}
	
	
	
//  @After
//   public static void tearDown() {
//		 driver.close();
//		 driver.quit();
//	 }
   
   
   
   
   
   
}
