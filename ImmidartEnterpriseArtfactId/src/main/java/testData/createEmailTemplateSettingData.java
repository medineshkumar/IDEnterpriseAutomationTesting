package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createEmailTemplateSettingData {

	@DataProvider(name = "createEmailTemplate")
	public static Object[][] getcreateEmailTemplateSettingData() {

		TestDataReader createEmailTemplateSettingObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\systemSettingData.xls");

		int row = createEmailTemplateSettingObj.getRowCount(11);
		int col = createEmailTemplateSettingObj.getColCount(11, 0);

		Object[][] createEmailTemplateSetting = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createEmailTemplateSetting[i - 1][j] = createEmailTemplateSettingObj.readDataFromFile(11, i, j);
			}
		}

		return createEmailTemplateSetting;

	}

}
