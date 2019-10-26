package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int n = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				n++;
			}
		}

		return n;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (tallest < peeps.get(i)) {
				tallest = peeps.get(i);
			}
		}

		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String word = "";
		for (int i = 0; i < words.size(); i++) {
			if (word.length() < words.get(i).length()) {
				word = words.get(i);
			}
		}

		return word;
	}

	public static Boolean containsSOS(List<String> message) {
		String SOS = " ... --- ... ";
		for (int i = 0; i < message.size(); i++) {
			if (message.contains(SOS)) {
				return true;
			}
		}

		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double[] array = results.toArray(new Double[results.size()]);
		// make a for loop that starts at 1 and goes through
		// the length of the list
		for (int i = 1; i < array.length ; i++) {
			// make another for loop that starts at i and counts down
			// while j is greater than 0
			for (int j = i; j > 0; j--) {
				// if the element at j is less than the element at j - 1,
				// then swap them
				int j2 = j - 1;
				if (array[j] < array[j2]) {
					double s = array[j];
					array[j] = array[j2];
					array[j2] = s;
				}
			}
		}
		List<Double> results2 = Arrays.asList(array);
		return results2;
	}
	
	
	public static List<String> sortDNA(List<String> unsortedSequences){
		String[] array = unsortedSequences.toArray(new String[unsortedSequences.size()]);
		// make a for loop that starts at 1 and goes through
		// the length of the list
		for (int i = 1; i < array.length ; i++) {
			// make another for loop that starts at i and counts down
			// while j is greater than 0
			for (int j = i; j > 0; j--) {
				// if the element at j is less than the element at j - 1,
				// then swap them
				int j2 = j - 1;
				if (array[j].length() < array[j2].length()) {
					String s = array[j];
					array[j] = array[j2];
					array[j2] = s;
				}
			}
		}
		List<String> unsortedSequences2 = Arrays.asList(array);
		return unsortedSequences2;
	}
	public static List<String> sortWords(List<String> words){
	
		String[] array = words.toArray(new String[words.size()]);
		// make a for loop that starts at 1 and goes through
		// the length of the list
		for (int i = 1; i < array.length ; i++) {
			// make another for loop that starts at i and counts down
			// while j is greater than 0
			for (int j = i; j > 0; j--) {
				// if the element at j is less than the element at j - 1,
				// then swap them
				int j2 = j - 1;
				if ( array[j].compareTo(array[j2])<0) {
					String s = array[j];
					array[j] = array[j2];
					array[j2] = s;
				}
			}
		}
		List<String> words2 = Arrays.asList(array);
		return words2;		
	
	}
	
	
	
}