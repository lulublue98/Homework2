public class LinkedList {

    private Node n = null;
    
    public void add(Node s) {
	Node tmp = new Node(s);
	tmp.setNext(n);
	n = tmp;
    }

    public String toString() {
	String s = "";
	Node tmp;
	for (tmp=temp;tmp!=null;tmp=tmp.getNext()) {
	    s = s + tmp + "-->";
	}
	s = s + "null";
	return s;
    }

}
