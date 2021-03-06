package outputView;

import recommendationSystem.*;
import fileIO.IOMethods;

import java.util.Arrays;

/* This class test the formula pred(a,p) against the recommender systems database u.txt: 100,000 ratings (1-5) from 943 users on 1682 movies.
 */

public class Test_05_UserBased {

	static String path1 = "DataStore\\u.txt";
	static String splitExpression = "\\s+";
		
			
			
	public static void main(String[] args) {

		String[][] myMatrix = IOMethods.txtMatrix(path1, splitExpression);

		
//---input elements for the formula of userBasedSiamilarity------

// the rectangular matrix of user, items and ratings
int[][] secondMatrix = IOMethods.matrixConversion(myMatrix);
int columnOfUsers = 0; // the column, in the rectangular input matrix, with the users number
int firstUser = 1; // the first user to compute the similarity
int secondUser = 2;
int itemColumnNumber = 1;
int itemSearched = 34;
int numOfNearestNeighbor = 2;
double predictedUserBasedValue;

System.out.printf("This section test the formula pred(a,p) against the database u.txt\nwhen the user change but the item searched and the num of rating used\nare constant:\n\n");

for( firstUser = 100; firstUser <= 200; firstUser++) 
{
	predictedUserBasedValue = UserBasedNearestNeighbor.predictionUserBasedValue(secondMatrix, columnOfUsers, firstUser, itemColumnNumber, itemSearched, numOfNearestNeighbor);
		System.out.printf("PredictionUserValue (user=%3d,item=%3d,numOfRating=%s):%6.2f\n", firstUser, itemSearched, numOfNearestNeighbor, predictedUserBasedValue);
}

System.out.println("\n-----End of computation-----"); 

	} // end main
} // end class Test_05_UserBased
