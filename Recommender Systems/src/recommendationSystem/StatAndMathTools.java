package recommendationSystem;

import java.util.*;
import java.awt.Toolkit;

public class StatAndMathTools {
	 
	
	/** 
	 * @param inputMatrix an input matrix of type int
	 * @param columnNumber column where to do the computation
	 * @return the average of the chosen column 
	 * @author Paolo Ronzoni
	 */
	public static double matrixColumnAverage(int[][] inputMatrix, int columnNumber) {		
		
		int numberOfRows = inputMatrix.length;
		double sumOfValues = 0;
			
		for (int row = 0; row < numberOfRows  ; row++)
		{
		    sumOfValues += inputMatrix[row][columnNumber];	    
			 
		} // end outer for 		
		
		return sumOfValues/numberOfRows;
	 } // end method matrixColumnAverage
	
	/** @Overrides
	 * @param inputMatrix an input matrix of type int
	 * @param columnNumber column where to do the computation
	 * @return the average of the chosen column 
	 * @author Paolo Ronzoni
	 */
	public static double matrixColumnAverage(double[][] inputMatrix, int columnNumber) {		
		
		int numberOfRows = inputMatrix.length;
		double sumOfValues = 0;
			
		for (int row = 0; row < numberOfRows  ; row++)
		{
		    sumOfValues += inputMatrix[row][columnNumber];	    
			 
		} // end outer for 		
		
		return sumOfValues/numberOfRows;
	 } // end method matrixColumnAverage
	
	/** 
	 * @param dataArray a multidimensional array of type double
	 * @param columnSorting the number of the column used to sort
	 * @return dataArray the multidimensional array sorted respects the columnSorting
	 * @author Paolo Ronzoni
	 */
	public static double[][] sortMultidimensionArray(double[][] dataArray, int columnSorting) {
		int numberOfColumn = dataArray[0].length;
		int minIndex;
		double tmp;
		
		for ( int i = 0; i < dataArray.length - 1; i++) 
		{			
			minIndex = i;			
			for (int j = i + 1; j < dataArray.length ; j++)  {
				
			 if ( dataArray[j][columnSorting] < dataArray[minIndex][columnSorting]) {
				 
				 for (int column = 0; column < numberOfColumn; column++) {
					tmp = dataArray[minIndex][column];
					dataArray[minIndex][column] = dataArray[j][column];
					dataArray[j][column] = tmp;}

			 } // end if				
			} // end inner for			
		} //end outer for	
		
	 return dataArray;
	} //end method sortMultidimensionArray
	
	
	/** 
 	 * @param element an array of type int
 	 * @return the maximum value of the array  
 	 * 
 	 */
 	public static double maxValue(int[] element) {
 		int max = element[0];
 		for (int ktr = 0; ktr < element.length; ktr++) {
 			if (element[ktr] > max) {
 				max = element[ktr];
 			}
 		}
 		return max;
 	} // end method maxValue
 	
 	/** 
 	 * @param element an array of type int
 	 * @return the minimum value of the array  
 	 * 
 	 */
 	public static double minValue(int[] element) {
 		int min = element[0];
 		for (int ktr = 0; ktr < element.length; ktr++) {
 			if (element[ktr] < min) {
 				min = element[ktr];
 			}
 		}
 		return min;
 	} // end method minValue
 	
 	
 	/** 
 	 * @param element an array of type double
 	 * @return the maximum value of the array  
 	 * 
 	 */
 	public static double maxValue(double[] element) {
 		double max = element[0];
 		for (int ktr = 0; ktr < element.length; ktr++) {
 			if (element[ktr] > max) {
 				max = element[ktr];
 			}
 		}
 		return max;
 	} // end method maxValue
 	
 	/** 
 	 * @param element an array of type double
 	 * @return the minimum value of the array  
 	 * 
 	 */
 	public static double minValue(double[] element) {
 		double min = element[0];
 		for (int ktr = 0; ktr < element.length; ktr++) {
 			if (element[ktr] < min) {
 				min = element[ktr];
 			}
 		}
 		return min;
 	} // end method minValue
 	
 	
 	public static void getTime(String comment) {
 		Toolkit.getDefaultToolkit().beep();
		Date date = new Date();
		System.out.println(comment + ": " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() );
	}

} // end calss StatAndMathTools

