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

    public Node search( int i, Node t ) {
	if ( t == null || t.getData() == i ) {
	    return t;
	} else if ( t.getData() < i ) {
	    return search( i, t.getRight() );
	} else {
	    return search( i, t.getLeft() );
	}
    }

    public String search( int i ) {
	String end = "" + search( i, root );
	if ( end == null ) {
	    return "Not Found";
	} else {
	    return end;
	}
    }
    
    public String traverse( Node t ) {
	String end = "";
	Node tmp = t;
	if ( tmp.isLeaf() == true ) {
	    end = end + tmp;
	} else if ( tmp.isFull() == true ) {
	    end = end + tmp + "\n"
		+ traverse(tmp.getLeft()) + "  " + traverse(tmp.getRight());
	} else {
	    if ( tmp.getLeft() == null ) {
		end = end + tmp + "\n"
		    + tmp.getRight();
	    } else {
		end = end + tmp + "\n"
		    + tmp.getLeft();
	    }
	}
	return end;
    }
    
    public String toString() {
	return traverse(root);
    }
    
    public static void main( String[] args ) {
	Node N = new Node(25);
	BST tree = new BST(N);
	tree.insert(4);
	tree.insert(30);
	System.out.println(tree);
     	System.out.println(tree.search(4));
    }

}
