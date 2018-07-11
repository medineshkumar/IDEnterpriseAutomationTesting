package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryQualificationData {

	@DataProvider(name = "createQualification")
	public static Object[][] getQualificationData() {

		TestDataReader createQualificationObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createQualificationObj.getRowCount(3);
		int col = createQualificationObj.getColCount(3, 0);

		Object[][] createQualification = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createQualification[i - 1][j] = createQualificationObj.readDataFromFile(3, i, j);
			}
		}

		return createQualification;

	}

}
