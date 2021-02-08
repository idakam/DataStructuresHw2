package datastructureshw;


public class ToPowerQuestion {
	//Write a public static method called "toPower" that takes in size and power as parameters.
	//The method should return an array of size "size" with each array index raised to the value of "power."
	public static int[] toPower(int size, int power) {
		int[] returnedArray = new int[size];
		for (int i = 0; i < returnedArray.length; i++) {
			returnedArray[i] = 1;
			for (int j = 0; j < power; j++) {
				returnedArray[i] *= i;
			}
		}
		return returnedArray;
		

	}
}
