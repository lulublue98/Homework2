import java.io.*;
import java.util.*;

public class Knights{

    int[][] board;
    int maxX;
    int maxY;

    public void delay(int n) {
	try {
	    Thread.sleep(n); 
	} catch( Exception e ) {}
    }

    public Knights(int size) {
	maxX=size;
	maxY=size;
	board = new int[maxX][maxY];
        for (int a=0;a<maxX;a++) {
	    for (int b=0;b<maxY;b++) {
		board[a][b] = 0;
	    }
	}
    }

    public void printBoard() {
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		int i = board[x][y];
		System.out.printf("%2d",i);
	    }
	    System.out.printf("%n");
	}	
    }
    
    public static void main(String[] args) {
	Knights k  = new Knights(5);
	k.printBoard();
    }
    
}
