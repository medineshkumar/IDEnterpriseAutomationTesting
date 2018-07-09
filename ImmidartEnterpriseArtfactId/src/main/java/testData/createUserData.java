package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createUserData {

	@DataProvider(name = "createUser")
	public static Object[][] getcreateUserData() {

		TestDataReader createUserDataObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\organisationData.xls");

		int row = createUserDataObj.getRowCount(0);
		int col = createUserDataObj.getColCount(0, 0);

		Object[][] createUserData = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createUserData[i - 1][j] = createUserDataObj.readDataFromFile(0, i, j);
			}
		}

		return createUserData;

	}

}
