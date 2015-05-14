public class Heap {

    private Node[] heap;
    private int last;

    public Heap( Node root ) {
	heap = new Node[25];
	heap[0] = root;
	last = 1;
    }

    // preconditions: 
    // nodes.length <= 25
    // m is either "MAX" or "MIN"
    public Heap( Node[] nodes, String m ) {
	heap = new Node[];
	for (int i=0;i<nodes.length;i++) {
	    heap[i] = nodes[i];
	}
	if ( m.equals("MAX") ) {
	    this.maxSort();
	} else if ( m.equals("MIN") ) {
	    this.minSort();
	} else {
	    System.out.println("could not sort");
	} 
    }

    public void add( int d ) {
	Node n = new Node(d);
	heap[last] = n;
    }

    public void pushdown( Node n ) {
	for (int i=heap.length-1;i>=0;i--) {
	    
	}
    }

    public void minSort() {

    }

    public void maxSort() {
	
    }

    public static void main( String[] args ) {

    }

}
