package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryTravelData {

	@DataProvider(name = "createTravel")
	public static Object[][] getTravelData() {

		TestDataReader createTravelObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createTravelObj.getRowCount(6);
		int col = createTravelObj.getColCount(6, 0);

		Object[][] createTravel = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createTravel[i - 1][j] = createTravelObj.readDataFromFile(6, i, j);
			}
		}

		return createTravel;

	}

}
