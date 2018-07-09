package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createCustomerProjectDetails {

	@DataProvider(name = "createCustomerProjectDetails")
	public static Object[][] getcreateCustomerProjectDetails() {

		TestDataReader createBenificiaryObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\organisationData.xls");

		int row = createBenificiaryObj.getRowCount(1);
		int col = createBenificiaryObj.getColCount(1, 0);

		Object[][] createBenificiary = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createBenificiary[i - 1][j] = createBenificiaryObj.readDataFromFile(1, i, j);
			}
		}

		return createBenificiary;

	}

}
