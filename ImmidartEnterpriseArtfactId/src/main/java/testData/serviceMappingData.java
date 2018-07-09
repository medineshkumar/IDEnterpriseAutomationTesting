package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class serviceMappingData {

	@DataProvider(name = "serviceMapping")
	public static Object[][] getserviceMappingData() {

		TestDataReader serviceMappingObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = serviceMappingObj.getRowCount(4);
		int col = serviceMappingObj.getColCount(4, 0);

		Object[][] serviceMapping = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				serviceMapping[i - 1][j] = serviceMappingObj.readDataFromFile(4, i, j);
			}
		}

		return serviceMapping;

	}

}
