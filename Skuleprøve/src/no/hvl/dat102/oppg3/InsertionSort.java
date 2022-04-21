package no.hvl.dat102.oppg3;

public class InsertionSort {

	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
	    for (int i = start + 1; i <= slutt; i++) {
	        T temp = a[i];
	        int j = i - 1;
	        
	        while (j >= 0) { 
	            if (temp.compareTo(a[j]) < 0) {
	                a[j + 1] = a[j];
	                j--;
	            } else {
	                break;
	            }
	        }
	        a[j+1] = temp;
	        System.out.println(a);
	    }
	}
	
	public static void main(String[] args) {
		Integer[] tabell = {4,1,7,3,2};
		
		sorteringVedInssetting(tabell, 0, tabell.length-1);
	}
 
}
