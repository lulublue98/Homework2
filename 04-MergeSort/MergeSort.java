import java.util.*;

public class MergeSort {
    
    public ArrayList<Integer> merge( ArrayList<Integer> a, ArrayList<Integer> b ) {
	ArrayList<Integer> merged= new ArrayList<Integer>();
	while ( a.size() > 0 && b.size() > 0 ) {
	    if ( a.get(0) < b.get(0) ) {
		merged.add(a.get(0));
		a.remove(0);
	    } else {
		merged.add(b.get(0));
		b.remove(0);
	    }
	}
	if (a.size()==0 && b.size()!=0){
	    for (int i=0;i<b.size();i++){
		merged.add(b.get(i));
	    }
	}
	if (a.size()!=0 && b.size()==0){
	    for (int i=0;i<a.size();i++){
		merged.add(a.get(i));
	    }
	}
	return merged;
    }
 
    public ArrayList<Integer> mergesort( ArrayList<Integer> m ) {
	if ( m.size() <= 1 ) {
	    return m;
	} else {
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    ArrayList<Integer> b = new ArrayList<Integer>();
	    for (int i=0;i<m.size()/2;i++) {
		a.add(m.get(i));
	    }
	    for (int j=a.size()/2;j<m.size();j++) {
		b.add(m.get(j));
	    }
	    ArrayList<Integer> r1 = mergesort(a);
	    ArrayList<Integer> r2 = mergesort(b);
	    return merge(r1, r2);
	}
    }

    public static void main( String[] args ) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	for (int i=0; i<10; i++) {
	    a.add(i);
	    b.add(i*2);}
	MergeSort M = new MergeSort();
	ArrayList<Integer> c = M.merge(a, b);
	System.out.println(c);
    }
    
}
