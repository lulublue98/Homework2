public class Driver {

    public static void main(String[] args) {
	
	Recursion R = new Recursion();
	int a = R.fib(10);
	int b = R.lens("hello");
	int c = R.count('l', "hello");
	System.out.println(c);

    }

}
