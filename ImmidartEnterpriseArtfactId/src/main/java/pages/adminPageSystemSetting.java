package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageSystemSetting {

	/* System Settings */

	// System Setting Menu
	@FindBy(xpath = "//div[contains(text(),'System Settings')]")
	public WebElement systemSettingMenu;
	
	//-----------------------------------------------------------
	
	//Master Legal Forms Setting
	@FindBy(xpath="//strong[contains(text(),'Master Legal Form')]")
	public WebElement masterLegalFormsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addMasterLegalFormBtn;
		
		//Code
		@FindBy(name="FormCode")
		public WebElement codeMasterForm;
		
		//Name
		@FindBy(name="Name")
		public WebElement nameMasterForm;
		
		//Description
		@FindBy(name="Description")
		public WebElement descriptionMasterDescription;
		
		//PDF File
		@FindBy(id="btnAttachPdf")
		public WebElement pdfFileMasterDescription;
		
		//Template File
		@FindBy(id="btnAttachTemplate")
		public WebElement templateFileMasterDescription;
		
		//Save Master legal form button
		@FindBy(id="btnSave")
		public WebElement saveMasterLegalFormBtn;
		
		//Cancel Master legal form button
		@FindBy(id="btnClose")
		public WebElement cancelMasterLegalFormBtn;		
		
	//-----------------------------------------------------------
	
	
	// Service Setting
	@FindBy(xpath = "//img[contains(@src,'service')]")
	public WebElement serviceSetting;
	
		//Add Service button
		@FindBy(id="btnAddService")
		public WebElement addServiceBtn;
		
		//Service code
		@FindBy(name="txtSerCode")
		public WebElement serviceCode;
		
		//Service description
		@FindBy(name="txtSerDesc")
		public WebElement serviceDescription;
		
		//Save service button
		@FindBy(id="btnServiceSave")
		public WebElement saveServiceBtn;
		
		//Cancel service button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelServiceBtn;
				
		
	//-----------------------------------------------------------

	// Type Setting
	@FindBy(xpath = "//img[contains(@src,'type')]")
	public WebElement typeSetting;
	
		//Add Type button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addTypeBtn;
	
		//Service Drop Down
		@FindBy(xpath="//span[@id='select2-chosen-2']")
		public WebElement serviceDropDown;
		
		// ServiceDrop Down
		@FindBy(id="s2id_Service")
		public WebElement serviceDropDown_Type;
			
		//Service Drop down input box
		@FindBy(xpath="//input[@id='s2id_autogen2_search']")
		public WebElement serviceDropDownInputBox;
		
		//Type code
		@FindBy(name="TypeCode")
		public WebElement typeCode;
		
		// Type Description
		@FindBy(name="TypeDescription")
		public WebElement typeDescription;		
		
		//Category Drop Down
		@FindBy(xpath="//span[@id='select2-chosen-3']")
		public WebElement categoryDropDown;
		
		//Category drop down
		@FindBy(id="s2id_ddlCategory")
		public WebElement categoryDropDown_Type;
		
		// Category Drop down input box
		@FindBy(xpath="//input[@id='s2id_autogen3_search']")
		public WebElement categoryDropDownInputBox;
		
		//Save type button
		@FindBy(id="btnSave")
		public WebElement saveTypeBtn;
		
		//Cancel type button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelTypeBtn;
		
	
	//-----------------------------------------------------------	

	// Assignment Role Setting
	@FindBy(xpath = "//img[contains(@src,'assignment')]")
	public WebElement assignmentRoleSetting;
	
		//Add Assignment Role
		@FindBy(id="btnAddLicenseAssignment")
		public WebElement addAssignmentRoleBtn;
		
		//Description
		@FindBy(xpath="//label[text()='Description']/following-sibling::input")
		public WebElement assignmentDescription;
		
		//Save Assignment Role
		@FindBy(id="btnLicenseAssignSave")
		public WebElement saveAssignmentRoleBtn;
		
		//Cancel Assignment Role
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelAssignmentRoleBtn;
		
	
	//-----------------------------------------------------------

	// Immigration Role Setting
	@FindBy(xpath = "//img[contains(@src,'immigration')]")
	public WebElement immigrationRoleSetting;
	
		//Add immigration role button
		@FindBy(id="btnAddImmigrationRole")
		public WebElement addImmigrationRoleBtn;
		
		//Description
		@FindBy(name="txtImmiRoleDescription")
		public WebElement immigrationDescription;
		
		//Save Immigration 
		@FindBy(id="btnSaveImmigrationRole")
		public WebElement saveImmigrationRoleBtn;
		
		//Cancel Immigration 
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelImmigrationRoleBtn;
	
	
	//-----------------------------------------------------------

	// Document Category Setting
	@FindBy(xpath="//img[contains(@src,'document')]")
	public WebElement documentCategorySetting;
		
		//Add Document Category Button
		@FindBy(id="btnAddDocumentCategory")
		public WebElement addDocumentCategoryBtn;
		
		//Document Name
		@FindBy(name="txtDocumentName")
		public WebElement documentCategoryName;
		
		//Document Description
		@FindBy(name="txtDocuemtDescription")
		public WebElement documentCategoryDescription;
			
		//Save Document 
		@FindBy(id="btnSaveDocumentCategory")
		public WebElement saveDocumentCategoryBtn;
		
		//Cancel Document 
		@FindBy(id="btnDocumentCancel")
		public WebElement cancelDocumentCategoryBtn;
		
		
	
	//-----------------------------------------------------------
	
	//Documents Setting
	@FindBy(xpath="//a[contains(@href,'MasterDocument')]//img[contains(@src,'legal')]")
	public WebElement documentsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addDocumentBtn;
		
		//Document Category drop down
		@FindBy(id="s2id_DocumentCategory")
		public WebElement documentCategoryDropDown;
		
		//Document Category drop down input box
		@FindBy(id="s2id_autogen4_search")
		public WebElement documentCategoryDropDownInputBox;
		
		//Document Name 
		@FindBy(name="DocumentName")
		public WebElement documentName;
		
		//Document Name Description
		@FindBy(name="Description")
		public WebElement documentDescription;
		
		//Document Display Name
		@FindBy(name="DisplayName")
		public WebElement documentDisplayName;	
		
		
		// Document applicable beneficiary case
		@FindBy(xpath="//input[@id='bencasechk']/following-sibling::label")
		public WebElement beneficiaryApplicableCase;
		
		// Document applicable beneficiary profile
		@FindBy(xpath="//input[@id='benprofilechk']/following-sibling::label")
		public WebElement beneficiaryApplicableProfile;
		
		// Document applicable spouse
		@FindBy(xpath="//label[@for='spousechk']")
		public WebElement spouseApplicable;
		
		// Document applicable child
		@FindBy(xpath="//label[@for='childchk']")
		public WebElement chileApplicable;
		
		//Document Save Button
		@FindBy(id="MDocbtnSave")
		public WebElement saveDocumentBtn;
		
		//Document Cancel Button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement documentCancelButton;
		
		
	
	//-----------------------------------------------------------
	
	//Progress Tracker Category Setting
	@FindBy(xpath="//img[contains(@src,'progress-tracker-category')]")
	public WebElement progressTrackerCategorySetting;
	
		//Add button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addProgresstrackerCategoryBtn;
		
		//Progress tracker category description
		@FindBy(name="Description")
		public WebElement progressTrackerCategoryDescription;
		
		//Save button
		@FindBy(id="btnSave")
		public WebElement saveProgressTrackerCategoryBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelProgressTrackerCategoryBtn; 
		
		
	//-----------------------------------------------------------
	
	//Progress Tracker Fields Setting
	@FindBy(xpath="//strong[contains(text(),'Progress Tracker Field')]")
	public WebElement progressTrackerFieldsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addProgressTrackerFieldBtn;
	
		//Progress Tracker Fields Drop Down
		@FindBy(id="select2-chosen-1")
		public WebElement progressTrackerFieldsDropDown;
		
		//Progress Tracker Fields Drop Down Input box
		@FindBy(id="s2id_autogen1_search")
		public WebElement progressTrackerFieldsDropDownInputBox;
		
		//Progress Tracker Fields Description
		@FindBy(name="Description")
		public WebElement progressTrackerFieldsDescription;
		
		//Progress tracker fields save button
		@FindBy(id="btnSave")
		public WebElement saveProgressTrackerFieldsBtn;
		
		
		
			
	//--------------------------------------------------------------
	
	//Travel Purpose Setting
	@FindBy(xpath="//img[contains(@src,'country-travel-purpose')]")
	public WebElement travelPurposeSetting;
	
		//Add button
		@FindBy(id="btnAddTravel")
		public WebElement addTravelPurposeBtn;
	
		//travel purpose name
		@FindBy(name="txtdTravelName")
		public WebElement travelPurposeName;
		
		//Travel purpose description
		@FindBy(name="txtdTravelDescription")
		public WebElement travelPurposeDescription;
		
		//Save travel purpose
		@FindBy(id="btnSave")
		public WebElement saveTravelPurposeBtn;
		
		//Cancel travel purpose
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelTravelPurposeBtn;
		
			
	//---------------------------------------------------------------
	
	//System Defined Keyword Setting
	@FindBy(xpath="//img[contains(@src,'keywords')]")
	public WebElement systemDefinedKeywordSetting;
	
		//Add button
		@FindBy(id="btnAdd")
		public WebElement addSystemDefinedKeywordBtn;		
	
		//Name 
		@FindBy(name="Keyword")
		public WebElement keyword;
		
		//Description
		@FindBy(name="Description")
		public WebElement systemDefinedKeywordDescription;
		
		//Source Table drop down
		@FindBy(xpath="//div[@id='s2id_SourceTable']")
		public WebElement sourceTableDropDown;
		
		//Source Table drop down inputBox
		@FindBy(id="s2id_autogen1_search")
		public WebElement sourceTableDropDownInputBox;
		
		//Source Column drop down
		@FindBy(xpath="//div[@id='s2id_SourceColumn']")
		public WebElement sourceColumnDropDown;
				
		//Source Table drop down inputBox
		@FindBy(id="s2id_autogen2_search")
		public WebElement sourceColumnDropDownInputBox;
		
		//Save system defined keyword
		@FindBy(id="btnSave")
		public WebElement saveSystemDefinedKeywordBtn;
		
		//Cancel System defined Keyword
		@FindBy(id="btnCancel")
		public WebElement cancelSystemDefinedKeywordBtn;
	
	//---------------------------------------------------------------
	
	
	//Education Evaluator Setting
	@FindBy(xpath="//img[contains(@src,'education')]")
	public WebElement educationEvaluatorSetting;
	
		//Add education evaluator button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addEducationEvaluationBtn;		
		
		//First Name
		@FindBy(name="FirstName")
		public WebElement firstNameEducationEvaluation;
		
		//Middle Name
		@FindBy(name="MiddleName")
		public WebElement middleNameEducationEvaluation;
		
		//Last Name
		@FindBy(name="LastName")
		public WebElement lastNameEducationEvaluation;
	
		//Email id
		@FindBy(name="EmailID")
		public WebElement emailIdEducationEvaluation;
		
		//Evaluation category Drop Down
		@FindBy(xpath="//div[@id='s2id_EducationEvaluationCategory']")
		public WebElement evaluationCategoryDropDown;
		
		//Evaluation Category Drop down input box
		@FindBy(id="s2id_autogen1_search")
		public WebElement evaluationCategoryDropDownInputBox;
		
		//Save button
		@FindBy(id="audit_submit")
		public WebElement saveEducationEvaluationBtn;
		
		//Cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelEducationEvaluationBtn;
		
	
	//----------------------------------------------------------
	

	//Milestone Fields Setting
	@FindBy(xpath="//a[contains(@href,'Licensemilestone')]//img")
	public WebElement milestoneFieldsSetting;
	
		//Add button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addMileStoneFieldBtn;
		
		//Name
		@FindBy(name="Name")
		public WebElement nameMileStoneField;
		
		//Description
		@FindBy(name="Description")
		public WebElement descriptionMileStoneField;
		
		//Is auto updated
		@FindBy(xpath="//strong[contains(text(),'Is Auto Updated?')]")
		public WebElement isAutoUpdated_MileStoneFieldSetting;
		
		//Save button
		@FindBy(id="btnSave")
		public WebElement saveMileStoneFieldBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelMileStoneFieldBtn;
	
	
	//---------------------------------------------------------
	
		
	// License vendor setting
		@FindBy(xpath="//img[contains(@src,'vendor')]")
		public WebElement licenseVendorSetting;
		
		
		// add license vendor button
		@FindBy(id="btnAddVendor")
		public WebElement addLicenseVendorBtn;
		
		// vendor type drop down
		@FindBy(id="s2id_ddlvendortype")
		public WebElement vendorTypeDropDown;
		
		// vendor name 
		@FindBy(name="txtvendorname")
		public WebElement vendorName;
		
		// contact person name
		@FindBy(name="txtcontactperson")
		public WebElement contactPerson_LicenseVendor;
		
		// contact person email id
		@FindBy(name="txtcontactpersonmail")
		public WebElement contactPersonEmailID_LicenseVendor;
		
		// contact number
		@FindBy(name="txtcontactnumber")
		public WebElement contactNumber_LicenseVendor;
		
		// validity start date
		@FindBy(name="txtstartdate")
		public WebElement validityStartDate_LicenseVendor;
		
		// validity end date
		@FindBy(name="txtenddate")
		public WebElement validityEndDate_LicenseVendor;
		
		// url
		@FindBy(name="txturl")
		public WebElement url_LicenseVendor;
		
		// save button
		@FindBy(id="btnvendorsave")
		public WebElement saveBtn_LicenseVendor;
		
		// cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelBtn_LicenseVendor;
		
		//********************************************************
		
		// Email template setting
		@FindBy(xpath="//a[contains(@href,'EmailTemplateMaster')]//img[contains(@src,'email')]")
		public WebElement emailTemplateSetting;
		
		// Add email button template button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addBtn_EmailTemplateSetting;
		
		// From 
		@FindBy(name="txtFrom")
		public WebElement from_EmailTemplateSetting;
		
		// To
		@FindBy(name="txtTo")
		public WebElement to_EmailTemplateSetting;
		
		// CC
		@FindBy(name="txtCc")
		public WebElement cc_EmailTemplateSetting;
		
		// BCC
		@FindBy(name="txtBcc")
		public WebElement bcc_EmailTemplateSetting;
		
		// Subject
		@FindBy(name="txtSubject")
		public WebElement subject_EmailTemplateSetting;
		
		// Category drop down
		@FindBy(id="s2id_ddlCategory")
		public WebElement categoryDropDown_EmailTemplateSetting;
		
		// Category drop down input box
		@FindBy(id="s2id_autogen1_search")
		public WebElement categoryDropDownInputBox_EmailTemplateSetting;
		
		// Keyword drop down
		@FindBy(id="s2id_ddlKeyword")
		public WebElement keywordDropDown_EmailTemplateSetting;
		
		// Attachment button
		@FindBy(xpath="//i[contains(@class,'paperclip')]")
		public WebElement attachmentBtn_EmailTemplateSetting;
		
		// Upload plugin add file button
		@FindBy(xpath="//span[contains(@class,'fileinput')]//span[contains(text(),'Add')]")
		public WebElement addFileBtn_AttachmentUploadPlugin_EmailTemplateSetting;
		
		// Upload plugin upload all button
		@FindBy(xpath="//span[contains(@class,'fileinput')]/following-sibling::button//span[contains(text(),'Upload All')]")
		public WebElement uploadAllBtn_AttachmentUploadPlugin_EmailTemplateSetting;
		
		// Upload plugin cancel all button
		@FindBy(xpath="//span[contains(@class,'fileinput')]/following-sibling::button//span[contains(text(),'Cancel All')]")
		public WebElement cancelAllBtn_AttachmentUploadPlugin_EmailTemplateSetting;
		
		// Upload plugin Close icon
		@FindBy(xpath="//button[@data-dismiss='modal']/span")
		public WebElement closeIcon_AttachmentUploadPlugin_EmailTemplateSetting;
		
		// Keyword drop down
		@FindBy(id="s2id_autogen2_search")
		public WebElement keywordDropDownInputBox_EmailTemplateSetting;
		
		// Save & Continue Button
		@FindBy(id="btnSave")
		public WebElement saveAndContinueBtn_EmailTemplateSetting;
		
		// Cancel button
		@FindBy(id="btnCancel")
		public WebElement cancelBtn_EmailTemplateSetting;
		
		// Save button
		@FindBy(id="save")
		public WebElement saveBtnFinal_EmailTemplateSetting;
		
		// Cancel button
		@FindBy(id="discard")
		public WebElement cancelBtnFinal_EmailTemplateSetting;
		
		//**************************************************************
		
		// Reminder Notification setting
		@FindBy(xpath="//img[contains(@src,'component')]")
		public WebElement reminderNotificationSetting;
		
		// Add button reminder notification setting
		@FindBy(id="btnAddReminder")
		public WebElement addBtn_ReminderNotification;
		
		// Category drop down 
		@FindBy(id="s2id_ddlReminderCategory")
		public WebElement categoryDropDown_ReminderNotification;
		
		// Category drop down input box
		@FindBy(id="s2id_autogen5_search")
		public WebElement categoryDropDownInputBox_ReminderNotification;
		
		// Criteria drop down
		@FindBy(id="s2id_ddlReminderCriteria")
		public WebElement criteriaDropDown_ReminderNotification;
		
		// Criteria drop down input box
		@FindBy(id="s2id_autogen28_search")
		public WebElement criteriaDropDownInputBox_ReminderNotification;
		
		// Operator drop down
		@FindBy(id="s2id_ddlReminderOperator")
		public WebElement operatorDropDown_ReminderNotification;
		
		// Operator drop down input box
		@FindBy(id="s2id_autogen27_search")
		public WebElement operatorDropDownInputBox_ReminderNotification;
		
		// Unit drop down
		@FindBy(id="s2id_ddlReminderUnit")
		public WebElement unitDropDown_ReminderNotification;
		
		// Unit drop down input box
		@FindBy(id="s2id_ddlReminderUnit")
		public WebElement unitDropDownInputBox_ReminderNotification;
		
		// Value 
		@FindBy(name="txtReminderValue")
		public WebElement value_ReminderNotification;
		
		// Email template selection icon
		@FindBy(id="reminderEmailTemplate")
		public WebElement selectEmailTemplateBtn_ReminderNotification;
		
		// Save email template button
		@FindBy(id="btnSaveRemEmailTemp")
		public WebElement saveEmailTemplateBtn_ReminderNotification;
		
		// Cancel email Template button
		@FindBy(id="btnCancelRemEmailTemp")
		public WebElement cancelEmailTemplateBtn_ReminderNotification;
		
		// Save button
		@FindBy(id="btnSaveReminder")
		public WebElement saveBtn_ReminderNotification;
		
		// Cancel button
		@FindBy(id="btnCancelReminder")
		public WebElement cancelBtn_ReminderNotification;
		
		
		
		
		
		
}
