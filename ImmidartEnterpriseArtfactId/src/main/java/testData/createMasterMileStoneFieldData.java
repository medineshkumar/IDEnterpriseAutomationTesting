package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createMasterMileStoneFieldData {

	@DataProvider(name = "masterMileStoneFieldData")
	public static Object[][] getMasterMileStoneFieldData() {

		TestDataReader masterMileStoneFieldDataObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = masterMileStoneFieldDataObj.getRowCount(7);
		int col = masterMileStoneFieldDataObj.getColCount(7, 0);

		Object[][] masterMileStoneFieldData = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				masterMileStoneFieldData[i - 1][j] = masterMileStoneFieldDataObj.readDataFromFile(7, i, j);
			}
		}

		return masterMileStoneFieldData;

	}

}
