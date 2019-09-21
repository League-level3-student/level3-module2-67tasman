package _00_Sorting_Algorithms;

public class InsertionSorter extends Sorter {
	public InsertionSorter() {
		type = "Insertion";
	}
	
	// Insertion Sort is similar to Bubble Sort but a little more efficient
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {		
		//1. make a for loop that starts at 1 and goes through 
		// the length of the array 
for (int i = 1; i < array.length; i++) {
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0
	for (int j = i; j >0; j--) {
				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
		int j2 = j-1;
		if(array[j]<array[j2]) {
			int s = array[j];
			array[j]=array[j2];
			array[j2]=s;
		}
		display.updateDisplay();
	}
	
}	
}
}
