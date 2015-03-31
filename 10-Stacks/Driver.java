public class Driver {

    public static void main( String[] args ) {

	Node<Integer> n = new Node<Integer>(3);
	myStack<Integer> s = new myStack<Integer>(n);
	s.push(4);
	s.push(5);
	System.out.println(s);
	System.out.println("pop: " + s.pop());
	System.out.println(s);
	System.out.println("empty: " + s.empty());
	System.out.println("top: " + s.top());
	System.out.println("pop: " + s.pop());
	System.out.println("pop: " + s.pop());
	System.out.println(s);
	System.out.println("empty: " + s.empty());
	System.out.println("top: " + s.top());
	s.push(6);
	System.out.println(s);
	System.out.println("top: " + s.top());
	System.out.println("empty: " + s.empty());
    }

}
