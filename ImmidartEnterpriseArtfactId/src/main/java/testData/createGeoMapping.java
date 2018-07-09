package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createGeoMapping {

	@DataProvider(name = "createGeoMapping")
	public static Object[][] getcreateGeoMapping() {

		TestDataReader createGeoMappingObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\configurationData.xls");

		int row = createGeoMappingObj.getRowCount(14);
		int col = createGeoMappingObj.getColCount(14, 0);

		Object[][] createGeoMapping = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createGeoMapping[i - 1][j] = createGeoMappingObj.readDataFromFile(14, i, j);
			}
		}

		return createGeoMapping;

	}

}
