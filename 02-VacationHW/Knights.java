import java.io.*;
import java.util.*;

public class Knights{

    String[][] board;
    int maxX, maxY;
    int currentX, currentY;
    int numMoves = 0;
    final static String Knight = "K";
    final static String spot = ".";

    public void delay(int n) {
	try {
	    Thread.sleep(n); 
	} catch( Exception e ) {}
    }

    public Knights( int size ) {
	maxX=size+2;
	maxY=size+2;
	board = new String[maxX][maxY];
        for (int a=0;a<maxX;a++) {
	    for (int b=0;b<maxY;b++) {
		if ( a == 0 || b == 0 || a == size + 1 || b == size + 1 ) {
		    board[a][b] = " ";
		} else {
		    board[a][b] = spot;
		}
	    }
	}
    }

    public void printBoard() {
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		String i = board[x][y];
		System.out.printf("%2s",i);
	    }
	    System.out.printf("%n");
	}	
    }
    
    public void placeKnight( int xcor, int ycor ) {
	board[xcor+1][ycor+1] = Knight;
	currentX = xcor+1;
	currentY = ycor+1;
    }

    public boolean check( int x, int y ) {
	int a = currentX + x;
	int b = currentY + y;
	if ( board[a][b] == "." ) {
	    return true;
	} else {
	    return false;
	}
    }

    public void move( int x, int y ) {
	int a = currentX + x;
	int b = currentY + y;
	if ( board[a][b] == "." ) {
	    board[currentX][currentY] = "" + numMoves;
	    numMoves = numMoves + 1;
	    currentX = a;
	    currentY = b;
	    board[a][b] = Knight;
	}
    }

    public void solve(int x, int y) {
	if ( board[currentX + x][currentY + y] == "0" ) {
	    board[currentX + x][currentY + y] = Knight;
	    System.exit(0);
	}
	if ( check(x,y) == false ) {
	    return;
	}
	move(x,y);
	delay(100);
	printBoard();
	solve(1,2);
	solve(-1,2);
	solve(1,-2);
	solve(-1,-2);
	solve(2,1);
	solve(-2,1);
	solve(2,-1);
	solve(-2,-1);
    }

    public static void main( String[] args ) {
	Knights k  = new Knights(5);
	k.placeKnight(1,1);
	k.printBoard();
	k.solve(1,2);
    }
    
}
