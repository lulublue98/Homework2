public class LList {

    private Node link = null;
    private Node dummy;
    private int length;

    public LList() {
	dummy = new Node();
	dummy.setNext(link);
	length = 0;
    }

    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=link ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public int get( int n ) {
	Node tmp = link;
	for (int i=0;i<n;i++) {
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }

    public LLIT getLLIT() {
	LLIT i = new LLIT(link.getNext());
	return i;
    }

    public void add( int s ) {
	Node tmp = new Node(s);
	tmp.setNext(link);
	link = tmp;
	dummy.setNext(link);
	length = length + 1;
    }

    public void add( int n, int s ) {
	Node tmp = dummy;
	while ( n-1 > 0 ) {
	    tmp = tmp.getNext();
	    n--;
	}
	Node node = new Node(s);
	node.setNext(tmp.getNext());
	tmp.setNext(node);
	length = length + 1;
    }

    public String removeNodeAt( int n ) {
	String s;
	if ( n < 0 || n > length ) {
	    s = "index too large";
	    return s;
	}
	Node tmp = link;
	for (int i=0;i<n-1;i++) {
	    tmp = tmp.getNext();
	}
	s = "" + tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	length = length - 1;
	return s;
    }

    public boolean remove( int n ) {
	Node t1 = link.getNext();
	Node t2 = link; 
	boolean b = false;
        while ( b == false && t1.getNext() != null ) {
	    if ( t1.getData() == n ) {
		b = true;
	    } else {
		t2 = t1;
		t1 = t1.getNext();
	    }
	}
	if ( b = true ) {
	    t2.setNext(t1.getNext());
	}
	return b;
    }
    
    public int getLength() {
	return length;
    }

}
