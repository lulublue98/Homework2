public class Selection {
    
    public int[] list;
    
    public Selection( int[] l ) {
	list = l;
    }

    public int select( int k, int[] l ) {
	int[] temp = new int[l.length];
	int pivot = l[0];
	for (int i=0;i<l.length;i++) {
	    if ( l[i] > pivot ) {

	    } else {

	    }
	}
	if ( temp[k] != pivot ) {
	    select( int k, temp );
	}
	return temp[k];
    }

}
