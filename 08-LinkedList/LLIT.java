public class LLIT {

    private Node t;

    public LLIT( Node n ) {
	t = n;
    }

    public boolean hasNext() {
	return t!=null;
    }

    public int next() {
	int retval = t.getData();
	t=t.getNext();
	return retval;
    }

}

