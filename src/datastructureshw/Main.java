package datastructureshw;

import java.util.Arrays;

public class Main {
	//Find output of following function:
	public static void main(String[] args) {
		double[ ] exampleArray = {1,5,6,5,4,1};
    	double maximum = exampleArray[0];
    	int index = 0;
    	for (int i = 1; i<exampleArray.length; i++){
    			if (exampleArray[ i ] > maximum) {
    				maximum = exampleArray[ i ];
    				index = i;
    			}
         }

    	System.out.println(index);
    	//Returns the index position of the largest value in the array
    
    	//Testing for sum from ArrayQuestion
    	int [] newArray = {4,3,2,5,1,86};
		int answerOne = ArrayQuestion.arraySum(newArray);
		System.out.println(answerOne);
		
		//Testing toPowers program
		System.out.println(Arrays.toString(ToPowerQuestion.toPower(4,2)));
	}
}
	


