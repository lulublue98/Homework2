public class LList2 {

    private Node link = null;

    public void add( String s ) {
	Node tmp = new Node(s);
	tmp.setNext(link);
	link = tmp;
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

    public Node find( int n ) {
	Node tmp = link;
	for (int i=0;i<n;i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public void insert( int n, String s ) {
	Node tmp = link;
	for (int i=0;i<n-1;i++) {
	    tmp = tmp.getNext();
	}
	Node node = new Node(s);
	node.setNext(tmp.getNext());
	tmp.setNext(node);
    }

}
