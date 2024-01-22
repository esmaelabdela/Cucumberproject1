package steps;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.ListAccountsPge;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {

	LoginPage loginPage;
	ListAccountsPge listAccountsPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		listAccountsPage = PageFactory.initElements(driver, ListAccountsPge.class);
		databasePage = new DatabasePage();
	}

	@Given("User is on the codefios login page")
	public void user_is_on_the_techfios_login_page() {

		driver.get("https://qa.codefios.com/login");

	}

	@When("User enters {string} from mysql database")
	public void userEntersFromMysqlDatabase(String loginData) {

		switch (loginData) {

		case "username":
			loginPage.enterUserName(databasePage.getDataFromDatabase("user_name"));
//		  System.out.println("Username from DB: " +databasePage.getDataFromDatabase("user_name"));
			break;

		case "password":
			loginPage.enterPassword(databasePage.getDataFromDatabase("user_password"));
//		  System.out.println("Password from DB: " + databasePage.getDataFromDatabase("user_password") );
			break;

		default:
			System.out.println("Unable to find Login data:" + loginData);
		}
	}

	/*
	 * if(loginData.equalsIgnoreCase("username")) {
	 * 
	 * }else if(loginData.equals("password")) {
	 * 
	 * }else {
	 * 
	 * }
	 */

	@When("User enter the userName as {string}")
	public void userEnterTheUserNameAs(String userName) {
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

	@Then("User should be able to land on dashboard page")
	public void user_should_be_able_to_land_dashBoard_page() {

		String expected = "Dashboard";
		// takeScreenshot(driver);
		listAccountsPage.validatedashboardPage(expected);
	}

	@When("User click on list accounts")
	public void user_click_on_list_accounts() {
		listAccountsPage.clickListAccounts();
	}

	@Then("User should be able to land on list account page")
	public void user_should_be_able_to_land_on_list_account_page() {
		String expectedTitle = "Manage Account";
		String actualTitle = listAccountsPage.getPageTitle();
		Assert.assertEquals("page Title are not matching!", expectedTitle, actualTitle);

	}

	@When("User click on add account")
	public void user_click_on_add_account() {
		listAccountsPage.clickAddAccounts();
	}

	@Then("User should be able to land on add new account window")
	public void User_should_be_able_to_land_on_add_new_account_window() {
		String expected = "New Account";
		listAccountsPage.validateAddAccountWindow(expected);
	}

	@When("User fill all the required information")
	public void user_fill_all_the_required_information() {
		listAccountsPage.enterAccountName("ESMAEL account");
		listAccountsPage.enterDescription("New bank account");
		listAccountsPage.enterInitialBalance("2000");
		listAccountsPage.enterAccountNumber("123456654321");
		listAccountsPage.enterContactPerson("Yusra");
	}

	@When("User enter the account name as {string}")
	public void user_enter_the_account_name(String accountName) {
		listAccountsPage.enterAccountName(accountName);
	}

	@When("User enter the descriptin as {string}")
	public void user_enter_the_descriptin(String description) {
		listAccountsPage.enterDescription(description);
	}

	@When("User entert the initial balance as {string}")
	public void user_entert_the_initial_balance(String initialBalance) {
		listAccountsPage.enterInitialBalance(initialBalance);
	}

	@When("User enter the account number as {string}")
	public void user_enter_the_account_number(String accountNumber) {
		listAccountsPage.enterAccountNumber(accountNumber);
	}

	@When("User enter the contact person as {string}")
	public void user_enter_the_contact_person(String contactPerson) {
		listAccountsPage.enterContactPerson(contactPerson);
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
		listAccountsPage.clickOnSaveButton();
		;
	}

	@Then("User should be able to create an account")
	public void user_should_be_able_to_create_an_account() {
		listAccountsPage.validateAddSuccessAlertPopup("the alert pop_up not displayed");

		String expected = "ESMAEL account";
		listAccountsPage.validateListAccountsPage(expected);
		takeScreenshot(driver);
	}

//  @After
//   public static void tearDown() {
//		 driver.close();
//		 driver.quit();
//	 }

}
