package no.hvl.dat102.oppg3;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
    	if (min < max) {
        int midten = finnPartisjon(data, min, max);
        quickSort(data, min, midten - 1);
        quickSort(data, midten + 1, max);
    	}
    }

    public static <T extends Comparable<T>> void quickSort(T[] data) { 
        quickSort(data, 0, data.length-1); 
    }
	
}
