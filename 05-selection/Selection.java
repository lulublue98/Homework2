import java.util.*;

public class Selection {
    
    public int[] list;
    
    public Selection( int[] l ) {
	list = l;
    }

    public int select( int k, int[] l ) {
	int[] temp = new int[l.length];
	int pivot = l[0];
	int endnum = l.length - 1;
	int frontnum = 0;
	for (int i=0;i<l.length;i++) {
	    if ( l[i] > pivot ) {
		temp[endnum] = l[i];
		endnum = endnum - 1;
	    } else {
		temp[frontnum] = l[i];
		frontnum = frontnum + 1;
	    }
	}
	if ( temp[k] != pivot ) {
	    int[] temp2 = new int[Arrays.asList(temp).indexOf(pivot)];
	    for (int j=0;j<=Arrays.asList(temp).indexOf(pivot);j++) {
		temp2[j] = temp[j];
	    }
	    select( k, temp2 );
	}
	return temp[k];
    }

    public static void main(String[] args) {
	int[] c = { 1, 0, 9, 8, 5, 
		    3, 4, 7, 2, 6 };
	Selection s = new Selection(c);
	System.out.println(s.select(3,c));
    }

}
