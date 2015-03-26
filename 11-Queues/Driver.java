public class Driver {

    public static void main( String[] args ) {

	myQueue<Integer> Q = new myQueue<Integer>();
	Q.enqueue(1);
	Q.enqueue(2);
	Q.enqueue(3);
	Q.enqueue(4);
	Q.enqueue(5);	
	System.out.println(Q);
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println(Q);
	System.out.println("empty: " + Q.empty());
	System.out.println(Q);
	System.out.println("head: " + Q.head());
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println("empty: " + Q.empty());
	System.out.println("head: " + Q.head());
	System.out.println("tail: " + Q.tail());
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println("head: " + Q.head());
	System.out.println("tail: " + Q.tail());
	Q.enqueue(1);
	Q.enqueue(2);
	Q.enqueue(3);
	Q.enqueue(4);
	Q.enqueue(5);	
	System.out.println(Q);
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println(Q);
	System.out.println("empty: " + Q.empty());
	System.out.println(Q);

    }

}
