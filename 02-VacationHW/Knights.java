import java.io.*;
import java.util.*;

public class Knights{

    String[][] board;
    int maxX, maxY;
    int lastX, lastY;
    int numMoves = 0;
    int totMoves;
    final static String Knight = "K";
    final static String spot = ".";

    public void delay(int n) {
	try {
	    Thread.sleep(n); 
	} catch( Exception e ) {}
    }

    public Knights( int size ) {
	totMoves = size * size;
	maxX=size;
	maxY=size;
	board = new String[maxX][maxY];
        for (int a=0;a<maxX;a++) {
	    for (int b=0;b<maxY;b++) {
		board[a][b] = spot;
	    }
	}
    }

    public void printBoard() {
	System.out.println();
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		String i = board[x][y];
		System.out.printf("%3s",i);
	    }
	    System.out.printf("%n");
	}	
    }

    public boolean check( int x, int y ) {
	int a = x;
	int b = y;
	if ( a >= maxX || b >= maxY || a < 0 || b < 0 ) {
	    return false;
	} else if ( board[a][b] == spot ) {
	    return true;
	} else {
	    return false;
	}
    }

    public void solve( int x, int y ) {
	if ( check(x,y) == false ) {
	    return;
	} else if ( numMoves == totMoves ) {
	    board[x][y] = Knight;
	    printBoard();
	    System.out.println("YOU WIN!");
	    System.exit(0);
	}
	delay(200);
	board[lastX,lastY] = "" + numMoves;
	board[x][y] = Knight;
	printBoard();
	solve(x+1,y+2);
	solve(x-1,y+2);
	solve(x+1,y-2);
	solve(x-1,y-2);
	solve(x+2,y+1);
	solve(x-2,y+1);
	solve(x+2,y-1);
	solve(x-2,y-1);
    }

    public static void main( String[] args ) {
	Knights k  = new Knights(5);
	k.solve(1,1);
    }
    
}
