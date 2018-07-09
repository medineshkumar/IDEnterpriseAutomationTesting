package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createMasterServiceData {

	@DataProvider(name = "createMasterService")
	public static Object[][] getMasterServiceData() {

		TestDataReader createMasterServiceObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = createMasterServiceObj.getRowCount(2);
		int col = createMasterServiceObj.getColCount(2, 0);

		Object[][] createMasterService = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createMasterService[i - 1][j] = createMasterServiceObj.readDataFromFile(2, i, j);
			}
		}

		return createMasterService;

	}

}
