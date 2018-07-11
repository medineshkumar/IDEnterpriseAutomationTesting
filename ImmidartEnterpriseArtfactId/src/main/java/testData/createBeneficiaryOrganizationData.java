package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryOrganizationData {

	@DataProvider(name = "createOrganization")
	public static Object[][] getOrganizationData() {

		TestDataReader createOrganizationObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createOrganizationObj.getRowCount(0);
		int col = createOrganizationObj.getColCount(0, 0);

		Object[][] createOrganization = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createOrganization[i - 1][j] = createOrganizationObj.readDataFromFile(0, i, j);
			}
		}

		return createOrganization;

	}

}
