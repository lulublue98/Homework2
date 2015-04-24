import java.io.*;
import java.util.*;

public class Maze {

    char[][] board;
    int maxX;
    int maxY;

    private Frontier F;
    private cors current;
    private Node<cors> place;

    private char path = ' ';
    private char wall = 'E';
    private char me = 'L';
    private char end = '$';
    private char route = '.';
    private char visited = '_';
    private boolean solved = false;

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch( Exception e ) {}
    }

    public Maze() {
	F = new Frontier();
	maxX=52;
	maxY=27;
	board = new char[maxX][maxY];
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++) {
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	}
	catch (Exception e){
	}
    }

    public String toString() {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	return s;
    }

    public void solve( int x, int y ) {
	cors c = new cors(x,y);
	current = c;
	while ( solved == false ) {
	    if ( board[current.getX()][current.getY()] == end ) {
		solved = true;
	    } else if ( board[current.getX()][current.getY()] == path ) {
		board[current.getX()][current.getY()] = visited;
		F.enqueue(current.getX()+1,current.getY());
		F.enqueue(current.getX()-1,current.getY());
		F.enqueue(current.getX(),current.getY()+1);
		F.enqueue(current.getX(),current.getY()-1);
	    }
	    System.out.println(this);
	    delay(10);
	    place = F.dequeue();
	    current = place.getData();
	}
	// broken code
	/*
	for (Node<cors> p = place.getPrev(); p != null ; p = p.getPrev()){
	    board[p.getData().getX()][p.getData().getY()] = route;
	    delay(10);
	    System.out.println(this);
	}
	*/
    }

    public static void main( String[] args ) {
	Maze m = new Maze();
	System.out.println(m);
	m.solve(2,2);
    }
    
}
