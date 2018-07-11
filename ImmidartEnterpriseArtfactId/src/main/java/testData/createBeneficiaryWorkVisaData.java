package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryWorkVisaData {

	@DataProvider(name = "createWorkVisa")
	public static Object[][] getWorkVisaData() {

		TestDataReader createWorkVisaObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createWorkVisaObj.getRowCount(5);
		int col = createWorkVisaObj.getColCount(5, 0);

		Object[][] createWorkVisa = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createWorkVisa[i - 1][j] = createWorkVisaObj.readDataFromFile(5, i, j);
			}
		}

		return createWorkVisa;

	}

}
