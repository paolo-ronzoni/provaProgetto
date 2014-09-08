package outputView;

import inProcessing.FormulaBuilding;
import recommendationSystem.ItemBasedNearestNeighbor;
import recommendationSystem.MatrixBuilder;
import recommendationSystem.UserBasedNearestNeighbor;
import fileIO.IOMethods;

public class ItemBasedTestResult {

	static double[][] doubleMatrix = {{23.2, 11.5, 18.23}, 
		  {7.89, 56.1, 1.00}};
static String path1 = "DataStore\\u1.txt";
static String path2 = "DataStore\\provaFinale.txt";
static String splitExpression = "\\s+";
	
		
		
public static void main(String[] args) {

	String[][] myMatrix = IOMethods.txtMatrix(path1, splitExpression);
	// IOMethods.printMatrix(myMatrix, "%4s\t");
	int[][] secondMatrix = IOMethods.matrixConversion(myMatrix);
	
	double [][] solutionMatrix = ItemBasedNearestNeighbor.predictionItemBasedValue(secondMatrix, userColumnNumber, userSearched, itemcolumnNumber, itemSearched)(secondMatrix, 0, 1, 5);
IOMethods.printMatrix(solutionMatrix, "%4s\t");

		double  itemBasedValue = ItemBasedNearestNeighbor.adjustedCosineSimilarity(secondMatrix, 0, 1, 5);
		System.out.println("ItemBasedValue: " + itemBasedValue);
		
		double  itemBasedValue2 = ItemBasedNearestNeighbor.cosineSimilarity(secondMatrix, 0, 1, 5);
		System.out.println("ItemBasedValue2: " + itemBasedValue2);
		
//		double  itemBasedValueBis;
//		for ( int i = 1; i < 1682; i++) {
//			itemBasedValueBis = ItemBasedNearestNeighbor.cosineSimilarity(secondMatrix, 0, 22, i);
//			System.out.println("ItemBasedValue: " + itemBasedValueBis);
//		}
//		
		
	} // end main

}// end class
