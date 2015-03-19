import java.io.*;
import java.util.*;

public class Driver2 {
    
    public static void main( String[] args ) {

	LList l = new LList();
	Random r = new Random();
	for (int i=0;i<100000;i++) {
	    l.add(r.nextInt(100));
	}
	//System.out.println(l);
	//System.out.println(l.remove( 50 ));
	LinkedList<Integer> d = new LinkedList<Integer>();
	Random q = new Random();
	for (int i=0;i<100000;i++) {
	    d.add(q.nextInt(100));
	}
	ArrayList<Integer> c = new ArrayList<Integer>();
	Random g = new Random();
	for (int i=0;i<100000;i++) {
	    c.add(g.nextInt(100));
	}
	int[] a = new int[100000];
	Random t = new Random();
	for (int i=0;i<100000;i++) {
	    a[i] = t.nextInt(100);
	}
	int total = 0;
	long start = System.currentTimeMillis();
	for (int i=0;i<l.getLength()-1;i++) {
	    total = total + l.get(i);
	}
	System.out.println("time: " + ( System.currentTimeMillis() - start ));
	total = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<d.size()-1;i++) {
	    total = total + d.get(i);
	}
	System.out.println("time: " + ( System.currentTimeMillis() - start ));
	total = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<c.size()-1;i++) {
	    total = total + c.get(i);
	}
	System.out.println("time: " + ( System.currentTimeMillis() - start ));
	total = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<a.length-1;i++) {
	    total = total + a[i];
	}
	System.out.println("time: " + ( System.currentTimeMillis() - start ));

    }

}
