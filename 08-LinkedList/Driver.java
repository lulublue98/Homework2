public class Driver {
    public static void main(String[] args) {
	LList l = new LList();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++) {
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println("length: " + l.getLength());
	System.out.println("index 3: " + l.get(3));
	l.remove(3);
	System.out.println(l);
	System.out.println("length: " + l.getLength());
	l.add(3,"5");
	System.out.println(l);
	System.out.println("length: " + l.getLength());
    }
}
