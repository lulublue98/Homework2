public class Node<E> {

    private E data;
    private Node<E> next;
    private Node<E> prev;

    public Node() {
	data = null;
	next = null;
	prev = null;
    }

    public Node( E s ) {
	data = s;
	next = null;
	prev = null;
    }

    public Node( Node p, Node n,  E s ) {
	data = s;
	next = n;
	prev = p;
    }

    public void setData( E s ) { 
	data = s;
    }

    public E getData() {
	return data;
    }

    public void setNext( Node<E> n ) {
	next = n;
    }

    public Node<E> getNext() {
	return next;
    }

    public String toString() {
	return ""+data;
    }

}
