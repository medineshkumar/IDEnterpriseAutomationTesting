package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class superAdminPages {

	
	// Master Modules Menu

	@FindBy(xpath = "//div[contains(text(),'Master Modules')]")
	public WebElement masterModuleSetting;

	//****************************************************************
	
	// Profile Icon
	@FindBy(xpath="//div[contains(@class,'nav-profile')]")
	public WebElement profileIcon;
	
	// Logout Option
	@FindBy(xpath="//button[contains(@class,'btn-logout')]")
	public WebElement logoutOption;
	
	// *****************************************************************

	// License Module
	@FindBy(xpath = "//strong[contains(text(),'License')]")
	public WebElement licenseSetting;

	// Add License Button
	@FindBy(xpath = "//button[@id='show']")
	public WebElement addLicenseBtn;

	// Product Type Drop Down
	@FindBy(id = "s2id_ddlProductType")
	public WebElement productTypeDropDown;

	// Product Type Drop Down Input Box
	@FindBy(id = "s2id_autogen1_search")
	public WebElement producTypeDropDownInputBox;

	// Stream Type Drop Down
	@FindBy(id = "s2id_ddlStreamType")
	public WebElement streamTypeDropDown;

	// Stream Type Drop Down Input Box
	@FindBy(id = "s2id_autogen2_search")
	public WebElement streamTypeDropDownInputBox;
	
	// Code 
	@FindBy(name="Code")
	public WebElement code;

	// Organization Name
	@FindBy(name = "Name")
	public WebElement organizationName;

	// Contact First Name
	@FindBy(name = "ContactName")
	public WebElement contactFirstName;

	// Contact Last Name
	@FindBy(name = "ContactLastName")
	public WebElement contactLastname;

	// Contact Email
	@FindBy(name = "ContactEmail")
	public WebElement contactEmail;

	// Contact Number
	@FindBy(name = "ContactPhone")
	public WebElement contactNumber;

	// Alternate Contact Number
	@FindBy(name = "AlternatePhone")
	public WebElement alternateContactNumber;

	// Validity Start Date
	@FindBy(id = "ValidityStartDate")
	public WebElement validityStartDate;

	// Validity End Date
	@FindBy(id = "ValidityEndDate")
	public WebElement validityEndDate;

	// URL
	@FindBy(name = "URL")
	public WebElement URL;

	// Input Date Format Drop Down
	@FindBy(id = "s2id_inputDate")
	public WebElement inputDateFormatDropDown;

	// Input Date Format Drop Down Input Box
	@FindBy(id = "s2id_autogen3_search")
	public WebElement inputDateFormatDropDownInputBox;

	// Display Date Format Drop Down
	@FindBy(id = "s2id_outputDate")
	public WebElement displayDateFormatDropDown;

	// Display Date Format Drop Down Input Box
	@FindBy(id = "s2id_autogen4_search")
	public WebElement displayDateFormatInputBox;

	// Domain
	@FindBy(name = "domain")
	public WebElement domain;
	
	// System alert email id 
	@FindBy(name = "SystemAlertEmail")
	public WebElement systemAlertEmail;

	// Time Zone Drop Down
	@FindBy(id = "s2id_timeZone")
	public WebElement timeZoneDropDown;

	// Time Zone Drop Down Input Box
	@FindBy(id = "s2id_autogen5_search")
	public WebElement timeZoneDropDownInputBox;

	// Save License Button
	@FindBy(id = "btnSave")
	public WebElement saveLicenseBtn;

	// Cancel License Button
	@FindBy(id = "btnCancel")
	public WebElement cancelLicenseBtn;


	// Xpath for edit-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[1]
	
	// Xpath for delete-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[2]
	
	// Xpath for Subscription-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[3]
	
	// Xpath for Users-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/a

	//********************************************************************
	

	//Embassy Master Setting
	@FindBy(xpath="//img[contains(@src,'embassy')]")
	public WebElement embassyMasterSetting;
	
		//Add button
		@FindBy(id="btnEmbassyMaster")
		public WebElement addEmbassyMasterBtn;
		
		//Source Country Drop Down
		@FindBy(id="s2id_embassySourceCountryCode")
		public WebElement sourceCountryEmbassyMaster;
		
		//Source Country Drop Down input box
		@FindBy(id="s2id_autogen15_search")
		public WebElement sourceCountryDropDownInputBoxEmbassyMaster;		
		
		//Destination Country Drop Down
		@FindBy(id="s2id_embassyDestinationCountryCode")
		public WebElement destinationCountryEmbassyMaster;
				
		//Destination Country Drop Down input box
		@FindBy(xpath="//div[@id='s2id_embassyDestinationCountryCode']/a/following::input[1]")
		public WebElement destinationCountryDropDownInputBoxEmbassyMaster;
		
		//Sample destination drop down input
		@FindBy(xpath="//div[@id='select2-drop']/div/input")
		public WebElement destinationCountryDropDownInputBoxEmbassyMaster1;
				
		//Type Drop Down
		@FindBy(id="s2id_ddlType")
		public WebElement typeDropDownEmbassyMaster;
				
		//Type Drop Down input box
		@FindBy(id="s2id_autogen3_search")
		public WebElement typeDropDownInputBoxEmbassyMaster;
		
		//title
		@FindBy(name="txtembassytitle")
		public WebElement titleEmbassy;
		
		//officer in charge
		@FindBy(name="txtembassyoffice")
		public WebElement officerInChargeEmbassyMaster;
		
		//Address1
		@FindBy(name="txtembassyAddress1")
		public WebElement address1EmbassyMaster;
		
		//Address 2
		@FindBy(name="txtembassyAddress2")
		public WebElement address2EmbassyMaster;
		
		//State Drop Down
		@FindBy(id="s2id_ddlembassystate")
		public WebElement stateDropDownEmbassyMaster;
				
		//State Drop Down input box
		@FindBy(id="s2id_autogen13_search")
		public WebElement stateDropDownInputBoxEmbassyMaster;
		
		//State drop down input box sample 
		@FindBy(xpath="//div[@class='select2-search']/input")
		public WebElement stateDropDownInputBoxEmbassyMaster1;
		
		//City Drop Down
		@FindBy(id="s2id_ddlembassyCity")
		public WebElement cityDropDownEmbassyMaster;
						
		//City Drop Down input box
		@FindBy(id="s2id_autogen14_search")
		public WebElement cityDropDownInputBoxEmbassyMaster;
		
		//State jurisdiction
		@FindBy(id="s2id_ddljurisdiction")
		public WebElement stateJurisdictionEmbassyMaster;				
		
		//Postal Code 
		@FindBy(name="txtembassyZip")
		public WebElement postalCodeEmbassyMaster;
		
		//Save button
		@FindBy(id="btnembassySave")
		public WebElement saveEmbassyMasterBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelEmbassyMasterBtn;	
		
		//**************************************************
		
		
		// Master service setting
		@FindBy(xpath="//img[contains(@src,'MasterService')]")
		public WebElement masterServiceSetting;
		
		// Add master service button
		@FindBy(id="btnAddService")
		public WebElement addBtn_MasterService;
		
		// Service code
		@FindBy(name="txtSerCode")
		public WebElement serviceCode;
		
		// Service description
		@FindBy(name="txtSerDesc")
		public WebElement serviceDescription;
		
		// save button
		@FindBy(id="btnServiceSave")
		public WebElement saveBtn_MasterService;
		
		// cancel button
		@FindBy(xpath="//button[contains(text(),'Cancel')]")
		public WebElement cancelBtn_MasterService;
		
		//**************************************************************
		
		// Master type setting
		@FindBy(xpath="//img[contains(@src,'MasterType')]")
		public WebElement masterTypeSetting;
		
		// Add master type button
		@FindBy(xpath="//button[contains(@title,'Add')]")
		public WebElement addBtn_MasterType;
		
		// Service Drop Down
		@FindBy(id="s2id_Service")
		public WebElement serviceDropDown_MasterType;
		
		// Type code 
		@FindBy(name="TypeCode")
		public WebElement typeCode_MasterType;
		
		// Type description
		@FindBy(name="TypeDescription")
		public WebElement typeDescription_MasterType;
		
		// category drop down
		@FindBy(id="s2id_ddlCategory")
		public WebElement categoryDropDown_MasterType;
		
		// save button
		@FindBy(id="btnSave")
		public WebElement saveBtn_MasterType;
		
		// cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelBtn_MasterType;
		
		
		//************************************************
		
		// Service mapping setting
		@FindBy(xpath="//img[contains(@src,'MasterServicMapping')]")
		public WebElement serviceMappingSetting;
		
		//add button service mapping
		@FindBy(id="btnServiceMapping")
		public WebElement addBtn_ServiceMapping;
		
		// StageType drop down
		@FindBy(id="s2id_ddlMasterStage")
		public WebElement stageTypeDropDown;
		
		// input search filter
		@FindBy(xpath="//div[@id='ms-ddlMasterService']/div[@class='ms-selectable']/input")
		public WebElement linkinputSearchFilter_ServiceMapping;
		
		
		//li[@class='ms-elem-selectable']/span[contains(text(),'Short-Term Transfers')]
		
		// save button 
		@FindBy(id="btnSaveMapping")
		public WebElement saveBtn_ServiceMapping;
		
		// cancel button 
		@FindBy(xpath="//button[contains(text(),'Cancel')]")
		public WebElement cancelBtn_ServiceMapping;
		
		
		//****************************************************
		
		// Master unit setting
		@FindBy(xpath="//img[contains(@src,'Master_Unit')]")
		public WebElement masterUnitSetting;
		
		// Add btn master unit
		@FindBy(id="show")
		public WebElement addBtn_MasterUnit;
		
		// Stage name
		@FindBy(id="s2id_ddlstage")
		public WebElement stageName_MasterUnit;
		
		// Number of application
		@FindBy(name="stageApplication")
		public WebElement numberOfApplication;
		
		// save button
		@FindBy(id="saveStage")
		public WebElement saveBtn_MasterUnit;
		
		// cancel button
		@FindBy(id="cancelStage")
		public WebElement cancelBtn_MasterUnit;
		
		//***************************************************************
		
		// Knowledge base setting
		@FindBy(xpath="//strong[contains(text(),'Knowledge Base')]")
		public WebElement knowledgeBaseSetting;
		
		// Select License name  drop down
		@FindBy(id="s2id_ddLicenseMenu")
		public WebElement selectLicenseNameDropDown_KnowledgeBaseSetting;
		
		// Add knowledge Base button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addKnowledgeBaseBtn;
		
		// Select License number drop down
		@FindBy(id="s2id_ddLicenseNo")
		public WebElement selectLicenseNoDropDown_KnowledgeBaseSetting;
		
		// Document Name
		@FindBy(name="uploadDocName")
		public WebElement documentName_KnowledgeBaseSetting;
		
		// Document Description
		@FindBy(name="uploadDocDesc")
		public WebElement documentDescription_KnowledgeBaseSetting;
		
		//Template
		@FindBy(name="fileKnowledgeBase")
		public WebElement templateUpload_KnowledgeBaseSetting;
		
		// Template UploadFileButton
		@FindBy(id="KnowledgebtnUpload")
		public WebElement templateUploadFileBtn_KnowledgeBaseSetting;
		
		// Save button 
		@FindBy(xpath="//button[@id='BtnUploadSave']")
		public WebElement saveBtn_KnowledgeBaseSetting;
		
		// Close button
		@FindBy(xpath="//button[@id='BtnUploadSaveReset']")
		public WebElement closeBtn_KnowledgeBaseSetting;
		
		
		//************************************************************************
		
		// Master Mile Stone field setting
		@FindBy(xpath="//strong[contains(text(),'Master Milestone Field')]")
		public WebElement masterMilestoneFieldSetting;
		
		//Add button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addBtn_MasterMileStoneField;
		
		//name 
		@FindBy(name="Name")
		public WebElement name_MasterMileStoneField;
		
		// Description
		@FindBy(name="Description")
		public WebElement description_MasterMileStoneField;
		
		// Is auto updated checkbox
		@FindBy(xpath="//strong[contains(text(),'Is Auto Updated?')]")
		public WebElement isAutoUpdatedCheckBox_MasterMileStoneField;
		
		// Save button
		@FindBy(xpath="//button[contains(@title,'Save')]")
		public WebElement saveBtn_MasterMileStoneField;
		
		// Cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelBtn_MasterMileStoneField;
		
	
}
