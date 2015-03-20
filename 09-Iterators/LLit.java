import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E> {

    private Node<E> c;
    private Node<E> b;
    private Node<E> a;

    public LLit(Node<E> n) {
	c=n;
    }

    public boolean hasNext() {
	return c != null;
    }

    public E next() {
	E retval = c.getData();
	a = b;
	b = c;
	c=c.getNext();
	return retval;
    }

    public void remove() {
        a.setNext(c);
	b = c;
	c = c.getNext();
    }

}
