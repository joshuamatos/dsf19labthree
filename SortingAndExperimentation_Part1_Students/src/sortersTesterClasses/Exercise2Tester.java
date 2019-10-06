package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class Exercise2Tester {
	public static void main(String[] args) { 
		Integer[] numarr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		Integer[] original = numarr;
		Sorter<Integer> sorter1 = new BubbleSortSorter<Integer>();
		showArray("\n ---Original array of size " + numarr.length + " to sort:", original);
		
		sorter1.sort(numarr, new IntegerComparator1());
		
		showArray("\n ---Original array of size " + numarr.length + " to sort:", original);
		
		sorter1.sort(numarr, new IntegerComparator2());
		
		showArray("\n ---Original array of size " + numarr.length + " to sort:", original);
		
		
		
		
	}
	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}

}
