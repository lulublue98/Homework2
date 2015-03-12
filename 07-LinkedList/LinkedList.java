public class LinkedList {

    private Node n = null;
    
    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(n);
	n = tmp;
    }

    public String toString() {
	String s = "";
	Node tmp;
	for (tmp=n;tmp!=null;tmp=tmp.getNext()) {
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

}
