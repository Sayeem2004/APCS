/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FunctionDemo.java
    Execution: java FunctionDemo
    Dependencies: none

    Notes: Tests out some common functions

    > java

****************************************************************************************************/
public class FunctionDemo {
    public static void main(String [] args) {
	    int n = Integer.parseInt(args[0]);
	    System.out.println("foo(" + n + ") = " + FunctionDemo.goo(n));
        return;
    }
    public static int foo(int x) {
        return 3 * x + 2;
    }
    public static int goo(int x) {
        return FunctionDemo.goo(x);
    }
}
