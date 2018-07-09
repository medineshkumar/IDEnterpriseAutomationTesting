package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createKnowledgeBaseData {

	@DataProvider(name = "knowledgeBaseData")
	public static Object[][] getKnowledgeBaseData() {

		TestDataReader knowledgeBaseObj = new TestDataReader("C:\\Users\\dinesh.r\\Desktop\\Automation\\EnterpriseTestData\\superadmin.xls");

		int row = knowledgeBaseObj.getRowCount(6);
		int col = knowledgeBaseObj.getColCount(6, 0);

		Object[][] knowledgeBase = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				knowledgeBase[i - 1][j] = knowledgeBaseObj.readDataFromFile(6, i, j);
			}
		}

		return knowledgeBase;

	}

}
