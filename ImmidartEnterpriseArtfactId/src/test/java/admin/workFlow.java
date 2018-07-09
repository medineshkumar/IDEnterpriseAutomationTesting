package admin;

import org.openqa.selenium.By;
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
import pages.adminPageConfiguration;
import pages.adminWorkflowPages;

public class workFlow {

	static WebDriver driver;
	static String appURL = "http://10.10.10.101/enterpriselatest/";
	
	
	@Test(enabled=false,priority=1)
	public void createNewWorflow() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		Thread.sleep(2000);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		workflowObj.addBtn_Workflow.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_addWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_addWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_addWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_addWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.name_addWorkflow.sendKeys("Lpermit");

		workflowObj.description_addWorkflow.sendKeys("LpermitDescription");

		workflowObj.searchKeyword_addWorkflow.sendKeys("LpermitSearchKeyword");

		workflowObj.saveBtn_addWorkflow.click();
		
		driver.close();
		driver.quit();
		
	}
	
	
	@Test(enabled=false,priority=2)
	public void configureStartPage() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.startMenu.click();

		workflowObj.startTab.click();
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[contains(text(),'Is Questionare Applicable')]/preceding-sibling::div/div"))
				.click();

		driver.findElement(
				By.xpath("//div[contains(text(),'Is Purpose Of Travel Applicable')]/preceding-sibling::div/div"))
				.click();

		workflowObj.caseInitationTab.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.claimDropDown).click();
		act4.sendKeys("Beneficiary", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.saveBtn_caseInitationTab.click();

		Thread.sleep(1500);
		
		driver.close();
		driver.quit();
				
	}
	
	@Test(enabled=false,priority=3)	
	public void addInitiationStageAndDocumentAction() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);
		
		workflowObj.addStageMenu.click();

		Thread.sleep(1500);

		workflowObj.stageName.sendKeys("InitiationStage");

		workflowObj.stageDescription.sendKeys("InitiationStage Description");

		workflowObj.stageSearchKeyword.sendKeys("InitiationStage");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("documentation collected by associate", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
	
	@Test(enabled=false,priority=4)
	public void addQuestionnaireAction_InitiationStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=1][@data-actionname='Document Configuration'][@data-stagename='InitiationStage Description']/h2/div[contains(text(),'Document Configuration')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=1][@data-actionname='Document Configuration']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
	
	@Test(enabled=false,priority=5)
	public void addVisaRequestSubmission_InitiationStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=2][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=2][@data-actionname='Questionnaire']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
				
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("application filed online", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("visa request submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
				
		driver.findElement(By.xpath("//td[(text()='Visa Request Submission')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
	
	
	@Test(enabled=false,priority=6)
	public void addApprovalStage() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=3][@data-actionname='Visa Request Submission']/h2/div[contains(text(),'Visa Request Submission')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=3][@data-actionname='Visa Request Submission']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addStageCheckBox.click();
		Thread.sleep(1000);
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		workflowObj.stageName.sendKeys("ApprovalStage");

		workflowObj.stageDescription.sendKeys("ApprovalStage Description");

		workflowObj.stageSearchKeyword.sendKeys("ApprovalStage");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("Request approved by Manager", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Approval");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//td[(text()='Approval')]/preceding-sibling::td/input")).click();
		
		Thread.sleep(1500);
		
		//workflowObj.isRejectionApplicationCheckBox_ApprovalAction.click();
	//	workflowObj.isClarificationApplicableCheckBox_ApprovalAction.click();
		
		workflowObj.saveChangesButton_ModalDialog_ApprovalAction.click();
		
		Thread.sleep(1500);		
		
		driver.close();
		driver.quit();
			
	}
	
	
	@Test(enabled=false,priority=7)
	public void addScreeeningStage() throws InterruptedException {		

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
	
		Actions forClickAddStageOption = new Actions(driver);
		forClickAddStageOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=5][@data-actionname='Email'][@data-stagename='ApprovalStage Description']/h2/div[contains(text(),'Email')]")));
		forClickAddStageOption.build().perform();
				
		driver.findElement(By.xpath("//div[@data-sequence=5][@data-actionname='Email'][@data-stagename='ApprovalStage Description']/div[contains(@class,'addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addStageCheckBox.click();
		Thread.sleep(1000);
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		workflowObj.stageName.sendKeys("ScreeningStage");

		workflowObj.stageDescription.sendKeys("ScreeningStage Description");

		workflowObj.stageSearchKeyword.sendKeys("ScreeningStage");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("application filed online", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();
						
		Thread.sleep(1500);	
		
		workflowObj.saveBtn_action.click();
		
		driver.close();
		driver.quit();
			
	}
	
	@Test(enabled=false,priority=8)
	public void addQuestionnaireAction_ScreeningStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=6][@data-stagename='ScreeningStage Description'][@data-actionname='Document Configuration']/h2/div[contains(text(),'Document Configuration')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=6][@data-stagename='ScreeningStage Description'][@data-actionname='Document Configuration']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
	
	
	@Test(enabled=false,priority=9)
	public void addScreeningSubmissionAction() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
				
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@data-sequence=7][@data-stagename='ScreeningStage Description'][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=7][@data-stagename='ScreeningStage Description'][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=7][@data-stagename='ScreeningStage Description'][@data-actionname='Questionnaire']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
				
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("screening completed", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("screening submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
				
		driver.findElement(By.xpath("//td[(text()='Screening Submission')]/preceding-sibling::td/input")).click();

		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//label[contains(text(),'Is Rejection Applicable')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Is Clarification Applicable')]")).click();
		
		driver.findElement(By.xpath("//button[@id='saveChanges']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}	
	
	
	@Test(enabled=false,priority=10)
	public void addProcessingStage() throws InterruptedException {	

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);	
				
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@data-sequence=9][@data-actionname='Email'][@data-stagename='ScreeningStage Description']/h2/div[contains(text(),'Email')]")));
	
		Actions forClickAddStageOption = new Actions(driver);
		forClickAddStageOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=9][@data-actionname='Email'][@data-stagename='ScreeningStage Description']/h2/div[contains(text(),'Email')]")));
		forClickAddStageOption.build().perform();
				
		driver.findElement(By.xpath("//div[@data-sequence=9][@data-actionname='Email'][@data-stagename='ScreeningStage Description']/div[contains(@class,'addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addStageCheckBox.click();
		Thread.sleep(1000);
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		workflowObj.stageName.sendKeys("ProcessingStage");

		workflowObj.stageDescription.sendKeys("ProcessingStage Description");

		workflowObj.stageSearchKeyword.sendKeys("ProcessingStage");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("accepted for processing", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();
						
		Thread.sleep(1500);	
		
		workflowObj.saveBtn_action.click();
		
		driver.close();
		driver.quit();
			
	}
		
	
	@Test(enabled=false,priority=11)
	public void addQuestionnaireAction_ProcessingStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);		
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@data-sequence=10][@data-stagename='ProcessingStage Description'][@data-actionname='Document Configuration']/h2/div[contains(text(),'Document Configuration')]")));
		
		Thread.sleep(1500);		
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=10][@data-stagename='ProcessingStage Description'][@data-actionname='Document Configuration']/h2/div[contains(text(),'Document Configuration')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=10][@data-stagename='ProcessingStage Description'][@data-actionname='Document Configuration']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		
		driver.close();
		driver.quit();		
	}	
	
	@Test(enabled=false,priority=12)
	public void addProcessingSubmissionAction() throws InterruptedException {


		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
				
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@data-sequence=11][@data-stagename='ProcessingStage Description'][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=11][@data-stagename='ProcessingStage Description'][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=11][@data-stagename='ProcessingStage Description'][@data-actionname='Questionnaire']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
				
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("accepted for processing", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("processing submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
				
		driver.findElement(By.xpath("//td[(text()='Processing Submission')]/preceding-sibling::td/input")).click();

		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//label[contains(text(),'Is Rejection Applicable')]")).click();
	//	driver.findElement(By.xpath("//label[contains(text(),'Is Clarification Applicable')]")).click();
		
		driver.findElement(By.xpath("//button[@id='saveChanges']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
			
	}
	
	@Test(enabled=false)
	public void configDocumentAction_InitiationStage() throws InterruptedException {		

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions doublecClickDocumentAction = new Actions(driver);
		doublecClickDocumentAction.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=1][@data-actionname='Document Configuration'][@data-stagename='InitiationStage Description']/h2/div[contains(text(),'Document Configuration')]"))).doubleClick();
		doublecClickDocumentAction.build().perform();
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Document Configuration')][@data-toggle='tab']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Document Configuration')][@data-toggle='tab']/ancestor::div[1]//div/a/span[contains(text(),'Add New')]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name='stageActionSearchKey']")).sendKeys("Degree Documents");
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Degree documents')]/preceding-sibling::div/label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		
		Actions fileSizeDropDown = new Actions(driver);
		fileSizeDropDown.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'File Size')]/following-sibling::div"))).click();
		fileSizeDropDown.sendKeys("5",Keys.ENTER);
		fileSizeDropDown.build().perform();
		
		Actions fileTypeDropDown = new Actions(driver);
		fileTypeDropDown.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'File Type')]/following-sibling::div"))).click();
		fileTypeDropDown.sendKeys("pdf",Keys.ENTER);
		fileTypeDropDown.build().perform();
		
		driver.findElement(By.xpath("//textarea[@class='mysytle']")).sendKeys("Document description");
							
		driver.findElement(By.xpath("//a[contains(text(),'Claims')]")).click();		
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(text(),'Beneficiary')]/following::div[1]//select")));
										
		Select sel = new Select(driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(text(),'Beneficiary')]/following::div[1]//select")));
		sel.selectByValue("M");		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		
		/*JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[contains(text(),'Templates')]")));
		
		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//a[contains(text(),'Templates')]")).click();*/
		
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'MileStone')]")).click();		

		Thread.sleep(1000);
				
		Actions chooseMileStoneField = new Actions(driver);
		chooseMileStoneField.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'active')]//div[contains(@id,'s2id_milestonefield')]"))).click();
		chooseMileStoneField.sendKeys("complete documents submitted by employee",Keys.ARROW_DOWN,Keys.ENTER);
		chooseMileStoneField.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(@for,'IsSLAApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//input[@name='SLA']")).sendKeys("3");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateWorkflowAction')]")).click();
		
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'Action Owner')]")).click();
		
		Thread.sleep(1000);
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")));
		*/
		Thread.sleep(1000);
										
		Actions clickOnAO = new Actions(driver);
		clickOnAO.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input"))).click();
		clickOnAO.build().perform();
		
		Thread.sleep(1000);
		
		Actions clickOnAOSave = new Actions(driver);
		clickOnAOSave.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateActionOwner')]"))).click();
		clickOnAOSave.build().perform();
					
	}
	
	@Test(enabled=false)
	public void configQuestionnaireAction_InitiationStage() throws InterruptedException {
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions doublecClickDocumentAction = new Actions(driver);
		doublecClickDocumentAction.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=2][@data-actionname='Questionnaire'][@data-stagename='InitiationStage Description']/h2/div[contains(text(),'Questionnaire')]"))).doubleClick();
		doublecClickDocumentAction.build().perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Questionnaire')][@data-toggle='tab']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Questionnaire')][@data-toggle='tab']/ancestor::div[1]//div/a/span[contains(text(),'Add New')]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name='stageActionSearchKey']")).sendKeys("d");
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'quesconfig')]//div[contains(text(),'d')]/preceding-sibling::div/label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'quesconfig')]//a[contains(text(),'Save')]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'MileStone')]")).click();
		
		Actions chooseMileStone = new Actions(driver);
		chooseMileStone.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'active')]//div[contains(@id,'s2id_milestonefield')]"))).click();
		chooseMileStone.sendKeys("Request Initiation",Keys.ARROW_DOWN,Keys.ENTER);
		chooseMileStone.build().perform();
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(@for,'IsSLAApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//input[@name='SLA']")).sendKeys("3");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateWorkflowAction')]")).click();
		
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'Action Owner')]")).click();
		
		Thread.sleep(1000);
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")));
		*/
		Thread.sleep(1000);
										
		Actions clickOnAO = new Actions(driver);
		clickOnAO.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input"))).click();
		clickOnAO.build().perform();
		
		Thread.sleep(1000);
		
		Actions clickOnAOSave = new Actions(driver);
		clickOnAOSave.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateActionOwner')]"))).click();
		clickOnAOSave.build().perform();
				
	}
	
	
	@Test(enabled=false)
	public void configVisaRequestSubmissionAction_InitiationStage() throws InterruptedException {
		
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions doublecClickDocumentAction = new Actions(driver);
		doublecClickDocumentAction.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=3][@data-actionname='Visa Request Submission'][@data-stagename='InitiationStage Description']/h2/div[contains(text(),'Visa Request Submission')]"))).doubleClick();
		doublecClickDocumentAction.build().perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Visa Request Submission')][@data-toggle='tab']")).click();
				
		Thread.sleep(1000);
		
		Actions chooseStatus = new Actions(driver);
		chooseStatus.moveToElement(driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Visa Request Submission')][@data-toggle='tab']/ancestor::ul/following-sibling::div//div[contains(@id,'s2id_actionStatus')]"))).click();
		chooseStatus.sendKeys("Application filed online",Keys.ARROW_DOWN,Keys.ENTER);
		chooseStatus.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Visa Request Submission')][@data-toggle='tab']/ancestor::ul/following-sibling::div//label[contains(@for,'IsCustomStatusApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Visa Request Submission')][@data-toggle='tab']/ancestor::ul/following-sibling::div//input[@name='CustomStatus']")).clear();
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Visa Request Submission')][@data-toggle='tab']/ancestor::ul/following-sibling::div//input[@name='CustomStatus']")).sendKeys("Application filed online");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateWorkflowAction')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'MileStone')]")).click();
		
		Thread.sleep(1000);
				
		Actions chooseMileStoneField = new Actions(driver);
		chooseMileStoneField.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'active')]//div[contains(@id,'s2id_milestonefield')]"))).click();
		chooseMileStoneField.sendKeys("request submission",Keys.ARROW_DOWN,Keys.ENTER);
		chooseMileStoneField.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(@for,'IsSLAApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//input[@name='SLA']")).sendKeys("3");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateWorkflowAction')]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'Action Owner')]")).click();
		
		Thread.sleep(1000);
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")));
		*/
		Thread.sleep(1000);
										
		Actions clickOnAO = new Actions(driver);
		clickOnAO.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input"))).click();
		clickOnAO.build().perform();
		
		Thread.sleep(1000);
		
		Actions clickOnAOSave = new Actions(driver);
		clickOnAOSave.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateActionOwner')]"))).click();
		clickOnAOSave.build().perform();
				
	}
	
	
	@Test(enabled=true)
	public void configApprovalAction_ApprovalStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions doublecClickDocumentAction = new Actions(driver);
		doublecClickDocumentAction.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=4][@data-actionname='Approval'][@data-stagename='ApprovalStage Description']/h2/div[contains(text(),'Approval')]"))).doubleClick();
		doublecClickDocumentAction.build().perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Approval')][@data-toggle='tab']")).click();
		
		Thread.sleep(1000);
		
		Actions chooseStatus = new Actions(driver);
		chooseStatus.moveToElement(driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Approval')][@data-toggle='tab']/ancestor::ul/following-sibling::div//div[contains(@id,'s2id_actionStatus')]"))).click();
		chooseStatus.sendKeys("request approved by manager",Keys.ARROW_DOWN,Keys.ENTER);
		chooseStatus.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Approval')][@data-toggle='tab']/ancestor::ul/following-sibling::div//label[contains(@for,'IsCustomStatusApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Approval')][@data-toggle='tab']/ancestor::ul/following-sibling::div//input[@name='CustomStatus']")).clear();
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Approval')][@data-toggle='tab']/ancestor::ul/following-sibling::div//input[@name='CustomStatus']")).sendKeys("request approved by manager");
		
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(text(),'Save')]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[contains(text(),'MileStone')]")).click();
		
		Thread.sleep(1000);
		
		Actions chooseMileStoneField = new Actions(driver);
		chooseMileStoneField.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'active')]//div[contains(@id,'s2id_milestonefield')]"))).click();
		chooseMileStoneField.sendKeys("request submission",Keys.ARROW_DOWN,Keys.ENTER);
		chooseMileStoneField.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(@for,'IsSLAApplicable')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//input[@name='SLA']")).sendKeys("3");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(text(),'Save')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li/a[text()='Action Owner']")).click();
		
		Thread.sleep(1000);
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")));
		*/
		Thread.sleep(1000);
										
		Actions clickOnAO = new Actions(driver);
		clickOnAO.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[text()='Manager']/preceding-sibling::td/input"))).click();
		clickOnAO.build().perform();
		
		Thread.sleep(1000);
		
		Actions clickOnAOSave = new Actions(driver);
		clickOnAOSave.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateActionOwner')]"))).click();
		clickOnAOSave.build().perform();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@class='actionOwnerli active']/following-sibling::li/a[contains(text(),'Custom Action Owner')]")).click();
		
		Thread.sleep(1500);
		
		Actions clickOnCAO = new Actions(driver);
		clickOnCAO.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//td[contains(text(),'Project manager')]/preceding-sibling::td/input"))).click();
		clickOnCAO.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'tab-pane active')]//button[contains(@id,'UpdateCustomActionOwner')]")).click();
		
	}
	
	
	@Test(enabled=false)
	public void configDocumentConfigAction_ScreeningStage() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		Actions doublecClickDocumentAction = new Actions(driver);
		doublecClickDocumentAction.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=6][@data-actionname='Document Configuration'][@data-stagename='ScreeningStage Description']/h2/div[contains(text(),'Document Configuration')]"))).doubleClick();
		doublecClickDocumentAction.build().perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Document Configuration')][@data-toggle='tab']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//li[@class='active']/a[contains(text(),'Document Configuration')][@data-toggle='tab']/ancestor::div[1]//div/a/span[contains(text(),'Add New')]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name='stageActionSearchKey']")).sendKeys("Degree Documents");
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		//input[@name='stageActionSearchKey']/ancestor::div[2]/following-sibling::div//a
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Degree documents')]/preceding-sibling::div/label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		
		Actions fileSizeDropDown = new Actions(driver);
		fileSizeDropDown.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'File Size')]/following-sibling::div"))).click();
		fileSizeDropDown.sendKeys("5",Keys.ENTER);
		fileSizeDropDown.build().perform();
		
		Actions fileTypeDropDown = new Actions(driver);
		fileTypeDropDown.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'File Type')]/following-sibling::div"))).click();
		fileTypeDropDown.sendKeys("pdf",Keys.ENTER);
		fileTypeDropDown.build().perform();
		
		driver.findElement(By.xpath("//textarea[@class='mysytle']")).sendKeys("Document description");
							
		driver.findElement(By.xpath("//a[contains(text(),'Claims')]")).click();		
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(text(),'Beneficiary')]/following::div[1]//select")));
										
		Select sel = new Select(driver.findElement(By.xpath("//div[contains(@class,'active')]//label[contains(text(),'Beneficiary')]/following::div[1]//select")));
		sel.selectByValue("M");		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		
	}
 	
	
	
	//************************************************************************************************************************************

	@Test(enabled = false,priority=1)
	public void addWorflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		Thread.sleep(2000);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		workflowObj.addBtn_Workflow.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_addWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_addWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_addWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_addWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.name_addWorkflow.sendKeys("Lpermit");

		workflowObj.description_addWorkflow.sendKeys("LpermitDescription");

		workflowObj.searchKeyword_addWorkflow.sendKeys("LpermitSearchKeyword");

		workflowObj.saveBtn_addWorkflow.click();

	}

	@Test(enabled = false)
	public static void searchWorkflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Bhutan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();
		
		Thread.sleep(2000);
		
	/*	driver.close();
		driver.quit();
*/
	}
	
	@Test(enabled=false,priority=2)
	public static void config() throws InterruptedException {
		
		searchWorkflow();
		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);		
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.startMenu.click();

		workflowObj.startTab.click();
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[contains(text(),'Is Questionare Applicable')]/preceding-sibling::div/div"))
				.click();

		driver.findElement(
				By.xpath("//div[contains(text(),'Is Purpose Of Travel Applicable')]/preceding-sibling::div/div"))
				.click();

		workflowObj.caseInitationTab.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.claimDropDown).click();
		act4.sendKeys("Beneficiary", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.saveBtn_caseInitationTab.click();

		Thread.sleep(1500);
		

		/*driver.close();
		driver.quit();
*/
		
	}
	
	@Test(enabled = false,priority=3)
	public void addFirstStageAndAction() throws InterruptedException {
				
		searchWorkflow();
		
		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);		
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);
		
		workflowObj.addStageMenu.click();

		Thread.sleep(1500);

		workflowObj.stageName.sendKeys("stage name");

		workflowObj.stageDescription.sendKeys("stage desc");

		workflowObj.stageSearchKeyword.sendKeys("stage search keyword");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("documentation collected by associate", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);		
		
		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		/*
		driver.close();
		driver.quit();
	*/	
					
	}
	
	@Test(enabled = false,priority=4)
	public void addNextAction() throws InterruptedException {
		searchWorkflow();
		
		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);		
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=1][@data-actionname='Document Configuration']/h2/div[contains(text(),'Document Configuration')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=1][@data-actionname='Document Configuration']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addActionCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);
		

	/*	driver.close();
		driver.quit();
		*/	
	}
	
	@Test(enabled = false,priority=5)
	public void addNextStage() throws InterruptedException {
		searchWorkflow();
		
		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);		
		
		driver.findElement(By.xpath("//td[contains(text(),'Bhutan')]/following-sibling::td[5]/div/a")).click();
		
		Thread.sleep(2000);
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[@data-sequence=2][@data-actionname='Questionnaire']/h2/div[contains(text(),'Questionnaire')]")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-sequence=2][@data-actionname='Questionnaire']/div[contains(@class,'org-add-button addTreeNode')]/i")).click();
		
		Thread.sleep(1500);
		
		workflowObj.addStageCheckBox.click();
		
		Thread.sleep(1500);
		
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		workflowObj.stageName.sendKeys("stage name1");

		workflowObj.stageDescription.sendKeys("stage desc1");

		workflowObj.stageSearchKeyword.sendKeys("stage search keyword1");

		workflowObj.nextBtn_stage.click();
		
		Thread.sleep(1500);
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("application filed online", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("visa request submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
				
		driver.findElement(By.xpath("//td[(text()='Visa Request Submission')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);


	/*	driver.close();
		driver.quit();
		*/
	}	
	
	//************************************************************************************************
	
	@Test(enabled = false)
	public void configWorkflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("United States", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[contains(text(),'DependentVisa')]/following-sibling::td[3]/div/a")).click();

		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.startMenu.click();

		workflowObj.startTab.click();
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[contains(text(),'Is Questionare Applicable')]/preceding-sibling::div/div"))
				.click();

		driver.findElement(
				By.xpath("//div[contains(text(),'Is Purpose Of Travel Applicable')]/preceding-sibling::div/div"))
				.click();

		workflowObj.caseInitationTab.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.claimDropDown).click();
		act4.sendKeys("Beneficiary", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.saveBtn_caseInitationTab.click();

		Thread.sleep(1500);

		// Remove this line later
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();

	}

	@Test(enabled = false,priority=2)
	public void addStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		Thread.sleep(2000);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Pakistan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();

		Thread.sleep(2000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//td[contains(text(),'Lpermit')]/following-sibling::td[3]/div/a")));
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[contains(text(),'Lpermit')]/following-sibling::td[3]/div/a")).click();

		Thread.sleep(2000);	
		

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.addStageMenu.click();

		Thread.sleep(1500);

		workflowObj.stageName.sendKeys("stage name");

		workflowObj.stageDescription.sendKeys("stage desc");

		workflowObj.stageSearchKeyword.sendKeys("stage search keyword");

		workflowObj.nextBtn_stage.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		System.out.println(workflowObj.closeBtn_StartPage.isDisplayed());
		
		workflowObj.closeBtn_StartPage.click();

		Actions actH = new Actions(driver);
		actH.moveToElement(driver.findElement(By.xpath("//div[text()='Document Configuration']"))).doubleClick();
		actH.build().perform();

		Thread.sleep(1000);

		// driver.findElement(By.xpath("//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();

		workflowObj.documentConfigurationTab_documentConfigAction.click();

		Thread.sleep(1000);

		workflowObj.addNewDocumentBtn_documentConfigAction.click();

		Thread.sleep(2000);

		workflowObj.searchKeyword_documentConfigAction.sendKeys("td");
		workflowObj.searchBtn_documentConfigAction.click();

		driver.findElement(By.xpath("//div[contains(text(),'td')]/preceding::label[1]")).click();

		Thread.sleep(1500);

		workflowObj.details_documentConfigAction.click();

		Thread.sleep(1500);

		Actions a = new Actions(driver);
		a.moveToElement(workflowObj.fileSizeDropDown_documentConfigAction).click();
		a.sendKeys("5", Keys.ARROW_DOWN, Keys.ENTER);
		a.build().perform();

		Thread.sleep(1500);

		Actions b = new Actions(driver);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("jpg", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("jpeg", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("png", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("pdf", Keys.ARROW_DOWN, Keys.ENTER);
		b.build().perform();

		Thread.sleep(1500);

		workflowObj.claims_documentConfigAction.click();

		Thread.sleep(1500);

		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[@id='dtab22']/div[2]/div[2]/div/select")));

		Thread.sleep(2000);

		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='dtab22']/div[2]/div[2]/div/select")));
		sel1.selectByValue("M");

		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[@id='dtab22']/div[5]/div[2]/div/select")));

		Thread.sleep(2000);

		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='dtab22']/div[5]/div[2]/div/select")));
		sel2.selectByValue("M");

		Thread.sleep(1500);

		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].scrollIntoView(true);", workflowObj.saveBtn_claimSubTab_dcoumentConfigAction);

		Thread.sleep(1500);

		workflowObj.saveBtn_claimSubTab_dcoumentConfigAction.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].scrollIntoView(true);", workflowObj.closeBtn_StartPage);
		
		Thread.sleep(1500);
		
		workflowObj.closeBtn_StartPage.click();		
		
		driver.navigate().refresh();
		
		Thread.sleep(2500);		
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[text()='Document Configuration']")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();
		
		Thread.sleep(2000);
		
		
		workflowObj.addActionCheckBox.click();
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		workflowObj.closeBtn_StartPage.click();
		
		Thread.sleep(2000);
		
		Actions configQuestionnaireAction = new Actions(driver);
		configQuestionnaireAction.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']"))).doubleClick();
		configQuestionnaireAction.build().perform();
		
		Thread.sleep(2000);
		
		workflowObj.questionnaireTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		workflowObj.addNewBtn_questionnairConfigAction.click();
		
		Thread.sleep(1500);
		
		workflowObj.searchBox_questionnaireConfigAction.sendKeys("Form");
		workflowObj.searchBtn_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[contains(@class,'quesconf')]//div[contains(text(),'Form')]/preceding::label[1]")).click();
				
	    JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].scrollIntoView(true);", workflowObj.saveBtn_questionnaireTab_questionnaireConfigAction);
		
		Thread.sleep(1500);
		
	//	workflowObj.saveBtn_questionnaireTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
				
		/* **************  configure milestone for questionnaire ************* */
		 driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		Actions configQuestionnaireAction1 = new Actions(driver);
		configQuestionnaireAction1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']"))).doubleClick();
		configQuestionnaireAction1.build().perform();
		
		Thread.sleep(1500);			
		
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].scrollIntoView(true);", workflowObj.milestoneTab_questionnaireConfigAction); 
		
		workflowObj.milestoneTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		Actions QmileStonetab = new Actions(driver);
		QmileStonetab.moveToElement(workflowObj.chooseMileStoneFieldDropDown_milestoneTab_documentConfigAction).click();
		QmileStonetab.sendKeys("initiation", Keys.ARROW_DOWN,Keys.ENTER);
		QmileStonetab.build().perform();
		
		workflowObj.isSlaApplicableCheckbox_milestoneTab_questionnaireConfigAction.click();
		
		workflowObj.SLA_milstoneTab_questionnaireConfigAction.sendKeys("5");
		
		workflowObj.saveBtn_milestoneTab_questionniareConfigAction.click();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		Actions addVisaRequestSubmission = new Actions(driver);
		addVisaRequestSubmission.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']")));
		addVisaRequestSubmission.build().perform();		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-actionname='Questionnaire']//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();
		
		Thread.sleep(2000);
		
		workflowObj.addActionCheckBox.click();
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);		
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("application sent", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(2000);		
		
		Actions visaRequestSubmissionAdd = new Actions(driver);
		visaRequestSubmissionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		visaRequestSubmissionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Visa Request Submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[contains(text(),'Visa Request Submission')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		workflowObj.closeBtn_StartPage.click();
		
		Thread.sleep(2000);		
		
		Actions VisaRequestSubmissionAction = new Actions(driver);
		VisaRequestSubmissionAction.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Visa Request Submission')][@class='actnode']"))).doubleClick();
		VisaRequestSubmissionAction.build().perform();
		
		Thread.sleep(2000);
		
		workflowObj.actionOwnerTab_VisaRequestSubmissionAction.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")).click();
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].scrollIntoView(true);",  driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Administrator')]/preceding-sibling::td/input")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Administrator')]/preceding-sibling::td/input")).click();
				
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Embassy')]/preceding-sibling::td/input"))); 
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Embassy')]/preceding-sibling::td/input")).click();*/

	}
}
