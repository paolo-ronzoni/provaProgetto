package outputView;

import recommendationSystem.*;
import fileIO.IOMethods;


public class UserBasedTestResult {

	static double[][] doubleMatrix = {{23.2, 11.5, 18.23}, 
		  {7.89, 56.1, 1.00}};
static String path1 = "DataStore\\u1.txt";
static String path2 = "DataStore\\bookDataTab2dot1.txt";
static String splitExpression = "\\s+";
	
		
		
public static void main(String[] args) {

	String[][] myMatrix = IOMethods.txtMatrix(path2, splitExpression);
	// IOMethods.printMatrix(myMatrix, "%4s\t");
	int[][] secondMatrix = IOMethods.matrixConversion(myMatrix);
	// int[] matrix1 = IOMethods.columnExtractor(secondMatrix, 0);
	// IOMethods.printMatrix(secondMatrix, "%4s\t");


//	int elementFounded = MatrixBuilder.numberOfElement(secondMatrix, 0, 186);
//	System.out.println("element founded: " + elementFounded);
//	System.out.println("matrix length: " + secondMatrix.length);
	int [][] solutionMatrix = MatrixBuilder.matchIDchoices(secondMatrix, 0, 1, 3);
 IOMethods.printMatrix(solutionMatrix, "%4s\t");
 double nearestValue = 0;
 for (int k = 1; k <= 5; k++ ) 
 {
	 nearestValue = UserBasedNearestNeighbor.userNearestNeighborValue(secondMatrix, 0, 1, k);
	 // if (Double.isNaN(nearestValue)) {
	 System.out.println("value(1," + k + "): " + nearestValue);
	 //}
 } //end for
 
 nearestValue = UserBasedNearestNeighbor.userNearestNeighborValue(secondMatrix, 0, 2, 1);
 
     System.out.println("fatto! and nearest:" + nearestValue);
     
     double[][] predictionMatrix = UserBasedNearestNeighbor.predictionUserBasedValue(secondMatrix, 0, 1, 2, 1);
     IOMethods.printMatrix(predictionMatrix, "%4s\t");
     
     

	} // end main

} // end class
