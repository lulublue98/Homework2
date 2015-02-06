public class Recursion {

    public int fact( int n ) {
	if ( n == 0 ) {
	    return 1;
	} else if ( n == 1 ) {
	    return 1;
	} else {
	    return n * fact( n - 1 );
	}
    }

    public int fib( int n ) {
	if ( n == 0 ) {
	    return 1;
	} else if ( n == 1 ) {
	    return 1;
	} else {
	    return fib( n - 1 ) + fib( n - 2 );
	}
    }

    public int lens( String s ) {
	if ( s == null ) {
	    return 0;
	} else {
	    return 1 + lens(s.substring(1));
	}
    }
    
    public int count( char c, String s ) {
	if ( s == null ) {
	    return 0;
	} else if ( s.charAt(0) == c ) {
	    return 1 + count(c, s.substring(1));
	} else if ( s.charAt(0) != c ) {
	    return count(c, s.substring(1));
	}
    }

}
