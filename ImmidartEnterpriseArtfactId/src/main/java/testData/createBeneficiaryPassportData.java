package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryPassportData {

	@DataProvider(name = "createPassport")
	public static Object[][] getPassportData() {

		TestDataReader createPassportObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createPassportObj.getRowCount(4);
		int col = createPassportObj.getColCount(4, 0);

		Object[][] createPassport = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createPassport[i - 1][j] = createPassportObj.readDataFromFile(4, i, j);
			}
		}

		return createPassport;

	}

}
