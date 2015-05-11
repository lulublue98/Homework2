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
    
    public int numNodes( Node t ) {
	if ( t == null ) {
	    return 0;
	} else {
	    return 1 + numNodes(t.getLeft()) + numNodes(t.getRight());
	}
    }
    public int size() {
	return numNodes( root );
    }

    public String toString() {
	return traverse(root);
    }
    
    public int maxValue() {
	Node tmp = root;
	while ( tmp.getRight() != null ) {
	    tmp = tmp.getRight();
	}
	return tmp.getData();
    }

    // this method is broken
    public void remove( int i ) {
	Node t1 = search( i, root );
	Node t2 = t1.getParent();
	if ( t1 == null ) {
	    System.out.println("not found");
	} else if ( t1.isLeaf() == true ) {
	    if ( t1 == t2.getLeft() ) {
	        t2.rmChildL();
	    } else {
		t2.rmChildR();
	    }
	} else if ( t1.getLeft() != null && t1.getRight() == null ) {
	    if ( t2.getLeft() == t1 ) {
		t2.addL(t1.getRight());
	    } else {
		t2.addR(t1.getRight());
	    }
	} else if ( t1.getRight() != null && t1.getLeft() == null ) {
	    if ( t2.getLeft() == t1 ) {
		t2.addL(t1.getLeft());
	    } else {
		t2.addR(t1.getLeft());
	    }
	} else {
	    Node tmp = t2.getLeft();
	    Node follow = t2;
	    while ( tmp.getRight() != null ) {
		follow = tmp;
		tmp = tmp.getRight();
	    }
	    tmp.addR(t2.getRight());
	    tmp.addL(t2.getLeft());
	    t1 = tmp;
	    follow.addR(null);
	}
    }

    public int getHeight( Node t ) {
	if ( t == null ) {
	    return 0;
	} else {
	    return 1 + Math.max(getHeight(t.getLeft()),getHeight(t.getRight()));
	}
    } 
    /*
    public int height() {
	return getHeight(root);
    }
    public int longest() {

    }
    
    public int splitDupes() {

    }
    */
    public static void main( String[] args ) {
	Node N = new Node(25);
	BST tree = new BST(N);
	Random r = new Random();
	for ( int i = 0; i < 10; i++ ) {
	    int x = r.nextInt(50);
	    tree.insert(x);
	}
	System.out.println(tree);
	//System.out.println(tree.search(30));
	//tree.remove(30);
	//System.out.println(tree);
	System.out.println(tree.maxValue());
	System.out.println(tree.size());
	System.out.println(tree.height());
    }

}
