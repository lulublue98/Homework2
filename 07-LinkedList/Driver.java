public class Driver {
    public static void main(String[] args) {
	LList2 l = new LList2();
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++) {
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.find(3));
	l.insert(2,"5");
	System.out.println(l);
    }
}
