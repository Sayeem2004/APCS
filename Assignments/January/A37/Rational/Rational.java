/****************************************************************************************************
    Names: Mohammad Khan & Bryan Zhang

    Compilation: javac Rational.java
    Execution: java Rational
    Dependencies: none

    Notes: An ADT that represents a rational number through a fraction of two numbers. Includes some
    methods for calculation.
****************************************************************************************************/

public final class Rational {
    // Attributes
    // 1. Declare appropriate fields.
    private final int n, d;


    // Constructors
    // 2. Provide a default constructor which sets the default value to 0/1.
    public Rational() {n = 0; d = 1;}
    // 3. Provide a second constructor Rational(int n) that represents n / 1.
    public Rational(int a) {n = a; d = 1;}
    // 4. Provide a third constructor Rational(int n, int d) to represent n/d.
    // 4b. Also, if d is 0 a RuntimeException should be thrown with the message DIVISION BY ZERO.
    public Rational(int a, int b) {
        if (b == 0) {throw new RuntimeException("DIVISION BY ZERO");}
        if (a == 0) {n = 0; d = 1; return;}
        if (b < 0 && a > 0) {a *= -1; b *= -1;}
        if (b < 0 && a < 0) {a *= -1; b *= -1;}
        int common = fact(Math.abs(a),Math.abs(b));
        n = a / common; d = b / common;
    }
    // 4a. This constructor should simplify n/d when necessary. You may want to write a separate
    // method to complete the simplification.
    private int fact(int n, int d) {
        if (d == 0) return n;
	    return fact(d, n % d);
	}
    // Extra constructor for convenience.
    public Rational(Rational a) {n = a.n; d = a.d;}


    // Override Methods
    // 5. Override the toString() method with appropriate behavior.
    @Override
    public String toString() {
        return n + "/" + d;
    }
    // 16. Implement an appropriate equals method. Use the Override annotation.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational) {
	        Rational rat = (Rational) obj;
	        return rat.n == n && rat.d == d;
        }
	    return false;
    }


    // Arithmetic Operators
    // 6. Implement the method plus(Rational rhs) to perform the addition of 2 rational numbers
    // (a/b + c/d).
    public Rational plus(Rational rhs) {
        int denom = d * rhs.d;
        int numer = d * rhs.n  + n * rhs.d;
        return new Rational(numer, denom);
    }
    // 7. Implement minus(Rational rhs) for subtraction.
    public Rational minus(Rational rhs) {
        int denom = d * rhs.d;
        int numer = n * rhs.d - d * rhs.n;
        return new Rational(numer, denom);
    }
    // 8. Implement times(Rational rhs) for multiplication.
    public Rational times(Rational rhs) {
        int a = rhs.n * n;
        int b = rhs.d * d;
        return new Rational(a,b);
    }
    // 9. Implement dividesBy(Rational rhs) for division.
    public Rational dividesBy(Rational rhs) {
        int a = rhs.d * n;
        int b = rhs.n * d;
        return new Rational(a,b);
    }
    // 14. Add the invert(), negate(), abs(), and doubleValue() methods to the Rational class.
    public Rational invert() {
        return new Rational(d,n);
    }
    public Rational negated() {
        return new Rational(-n,d);
    }
    public Rational abs() {
        return new Rational(Math.abs(n),d);
    }
    public double doubleValue() {
        double doub = (double) n;
        return doub / d;
    }
}
