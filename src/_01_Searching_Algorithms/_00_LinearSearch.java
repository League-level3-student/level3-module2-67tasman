package _01_Searching_Algorithms;

public class _00_LinearSearch {
	// When finding the location of a certain element in an array, 
	// there are many algorithms that can do so. The simplest is the
	// linear search. This is best for short unsorted lists of data.
	public static int linearSearch(String[] words, String value) {
		//1. Complete the method using a for loop to find the value
		//   in the array. Return the location in the array
		//   where the value was found.
		//   If the value is not found in the array, return -1.
		boolean b = false;
		int j = 0;
		for (int i = 0; i < words.length - 1; i++) {
			if(words[i] == value) {
				b = true;
				j = i;
			}
		}
		if(b==true) {
			return j;
		}
		if(b==false) {
			return -1;
		}
		return 0;
		
	
	}
}
