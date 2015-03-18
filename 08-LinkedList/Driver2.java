import java.io.*;
import java.util.*;

public class Driver2 {
    
    public static void main( String[] args ) {

	LList l = new LList();
	Random r = new Random();
	for (int i=0;i<1000;i++) {
	    l.add(r.nextInt(100));
	}
	l.remove( 50 );

    }

}
