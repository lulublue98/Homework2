public class myStack<E> {

    private Node top;
    private Node bottom;

    public myStack() {
	bottom = null;
	top = null;
    }

    public myStack( Node b ) {
	bottom = b;
	top = b;
    }

    public void push( E data ) {
	Node n = new Node(top, null, data);
        top.setNext(n);
	top = n;
    }

    public E pop() {
	if (bottom=null){
	    return top;
	}
        Node tmp = top;
	top.getPrev().setNext(null);
	return tmp;
    }

    public boolean empty() {
	if (bottom=null){
	    return true;
	}
	else 
	    return false;
    }

    public E top() {
	return top.getData();
    }

}
