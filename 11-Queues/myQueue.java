public class myQueue<E> {

    private Node<E> front;
    private Node<E> back;

    public myQueue() {
	front = null;
	back = null;
	front.setNext(back);
	back.setPrev(front);
    }

    public void enqueue(E data) {
        if ( empty() ) {
	    front = new Node<E>(data);
	    front.setNext(back);
	    back.setPrev(front);
	} else {
	    Node<E> tmp = new Node<E>(data);
	    back.setNext(tmp);
	    tmp.setPrev(back);
	    back = tmp;
	}
    }

    public E dequeue() { 				
	if ( empty() ) {
	    return null;
	}
        E tmp = front.getData();
	front = front.getNext();
	return tmp;
    }

    public boolean empty() { 
	return front == null;
    }

    public E head() {
	return front.getData();
    }

    public String toString() {
	String s = "";
	Node<E> tmp = front;
	while ( tmp != null ) {
	    s = s + tmp.getData() + " <-- ";
	    tmp = tmp.getNext();
	}
	s = s + "null";
	return s;
    }

}
