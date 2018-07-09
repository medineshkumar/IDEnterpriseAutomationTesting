package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createReminderNotificationData {

	@DataProvider(name = "createReminderNotification")
	public static Object[][] getcreateReminderNotificationData() {

		TestDataReader createReminderNotificationDataObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\systemSettingData.xls");

		int row = createReminderNotificationDataObj.getRowCount(12);
		int col = createReminderNotificationDataObj.getColCount(12, 0);

		Object[][] createReminderNotificationData = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createReminderNotificationData[i - 1][j] = createReminderNotificationDataObj.readDataFromFile(12, i, j);
			}
		}

		return createReminderNotificationData;

	}

}
