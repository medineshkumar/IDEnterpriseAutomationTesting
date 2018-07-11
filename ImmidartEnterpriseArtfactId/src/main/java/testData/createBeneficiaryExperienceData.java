package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryExperienceData {

	@DataProvider(name = "createExperience")
	public static Object[][] getExperienceData() {

		TestDataReader createExperienceObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\beneficiaryData.xls");

		int row = createExperienceObj.getRowCount(8);
		int col = createExperienceObj.getColCount(8, 0);

		Object[][] createExperience = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createExperience[i - 1][j] = createExperienceObj.readDataFromFile(8, i, j);
			}
		}

		return createExperience;

	}

}
