public class BST {

    private Node root;
    
    public BST( Node n ) {
	root = n;
    }

    public void insert( int i ) {
	Node tmp = root;
	boolean in = false;
	while ( in == false ) {
	    if ( tmp.isFull() == true ) {
		if ( i > tmp.getData() ) {
		    tmp = tmp.getRight();
		} else {
		    tmp = tmp.getLeft();
		}
	    } else {
		Node x = new Node( i, tmp );
		if ( i > tmp.getData() ) {
		    tmp.addR(x);
		} else {
		    tmp.addL(x);
		}
		in = true;
	    }
	}
    }

    public Node search( int i ) {
	Node tmp = root;
	while ( tmp.isLeaf() == false ) {
	    if ( tmp.getData() == i ) {
		return tmp;
	    } else if ( i > tmp.getData() ) {
		if ( tmp.getRight() == null ) {
		    return null;
		} else {
		    tmp = tmp.getRight();
		}
	    } else {
		if ( tmp.getLeft() == null ) {
		    return null;
		} else {
		    tmp = tmp.getLeft();
		}
	    }
	}
	return null;
    }

    public String toString() {
	
    }

    public static void main( String[] args ) {
	Node N = new Node(25);
	BST tree = new BST(N);
	tree.insert(4);
    }

}
