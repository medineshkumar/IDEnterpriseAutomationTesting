package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryPersonalData {

	@DataProvider(name = "createPersonal")
	public static Object[][] getPersonalData() {

		TestDataReader createPersonalObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createPersonalObj.getRowCount(1);
		int col = createPersonalObj.getColCount(1, 0);

		Object[][] createPersonal = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createPersonal[i - 1][j] = createPersonalObj.readDataFromFile(1, i, j);
			}
		}

		return createPersonal;

	}

}
