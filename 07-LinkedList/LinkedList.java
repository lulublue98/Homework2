public class LinkedList {

    private Node temp = null;
    
    public void add(Node n) {
	temp = new Node(l);
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
