package admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import genericClasses.Browser;
import genericClasses.FileUpload;
import genericClasses.Login;
import pages.adminPageConfiguration;
import testData.addAuthorizedSignatoryData;
import testData.assignmentImmigrationRoleMappingData;
import testData.countryAssignmentRoleData;
import testData.countryImmigrationRoleData;
import testData.countryTravelPurpose;
import testData.countryTypeData;
import testData.countryTypeForm;
import testData.createClaimMenuMappingData;
import testData.createCountryMappingData;
import testData.createEmailSetting;
import testData.createGeoMapping;
import testData.createUserDefindedKeywordData;
import testData.deputationLetterData;
import testData.educationEvaluationData;
import testData.supportLetterData;

public class Configuration {
	
	
	static WebDriver driver;

	String appURL = "http://10.10.10.101/enterpriseqa/";
	
	ATUTestRecorder recorder ;
	
	ExtentReports report = new ExtentReports("C:\\Users\\dinesh.r\\Desktop\\Automation\\ExtentReport\\configurationReport.html", true);
	ExtentTest test;

	//@Test(enabled = true, dataProvider = "createCountryMapping", dataProviderClass = createCountryMappingData.class)
	@Test(enabled = false, dataProvider = "createCountryMapping", dataProviderClass = createCountryMappingData.class,priority=1)
	public void createCountryMapping(String srcCountry, String destCountry) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		test = report.startTest("Create country mapping", "Map destination countries to source country");

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryMappingSetting.click();

		Thread.sleep(2000);

		configurationObj.addCountryMappingBtn.click();

		Thread.sleep(2000);

		configurationObj.countryMapping_SourceCountry_DropDown.click();
		Thread.sleep(1000);
		configurationObj.countryMapping_SourceCountry_DropDownInputBox.sendKeys(srcCountry, Keys.ARROW_DOWN,
				Keys.ENTER);

		Thread.sleep(2000);

		String[] destinationCountry = destCountry.split(",");

		for (int i = 0; i < destinationCountry.length; i++) {
			configurationObj.countryMapping_DataTableSearchBox.clear();
			configurationObj.countryMapping_DataTableSearchBox.sendKeys(destinationCountry[i]);
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//td[contains(text(),'" + destinationCountry[i] + "')]/preceding-sibling::td/div"))
					.click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);

		configurationObj.saveCountryMappingBtn.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Country mapped successfully");
		
		System.out.println("Country mapping created succesfully");
		
		report.endTest(test);
	}
	
	//@Test(enabled=true,dataProvider="createCountryType",dataProviderClass=countryTypeData.class,dependsOnMethods={"createCountryMapping"})
	@Test(enabled=false,dataProvider="createCountryType",dataProviderClass=countryTypeData.class,priority=2)
	public void countryType(String srcCountry, String destCountry, String service,String type) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Create country type", "Country type is mapped");
		
		configurationObj.configurationSetting.click();
		
		Thread.sleep(2000);
		
		configurationObj.countryTypeSetting.click();
		
		Thread.sleep(2000);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(configurationObj.sourceCountryDropDown_CountryType).click();
		act1.sendKeys(srcCountry,Keys.ARROW_DOWN,Keys.ENTER);
		act1.build().perform();
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(configurationObj.destinationCountryDropDown_CountryType).click();
		act2.sendKeys(destCountry,Keys.ARROW_DOWN,Keys.ENTER);
		act2.build().perform();
		
		Actions act3 = new Actions(driver);
		act3.moveToElement(configurationObj.serviceDropDown_CountryType).click();
		act3.sendKeys(service,Keys.ARROW_DOWN,Keys.ENTER);
		act3.build().perform();
		
		configurationObj.searchBtn_CountryType.click();
		
		Thread.sleep(2000);
		/*
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//td[contains(text(),'Regular L1A - Premium')]/preceding-sibling::td/div")));
		
		Thread.sleep(1500);*/
		
		String[] countrytype = type.split(",");
		
		for(int i=0; i<countrytype.length;i++ ){
		
		driver.findElement(By.xpath("//td[contains(text(),'"+countrytype[i]+"')]/preceding-sibling::td/div")).click();
		}
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",configurationObj.saveBtn_CountryType);
		
		Thread.sleep(1500);
		
		configurationObj.saveBtn_AssignmentImmigrationRole.click();
		test.log(LogStatus.INFO, "Country type mapped successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
				
		System.out.println("Country type created succesfully");
		
		report.endTest(test);
		
	}
	
	
	//@Test(enabled = true, dataProvider = "countryAssignmentRole", dataProviderClass = countryAssignmentRoleData.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "countryAssignmentRole", dataProviderClass = countryAssignmentRoleData.class,priority=3)
	public void countryAssignmentRole(String country, String assignmentRole) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Country Assignment Role", "Assignment role is mapped to country");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryAssignmentRoleSetting.click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-controls='MIRTable']")).sendKeys(country);
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[contains(text(),'" + country + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(2000);

		String[] countryAssignmentRole = assignmentRole.split(",");

		for (int i = 0; i < countryAssignmentRole.length; i++) {

			configurationObj.countryAssignmentRole_DataTableSearchBox.clear();
			configurationObj.countryAssignmentRole_DataTableSearchBox.sendKeys(countryAssignmentRole[i]);

			Thread.sleep(1000);

			driver.findElement(
					By.xpath("//div[@id='ms-AssignmentSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryAssignmentRole[i] + "')]"))
					.click();

		}

		configurationObj.saveCountryAssignmentRole.click();
		test.log(LogStatus.INFO, "Assignment Role mapped successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Country assignment role created succesfully");
		
		report.endTest(test);

	}

	//@Test(enabled = true, dataProvider = "countryImmigrationRole", dataProviderClass = countryImmigrationRoleData.class,dependsOnMethods={"createCountryMapping","countryType","countryAssignmentRole"})
	@Test(enabled = false, dataProvider = "countryImmigrationRole", dataProviderClass = countryImmigrationRoleData.class,priority=4)
		public void countryImmigrationRole(String country, String immigrationRole) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Country Immigration Role", "Immigration role is mapped to country");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryImmigrationRoleSetting.click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-controls='MIRTable']")).sendKeys(country);
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[contains(text(),'" + country + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(2000);

		String[] countryImmigrationRole = immigrationRole.split(",");
		
		Thread.sleep(1500);

		for (int i = 0; i < countryImmigrationRole.length; i++) {

			configurationObj.countryImmigrationRole_DataTableSearchBox.clear();
			configurationObj.countryImmigrationRole_DataTableSearchBox.sendKeys(countryImmigrationRole[i]);

			Thread.sleep(2000);

			driver.findElement(By
					.xpath("//div[@id='ms-ImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryImmigrationRole[i] + "')]"))
					.click();
			
			Thread.sleep(2000);

		}

		configurationObj.saveCountryImmigrationRole.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Country immigration role created succesfully");
		
		test.log(LogStatus.INFO, "Immigration role is mapped to country");

		// It work without selecting from search box also.

		report.endTest(test);
		
	}
	
	//@Test(enabled = true, dataProvider = "assignmentImmigrationRoleMapping", dataProviderClass = assignmentImmigrationRoleMappingData.class,dependsOnMethods={"createCountryMapping","countryType","countryAssignmentRole","countryImmigrationRole"})
	@Test(enabled = false, dataProvider = "assignmentImmigrationRoleMapping", dataProviderClass = assignmentImmigrationRoleMappingData.class,priority=5)
	public void assignmentImmigrationRoleMapping(String assignmentRole, String immigrationRole)
			throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Assignment Immigration Role", "Immigration role is mapped to assignment role");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.assignmentImmigrationRoleSetting.click();

		Thread.sleep(1500);

		configurationObj.assignmentImmigrationRole_DataTableSearchBox.clear();
		configurationObj.assignmentImmigrationRole_DataTableSearchBox.sendKeys(assignmentRole);

		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//td[contains(text(),'" + assignmentRole + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(1500);

		String[] countryAssignmentImmigrationRole = immigrationRole.split(",");

		for (int i = 0; i < countryAssignmentImmigrationRole.length; i++) {

			configurationObj.searchAssignmentRole_AssignmentImmigrationRole.clear();
			configurationObj.searchAssignmentRole_AssignmentImmigrationRole
					.sendKeys(countryAssignmentImmigrationRole[i]);

			Thread.sleep(1000);

			driver.findElement(By
					.xpath("//div[@id='ms-AssignmentImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryAssignmentImmigrationRole[i] + "')]"))
					.click();
			Thread.sleep(1000);

		}

		configurationObj.saveBtn_AssignmentImmigrationRole.click();
		
		test.log(LogStatus.INFO, "Assignment Immigration role is mapped successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Assignment Immigration role created succesfully");
		
		report.endTest(test);

	}
	

	/*@Test(enabled = true, dataProvider = "countryTravelPurpose", dataProviderClass = countryTravelPurpose.class,
			dependsOnMethods={"createCountryMapping","countryType"})*/
	@Test(enabled = false, dataProvider = "countryTravelPurpose", dataProviderClass = countryTravelPurpose.class,priority=6)
	public void countryTravelPurpose(String sourceCountry, String destinationCountry,String service,String type,String travelPurpose) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Country Travel Purpose", "Creates country travel purspose");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryTravelPurposeSetting.click();
		
		Actions srcCountry = new Actions(driver);
		srcCountry.moveToElement(configurationObj.sourceCountry_CountryTravelPurpose).click();
		srcCountry.sendKeys(sourceCountry,Keys.ARROW_DOWN,Keys.ENTER);
		srcCountry.build().perform();		
		
		Thread.sleep(1000);
		
		Actions destCountry = new Actions(driver);
		destCountry.moveToElement(configurationObj.destinationCountry_CountryTravelPurpose).click();
		destCountry.sendKeys(destinationCountry,Keys.ARROW_DOWN,Keys.ENTER);
		destCountry.build().perform();
		
		Thread.sleep(1000);
		
		Actions serviceDropDown = new Actions(driver);
		serviceDropDown.moveToElement(configurationObj.service_CountryTravelPurpose).click();
		serviceDropDown.sendKeys(service,Keys.ARROW_DOWN,Keys.ENTER);
		serviceDropDown.build().perform();
		
		Thread.sleep(1000);
		
		Actions typeDropDown = new Actions(driver);
		typeDropDown.moveToElement(configurationObj.type_CountryTravelPurpose).click();
		typeDropDown.sendKeys(type,Keys.ARROW_DOWN,Keys.ENTER);
		typeDropDown.build().perform();
		
		Thread.sleep(1000);
		
		configurationObj.searchBtn_CountryTravelPurpose.click();
		
		Thread.sleep(1500);
		
				
		String[] countryTravelPurpose = travelPurpose.split(",");
		
		for (int i = 0; i < countryTravelPurpose.length; i++) {			
			
			configurationObj.SearchBoxDataTable_CountryTravelPurpose.sendKeys(countryTravelPurpose[i]);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//table[@id='tblCountryTravelPurpose']//td[contains(text(),'"+countryTravelPurpose[i]+"')]/preceding-sibling::td//label")).click();

			configurationObj.SearchBoxDataTable_CountryTravelPurpose.clear();
			
		}
		
			
		/* Code is modified - New functionality is being implemented in application.
		configurationObj.addCountryTravelPurpose.click();

		Thread.sleep(1500);

		Actions action = new Actions(driver);
		action.moveToElement(configurationObj.countryDropDown_TravelPurpose);
		action.sendKeys(country, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(1500);

		String[] countryTravelPurpose = travelPurpose.split(",");

		for (int i = 0; i < countryTravelPurpose.length; i++) {

			driver.findElement(By.xpath("//input[@value='" + countryTravelPurpose[i] + "']/following-sibling::label"))
					.click();

		} */
	
		configurationObj.saveCountryTravelPurpose.click();
		
		test.log(LogStatus.INFO, "Country travel purspose created successfully");
			
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Country travel purpose created succesfully");

		report.endTest(test);
	}	
	
	
	//@Test(enabled = true, dataProvider = "countryTypeForm", dataProviderClass = countryTypeForm.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "countryTypeForm", dataProviderClass = countryTypeForm.class,priority=7)
	public void countryTypeForm(String source, String destination, String service, String type, String formName,
			String applicableFor) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		test = report.startTest("Country Type Form", "Create country type form");
		
		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryTypeFormSetting.click();
		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_CountryTypeForm).click();
		action1.sendKeys(source, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_CountryTypeForm).click();
		action2.sendKeys(destination, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.serviceDropDown_CountryTypeForm).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.typeDropDown_CountryTypeForm).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.searchBtn_CountryTypeForm.click();

		Thread.sleep(1000);

		configurationObj.addBtn_CountryTypeForm.click();

		Thread.sleep(1500);

		String[] form = formName.split(",");
		String[] applicable = applicableFor.split(",");

		for (int i = 0; i < form.length; i++) {

			driver.findElement(By.xpath("//td[contains(text(),'" + form[i] + "')]/preceding-sibling::td/div/label"))
					.click();

			Thread.sleep(1500);

			Actions action5 = new Actions(driver);
			action5.moveToElement(driver.findElement(By.xpath(
					"//td[contains(text(),'" + form[i] + "')]/following-sibling::td/div[@title='select dependents']")))
					.click();

			for (int j = 0; j < applicable.length; j++) {

				action5.sendKeys(applicable[j], Keys.ENTER);
				action5.build().perform();

			}
		}

		configurationObj.saveBtn_CountryTypeForm.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Country type form created successfully");
		
		System.out.println("Country type form created succesfully");
		
		report.endTest(test);
	}
	

	//@Test(enabled = true, dataProvider = "supportLetter", dataProviderClass = supportLetterData.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "supportLetter", dataProviderClass = supportLetterData.class,priority=8)
	public void createSupportLetter(String sourceCountry, String destinationCountry, String service, String type,
			String documentName, String displayName, String documentDesc, String dateFormat) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Create Support Letter", "Creates support letter");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.supportLetterSetting);*/
		
		Actions supportLetterSetting = new Actions(driver);
		supportLetterSetting.moveToElement(configurationObj.supportLetterSetting).click();
		supportLetterSetting.build().perform();		

		//Thread.sleep(1500);

		//configurationObj.supportLetterSetting.click();

		Thread.sleep(2000);

		configurationObj.addBtn_SupportLetter.click();

		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountry_SupportLetter).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountry_SupportLetter).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.service_SupportLetter).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.type_SupportLetter).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.documentName_SupportLetter.sendKeys(documentName);

		configurationObj.displayName_SupportLetter.sendKeys(displayName);

		configurationObj.description_SupportLetter.sendKeys(documentDesc);
		
		Actions date = new Actions(driver);
		date.moveToElement(configurationObj.dateFormat_SupportLetter).click();
		date.sendKeys(dateFormat,Keys.ARROW_DOWN,Keys.ENTER);
		date.build().perform();

		configurationObj.saveBtn_SupportLetter.click();
		
		test.log(LogStatus.INFO, "Support letter created successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		Thread.sleep(1000);
		
		loginObj.logOut();
		
		System.out.println("Support letter created succesfully");
		
		report.endTest(test);

	}

	//@Test(enabled = true, dataProvider = "deputationLetter", dataProviderClass = deputationLetterData.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "deputationLetter", dataProviderClass = deputationLetterData.class,priority=9)
	public void createDeputationLetter(String sourceCountry, String destinationCountry, String service, String type,
			String documentName, String displayName, String documentDesc, String dateFormat) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test=report.startTest("Create Deputation Letter", "Creates deputation letter");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.deputationLetterSetting);*/

		Actions deputationLetterSetting = new Actions(driver);
		deputationLetterSetting.moveToElement(configurationObj.deputationLetterSetting).click();
		deputationLetterSetting.build().perform();
					
		//Thread.sleep(1500);

		//configurationObj.deputationLetterSetting.click();

		Thread.sleep(2000);

		configurationObj.addBtn_DeputationLetter.click();

		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_DepuationLetter).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_DepuationLetter).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.serviceDropDown_DeputationLetter).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.typeDropDown_DepuationLetter).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.documentName_DeputationLetter.sendKeys(documentName);

		configurationObj.displayName_DeputationLetter.sendKeys(displayName);

		configurationObj.description_DepuatationLetter.sendKeys(documentDesc);
		
		Actions date = new Actions(driver);
		date.moveToElement(configurationObj.dateFormat_DepuationLetter).click();
		date.sendKeys(dateFormat,Keys.ARROW_DOWN,Keys.ENTER);
		date.build().perform();

		configurationObj.saveBtn_DepuatationLetter.click();
		
		test.log(LogStatus.INFO, "Deputation letter created successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Deputation letter created succesfully");
		
		report.endTest(test);

	}
	
	//@Test(enabled=true,dataProvider="createEmailSetting",dataProviderClass=createEmailSetting.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled=false,dataProvider="createEmailSetting",dataProviderClass=createEmailSetting.class,priority=10)
	public void createEmail(String sourceCountry,String destinationCountry,String Service,String Type,
			String Category,String from, String to, String cc,String bcc,String subject) throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.emailSetting);

		Thread.sleep(1500);
		
		configurationObj.emailSetting.click();
		
		Thread.sleep(2000);
		
		Actions srcCountry = new Actions(driver);
		srcCountry.moveToElement(configurationObj.srcCountryDropDown_Email).click().sendKeys(sourceCountry,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions destCountry = new Actions(driver);
		destCountry.moveToElement(configurationObj.DestCountryDropDown_Email).click().sendKeys(destinationCountry,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions service = new Actions(driver);
		service.moveToElement(configurationObj.serviceDropDown_Email).click().sendKeys(Service,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions type = new Actions(driver);
		type.moveToElement(configurationObj.typeDropDown_Email).click().sendKeys(Type,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		configurationObj.searchBtn_EmailSetting.click();
		
		Thread.sleep(1500);
		
		configurationObj.addBtn_EmailSetting.click();
		
		Thread.sleep(2000);
		
		Actions category = new Actions(driver);
		category.moveToElement(configurationObj.categoryDropDown_EmailSetting).click().sendKeys(Category,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		configurationObj.From_EmailSetting.clear();
		configurationObj.From_EmailSetting.sendKeys(from);
		
		configurationObj.To_EmailSetting.sendKeys(to);
		
		configurationObj.Cc_EmailSetting.sendKeys(cc);
		
		configurationObj.Bcc_EmailSetting.sendKeys(bcc);
		
		configurationObj.Subject_EmailSetting.sendKeys(subject);
		
		configurationObj.saveAndContinueBtn_EmailSetting.click();
		
		Thread.sleep(4000);
		
		configurationObj.finalSaveBtn_EmailSetting.click();
		
		Thread.sleep(2000);
		
		//Nt required
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();	
		
		System.out.println("Email created succesfully");
		
	}
	

	//@Test(enabled = true, dataProvider = "userDefinedKeyword", dataProviderClass = createUserDefindedKeywordData.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "userDefinedKeyword", dataProviderClass = createUserDefindedKeywordData.class,priority=11)
	public void createUserDefinedKeyword(String text, String value) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Create User Defined Keyword", "Creates user defined keywords");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.userDefinedKeywordSetting);

		Thread.sleep(1500);
		configurationObj.userDefinedKeywordSetting.click();

		Thread.sleep(1500);

		configurationObj.addBtn_UserDefinedKeyword.click();
		Thread.sleep(1500);

		configurationObj.text.sendKeys(text);
		configurationObj.value.sendKeys(value);

		configurationObj.saveBtn_UserDefinedKeyword.click();
		
		test.log(LogStatus.INFO, "User defined keyword created successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("User defined Keyword created succesfully");
		
		report.endTest(test);

	}

	
	//@Test(enabled = true, dataProvider = "addAuthorizedSignatory", dataProviderClass = addAuthorizedSignatoryData.class,dependsOnMethods={"createCountryMapping","countryType"})
	@Test(enabled = false, dataProvider = "addAuthorizedSignatory", dataProviderClass = addAuthorizedSignatoryData.class,priority=12)
	public void addAuthorizedSignatory(String isEmp, String fName, String mName, String lName, String designation,
			String phNo, String emailID, String companyName, String postalCode, String country, String state,
			String city, String addressLine1, String addressLine2, String signature) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Create Authorized Signatory","Creates authorized signatory");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.authorizedSignatorySetting);

		Thread.sleep(1500);

		configurationObj.authorizedSignatorySetting.click();

		Thread.sleep(1500);

		configurationObj.addBtn_AuthorizedSignatory.click();

		Thread.sleep(1500);

		Actions action = new Actions(driver);
		action.moveToElement(configurationObj.isEmployeeDropDown_AuthorizedSignatory).click();
		action.sendKeys(isEmp, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		configurationObj.firstName_AuthorizedSignatory.sendKeys(fName);

		configurationObj.middleName_AuthorizedSignatory.sendKeys(mName);

		configurationObj.lastName_AuthorizedSignatory.sendKeys(lName);

		configurationObj.designation_AuthorizedSignatory.sendKeys(designation);

		configurationObj.phoneNumber_AuthorizedSignatory.sendKeys(phNo);

		configurationObj.emailId_AuthorizedSignatory.sendKeys(emailID);

		configurationObj.companyName_AuthorizedSignatory.sendKeys(companyName);

		configurationObj.postalCode_AuthorizedSignatory.sendKeys(postalCode);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.countryDropDown_AuthorizedSignatory).click();
		action1.sendKeys(country, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.stateDropDown_AuthorizedSignatory).click();
		action2.sendKeys(state, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.cityDropDown_AuthorizedSignatory).click();
		action3.sendKeys(city, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		configurationObj.addressLine1_AuthorizedSignatory.sendKeys(addressLine1);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", configurationObj.addressLine2_AuthorizedSignatory);

		configurationObj.addressLine2_AuthorizedSignatory.sendKeys(addressLine2);

		configurationObj.uploadBtn_AuthorizedSignatory.click();
		Thread.sleep(1000);
		FileUpload.uploadFile(signature);
		
		configurationObj.saveBtn_AuthorizedSignatory.click();
		
		test.log(LogStatus.INFO, "Authorized signatory created successfully");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Authorized signatory created succesfully");
		
		report.endTest(test);

	}
	
	
	//@Test(enabled=true,dataProvider = "createClaimMenuMapping", dataProviderClass = createClaimMenuMappingData.class)
	@Test(enabled=false,dataProvider = "createClaimMenuMapping", dataProviderClass = createClaimMenuMappingData.class,priority=13)
	public void claim_MenuMapping(String user, String claims) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Create Authorized Signatory","Creates authorized signatory");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.claimMenuMappingSetting);

		Thread.sleep(1500);
		
		configurationObj.claimMenuMappingSetting.click();
		
		Thread.sleep(1500);
		
		configurationObj.addBtn_ClaimMenuMapping.click();
		
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		act.moveToElement(configurationObj.claimDropDown_ClaimMenuMapping).click();
		act.sendKeys(user,Keys.ARROW_DOWN,Keys.ENTER);
		act.build().perform();
		
		Thread.sleep(1500);
		
		String[] claim= claims.split(",");
		
		for ( int i=0 ; i<claim.length; i++) {			
			configurationObj.inputSearchBoxNonSelected.sendKeys(claim[i]);
			configurationObj.moveAll.click();	
			configurationObj.inputSearchBoxNonSelected.clear();
		}
		
		Thread.sleep(1500);
		
		configurationObj.saveBtn_ClaimMenuMapping.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		System.out.println("Claim menu mapping created succesfully");
		
	}	

	
	
	
	//@Test(enabled=true,dataProvider="createGeoMapping",dataProviderClass=createGeoMapping.class)
	@Test(enabled=false,dataProvider="createGeoMapping",dataProviderClass=createGeoMapping.class,priority=14)
	public void createGeoMapping(String GeoName, String Countries) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.getMappingSetting);

		Thread.sleep(1500);

		configurationObj.getMappingSetting.click();

		Thread.sleep(2000);

		configurationObj.addBtn_GeoMappingSetting.click();

		Thread.sleep(2000);

		configurationObj.geoMappingName_GeoMappingSetting.sendKeys(GeoName);

		String[] Country = Countries.split(",");

		for (int i = 0; i < Country.length; i++) {

			configurationObj.dataTableSearchBox_GeoMappingSetting.clear();
			configurationObj.dataTableSearchBox_GeoMappingSetting.sendKeys(Country[i]);
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//table[@id='tblAddGeoMapping']//td[contains(text(),'" + Country[i]
					+ "')]/preceding-sibling::td//div")).click();
			
			Thread.sleep(1000);
		}

		configurationObj.saveBtn_GeoMappingSetting.click();

		Thread.sleep(2000);

		wait.until(ExpectedConditions
				.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));

		loginObj.logOut();

		System.out.println("Geo Mapping created succesfully");
	}
	
	
	
	
 /*
  * 
  * *********Feature modified as on 26 May 2017
  
	
	@Test(enabled = false, dataProvider = "educationEvaluation", dataProviderClass = educationEvaluationData.class,
			dependsOnMethods={"createCountryMapping","countryType"})
	public void createEducationEvaluation(String sourceCountry, String destinationCountry, String service, String type)
			throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test=report.startTest("Create Education Evaluation", "Creates education evaluation");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.educationEvaluationSetting);

		Thread.sleep(1500);

		configurationObj.educationEvaluationSetting.click();

		Thread.sleep(1500);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_EducationEvaluation).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_EducationEvaluation).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.service_EducationEvaluation).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.type_EducationEvaluation).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.searchBtn_EducationEvaluation.click();

		Thread.sleep(1000);

		configurationObj.addBtn_EducationEvaluation.click();
		
		test.log(LogStatus.INFO, "Education Evaluation created successfully");
		
		System.out.println("Education evaluation created succesfully");
		
		report.endTest(test);
		
		

	}
	*/
	
	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
	}
	
	@BeforeSuite
	public void init() throws ATUTestRecorderException{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'-At-'HH-mm-ss");

		String dateStr = dateFormat.format(cal.getTime());
		
		recorder = new ATUTestRecorder("C:\\Users\\dinesh.r\\Desktop\\Automation\\VideoScreenshot\\", dateStr, false);
		
		recorder.start();
				
	}
	
	@AfterSuite
	public void flush() throws ATUTestRecorderException{
		recorder.stop();
		
	}
	
	@AfterTest
	public void flushReport(){
		report.flush();
	}
	

}
