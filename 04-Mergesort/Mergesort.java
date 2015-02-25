public class Mergesort {

    public Arraylist<Integer> one, two;
    public Arraylist<Integer> merge;

    public Mergesort( Arraylist<Integer> a, Arraylist<Integer> b ) {
	one = a;
	two = b;
    }

    public Arraylist<Integer> mergesort( Arraylist<Integer> a, Arraylist<Integer> b ) {
	while ( a.size() > 0 && b.size() > 0 ) {
	    if ( a.get(0) > b.get(0) ) {
		merge.add(a.get(0));
	    } else if ( b.get(0) > a.get(0) ) { 
		merge.add(b.get(0));
	    } else {
		merge.add(a.get(0));
	    }
	}
	
    }

    public static void main( String[] args ) {
	Mergesort M = new Mergesort();
	Arraylist<Integer> a = M.mergesort();
	System.out.println(a);
    }

}
