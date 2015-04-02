import java.io.*;
import java.util.*;

public class Maze {

    char[][] board;
    int maxX;
    int maxY;

    private Frontier F;
    private cors current;

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
	maxX=50;
	maxY=25;
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
	    } else {

	    }
	}
    }

    public static void main( String[] args ) {
	Maze m = new Maze();
	System.out.println(m);
	//m.solve(1,1);
    }

}
