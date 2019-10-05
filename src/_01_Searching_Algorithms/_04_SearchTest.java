package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = {"adsf", "das", "fsd", "ewr", "r", "yes"};
		
		assertEquals(1,_00_LinearSearch.linearSearch(array, "das"));
		assertEquals(0,_00_LinearSearch.linearSearch(array, "adsf"));
		assertEquals(4,_00_LinearSearch.linearSearch(array, "r"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {2,4,5,12,43,45,66,67,78,79,82,85,89,95};
		assertEquals(1,_01_BinarySearch.binarySearch(array, 1, 3, 4));
		assertEquals(4,_01_BinarySearch.binarySearch(array, 3, 9, 43));
		assertEquals(11,_01_BinarySearch.binarySearch(array, 0, 13, 85));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
