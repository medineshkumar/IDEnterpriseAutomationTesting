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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import genericClasses.Browser;
import genericClasses.Login;
import pages.beneficiaryInitiationPage;
import pages.beneficiaryLandingPage;
import pages.beneficiaryMyProfilePage;
import testData.createBeneficiaryAddressData;
import testData.createBeneficiaryExperienceData;
import testData.createBeneficiaryImmigrationData;
import testData.createBeneficiaryOrganizationData;
import testData.createBeneficiaryPassportData;
import testData.createBeneficiaryPersonalData;
import testData.createBeneficiaryQualificationData;
import testData.createBeneficiaryTravelData;
import testData.createBeneficiaryWorkVisaData;

public class beneficiaryInformationSheet {

	static WebDriver driver;

	String appURL = "http://10.10.10.101/EnterpriseQA/";
	
	@Test(enabled = false, dataProvider = "createOrganization", dataProviderClass = createBeneficiaryOrganizationData.class, priority = 1)
	public void createOrganization(String OrgcarrerBand, String CurrentDesignation, String OrganizationName,
			String OrganizationCode, String Division, String Subdivision, String businessDivision,
			String businessSubDivision, String Domain, String DateofJoining, String ExperienceWithCurrentEmp,
			String OverAllExp, String RelevantExp, String ContactNo, String CurrentWorkLocation,
			String CurrentWorkAddress, String EmploymentType, String ReportingManager) throws InterruptedException {
		
		
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryMyProfilePage beneficiaryMyProfilePageObj = PageFactory.initElements(driver,
				beneficiaryMyProfilePage.class);

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

		beneficiaryMyProfilePageObj.organizationCareerBand_OrganizationSetting.sendKeys(OrgcarrerBand);

		beneficiaryMyProfilePageObj.currentDesignation_OrganizationSetting.sendKeys(CurrentDesignation);

		beneficiaryMyProfilePageObj.organizationName_OrganizationSetting.sendKeys(OrganizationName);

		beneficiaryMyProfilePageObj.organizationCode_OrganizationSetting.sendKeys(OrganizationCode);

		beneficiaryMyProfilePageObj.division_OrganizationSetting.sendKeys(Division);

		beneficiaryMyProfilePageObj.subDivision_OrganizationSetting.sendKeys(Subdivision);

		beneficiaryMyProfilePageObj.businessDivision_OrganizationSetting.sendKeys(businessDivision);

		beneficiaryMyProfilePageObj.businessSubDivision_OrganizationSetting.sendKeys(businessSubDivision);

		beneficiaryMyProfilePageObj.domain_OrganizationSetting.sendKeys(Domain);

		beneficiaryMyProfilePageObj.dateOfJoining_OrganizationSetting.click();
		JavascriptExecutor doj = (JavascriptExecutor) driver;
		doj.executeScript("document.getElementById('DateOfJoining').value='"+DateofJoining+"';");

		beneficiaryMyProfilePageObj.currentExperience_OrganizationSetting.sendKeys(ExperienceWithCurrentEmp);

		beneficiaryMyProfilePageObj.overAll_OrganizationSetting.sendKeys(OverAllExp);

		beneficiaryMyProfilePageObj.relevantExperience_OrganizationSetting.sendKeys(RelevantExp);

		// Write code for selecting country code.

		JavascriptExecutor contactNoFocus = (JavascriptExecutor) driver;
		contactNoFocus.executeScript("arguments[0].scrollIntoView(false);",
				beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting);

		Thread.sleep(1500);

		Actions flagSelector = new Actions(driver);
		flagSelector.moveToElement(driver.findElement(By.xpath("//div[@class='flag-container']"))).click()
				.sendKeys("India", Keys.ENTER).build().perform();

		Thread.sleep(1000);

		beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting.sendKeys(ContactNo);

		JavascriptExecutor currentWorkLocationFocus = (JavascriptExecutor) driver;
		currentWorkLocationFocus.executeScript("arguments[0].scrollIntoView(false);",
				beneficiaryMyProfilePageObj.contactNumber_OrganizationSetting);

		Thread.sleep(1500);

		beneficiaryMyProfilePageObj.currentWorkLocation_OrganizationSetting.sendKeys(CurrentWorkLocation);

		JavascriptExecutor currentWorkAddressFocus = (JavascriptExecutor) driver;
		currentWorkAddressFocus.executeScript("arguments[0].scrollIntoView(false);",
				beneficiaryMyProfilePageObj.currentWorkAddress_OrganizationSetting);

		Thread.sleep(1500);

		beneficiaryMyProfilePageObj.currentWorkAddress_OrganizationSetting.sendKeys(CurrentWorkAddress);

		JavascriptExecutor reportingManagerFocus = (JavascriptExecutor) driver;
		reportingManagerFocus.executeScript("arguments[0].scrollIntoView(false);",
				beneficiaryMyProfilePageObj.reportingManager_OrganizationSetting);

		Thread.sleep(1500);

		// beneficiaryMyProfilePageObj.employmentTypeDropDown_OrganizationSetting.click();

		beneficiaryMyProfilePageObj.reportingManager_OrganizationSetting.sendKeys(ReportingManager);

		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);",
				beneficiaryMyProfilePageObj.saveBtn_OrganizationSetting);

		Thread.sleep(1500);

		// beneficiaryMyProfilePageObj.saveBtn_OrganizationSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
	}

	@Test(enabled=false, dataProvider="createPersonal",dataProviderClass= createBeneficiaryPersonalData.class, priority = 2)
	public void createPersonalInformation(String Fname,String Mname,String Lname,String DOB,String placeOfBirth,String countryOfBirth
			,String stateOfBirth,String maritalStatus, String personalEmailID,String altEmailID,String contactNo,String altContactNo,String gender) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		
		beneficiaryMyProfilePageObj.firstName_PersonalSetting.sendKeys(Fname);
		beneficiaryMyProfilePageObj.middleName_PersonalSetting.sendKeys(Mname);
		beneficiaryMyProfilePageObj.lastName_PersonalSetting.sendKeys(Lname);
		
		beneficiaryMyProfilePageObj.dateOfBirth_PersonalSetting.click();
		JavascriptExecutor dob = (JavascriptExecutor) driver;
		dob.executeScript("document.getElementById('DateOfBirth').value='"+DOB+"';");		
		
		
		beneficiaryMyProfilePageObj.placeOfBirth_PersonalSetting.click();
		beneficiaryMyProfilePageObj.placeOfBirth_PersonalSetting.sendKeys(placeOfBirth);
		
		Actions countryofBirth = new Actions(driver);
		countryofBirth.moveToElement(beneficiaryMyProfilePageObj.countryOfBirthDropDown_PersonalSetting).click().sendKeys(countryOfBirth,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions stateofBirth = new Actions(driver);
		stateofBirth.moveToElement(beneficiaryMyProfilePageObj.stateOfBirthDropDown_PersonalSetting).click().sendKeys(stateOfBirth,Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1500);
		
		Actions marital = new Actions(driver);
		marital.moveToElement(beneficiaryMyProfilePageObj.martialStatus_PersonalSetting).click().sendKeys(maritalStatus,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.personalEmailID_PersonalSetting.sendKeys(personalEmailID);
		
		beneficiaryMyProfilePageObj.alternateEmailID_PersonalSetting.sendKeys(altEmailID);
		
		Actions flagSelector = new Actions(driver);
		flagSelector.moveToElement(driver.findElement(By.xpath("//div[@class='flag-container']"))).click().sendKeys("India",Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.contactNumber_PersonalSetting.sendKeys(contactNo);
		
		beneficiaryMyProfilePageObj.alternateNumber_PersonalSetting.sendKeys(altContactNo);
		
		Actions Gender = new Actions(driver);
		Gender.moveToElement(beneficiaryMyProfilePageObj.gender_PersonalSetting).click().sendKeys(gender,Keys.ENTER);
		
		//beneficiaryMyProfilePageObj.saveBtn_PersonalSetting.click();
		
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
			
		
	}
	
	@Test(enabled=false,dataProvider="createAddress",dataProviderClass=createBeneficiaryAddressData.class , priority = 3)
	public void createAddress(String AddressLine1,String AddressLine2,String Country,String State,String City,String PostalCode,String isPermSame,String isEmgSame) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		
		beneficiaryMyProfilePageObj.currentAddressLine1_AddressSetting.sendKeys(AddressLine1);
		beneficiaryMyProfilePageObj.currentAddressLine2_AddressSetting.sendKeys(AddressLine2);
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.currentAddressCountryDropDown_AddressSetting).click().sendKeys(Country,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		Actions state = new Actions(driver);
		state.moveToElement(beneficiaryMyProfilePageObj.currentAddressStateDropDown_AddressSetting).click().sendKeys(State,Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1500);
		
		Actions city = new Actions(driver);
		city.moveToElement(beneficiaryMyProfilePageObj.currentAddressCityDropDown_AddressSetting).click().sendKeys(City,Keys.ARROW_DOWN,Keys.ENTER).build().perform();;
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.currentAddressPostalCode_AddressSetting.sendKeys(PostalCode);
		
		Select isPermanentSame = new Select(beneficiaryMyProfilePageObj.isPermanentAddressDropDown_AddressSetting);
		isPermanentSame.selectByVisibleText(isPermSame);
		
		JavascriptExecutor IsEmergencySameFocus = (JavascriptExecutor) driver;
		IsEmergencySameFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.isEmergencyAddressDropDown_AddressSetting);
		
		Thread.sleep(1500);
		
		Select isEmergency = new Select(beneficiaryMyProfilePageObj.isEmergencyAddressDropDown_AddressSetting);
		isEmergency.selectByVisibleText(isEmgSame);

		Thread.sleep(1000);
		
		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.saveBtn_AddressSetting);
		
		Thread.sleep(1500);
		
		//beneficiaryMyProfilePageObj.saveBtn_AddressSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
				
	}
	
	@Test(enabled=false, dataProvider="createQualification",dataProviderClass= createBeneficiaryQualificationData.class,priority = 4)
	public void createQualification(String EducationCategory, String Degree,String BoardUniversity,String InstituteName,
			String YearofStart,String YearofPassing,String PercentageGrade,String ModeofEducation,String MajorFieldofstudy,String Country,String State,String City) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		educationCategory.moveToElement(beneficiaryMyProfilePageObj.educationCategoryDropdown_QualificationSetting).click().sendKeys(EducationCategory).build().perform();
		
		Thread.sleep(1500);
		
		Actions degree = new Actions(driver);
		degree.moveToElement(beneficiaryMyProfilePageObj.degreeDropDown_QualificationSetting).click().sendKeys(Degree).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.boardUniversityName_QualificationSetting.sendKeys(BoardUniversity);
		
		beneficiaryMyProfilePageObj.instituteName_QualificationSetting.sendKeys(InstituteName);
		
		beneficiaryMyProfilePageObj.yearOfStart_QualificationSetting.click();
		beneficiaryMyProfilePageObj.yearOfStart_QualificationSetting.sendKeys(YearofStart,Keys.ENTER);
		
		beneficiaryMyProfilePageObj.yearOfPassing_QualificationSetting.click();
		beneficiaryMyProfilePageObj.yearOfPassing_QualificationSetting.sendKeys(YearofPassing,Keys.ENTER);
		
		beneficiaryMyProfilePageObj.percentageGrade_QualificationSetting.sendKeys(PercentageGrade);
		
		Actions modeOfEducation = new Actions(driver);
		modeOfEducation.moveToElement(beneficiaryMyProfilePageObj.modeOfEducationDropDown_QualificationSetting).click().sendKeys(ModeofEducation,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.majorFieldOfStudy_QualificationSetting.sendKeys(MajorFieldofstudy);
		
		Actions country = new Actions(driver);
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_QualificationSetting).click().sendKeys(Country,Keys.ARROW_DOWN,Keys.ENTER);
		
		Actions state = new Actions(driver);
		state.moveToElement(beneficiaryMyProfilePageObj.StateDropDown_QualificationSetting).click().sendKeys(State,Keys.ARROW_DOWN,Keys.ENTER);
		
		Actions city = new Actions(driver);
		city.moveToElement(beneficiaryMyProfilePageObj.cityDropDown_QualificationSetting).click().sendKeys(City,Keys.ARROW_DOWN,Keys.ENTER);
	
		//beneficiaryMyProfilePageObj.saveBtn_QualificationSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
	}
	
	@Test(enabled=false,dataProvider="createPassport",dataProviderClass= createBeneficiaryPassportData.class, priority = 5)
	public void createPassport(String PassportNo,String Surname,String GivenName,String Nationality,String PlaceofIssue,
			String DateofIssue,String DateofExpiry,String ECNR,String PassportActive) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		
		beneficiaryMyProfilePageObj.passportNo_PassportSetting.sendKeys(PassportNo);
		
		beneficiaryMyProfilePageObj.surname_PassportSetting.sendKeys(Surname);
		
		beneficiaryMyProfilePageObj.givenName_PassportSetting.sendKeys(GivenName);
		
		Actions nationality = new Actions(driver);
		nationality.moveToElement(beneficiaryMyProfilePageObj.nationalityDropDown_PassportSetting).click().sendKeys(Nationality,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		beneficiaryMyProfilePageObj.placeOfIssue_PassportSetting.sendKeys(PlaceofIssue);
		
		beneficiaryMyProfilePageObj.dateOfIssue_PassportSetting.click();
		JavascriptExecutor doi = (JavascriptExecutor) driver;
		doi.executeScript("document.getElementById('DateOfIssue').value='"+DateofIssue+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.dateOfExpiry_PassportSetting.click();
		JavascriptExecutor doe = (JavascriptExecutor) driver;
		doe.executeScript("document.getElementById('DateOfExpiry').value='"+DateofExpiry+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.placeOfIssue_PassportSetting.click();
		
		Select ecnr = new Select(beneficiaryMyProfilePageObj.ecnrRequirement_PassportSetting);
		ecnr.selectByVisibleText(ECNR);
		
		Thread.sleep(1000);
		
		Select passportActive = new Select(beneficiaryMyProfilePageObj.passportActive_PassportSetting);
		passportActive.selectByVisibleText(PassportActive);
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_PassportSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
	}
	
	@Test(enabled=false, dataProvider="createWorkVisa",dataProviderClass= createBeneficiaryWorkVisaData.class,priority = 6)
	public void createWorkVisa(String Country,String Sponsorer,String VisaType,String VisaDescription,String Status,String WorkPermitStartDate,
			String WorkPermitEndDate,String WorkPermitNumber,String VisaStartDate,String VisaEndDate,String DeregistrationDate,String AdditionalInformation) throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_WorkVisaSetting).click().sendKeys(Country,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.sponsorer_WorkVisaSetting.sendKeys(Sponsorer);
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_WorkVisaSetting).click().sendKeys(VisaType,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.visaDescription_WorkVisaSetting.sendKeys(VisaDescription);
		
		Thread.sleep(1000);
		
		Actions status = new Actions(driver);
		status.moveToElement(beneficiaryMyProfilePageObj.status_WorkVisaSetting).click().sendKeys(Status,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		beneficiaryMyProfilePageObj.workPermitStartDate_WorkVisaSetting.click();
		JavascriptExecutor wps = (JavascriptExecutor) driver;
		wps.executeScript("document.getElementById('WorkPermitStartDate').value='"+WorkPermitStartDate+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workPermitEndDate_WorkVisaSetting.click();
		JavascriptExecutor wpe = (JavascriptExecutor) driver;
		wpe.executeScript("document.getElementById('WorkPermitEndDate').value='"+WorkPermitEndDate+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.workPermitNumber_WorkVisaSetting.sendKeys(WorkPermitNumber);
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.visaStartDate_WorkVisaSetting.click();
		JavascriptExecutor vsd = (JavascriptExecutor) driver;
		vsd.executeScript("document.getElementById('VisaStartDate').value='"+VisaStartDate+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.visaEndDate_WorkVisaSetting.click();
		JavascriptExecutor vse = (JavascriptExecutor) driver;
		vse.executeScript("document.getElementById('VisaEndDate').value='"+VisaEndDate+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.deregistrationDate_WorkVisaSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('TDeregistrationDate').value='"+DeregistrationDate+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.remarks_WorkVisaSetting.click();
		beneficiaryMyProfilePageObj.remarks_WorkVisaSetting.sendKeys(AdditionalInformation);
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_WorkVisaSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
		
	}
	
	@Test(enabled=false,dataProvider="createTravel",dataProviderClass=createBeneficiaryTravelData.class , priority = 7)
	public void createTravel(String Country,String Company,String VisaType,String VisaDescription,String Dateoftravel,String DateofDeparture,String DeregistrationDate,String AdditionalInformation
) throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_travelSetting).click().sendKeys(Country,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.company_travelSetting.sendKeys(Company);
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_travelSetting).click().sendKeys(VisaType,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1500);
		
		beneficiaryMyProfilePageObj.visaDescription_travelSetting.sendKeys(VisaDescription);
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfTravel_travelSetting.click();
		JavascriptExecutor dot = (JavascriptExecutor) driver;
		dot.executeScript("document.getElementById('TDateOfTravel').value='"+Dateoftravel+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfDeparture_travelSetting.click();
		JavascriptExecutor dod = (JavascriptExecutor) driver;
		dod.executeScript("document.getElementById('TDateOfDepature').value='"+DateofDeparture+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.deregistrationDate_travelSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('TDeregistrationDate').value='"+DeregistrationDate+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.remarks_travelSetting.click();
		beneficiaryMyProfilePageObj.remarks_travelSetting.sendKeys(AdditionalInformation);
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_travelSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
			
	}
	
	@Test(enabled=false,dataProvider="createImmigration",dataProviderClass= createBeneficiaryImmigrationData.class, priority = 8)
	public void createImmigration(String Country,String Company,String VisaType,String VisaDescription,String AntecedentDescription,String DateofTravel) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
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
		country.moveToElement(beneficiaryMyProfilePageObj.countryDropDown_ImmigrationSetting).click().sendKeys(Country,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
				
		beneficiaryMyProfilePageObj.company_ImmigrationSetting.sendKeys(Company);
		
		Thread.sleep(1000);
		
		Actions visaType = new Actions(driver);
		visaType.moveToElement(beneficiaryMyProfilePageObj.visaType_ImmigrationSetting).click().sendKeys(VisaType,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.visaDescription_ImmigrationSetting.sendKeys(VisaDescription);
		
		beneficiaryMyProfilePageObj.antecedentDetails_ImmigrationSetting.sendKeys(AntecedentDescription);
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.dateOfTravel_ImmigrationSetting.click();
		JavascriptExecutor drd = (JavascriptExecutor) driver;
		drd.executeScript("document.getElementById('DDateOfTravel').value='"+DateofTravel+"';");
		
		Thread.sleep(1000);
		
		beneficiaryMyProfilePageObj.antecedentDetails_ImmigrationSetting.click();
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_ImmigrationSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
			
	}
	
	@Test(enabled=false, dataProvider="createExperience",dataProviderClass= createBeneficiaryExperienceData.class,priority = 9)
	public void createExperience(String Employeenumber,String Designation,String CompanyName,String CompanyAddress,String CompanyPhoneNumber,
			String WorkFrom,String WorkTo,String Reasonforleaving,String LastDrawnSalary) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
		
		beneficiaryMyProfilePageObj.employeeNo_ExperienceSetting.sendKeys(Employeenumber);
		
		beneficiaryMyProfilePageObj.designation_ExperienceSetting.sendKeys(Designation);
		
		beneficiaryMyProfilePageObj.companyName_ExperienceSetting.sendKeys(CompanyName);
		
		beneficiaryMyProfilePageObj.companyAddress_ExperienceSetting.sendKeys(CompanyAddress);
		
		beneficiaryMyProfilePageObj.companyPhoneNo_ExperienceSetting.sendKeys(CompanyPhoneNumber);
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workFrom_ExperienceSetting.click();
		JavascriptExecutor wf = (JavascriptExecutor) driver;
		wf.executeScript("document.getElementById('WorkFrom').value='"+WorkFrom+"';");
		
		Thread.sleep(1000);		
		beneficiaryMyProfilePageObj.workTo_ExperienceSetting.click();
		JavascriptExecutor wt = (JavascriptExecutor) driver;
		wt.executeScript("document.getElementById('WorkTo').value='"+WorkTo+"';");
				
		beneficiaryMyProfilePageObj.reasonForLeaving_ExperienceSetting.sendKeys(Reasonforleaving);
		
		beneficiaryMyProfilePageObj.lastDrawnSalary_ExperienceSetting.click();
		beneficiaryMyProfilePageObj.lastDrawnSalary_ExperienceSetting.sendKeys(LastDrawnSalary);
		
		Thread.sleep(1000);
		
		JavascriptExecutor SaveBtnFocus = (JavascriptExecutor) driver;
		SaveBtnFocus.executeScript("arguments[0].scrollIntoView(false);", beneficiaryMyProfilePageObj.saveBtn_ExperienceSetting);
		
		Thread.sleep(1000);
		
		//beneficiaryMyProfilePageObj.saveBtn_ExperienceSetting.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@id,'toast-container')]"))));
		
		loginObj.logOut();
			
	}
	
	
	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
	}
	
	//***************************************************************************************************************

	
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
	public void createPassport1() throws InterruptedException {
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
