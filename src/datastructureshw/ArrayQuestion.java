package datastructureshw;

public class ArrayQuestion {
	//Write program to sum all values of given Array
	public static int arraySum(int[] numbers){
		int mySum = 0;
		for(int i=0; i < numbers.length; i++) {
			mySum += numbers[i];
		}
		return mySum;
	}
		
}
