package beneficiary;

import java.util.List;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import genericClasses.Browser;
import genericClasses.Login;
import pages.beneficiaryInitiationPage;
import pages.beneficiaryLandingPage;
import pages.beneficiaryMyProfilePage;

public class beneficiaryInformationSheet {

	static WebDriver driver;

	String appURL = "http://10.10.10.101/EnterpriseQA/";
	
	@Test(enabled=true, priority = 1)
	public void createOrganization() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);	
		
		beneficiaryMyProfilePageObj.organizationSetting.click();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.editOrganization.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.organizationCareerBand_OrganizationSetting.sendKeys("organization career band");
		
		beneficiaryMyProfilePageObj.currentDesignation_OrganizationSetting.sendKeys("current designation");
		
		beneficiaryMyProfilePageObj.organizationName_OrganizationSetting.sendKeys("organization name");
		
		beneficiaryMyProfilePageObj.organizationCode_OrganizationSetting.sendKeys("organization code");
		
		beneficiaryMyProfilePageObj.division_OrganizationSetting.sendKeys("division");
		
		beneficiaryMyProfilePageObj.subDivision_OrganizationSetting.sendKeys("sub division");
		
		beneficiaryMyProfilePageObj.businessDivision_OrganizationSetting.sendKeys("business division");
		
		beneficiaryMyProfilePageObj.businessSubDivision_OrganizationSetting.sendKeys("business sub division");
		
		beneficiaryMyProfilePageObj.domain_OrganizationSetting.sendKeys("domain");
		
		beneficiaryMyProfilePageObj.dateOfJoining_OrganizationSetting.click();		
		JavascriptExecutor doj = (JavascriptExecutor) driver;
		doj.executeScript("document.getElementById('DateOfJoining').value='02/01/2018';");
		
		beneficiaryMyProfilePageObj.currentExperience_OrganizationSetting.sendKeys("12");
		
		beneficiaryMyProfilePageObj.overAll_OrganizationSetting.sendKeys("36");
		
		beneficiaryMyProfilePageObj.relevantExperience_OrganizationSetting.sendKeys("24");
		
		// Write code for selecting country code.
		
		JavascriptExecutor contactNoFocus = (JavascriptExecutor) driver;
		contactNoFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting);
		
		Thread.sleep(1500);
		
		Actions flagSelector = new Actions(driver);
		flagSelector.moveToElement(driver.findElement(By.xpath("//div[@class='flag-container']"))).click().sendKeys("India",Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting.sendKeys("9844748783");
		
		JavascriptExecutor currentWorkLocationFocus = (JavascriptExecutor) driver;
		currentWorkLocationFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting);
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.currentWorkLocation_OrganizationSetting.sendKeys("bangalore");
		
		JavascriptExecutor currentWorkAddressFocus = (JavascriptExecutor) driver;
		currentWorkAddressFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.currentWorkAddress_OrganizationSetting);
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.currentWorkAddress_OrganizationSetting.sendKeys("bangalore india");
		
		JavascriptExecutor reportingManagerFocus = (JavascriptExecutor) driver;
		reportingManagerFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.reportingManager_OrganizationSetting);
		
		Thread.sleep(1500);
		
		//beneficiaryMyProfilePageObj.employmentTypeDropDown_OrganizationSetting.click();
		
		beneficiaryMyProfilePageObj.reportingManager_OrganizationSetting.sendKeys("reporting");

		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.saveBtn_OrganizationSetting);
		
		Thread.sleep(1500);
		
		//beneficiaryMyProfilePageObj.saveBtn_OrganizationSetting.click();
	}
	
	@Test(enabled=true, priority = 2)
	public void createPersonalInformation() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);	
		
		beneficiaryMyProfilePageObj.personalInformationSetting.click();
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.editPersonalInformation.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.firstName_PersonalSetting.sendKeys("first name");
		beneficiaryMyProfilePageObj.middleName_PersonalSetting.sendKeys("middle name");
		beneficiaryMyProfilePageObj.lastName_PersonalSetting.sendKeys("last name");
		
		beneficiaryMyProfilePageObj.dateOfBirth_PersonalSetting.click();
		JavascriptExecutor dob = (JavascriptExecutor) driver;
		dob.executeScript("document.getElementById('DateOfBirth').value='02/01/2018';");		
		
		
		beneficiaryMyProfilePageObj.placeOfBirth_PersonalSetting.click();
		beneficiaryMyProfilePageObj.placeOfBirth_PersonalSetting.sendKeys("Bangalore");
		
		Actions countryOfBirth = new Actions(driver);
		countryOfBirth.moveToElement(beneficiaryMyProfilePageObj.countryOfBirthDropDown_PersonalSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions stateOfBirth = new Actions(driver);
		stateOfBirth.moveToElement(beneficiaryMyProfilePageObj.stateOfBirthDropDown_PersonalSetting).click().sendKeys("karnataka",Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1500);
		
		Actions maritalStatus = new Actions(driver);
		maritalStatus.moveToElement(beneficiaryMyProfilePageObj.martialStatus_PersonalSetting).click().sendKeys("single",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.personalEmailID_PersonalSetting.sendKeys("pesonal@email.com");
		
		beneficiaryMyProfilePageObj.alternateEmailID_PersonalSetting.sendKeys("altpersonal@email.com");
		
		Actions flagSelector = new Actions(driver);
		flagSelector.moveToElement(driver.findElement(By.xpath("//div[@class='flag-container']"))).click().sendKeys("India",Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.contactNumber_PersonalSetting.sendKeys("9844748783");
		
		beneficiaryMyProfilePageObj.alternateNumber_PersonalSetting.sendKeys("9844748783");
		
		Actions gender = new Actions(driver);
		gender.moveToElement(beneficiaryMyProfilePageObj.gender_PersonalSetting).click().sendKeys("male",Keys.ENTER);
			
		
	}
	
	@Test(enabled=true, priority = 3)
	public void createAddress() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.addressSetting.click();
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.addAddressBtn_AddressSetting.click();
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.currentAddressLine1_AddressSetting.sendKeys("address line 1");
		beneficiaryMyProfilePageObj.currentAddressLine2_AddressSetting.sendKeys("address line 2");
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.currentAddressCountryDropDown_AddressSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions state = new Actions(driver);
		state.moveToElement(beneficiaryMyProfilePageObj.currentAddressStateDropDown_AddressSetting).click().sendKeys("karnataka",Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1500);
		
		Actions city = new Actions(driver);
		city.moveToElement(beneficiaryMyProfilePageObj.currentAddressCityDropDown_AddressSetting).click().sendKeys("bangalore",Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.currentAddressPostalCode_AddressSetting.sendKeys("456123");
		
		Select isPermanentSame = new Select(beneficiaryMyProfilePageObj.isPermanentAddressDropDown_AddressSetting);
		isPermanentSame.selectByVisibleText("Yes");
		
		JavascriptExecutor IsEmergencySameFocus = (JavascriptExecutor) driver;
		IsEmergencySameFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.isEmergencyAddressDropDown_AddressSetting);
		
		Thread.sleep(1500);
		
		Select isEmergency = new Select(beneficiaryMyProfilePageObj.isEmergencyAddressDropDown_AddressSetting);
		isEmergency.selectByVisibleText("Yes");

		Thread.sleep(1000);
		
		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.saveBtn_AddressSetting);
		
		Thread.sleep(1500);
		
		//beneficiaryMyProfilePageObj.saveBtn_AddressSetting.click();
				
	}
	
	@Test(enabled=true, priority = 4)
	public void createQualification() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.qualificationSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.addEducationButton_QualificationSetting.click();
		
		Thread.sleep(2000);
		
		Actions educationCategory = new Actions(driver);
		educationCategory.moveToElement(beneficiaryMyProfilePageObj.educationCategoryDropdown_QualificationSetting).click().sendKeys("").build().perform();
		
		Thread.sleep(1500);
		
		Actions degree = new Actions(driver);
		degree.moveToElement(beneficiaryMyProfilePageObj.degreeDropDown_QualificationSetting).click().sendKeys("").build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.boardUniversityName_QualificationSetting.sendKeys("");
		
		beneficiaryMyProfilePageObj.instituteName_QualificationSetting.sendKeys("");
		
		beneficiaryMyProfilePageObj.yearOfStart_QualificationSetting.click();
		beneficiaryMyProfilePageObj.yearOfStart_QualificationSetting.sendKeys("",Keys.ENTER);
		
		beneficiaryMyProfilePageObj.yearOfPassing_QualificationSetting.click();
		beneficiaryMyProfilePageObj.yearOfPassing_QualificationSetting.sendKeys("",Keys.ENTER);
		
		beneficiaryMyProfilePageObj.percentageGrade_QualificationSetting.sendKeys("");
		
		Actions modeOfEducation = new Actions(driver);
		modeOfEducation.moveToElement(beneficiaryMyProfilePageObj.modeOfEducationDropDown_QualificationSetting).click().sendKeys("",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.majorFieldOfStudy_QualificationSetting.sendKeys("");
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_QualificationSetting).click().sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);
		
		Actions state = new Actions(driver);
		state.moveToElement(beneficiaryMyProfilePageObj.StateDropDown_QualificationSetting).click().sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);
		
		Actions city = new Actions(driver);
		city.moveToElement(beneficiaryMyProfilePageObj.cityDropDown_QualificationSetting).click().sendKeys("",Keys.ARROW_DOWN,Keys.ENTER);
	
		//beneficiaryMyProfilePageObj.saveBtn_QualificationSetting.click();
		
	}
	
	@Test(enabled=true, priority = 5)
	public void createPassport1() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.passportSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.addPassportBtn_PassportSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.passportNo_PassportSetting.sendKeys("25236525");
		
		beneficiaryMyProfilePageObj.surname_PassportSetting.sendKeys("surname");
		
		beneficiaryMyProfilePageObj.givenName_PassportSetting.sendKeys("givenname");
		
		Actions nationality = new Actions(driver);
		nationality.moveToElement(beneficiaryMyProfilePageObj.nationalityDropDown_PassportSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.placeOfIssue_PassportSetting.sendKeys("bangalore");
		
		beneficiaryMyProfilePageObj.dateOfIssue_PassportSetting.click();
		JavascriptExecutor doi = (JavascriptExecutor) driver;
		doi.executeScript("document.getElementById('DateOfIssue').value='02/01/2018';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.dateOfExpiry_PassportSetting.click();
		JavascriptExecutor doe = (JavascriptExecutor) driver;
		doe.executeScript("document.getElementById('DateOfExpiry').value='02/01/2019';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.placeOfIssue_PassportSetting.click();
		
		Select ecnr = new Select(beneficiaryMyProfilePageObj.ecnrRequirement_PassportSetting);
		ecnr.selectByVisibleText("No");
		
		Thread.sleep(1000);
		
		Select passportActive = new Select(beneficiaryMyProfilePageObj.passportActive_PassportSetting);
		passportActive.selectByVisibleText("Yes");
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_PassportSetting.click();
		
	}
	
	@Test(enabled=true, priority = 6)
	public void createWorkVisa() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.workVisaSetting.click();
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.addWorkVisa_WorkVisaSetting.click();
		
		Thread.sleep(2000);
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_WorkVisaSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.sponsorer_WorkVisaSetting.sendKeys("sponsorer");
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_WorkVisaSetting).click().sendKeys("other",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.visaDescription_WorkVisaSetting.sendKeys("Visa description");
		
		Thread.sleep(1000);
		
		Actions status = new Actions(driver);
		status.moveToElement(beneficiaryMyProfilePageObj.status_WorkVisaSetting).click().sendKeys("active",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		beneficiaryMyProfilePageObj.workPermitStartDate_WorkVisaSetting.click();
		JavascriptExecutor wps = (JavascriptExecutor) driver;
		wps.executeScript("document.getElementById('WorkPermitStartDate').value='02/01/2018';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workPermitEndDate_WorkVisaSetting.click();
		JavascriptExecutor wpe = (JavascriptExecutor) driver;
		wpe.executeScript("document.getElementById('WorkPermitEndDate').value='02/01/2019';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.workPermitNumber_WorkVisaSetting.sendKeys("123456");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.visaStartDate_WorkVisaSetting.click();
		JavascriptExecutor vsd = (JavascriptExecutor) driver;
		vsd.executeScript("document.getElementById('VisaStartDate').value='02/01/2018';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.visaEndDate_WorkVisaSetting.click();
		JavascriptExecutor vse = (JavascriptExecutor) driver;
		vse.executeScript("document.getElementById('VisaEndDate').value='02/01/2019';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.deregistrationDate_WorkVisaSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('TDeregistrationDate').value='02/01/2019';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.remarks_WorkVisaSetting.click();
		beneficiaryMyProfilePageObj.remarks_WorkVisaSetting.sendKeys("remarks");
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_WorkVisaSetting.click();
		
	}
	
	@Test(enabled=true, priority = 7)
	public void createTravel() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.travelSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.AddTravelBtn_travelSetting.click();
		
		Thread.sleep(1500);
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_travelSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.company_travelSetting.sendKeys("compnay");
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_travelSetting).click().sendKeys("other",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.visaDescription_travelSetting.sendKeys("visa description");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfTravel_travelSetting.click();
		JavascriptExecutor dot = (JavascriptExecutor) driver;
		dot.executeScript("document.getElementById('TDateOfTravel').value='02/01/2018';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfDeparture_travelSetting.click();
		JavascriptExecutor dod = (JavascriptExecutor) driver;
		dod.executeScript("document.getElementById('TDateOfDepature').value='02/01/2019';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.deregistrationDate_travelSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('TDeregistrationDate').value='02/02/2019';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.remarks_travelSetting.click();
		beneficiaryMyProfilePageObj.remarks_travelSetting.sendKeys("remarks");
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_travelSetting.click();
		
		
	}
	
	@Test(enabled=true, priority = 8)
	public void createImmigration() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.immigrationSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.addImmigrationBtn_ImmigrationSetting.click();
		
		Thread.sleep(2000);
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_ImmigrationSetting).click().sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
				
		beneficiaryMyProfilePageObj.company_ImmigrationSetting.sendKeys("company");
		
		Thread.sleep(1000);
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_ImmigrationSetting).click().sendKeys("other",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.visaDescription_ImmigrationSetting.sendKeys("visa description");
		
		beneficiaryMyProfilePageObj.antecedentDetails_ImmigrationSetting.sendKeys("antecedent details");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfTravel_ImmigrationSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('DDateOfTravel').value='02/02/2019';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.antecedentDetails_ImmigrationSetting.click();
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_ImmigrationSetting.click();
			
	}
	
	@Test(enabled=true, priority = 9)
	public void createExperience() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,beneficiaryMyProfilePage.class);

		benLandingPageObj.myProfileSetting_Dashboard.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.myProfileMenu.click();
		Thread.sleep(1500);
		beneficiaryMyProfilePageObj.informationSheetSubMenu.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.experienceSetting.click();
		
		Thread.sleep(2000);
		
		beneficiaryMyProfilePageObj.AddExperienceBtn_ExperienceSetting.click();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.employeeNo_ExperienceSetting.sendKeys("123456");
		
		beneficiaryMyProfilePageObj.designation_ExperienceSetting.sendKeys("software engineer");
		
		beneficiaryMyProfilePageObj.companyName_ExperienceSetting.sendKeys("company name");
		
		beneficiaryMyProfilePageObj.companyAddress_ExperienceSetting.sendKeys("company address");
		
		beneficiaryMyProfilePageObj.companyPhoneNo_ExperienceSetting.sendKeys("1234567890");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workFrom_ExperienceSetting.click();
		JavascriptExecutor wf = (JavascriptExecutor) driver;
		wf.executeScript("document.getElementById('WorkFrom').value='02/02/2017';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workTo_ExperienceSetting.click();
		JavascriptExecutor wt = (JavascriptExecutor) driver;
		wt.executeScript("document.getElementById('WorkTo').value='02/02/2018';");
				
		beneficiaryMyProfilePageObj.reasonForLeaving_ExperienceSetting.sendKeys("reason for leaving");
		
		beneficiaryMyProfilePageObj.lastDrawnSalary_ExperienceSetting.click();
		beneficiaryMyProfilePageObj.lastDrawnSalary_ExperienceSetting.sendKeys("123456");
		
		Thread.sleep(1000);
		
		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.saveBtn_ExperienceSetting);
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_ExperienceSetting.click();
			
	}
	

	public static void selectDate(WebDriver driver, String YYYY, String MMM, String DD) throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']")).click();

		Thread.sleep(1500);

		List<WebElement> years = driver.findElements(By.xpath("//div[@class='datepicker-years']//tbody//span"));

		for (WebElement year : years) {
			String selectyear = year.getText();
			if (selectyear.equalsIgnoreCase(YYYY)) {

				for (int i = 0; i <= 2; i++) {

					try {

						year.click();
						Thread.sleep(1500);
						List<WebElement> months = driver
								.findElements(By.xpath("//div[@class='datepicker-months']//tbody//span"));

						for (WebElement month : months) {
							String selectmonth = month.getText();
							if (selectmonth.equalsIgnoreCase(MMM)) {

								for (int j = 0; j <= 2; j++) {

									try {

										month.click();

										Thread.sleep(1500);
										List<WebElement> days = driver
												.findElements(By.xpath("//div[@class='datepicker-days']//tbody//td"));

										for (WebElement day : days) {
											String selectDay = day.getText();
											if (selectDay.equalsIgnoreCase(DD)) {

												for (int k = 0; k <= 2; k++) {

													try {
														day.click();

													} catch (Exception e) {
														System.out.println(e.getMessage());
													}
												}
											}
										}

									} catch (Exception e) {
										System.out.println(e.getMessage());
									}
								}
							}

						}

					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}

	}

	@Test(enabled = false)
	public void applyForVisa() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		driver.findElement(By.name("UserName")).sendKeys("beneficiarysantosh@immidartgroup.com");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(40000);

		driver.findElement(By.xpath("//i[contains(@class,'fa fa-user')]/following-sibling::h3")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'workpermit')]")).click();

		Thread.sleep(2500);

		driver.findElement(By.id("btnwpvisaAdd")).click();

		Thread.sleep(2500);

		/*
		 * driver.findElement(By.name("WorkPermitStartDate")).click();
		 * 
		 * beneficiaryInformationSheet.selectDate(driver, "2012", "JAN", "1");
		 * 
		 * Thread.sleep(1500);
		 */

		driver.findElement(By.name("WorkPermitEndDate")).click();

		beneficiaryInformationSheet.selectDate(driver, "2015", "JAN", "1");

		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();
		 * 
		 * Thread.sleep(1500);
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@class='datepicker-months']//th[@class='datepicker-switch']")).click()
		 * ;
		 * 
		 * Thread.sleep(1500);
		 * 
		 * List<WebElement> years =
		 * driver.findElements(By.xpath("//div[@class='datepicker-years']//tbody//span")
		 * );
		 * 
		 * for (WebElement year : years) { String selectyear = year.getText(); if
		 * (selectyear.equalsIgnoreCase("2020")) { year.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * List<WebElement> months = driver
		 * .findElements(By.xpath("//div[@class='datepicker-months']//tbody//span"));
		 * 
		 * for (WebElement month : months) { String selectmonth = month.getText(); if
		 * (selectmonth.equalsIgnoreCase("Oct")) { month.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * List<WebElement> days = driver
		 * .findElements(By.xpath("//div[@class='datepicker-days']//tbody//td"));
		 * 
		 * for (WebElement day : days) { String selectDay = day.getText(); if
		 * (selectDay.equalsIgnoreCase("10")) { day.click(); } }
		 * 
		 * } }
		 * 
		 * } }
		 */

	}

	@Test(enabled = false)
	public void test1() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		driver.findElement(By.name("UserName")).sendKeys("beneficiarysantosh@immidartgroup.com");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[contains(@class,'fa fa-user')]/following-sibling::h3")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'workpermit')]")).click();

		Thread.sleep(2500);

		driver.findElement(By.id("btnwpvisaAdd")).click();

		Thread.sleep(2500);

		driver.findElement(By.name("WorkPermitStartDate")).click();

		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']")).click();

		Thread.sleep(1500);

		List<WebElement> years = driver.findElements(By.xpath("//div[@class='datepicker-years']//tbody//span"));

		for (WebElement year : years) {
			String selectyear = year.getText();
			if (selectyear.equalsIgnoreCase("2020")) {
				year.click();
			}
		}

		Thread.sleep(1000);

		List<WebElement> months = driver.findElements(By.xpath("//div[@class='datepicker-months']//tbody//span"));

		for (WebElement month : months) {
			String selectmonth = month.getText();
			if (selectmonth.equalsIgnoreCase("Oct")) {
				month.click();

			}

			Thread.sleep(1000);
			List<WebElement> days = driver.findElements(By.xpath("//div[@class='datepicker-days']//tbody//td"));

			for (WebElement day : days) {
				String selectDay = day.getText();
				if (selectDay.equalsIgnoreCase("10")) {
					day.click();
				}
			}

		}
	}
	
	@Test(enabled=false)
	public void test12() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);

		driver.findElement(By.name("UserName")).sendKeys("beneficiarysantosh@immidartgroup.com");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[contains(@class,'fa fa-user')]/following-sibling::h3")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'workpermit')]")).click();

		Thread.sleep(2500);

		driver.findElement(By.id("btnwpvisaAdd")).click();

		Thread.sleep(2500);

		driver.findElement(By.name("WorkPermitStartDate")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('WorkPermitStartDate').value='5/Feb/2017';");
		
	}
	
	@Test(enabled=false) 
	public void createPassport() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		driver.findElement(By.name("UserName")).sendKeys("santosh@auto5.com");
		driver.findElement(By.id("txtPassword")).sendKeys("Password@123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[contains(@class,'fa fa-user')]/following-sibling::h3")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'passport')]")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("btnPassportAdd")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("PassportNo")).sendKeys("1234567890");
		
		driver.findElement(By.name("Surname")).sendKeys("surname");
		
		driver.findElement(By.name("GivenName")).sendKeys("given name");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("s2id_CountryOfIssue"))).click().sendKeys("India",Keys.ARROW_DOWN,Keys.ENTER).build().perform();
			
		driver.findElement(By.name("PlaceOfIssue")).sendKeys("place of issue");
		
		driver.findElement(By.name("DateOfIssue")).click();		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('DateOfIssue').value='02/01/2018';");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("DateOfExpiry")).click();		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("document.getElementById('DateOfExpiry').value='03/05/2018';");
		
		Thread.sleep(1500);
		
		Select sel = new Select(driver.findElement(By.name("ECNRRequired")));
		sel.selectByValue("Y");
		
		Select sel1 = new Select(driver.findElement(By.name("IsPassportActive")));
		sel1.selectByValue("1");
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("emp-passport-save")).click();
	
	}
	

}
