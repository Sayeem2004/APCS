/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FunctionGraph.java
    Execution: java FunctionGraph a b
    Dependencies: Function.java StdStats.java

    Notes: Graphs basic functions from the files above. a >= 1;

    > java

****************************************************************************************************/

public class FunctionGraph {
    // plots the function f in the interval [a, b] using n+1 evenly spaced points
    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n+1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.evaluate(a + delta*i);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int n = (int)(b-a);
        Function f = new Constant();
        plot(f, a, b, 2*n);
        Function f2 = new Logarithm();
        plot(f2, a, b, 2*n);
        Function f3 = new Linear();
        plot(f3, a, b, 2*n);
        Function f4 = new NLogN();
        plot(f4, a, b, 2*n);
        Function f5 = new Quadratic();
        plot(f5, a, b, 2*n);
        Function f6 = new Exponential();
        plot(f6, a, b, 2*n);
        Function f7 = new Factorial();
        plot(f7, a, b, 2*n);
    }

}
