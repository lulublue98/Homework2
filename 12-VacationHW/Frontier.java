public class Frontier {

    private Queue<cors> Q;

    public Frontier() {
	Q = new Queue<cors>();
    }

    public boolean empty() {
	return Q.empty();
    }

    public void enqueue( int x, int y ) {
	cors data = new cors( x, y );
	Q.enqueue( data );
    }

    public Node<cors> dequeue() {
	return Q.dequeue();
    }

    public cors front() {
	return Q.head();
    }

}
