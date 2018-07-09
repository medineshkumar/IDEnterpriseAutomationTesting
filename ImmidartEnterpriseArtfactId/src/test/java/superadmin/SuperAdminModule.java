package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import genericClasses.FileUpload;
import genericClasses.Login;
import pages.superAdminPages;
import testData.createKnowledgeBaseData;
import testData.createEmbassyMasterData;
import testData.createLicenseData;
import testData.createMasterMileStoneFieldData;
import testData.createMasterServiceData;
import testData.createMasterTypeData;
import testData.masterUnitData;
import testData.serviceMappingData;

public class SuperAdminModule {

	static WebDriver driver;

	String appURL = "http://10.10.10.101/enterpriseqa/";

	ExtentReports report = new ExtentReports("C:\\Users\\dinesh.r\\Desktop\\Automation\\ExtentReport\\SuperAdminReport.html", true);
	ExtentTest test;	

	@Test(enabled = true, dataProvider = "createLicense", dataProviderClass = createLicenseData.class,priority=1)
	public void createLicense(String productType, String streamType, String code ,String OrganizationName, String contactFname,
			String contactLname, String contactEmail, String contactNumber, String alternateContactNumber,
			String validityStartDate, String validityEndDate, String url, String inputDateFormat,
			String displayDateFormat, String domain, String timeZone) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages supersuperAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);

		test = report.startTest("Create new License", "Creates new license");

		Thread.sleep(2500);

		supersuperAdminPageObj.masterModuleSetting.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.licenseSetting.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.addLicenseBtn.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.productTypeDropDown.click();
		supersuperAdminPageObj.producTypeDropDownInputBox.sendKeys(productType, Keys.ENTER);

		Thread.sleep(2000);

		supersuperAdminPageObj.streamTypeDropDown.click();
		supersuperAdminPageObj.streamTypeDropDownInputBox.sendKeys(streamType, Keys.ENTER);

		Thread.sleep(2000);
		
		supersuperAdminPageObj.code.sendKeys(code);

		supersuperAdminPageObj.organizationName.sendKeys(OrganizationName);

		supersuperAdminPageObj.contactFirstName.sendKeys(contactFname);

		supersuperAdminPageObj.contactLastname.sendKeys(contactLname);

		supersuperAdminPageObj.contactEmail.sendKeys(contactEmail);

		supersuperAdminPageObj.contactNumber.sendKeys(contactNumber);

		supersuperAdminPageObj.alternateContactNumber.sendKeys(alternateContactNumber);

		supersuperAdminPageObj.validityStartDate.sendKeys(validityStartDate, Keys.ENTER);

		supersuperAdminPageObj.validityEndDate.sendKeys(validityEndDate, Keys.ENTER);

		supersuperAdminPageObj.URL.sendKeys(url);

		supersuperAdminPageObj.inputDateFormatDropDown.click();
		supersuperAdminPageObj.inputDateFormatDropDownInputBox.sendKeys(inputDateFormat, Keys.ENTER);

		Thread.sleep(1000);

		supersuperAdminPageObj.displayDateFormatDropDown.click();
		supersuperAdminPageObj.displayDateFormatInputBox.sendKeys(displayDateFormat, Keys.ENTER);

		Thread.sleep(1000);

		supersuperAdminPageObj.domain.sendKeys(domain);

		Thread.sleep(1000);
		
		supersuperAdminPageObj.systemAlertEmail.sendKeys("systemalert@email.com");

		/*
		 * Currently Not implemented
		 * supersuperAdminPageObj.timeZoneDropDown.click();
		 * supersuperAdminPageObj.timeZoneDropDownInputBox.sendKeys("");
		 */
		
		supersuperAdminPageObj.saveLicenseBtn.click();
		
		Thread.sleep(2000);
							
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));

		loginObj.logOut();

		test.log(LogStatus.INFO, "New License created successfully");

		System.out.println("License created successfully");

		report.endTest(test);

	}

	@Test(enabled = true, dataProvider = "createEmbassyMaster", dataProviderClass = createEmbassyMasterData.class,priority=6)
	public void createEmbassyMaster(String sourceCountry, String destinationCountry, String type, String title,
			String officerInCharge, String address1, String address2, String state, String city, String postalCode,
			String stateJurisdiction) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);

		test = report.startTest("Create embassy master", "Create new embassy master");

		Actions action = new Actions(driver);

		superAdminPageObj.masterModuleSetting.click();

		Thread.sleep(2500);

		superAdminPageObj.embassyMasterSetting.click();

		superAdminPageObj.addEmbassyMasterBtn.click();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.sourceCountryEmbassyMaster);
		action.click();
		action.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.destinationCountryEmbassyMaster);
		action.click();
		action.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.typeDropDownEmbassyMaster);
		action.click();
		action.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		superAdminPageObj.titleEmbassy.sendKeys(title);

		superAdminPageObj.officerInChargeEmbassyMaster.sendKeys(officerInCharge);

		superAdminPageObj.address1EmbassyMaster.sendKeys(address1);

		superAdminPageObj.address2EmbassyMaster.sendKeys(address2);

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.stateDropDownEmbassyMaster);
		action.click();
		action.sendKeys(state, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.cityDropDownEmbassyMaster);
		action.click();
		action.sendKeys(city, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		superAdminPageObj.postalCodeEmbassyMaster.sendKeys(postalCode);

		Thread.sleep(2000);

		String[] jurisdiction = stateJurisdiction.split(",");
		for (int i = 0; i < jurisdiction.length; i++) {

			action.moveToElement(superAdminPageObj.stateJurisdictionEmbassyMaster);
			action.click();
			action.sendKeys(jurisdiction[i], Keys.ENTER);
			action.build().perform();

		}
		 superAdminPageObj.saveEmbassyMasterBtn.click();

		 Thread.sleep(2000);
			
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
	

		loginObj.logOut();

		test.log(LogStatus.INFO, "Embassy master created successfully");

		System.out.println("Embassy master created successfully");

		report.endTest(test);

	}

	@Test(enabled = true, dataProvider="createMasterService",dataProviderClass=createMasterServiceData.class,priority=2)
	public void createMasterService(String serviceCode,String serviceDescription) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create new master service", "Creates new master service");

		Thread.sleep(2000);
		superAdminPageObj.masterServiceSetting.click();

		Thread.sleep(2000);

		superAdminPageObj.addBtn_MasterService.click();

		Thread.sleep(2000);

		superAdminPageObj.serviceCode.sendKeys(serviceCode);

		superAdminPageObj.serviceDescription.sendKeys(serviceDescription);

		superAdminPageObj.saveBtn_MasterService.click();

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));


		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Master service created successfully");

		System.out.println("Master service created successfully");
		
		report.endTest(test);

	}

	@Test(enabled = true,dataProvider="createMasterType",dataProviderClass=createMasterTypeData.class,priority=3)
	public void createMasterType(String service, String typeCode, String typeDescription, String category) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create new master type", "Creates new master type");


		Thread.sleep(2000);
		superAdminPageObj.masterTypeSetting.click();

		Thread.sleep(2000);

		superAdminPageObj.addBtn_MasterType.click();

		Thread.sleep(1500);

		Actions serviceDropDown = new Actions(driver);
		serviceDropDown.moveToElement(superAdminPageObj.serviceDropDown_MasterType).click();
		serviceDropDown.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		serviceDropDown.build().perform();

		superAdminPageObj.typeCode_MasterType.sendKeys(typeCode);
		superAdminPageObj.typeDescription_MasterType.sendKeys(typeDescription);

		Actions categoryDropDown = new Actions(driver);
		categoryDropDown.moveToElement(superAdminPageObj.categoryDropDown_MasterType).click();
		categoryDropDown.sendKeys(category, Keys.ARROW_DOWN, Keys.ENTER);
		categoryDropDown.build().perform();

		superAdminPageObj.saveBtn_MasterType.click();

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));

		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Master type created successfully");

		System.out.println("Master type created successfully");
		
		report.endTest(test);

	}

	@Test(enabled = true, dataProvider="serviceMapping",dataProviderClass=serviceMappingData.class,priority=4)
	public void serviceMapping(String stageType, String service) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);		
		
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create new service mapping", "Creates new service mapping");


		Thread.sleep(2000);
		superAdminPageObj.serviceMappingSetting.click();

		Thread.sleep(2000);
		
		superAdminPageObj.addBtn_ServiceMapping.click();
		
		Thread.sleep(2000);
		
		Actions stageTypeDropDown = new Actions(driver);
		stageTypeDropDown.moveToElement(superAdminPageObj.stageTypeDropDown).click();
		stageTypeDropDown.sendKeys(stageType,Keys.ARROW_DOWN,Keys.ENTER);
		stageTypeDropDown.build().perform();
		
		Thread.sleep(2000);
		
		String[] services = service.split(",");
		
		for(int i=0 ; i<services.length; i++){
		superAdminPageObj.linkinputSearchFilter_ServiceMapping.clear();
		superAdminPageObj.linkinputSearchFilter_ServiceMapping.sendKeys(services[i]);
		Thread.sleep(2000);		
		//driver.findElement(By.xpath("//li[@class='ms-elem-selectable']/span[contains(text(),'"+services[i]+"')]")).click();
		driver.findElement(By.xpath("//div[@id='ms-ddlMasterService']//li[contains(@class,'selectable')]/span[contains(text(),'"+services[i]+"')]")).click();
		Thread.sleep(1000);
		}
		
		superAdminPageObj.saveBtn_ServiceMapping.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Service mapped successfully");

		System.out.println("Service mapped successfully");
		
		report.endTest(test);

	}

	@Test(enabled = true,dataProvider="masterUnitData", dataProviderClass= masterUnitData.class,priority=5)
	public void createMasterUnit(String stageName, String numOfApplications) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create Master Unit", "Creates new master unit");

		Thread.sleep(2000);
		superAdminPageObj.masterUnitSetting.click();

		Thread.sleep(2000);
		
		superAdminPageObj.addBtn_MasterUnit.click();
		
		Thread.sleep(1500);
		
		Actions stageNameDropDown = new Actions(driver);
		stageNameDropDown.moveToElement(superAdminPageObj.stageName_MasterUnit).click();
		stageNameDropDown.sendKeys(stageName,Keys.ARROW_DOWN,Keys.ENTER);
		stageNameDropDown.build().perform();
		
		superAdminPageObj.numberOfApplication.sendKeys(numOfApplications);
		
		superAdminPageObj.saveBtn_MasterUnit.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
		test.log(LogStatus.INFO, "Master unit created successfully");

		System.out.println("Master unit created successfully");
		
		report.endTest(test);
		
	}
		
	@Test(enabled=true, dataProvider="knowledgeBaseData", dataProviderClass=createKnowledgeBaseData.class,priority=7)
	public void createKnowledgeBase(String licenseNo, String documentName, String documentDescription, String templateFilePath) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
				
		Thread.sleep(2000);
		
		superAdminPageObj.knowledgeBaseSetting.click();
		
		Thread.sleep(2000);
		
		superAdminPageObj.addKnowledgeBaseBtn.click();
		
		Thread.sleep(2000);
		
		Actions selectLicenseNo = new Actions(driver);
		selectLicenseNo.moveToElement(superAdminPageObj.selectLicenseNoDropDown_KnowledgeBaseSetting).click();
		selectLicenseNo.sendKeys(licenseNo,Keys.ARROW_DOWN,Keys.ENTER);
		selectLicenseNo.build().perform();
		
		superAdminPageObj.documentName_KnowledgeBaseSetting.sendKeys(documentName);
		
		superAdminPageObj.documentDescription_KnowledgeBaseSetting.sendKeys(documentDescription);
		
		superAdminPageObj.templateUpload_KnowledgeBaseSetting.click();
		
		Thread.sleep(1500);
		
		FileUpload.uploadFile(templateFilePath);
		Thread.sleep(1500);
		superAdminPageObj.templateUploadFileBtn_KnowledgeBaseSetting.click();
		
		Thread.sleep(1500);
		
		superAdminPageObj.saveBtn_KnowledgeBaseSetting.click();

		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();

}
	
	
	@Test(enabled=true,dataProvider="masterMileStoneFieldData",dataProviderClass=createMasterMileStoneFieldData.class,priority=8)
	public void createMasterMileStoneField(String name, String description, String isAuto) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);

		Thread.sleep(2000);

		superAdminPageObj.masterMilestoneFieldSetting.click();

		Thread.sleep(2000);

		superAdminPageObj.addBtn_MasterMileStoneField.click();

		Thread.sleep(2000);

		superAdminPageObj.name_MasterMileStoneField.sendKeys(name);

		superAdminPageObj.description_MasterMileStoneField.sendKeys(description);

		if (isAuto.toLowerCase().contains("yes")) {
			superAdminPageObj.isAutoUpdatedCheckBox_MasterMileStoneField.click();
		}

		Thread.sleep(1000);

		superAdminPageObj.saveBtn_MasterMileStoneField.click();

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
