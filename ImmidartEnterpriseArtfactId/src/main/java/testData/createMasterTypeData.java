package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createMasterTypeData {

	@DataProvider(name = "createMasterType")
	public static Object[][] getMasterTypeData() {

		TestDataReader createMasterTypeObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = createMasterTypeObj.getRowCount(3);
		int col = createMasterTypeObj.getColCount(3, 0);

		Object[][] createMasterType = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createMasterType[i - 1][j] = createMasterTypeObj.readDataFromFile(3, i, j);
			}
		}

		return createMasterType;

	}

}
