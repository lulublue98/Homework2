public class Driver {
    
    public static void main( String[] args ) {

	Node n = new Node("Hello");
	System.out.println(n);
	Node m = new Node("Goodbye");
	n.setNext(m);
	System.out.println(n.getNext());

    }

}
