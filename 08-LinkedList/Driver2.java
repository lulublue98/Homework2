import java.io.*;
import java.util.*;

public class Driver2 {
    
    public static void main( String[] args ) {

	LList l = new LList();
	Random r = new Random();
	for (int i=0;i<1000;i++) {
	    l.add(r.nextInt(100));
	}
	//System.out.println(l);
	//System.out.println(l.remove( 50 ));
	LinkedList<Integer> d = new LinkedList<Integer>();
	Random q = new Random();
	for (int i=0;i<1000;i++) {
	    d.add(q.nextInt(100));
	}
	int[] a = new int[1000];
	Random t = new Random();
	for (int i=0;i<1000;i++) {
	    a[i] = t.nextInt(100);
	}
	int total = 0;
	long start = System.currentTimeMillis();
	for (int i=0;i<l.getLength()-1;i++) {
	    total = total + l.get(i);
	}
	System.out.println(total);
	total = 0;
	System.out.println("time: " + ( System.currentTimeMillis() - start ));
	long start = System.currentTimeMillis();
	for (int i=0;i<d.length()-1;i++) {
	    total = total + l.get(i);
	}
	System.out.println(total);
	System.out.println("time: " + ( System.currentTimeMillis() - start ));

    }

}
