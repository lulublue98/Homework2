public class LList {

    private Node link = null;
    private Node dummy;
    private int length;

    public LList() {
	dummy = new Node("");
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

    public Node get( int n ) {
	Node tmp = link;
	for (int i=0;i<n;i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public void add( String s ) {
	Node tmp = new Node(s);
	tmp.setNext(link);
	link = tmp;
	dummy.setNext(link);
	length = length + 1;
    }

    public void add( int n, String s ) {
	Node tmp = dummy;
	while ( n-1 > 0 ) {
	    tmp = tmp.getNext();
	    n--;
	}
	Node node = new Node(s);
	node.setNext(tmp.getNext());
	Node nd = tmp.getNext();
	nd = node;
	tmp.setNext(node);
	length = length + 1;
    }

    public int getLength() {
	return length;
    }

}
