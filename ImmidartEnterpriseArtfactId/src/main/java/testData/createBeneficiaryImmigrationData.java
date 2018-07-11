package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryImmigrationData {

	@DataProvider(name = "createImmigration")
	public static Object[][] getImmigrationData() {

		TestDataReader createImmigrationObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createImmigrationObj.getRowCount(7);
		int col = createImmigrationObj.getColCount(7, 0);

		Object[][] createImmigration = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createImmigration[i - 1][j] = createImmigrationObj.readDataFromFile(7, i, j);
			}
		}

		return createImmigration;

	}

}
