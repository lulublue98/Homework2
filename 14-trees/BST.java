import java.util.*;
import java.io.*;

public class BST {

    private Node root;
    
    public BST( Node n ) {
	root = n;
    }

    public void insert( int i ) {
	Node tmp = root;
	boolean in = false;
	while ( in == false ) {
	    if ( tmp.isLeaf() == true ) {
		Node x = new Node( i, tmp );
		if ( i >= tmp.getData() ) {
		    tmp.addR(x);
		} else {
		    tmp.addL(x);
		}
		in = true;
	    } else if ( i >= tmp.getData() && tmp.getRight() == null ) {
		Node x = new Node( i, tmp );
		tmp.addR(x);
		in = true;
	    } else if ( i < tmp.getData() && tmp.getLeft() == null ) {
		Node x = new Node( i, tmp );
		tmp.addL(x);
		in = true;
	    } else {
		if ( i >= tmp.getData() ) {
		    tmp = tmp.getRight();
		} else {
		    tmp = tmp.getLeft();
		}
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
	Node tmp = t;
	if ( tmp == null ) {
	    return "";
	} else {
	    return traverse(t.getLeft()) +
		t.getData() + ", " +
		traverse(t.getRight());
	}
    }
    
    public String toString() {
	return traverse(root);
    }
    
    public String remove( int i ) {
	t1 = search( i, root );
	t2 = t1.getParent();
	if ( t1 == null ) {
	    return "not found";
	} else if ( t1.isLeaf() == true ) {
	    if ( t1 == t2.getLeft() ) {
	        t2.rmChildL();
	    } else {
		t2.rmChildR();
	    }
	} else if ( t1.getLeft() != null && t1.getRight() == null ) {
	    
	} else if ( t1.getRight() != null && t1.getLeft() == null ) {

	} else {

	}
    }

    public static void main( String[] args ) {
	Node N = new Node(25);
	BST tree = new BST(N);
	Random r = new Random();
	for ( int i = 0; i < 10; i++ ) {
	    int x = r.nextInt(50);
	    tree.insert(x);
	}
	System.out.println(tree);
    }

}
