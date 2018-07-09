package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createEmailSetting {

	@DataProvider(name = "createEmailSetting")
	public static Object[][] getcreateEmailSetting() {

		TestDataReader createEmailSettingObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\configurationData.xls");

		int row = createEmailSettingObj.getRowCount(13);
		int col = createEmailSettingObj.getColCount(13, 0);

		Object[][] createEmailSetting = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createEmailSetting[i - 1][j] = createEmailSettingObj.readDataFromFile(13, i, j);
			}
		}

		return createEmailSetting;

	}

}
