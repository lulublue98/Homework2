import java.io.*;
import java.util.*;

public class Maze {

    char[][] board;
    int maxX;
    int maxY;

    private char path = '_';
    private char wall = ' ';
    private char me = 'L';
    private char end = '@';
    private char visited = '.';
    private boolean solved = false;

    public void delay(int n) {
	try {
	    Thread.sleep(n); 
	} catch( Exception e ) {
	}
    }

    public Maze() {
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

    public void solve(int x, int y) {
	if ( board[x][y] == wall || 
	     board[x][y] == me ||
	     board[x][y] == visited ) {
	    return;
	}
	if (board[x][y] == end) {
	    System.out.println(this);
	    System.out.println("YOU WIN!");
	    System.exit(0);

	}
	delay(100);
	System.out.println(this);
	board[x][y] = me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	board[x][y] = visited;
    }

    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
    }
}
