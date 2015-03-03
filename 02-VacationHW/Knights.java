import java.io.*;
import java.util.*;

public class Knights{

    String[][] board;
    int maxX, maxY;
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
		System.out.printf("%2s",i);
	    }
	    System.out.printf("%n");
	}	
    }

    public boolean check( int x, int y ) {
	int a = x;
	int b = y;
	if ( a >= maxX || b >= maxY || a <= 0 || b <= 0 ) {
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
	printBoard();
	board[x][y] = Knight;
	numMoves = numMoves + 1;
	solve(1,2);
	solve(-1,2);
	solve(1,-2);
	solve(-1,-2);
	solve(2,1);
	solve(-2,1);
	solve(2,-1);
	solve(-2,-1);
	return;
    }

    public static void main( String[] args ) {
	Knights k  = new Knights(5);
	k.printBoard();
	k.solve(2,2);
    }
    
}
