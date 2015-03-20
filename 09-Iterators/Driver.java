import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	//ArrayList<String> l = new ArrayList<String>();
	//ArrayList<Integer> l2 = new ArrayList<Integer>();
	//LinkedList<String> l = new LinkedList<String>();
	//LinkedList<Integer> l2 = new LinkedList<Integer>();
	LList<String> l = new LList<String>();
	LList<Integer> l2 = new LList<Integer>();

	l.add("Hello");
	l.add("world");
	l.add("abc");
	l.add("something");
	l.add("else");

	for (int i=0;i < 5; i++){
	    l2.add(i);
	}

	System.out.println(l);
	System.out.println(l2);

	Iterator<String> i = l.iterator();
	Iterator<Integer> i2 = l2.iterator();
	/*
	while (i.hasNext()) {
	    System.out.println(i.next());
	}

	while (i2.hasNext()) {
	    System.out.println(i2.next());
	}
	*/
	
	System.out.println(i.next());
	System.out.println(i2.next());
	
	i.remove();
	i2.remove();

	System.out.println(i.next());
	System.out.println(i2.next());

	System.out.println(l);
	System.out.println(l2);

    }

}
