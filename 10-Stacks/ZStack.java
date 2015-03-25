public class ZStack<E> {

    private Node<E> s;

    public ZStack() {
	s = null;
    }

    public boolean empty() {
	return s == null;
    }

    public void push( E data ) {
	Node<E> tmp = new Node<E>(data);
	tmp.setNext(s);
	s = tmp;
    }

    public E pop() {				
	if ( empty() ) {
	    // throw exception
	}
	E tmp = s.getData();
	s = s.getNext();
	return tmp;
    }

    public E top() {
	if ( empty() ) {
	    // throw exception
	}
	return s.getData();
    }

}
