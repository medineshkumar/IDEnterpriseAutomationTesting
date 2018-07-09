package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericClasses.Browser;
import genericClasses.Login;
import pages.adminPageOrganization;
import testData.createUserData;
import testData.createCustomerProjectDetails;

public class Organization {

	static WebDriver driver;

	String appURL = "http://10.10.10.101/enterpriseqa/";

	ExtentReports report = new ExtentReports("C:\\Users\\dinesh.r\\Desktop\\Automation\\ExtentReport\\OrganizationReport.html",true);
	ExtentTest test;

	@Test(enabled = false, dataProvider = "createUser", dataProviderClass = createUserData.class)
	public void CreateUser(String oname, String firstName, String middleName, String lastName, String gender,
			String emailID, String empNo, String claim) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageOrganization organizationObj = PageFactory.initElements(driver, adminPageOrganization.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		test = report.startTest("Create beneficiary", "Creates beneficiary users");

		organizationObj.organizationSettingMenu.click();

		Thread.sleep(2000);

		organizationObj.clientSubMenu_Organization.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'" + oname + "')]")).click();

		Thread.sleep(1000);

		organizationObj.viewBeneficiaryBtn.click();

		Thread.sleep(2000);

		organizationObj.addBtn_Beneficiary.click();

		Thread.sleep(2000);

		organizationObj.firstName_Beneficiary.sendKeys(firstName);
		organizationObj.middleName_Beneficiary.sendKeys(middleName);
		organizationObj.lastName_Beneficiary.sendKeys(lastName);

		Actions act = new Actions(driver);
		act.moveToElement(organizationObj.gender_Beneficiary).click();
		act.sendKeys(gender, Keys.ENTER);
		act.build().perform();

		organizationObj.emailID_Beneficiary.sendKeys(emailID);
		organizationObj.employeeNo_Beneficiary.sendKeys(empNo);

		Actions act1 = new Actions(driver);
		act1.moveToElement(organizationObj.claim_Beneficiary).click();
		act1.sendKeys(claim, Keys.ENTER);
		act1.build().perform();

		organizationObj.saveBtn_Beneficiary.click();

		test.log(LogStatus.INFO, "Beneficiary created sucessfully");

		System.out.println("Beneficiary created succesfully");
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();

		report.endTest(test);

	}

	@Test(enabled = false,dataProvider = "createCustomerProjectDetails", dataProviderClass = createCustomerProjectDetails.class)
	public void addCustomerProjectDetails(String customerName, String address, String baseLocation, String state,
			String city, String postalCode, String accountManagerName, String engagementManagerName) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageOrganization organizationObj = PageFactory.initElements(driver, adminPageOrganization.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		

		organizationObj.organizationSettingMenu.click();

		Thread.sleep(2000);

		organizationObj.customerProjectSubMenu_Organization.click();

		Thread.sleep(2000);

		organizationObj.addBtn_CustomerProjectDetails_Organization.click();

		Thread.sleep(2000);

		organizationObj.customerName_CustomerProjectDetails.sendKeys(customerName);

		organizationObj.address_CustomerProjectDetails.sendKeys(address);

		Actions baseLocObj = new Actions(driver);
		baseLocObj.moveToElement(organizationObj.baseLocationDropDown_CustomerProjectDetails).click();
		baseLocObj.sendKeys(baseLocation, Keys.ARROW_DOWN, Keys.ENTER);
		baseLocObj.build().perform();

		Thread.sleep(1500);

		Actions stateObj = new Actions(driver);
		stateObj.moveToElement(organizationObj.stateDropDown_CustomerProjectDetails).click();
		stateObj.sendKeys(state, Keys.ARROW_DOWN, Keys.ENTER);
		stateObj.build().perform();

		Thread.sleep(1500);

		Actions cityObj = new Actions(driver);
		cityObj.moveToElement(organizationObj.cityDropDown_CustomerProjectDetails).click();
		cityObj.sendKeys(city, Keys.ARROW_DOWN, Keys.ENTER);
		cityObj.build().perform();

		organizationObj.postalCode_CustomerProjectDetails.sendKeys(postalCode);

		organizationObj.accountManagerName_CustomerProjectDetails.sendKeys(accountManagerName);

		organizationObj.engagementManagerName_CustomerProjectDetails.sendKeys(engagementManagerName);
		
		Actions saveCustomerProject = new Actions(driver);
		saveCustomerProject.moveToElement(organizationObj.saveBtn_CustomerProjectDetails).click();
		saveCustomerProject.build().perform();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();				

	}

	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
	}

	@AfterTest
	public void flushReport() {
		report.flush();
	}

}
