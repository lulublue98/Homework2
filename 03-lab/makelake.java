import java.io.*;
import java.util.*;

public class makelake {

    int[][] pasture;

    public makelake(int R, int C, int E, int N) {
	maxX=C;
	maxY=R;
	pasture = new int[maxX][maxY];
	try {
	    Scanner sc = new Scanner(new File("lake.txt"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++) {
		    board[i][j] = line.intAt(i);
		}
		j++;
	    }
	}
	catch (Exception e){
	}
    }

    public static void main( String[] args ) {
	makelake M = new makelake();
    }
}
