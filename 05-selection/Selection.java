import java.util.*;
import java.io.*;

public class Selection {

    public int select( int k, int[] A, int L, int H ) {
	int pivot = A[L];
	int[] temp == new int[A.length-1];
	temp[H] = pivot;
	for (int i=0;i<A.length;i++) {
	    if ( A[i] > pivot ) {
		temp[H] = A[i];
		H = H - 1;
	    } else {
		temp[L] = A[i];
		L = L + 1;
	    }
	}
	if ( k != ) {
	    select( k, temp, 0, pivot );
	}
	return temp[k];
    }

    public static void main(String[] args) {
	int[] a = { 1, 0, 9, 8, 5, 
		    3, 4, 7, 2, 6 };
	Selection s = new Selection();
	System.out.println(s.select(3,a, 0, a.length - 1));
    }

}
