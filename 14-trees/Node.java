public class Node {

    private Node parent;
    private Node childL, childR;
    private int data;

    public Node() {
	childL = null;
	childR = null;
    }
    public Node( int d ) {
	data = d;
	childL = null;
	childR = null;
    }
    public Node( int d, Node p ) {
	data = d;
	parent = p;
	childL = null;
	childR = null;
    }

    public void setData( int d ) {
	data = d;
    }
    public int getData() {
	return data;
    }

    public void addL( Node n ) {
	childL = n;
    }
    public void addR( Node n ) {
	childR = n;
    }

    public void rmChildL() {
	childL = null;
    }
    public void rmChildR() {
	childR = null;
    }
    
    public boolean isFull() {
	if ( childL != null && childR != null ) {
	    return true;
	} else {
	    return false;
	}
    }
    public boolean isLeaf() {
	if ( childL != null || childR != null ) {
	    return false;
	} else {
	    return true;
	}
    }

    public Node getLeft() {
	return childL;
    }
    public Node getRight() {
	return childR;
    }
    public Node getParent() {
	return parent;
    }

    public String toString() {
	return ""+data;
    }

}
