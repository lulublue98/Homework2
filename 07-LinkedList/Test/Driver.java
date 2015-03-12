public class Driver {
    
    public static void main( String[] args ) {

	Node a = new Node("Robin");
	//System.out.println(a);

	Node b = new Node("Raven");
	a.setNext(b);
	//System.out.println(a.getNext());

	a.getNext().setNext(new Node("Cyborg"));
	//System.out.println(b.getNext());

	Node c = new Node("Starfire");
	c.setNext(a);
	a = c;
	/*
	System.out.println(a);
	System.out.println(a.getNext());
	System.out.println(a.getNext().getNext());
	System.out.println(a.getNext().getNext().getNext());
	*/

	Node tmp = a;
	while(tmp != null) {
	    System.out.print(tmp+", ");
	    tmp = tmp.getNext();
	}
	System.out.println();

	for(tmp=a;tmp!=null;tmp=tmp.getNext()){
	    System.out.print(tmp+", ");
	}
	System.out.println();

    }

}
