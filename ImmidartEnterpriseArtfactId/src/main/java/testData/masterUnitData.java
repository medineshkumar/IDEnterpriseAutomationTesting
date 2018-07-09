package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class masterUnitData {

	@DataProvider(name = "masterUnitData")
	public static Object[][] getmasterUnitData() {

		TestDataReader masterUnitObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = masterUnitObj.getRowCount(5);
		int col = masterUnitObj.getColCount(5, 0);

		Object[][] masterUnit = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				masterUnit[i - 1][j] = masterUnitObj.readDataFromFile(5, i, j);
			}
		}

		return masterUnit;

	}

}
