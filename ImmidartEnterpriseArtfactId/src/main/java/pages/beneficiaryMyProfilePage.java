package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class beneficiaryMyProfilePage {

	// My profile menu
	@FindBy(xpath="//div[contains(text(),'My Profile')]")
	public WebElement myProfileMenu;
	
	// Information sheet sub menu
	@FindBy(xpath="//a[contains(@data-dhref,'InformationSheet')]//span[contains(text(),'Information Sheet')]")
	public WebElement informationSheetSubMenu;
	
	//*********** Organization *********************
	
	// Organization setting
	@FindBy(xpath="//span[contains(text(),'Organization')]")
	public WebElement organizationSetting;
	
	// Edit organization 
	@FindBy(xpath="//a[contains(@id,'edit-organization')][@title='Edit']")
	public WebElement editOrganization;
	
	// Organization career band
	@FindBy(name="Band")
	public WebElement organizationCareerBand_OrganizationSetting;
	
	// Current designation
	@FindBy(name="Designation")
	public WebElement currentDesignation_OrganizationSetting;
	
	// Organization name
	@FindBy(name="OrganizationName")
	public WebElement organizationName_OrganizationSetting;
	
	// Organization code
	@FindBy(name="OrganizationCode")
	public WebElement organizationCode_OrganizationSetting;
	
	// Division
	@FindBy(name="Division")
	public WebElement division_OrganizationSetting;
	
	// Sub division
	@FindBy(name="SubDivision")
	public WebElement subDivision_OrganizationSetting;
	
	// Business division
	@FindBy(name="BusinessDivision")
	public WebElement businessDivision_OrganizationSetting;
	
	// Business sub division
	@FindBy(name="BusinessSubDivision")
	public WebElement businessSubDivision_OrganizationSetting;
	
	// Domain
	@FindBy(name="Domain")
	public WebElement domain_OrganizationSetting;
	
	//Date of joining
	@FindBy(name="DateOfJoining")
	public WebElement dateOfJoining_OrganizationSetting;
	
	// Current experience
	@FindBy(name="ExperienceWithCurrentEmployer")
	public WebElement currentExperience_OrganizationSetting;
	
	//Overall experience
	@FindBy(name="OverallExperience")
	public WebElement overAll_OrganizationSetting;
	
	//Relevant experience
	@FindBy(name="RelaventExperienceInCurrentPosition")
	public WebElement relevantExperience_OrganizationSetting;
	
	// Contact number
	@FindBy(name="ContactNumber")
	public WebElement contactNumber_OrganizationSetting;
	
	// Current work location
	@FindBy(name="CurrentWorkLocation")
	public WebElement currentWorkLocation_OrganizationSetting;
	
	// Current work address
	@FindBy(name="CurrentWorkAddress")
	public WebElement currentWorkAddress_OrganizationSetting;
	
	// Employement type
	@FindBy(id="s2id_employmentType")
	public WebElement employmentTypeDropDown_OrganizationSetting;
	
	// Reporting manager
	@FindBy(name="reportingManager")
	public WebElement reportingManager_OrganizationSetting;
	
	// Save Button
	@FindBy(id="emp-organizational-save")
	public WebElement saveBtn_OrganizationSetting;
	
	// Cancel Button
	@FindBy(xpath="//a[contains(@class,'OrgCancel')]")
	public WebElement cancelBtn_OrganizationSetting;
	
	//****************** Personal Information *******************
	
	//Personal information setting
	@FindBy(xpath="//span[contains(text(),'Personal')]")
	public WebElement personalInformationSetting;
	
	// Edit button
	@FindBy(xpath="//a[contains(@id,'edit-personal')]")
	public WebElement editPersonalInformation;
	
	// First name
	@FindBy(name="FirstName")
	public WebElement firstName_PersonalSetting;
	
	// Middle name
	@FindBy(name="MiddleName")
	public WebElement middleName_PersonalSetting;
	
	// Last name
	@FindBy(name="LastName")
	public WebElement lastName_PersonalSetting;
	
	// Date of birth
	@FindBy(name="DateOfBirth")
	public WebElement dateOfBirth_PersonalSetting;
	
	// Place of birth
	@FindBy(name="PlaceOfBirth")
	public WebElement placeOfBirth_PersonalSetting;
	
	// Country of birth
	@FindBy(id="s2id_CountryOfBirth")
	public WebElement countryOfBirthDropDown_PersonalSetting;
	
	// State of birth
	@FindBy(id="s2id_StateOfBirth")
	public WebElement stateOfBirthDropDown_PersonalSetting;
	
	// Marital Status
	@FindBy(id="s2id_MaritalStatus")
	public WebElement martialStatus_PersonalSetting;
	
	// Personal email id
	@FindBy(name="EmailId")
	public WebElement personalEmailID_PersonalSetting;
	
	// Alternate email id
	@FindBy(name="AlEmailId")
	public WebElement alternateEmailID_PersonalSetting;
	
	// Contact number
	@FindBy(name="PhoneNumber")
	public WebElement contactNumber_PersonalSetting;
	
	// ALternate contact number
	@FindBy(name="AlternatePhoneNumber")
	public WebElement alternateNumber_PersonalSetting;
	
	// Gender
	@FindBy(id="s2id_Gender")
	public WebElement gender_PersonalSetting;
	
	// Save
	@FindBy(id="emp-personal-save")
	public WebElement saveBtn_PersonalSetting;
	
	// Cancel
	@FindBy(xpath="//a[contains(@id,'canelpersonalinfo')]")
	public WebElement cancelBtn_PersonalSetting;
		
	//************************ Address ******************************
	
	//Address setting
	@FindBy(xpath="//span[contains(text(),'Address')]")
	public WebElement addressSetting;
	
	// Add address button
	@FindBy(id="AddAddress")
	public WebElement addAddressBtn_AddressSetting;
	
	// Address line 1
	@FindBy(name="CAddress1")
	public WebElement currentAddressLine1_AddressSetting;
	
	// Address line 2
	@FindBy(name="CAddress2")
	public WebElement currentAddressLine2_AddressSetting;
	
	// Country 
	@FindBy(id="s2id_CCountryCode")
	public WebElement currentAddressCountryDropDown_AddressSetting;
	
	// State
	@FindBy(id="s2id_CStateCode")
	public WebElement currentAddressStateDropDown_AddressSetting;
	
	// City
	@FindBy(id="s2id_CCityCode")
	public WebElement currentAddressCityDropDown_AddressSetting;
	
	// Postal Code
	@FindBy(name="CPostalCode")
	public WebElement currentAddressPostalCode_AddressSetting;
	
	// Is permanent Address same as current
	@FindBy(name="PIsPermanentSameAsCurrent")
	public WebElement isPermanentAddressDropDown_AddressSetting;
	
	// Is current Address same as current
	@FindBy(name="EIsEmergencySameAsCurrent")
	public WebElement isEmergencyAddressDropDown_AddressSetting;
	
	// Save button
	@FindBy(id="emp-address-save")
	public WebElement saveBtn_AddressSetting;
	
	// Cancel button
	@FindBy(id="emp-address-Cancel")
	public WebElement cancelBtn_AddressSetting;
	
	//****************** Qualification ********************************
	
	//Qualification setting
	@FindBy(xpath="//span[contains(text(),'Qualification')]")
	public WebElement qualificationSetting;
	
	// Add eduction button
	@FindBy(id="btnEducationtAdd")
	public WebElement addEducationButton_QualificationSetting;
	
	// Education category 
	@FindBy(id="s2id_EductationCategoryCode")
	public WebElement educationCategoryDropdown_QualificationSetting;
	
	// Degree
	@FindBy(id="s2id_DegreeCode")
	public WebElement degreeDropDown_QualificationSetting;
	
	//BoardUniversity name
	@FindBy(name="BoardUniversityName")
	public WebElement boardUniversityName_QualificationSetting;
	
	// Institute name
	@FindBy(name="InstituteName")
	public WebElement instituteName_QualificationSetting;
	
	// Year of start
	@FindBy(name="BeginYear")
	public WebElement yearOfStart_QualificationSetting;
	
	// Year of passing
	@FindBy(name="YearPassing")
	public WebElement yearOfPassing_QualificationSetting;
	
	//Percentage / Grade
	@FindBy(name="PercentageGrade")
	public WebElement percentageGrade_QualificationSetting;
	
	// Mode of education
	@FindBy(id="s2id_ModeOfEducation")
	public WebElement modeOfEducationDropDown_QualificationSetting;
	
	// Major field of study
	@FindBy(name="MajorFieldOfStudy")
	public WebElement majorFieldOfStudy_QualificationSetting;
	
	//Country
	@FindBy(id="s2id_QCountryCode")
	public WebElement countryDropDown_QualificationSetting;
	
	//State
	@FindBy(id="s2id_QStateCode")
	public WebElement StateDropDown_QualificationSetting;
	
	//City
	@FindBy(id="s2id_QCityCode")
	public WebElement cityDropDown_QualificationSetting;
	
	// Save
	@FindBy(id="educationsave")
	public WebElement saveBtn_QualificationSetting;
	
	// Cancel
	@FindBy(xpath="//a[contains(@class,'eduCancel')]")
	public WebElement cancelBtn_QualificationSetting;
	
	//****************** Passport *************************************
	
	//Passport Setting
	@FindBy(xpath="//span[contains(text(),'Passport')]")
	public WebElement passportSetting;
	
	// Add passport
	@FindBy(id="btnPassportAdd")
	public WebElement addPassportBtn_PassportSetting;
	
	// Passport no
	@FindBy(name="PassportNo")
	public WebElement passportNo_PassportSetting;
	
	// Surname 
	@FindBy(name="Surname")
	public WebElement surname_PassportSetting;
	
	// Given name
	@FindBy(name="GivenName")
	public WebElement givenName_PassportSetting;
	
	// Nationality
	@FindBy(id="s2id_CountryOfIssue")
	public WebElement nationalityDropDown_PassportSetting;
	
	// Place of issue
	@FindBy(name="PlaceOfIssue")
	public WebElement placeOfIssue_PassportSetting;
	
	// Date of issue
	@FindBy(id="DateOfIssue")
	public WebElement dateOfIssue_PassportSetting;
	
	// Date of expiry
	@FindBy(id="DateOfExpiry")
	public WebElement dateOfExpiry_PassportSetting;
	
	// ECR Requirement
	@FindBy(name="ECNRRequired")
	public WebElement ecnrRequirement_PassportSetting;
	
	// Passport Active
	@FindBy(name="IsPassportActive")
	public WebElement passportActive_PassportSetting;
	
	// Save
	@FindBy(id="emp-passport-save")
	public WebElement saveBtn_PassportSetting;
	
	// Cancel 
	@FindBy(xpath="//a[contains(@class,'btnPassportCancel')]")
	public WebElement cancelBtn_PassportSetting;
	
	
	//********************* Work Visa ********************************
	
	// Work Visa setting
	@FindBy(xpath="//span[contains(text(),'Work')]")
	public WebElement workVisaSetting;
	
	// Add WorkVisa
	@FindBy(id="btnwpvisaAdd")
	public WebElement addWorkVisa_WorkVisaSetting;
	
	// Country
	@FindBy(id="s2id_wpCountryCode")
	public WebElement countryDropDown_WorkVisaSetting;
	
	// Sponsorer
	@FindBy(name="Sponsored")
	public WebElement sponsorer_WorkVisaSetting;
	
	// Visa type
	@FindBy(id="s2id_wpVisaType")
	public WebElement visaType_WorkVisaSetting;
	
	// Visa description
	@FindBy(name="OtherDesc")
	public WebElement visaDescription_WorkVisaSetting;
	
	//Status
	@FindBy(id="s2id_wpVisaStatus")
	public WebElement status_WorkVisaSetting;
	
	// Work permit start date
	@FindBy(name="WorkPermitStartDate")
	public WebElement workPermitStartDate_WorkVisaSetting;
	
	// Work permit end date
	@FindBy(name="WorkPermitEndDate")
	public WebElement workPermitEndDate_WorkVisaSetting;
		
	// Work permit number
	@FindBy(name="WorkPermitNumber")
	public WebElement workPermitNumber_WorkVisaSetting;
	
	// Visa start date
	@FindBy(name="VisaStartDate")
	public WebElement visaStartDate_WorkVisaSetting;
	
	// Visa end date
	@FindBy(name="VisaEndDate")
	public WebElement visaEndDate_WorkVisaSetting;
	
	// Deregistration date
	@FindBy(name="TDeregistrationDate")
	public WebElement deregistrationDate_WorkVisaSetting;
	
	// Remarks
	@FindBy(id="Remarks")
	public WebElement remarks_WorkVisaSetting;
	
	// Save
	@FindBy(id="emp-visaworkpermitinfo-save")
	public WebElement saveBtn_WorkVisaSetting;
	
	// Cancel
	@FindBy(xpath="//a[contains(@class,'wpCancel')]")
	public WebElement cancelBtn_WorkVisaSetting;
	
	
	//*********************** Travel *********************************
	
	// Travel Setting
	@FindBy(xpath="//a[contains(@href,'travel')]//span[contains(text(),' Travel')]")
	public WebElement travelSetting;
	
	// Add Travel
	@FindBy(id="btnTravelAdd")
	public WebElement AddTravelBtn_travelSetting;
	
	// Country
	@FindBy(id="s2id_TCountryCode")
	public WebElement countryDropDown_travelSetting;
	
	// Company
	@FindBy(name="TCompany")
	public WebElement company_travelSetting;
	
	// Visa type
	@FindBy(id="s2id_wpVisaType")
	public WebElement visaType_travelSetting;
	
	// Visa description
	@FindBy(name="OtherDesc")
	public WebElement visaDescription_travelSetting;
	
	// Date of travel
	@FindBy(name="TDateOfTravel")
	public WebElement dateOfTravel_travelSetting;
	
	// Date of departure
	@FindBy(name="TDateOfDepature")
	public WebElement dateOfDeparture_travelSetting;
	
	// Deregistration date
	@FindBy(name="TDeregistrationDate")
	public WebElement deregistrationDate_travelSetting;;
	
	// Remarks
	@FindBy(name="TRemarks")
	public WebElement remarks_travelSetting;;
	
	// Save 
	@FindBy(id="emp-travelinfo-save")
	public WebElement saveBtn_travelSetting;
	
	// Cancel
	@FindBy(xpath="//a[contains(@class,'travelCancel')]")
	public WebElement cancel_travelSetting;
	
	
	//************************* Immigration **************************
	
	// Immigration Setting
	@FindBy(xpath="//span[contains(text(),'Immigration')]")
	public WebElement immigrationSetting;
	
	// Add Immigration
	@FindBy(id="btnDeportationAdd")
	public WebElement addImmigrationBtn_ImmigrationSetting;
	
	// Country
	@FindBy(id="s2id_DCountryCode")
	public WebElement countryDropDown_ImmigrationSetting;
	
	// Company
	@FindBy(name="DCompany")
	public WebElement company_ImmigrationSetting;
	
	// Visa type
	@FindBy(id="s2id_DVisaType")
	public WebElement visaType_ImmigrationSetting;
	
	// Visa description
	@FindBy(name="OtherDesc")
	public WebElement visaDescription_ImmigrationSetting;
	
	// Antecedent details
	@FindBy(name="DeportationDetails")
	public WebElement antecedentDetails_ImmigrationSetting;
	
	// Date of travel
	@FindBy(name="DDateOfTravel")
	public WebElement dateOfTravel_ImmigrationSetting;
	
	// Save
	@FindBy(id="emp-deportationhistory-save")
	public WebElement saveBtn_ImmigrationSetting;
	
	// Cancel
	@FindBy(xpath="//a[contains(@class,'btnDeportionCancel')]")
	public WebElement cancelBtn_ImmigrationSetting;
	
	//************************** Experience ****************************

	// Experience setting
	@FindBy(xpath="//span[contains(text(),'Experience')]")
	public WebElement experienceSetting;
	
	// Add Experience
	@FindBy(id="btnWorkExperinceAdd")
	public WebElement AddExperienceBtn_ExperienceSetting;
	
	// Employee number
	@FindBy(name="EmployeeNo")
	public WebElement employeeNo_ExperienceSetting;
	
	// Designation
	@FindBy(name="Designation")
	public WebElement designation_ExperienceSetting;
	
	// Company
	@FindBy(name="CompanyName")
	public WebElement companyName_ExperienceSetting;
	
	// Company address
	@FindBy(name="CompanyAddress")
	public WebElement companyAddress_ExperienceSetting;
	
	// Company phone number
	@FindBy(name="CompanyPhoneNo")
	public WebElement companyPhoneNo_ExperienceSetting;
	
	// Work From
	@FindBy(name="WorkFrom")
	public WebElement workFrom_ExperienceSetting;
	
	// Work To
	@FindBy(name="WorkTo")
	public WebElement workTo_ExperienceSetting;
	
	// Reason for leaving
	@FindBy(name="ReasonForLeaving")
	public WebElement reasonForLeaving_ExperienceSetting;
	
	// Last drawn salary
	@FindBy(name="LastDrawnSalary")
	public WebElement lastDrawnSalary_ExperienceSetting;
	
	// Describe responsibilities
	
	// Save 
	@FindBy(id="experiencesave")
	public WebElement saveBtn_ExperienceSetting;
	
	// Cancel
	@FindBy(id="expCancel")
	public WebElement cancelBtn_ExperieneSetting;
	
	
	

}
