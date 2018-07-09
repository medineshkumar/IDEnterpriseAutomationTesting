package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createClaimMenuMappingData {

	@DataProvider(name = "createClaimMenuMapping")
	public static Object[][] getcreateClaimMenuMapping() {

		TestDataReader createClaimMenuMappingObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\configurationData.xls");

		int row = createClaimMenuMappingObj.getRowCount(12);
		int col = createClaimMenuMappingObj.getColCount(12, 0);

		Object[][] createClaimMenuMapping = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createClaimMenuMapping[i - 1][j] = createClaimMenuMappingObj.readDataFromFile(12, i, j);
			}
		}

		return createClaimMenuMapping;

	}

}
