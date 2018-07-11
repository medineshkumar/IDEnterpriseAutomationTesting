package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryAddressData {

	@DataProvider(name = "createAddress")
	public static Object[][] getAddressData() {

		TestDataReader createAddressObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createAddressObj.getRowCount(2);
		int col = createAddressObj.getColCount(2, 0);

		Object[][] createAddress = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createAddress[i - 1][j] = createAddressObj.readDataFromFile(2, i, j);
			}
		}

		return createAddress;

	}

}
