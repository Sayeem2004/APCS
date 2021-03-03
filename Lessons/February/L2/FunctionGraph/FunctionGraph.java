/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FunctionGraph.java
    Execution: java FunctionGraph a b n
    Dependencies: Function.java StdStats.java StdArrayIO.java StdDraw.java StdIn.java StdOut.java

    Notes: Graphs basic time complexity functions from a(a >= 1) to b with n+1 distinct points.

    > java FunctionGraph 1 25 50
    <Creates ComplexityGraph.png>
****************************************************************************************************/
import java.awt.Color;

public class FunctionGraph {
    public static void plot(Function f, double a, double b, int n, Color c) {
        double[] y = new double[n+1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++)
            y[i] = f.evaluate(a + delta*i);
        StdDraw.setPenColor(c);
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        Function[] func = {x -> b*b/2, x -> Math.log(x)/Math.log(2), x -> x, x -> Math.log(x)/Math.log(2)*x, x -> x*x, x -> Math.pow(2,x)};
        Color[] col = {Color.BLUE, Color.ORANGE, Color.GREEN, Color.MAGENTA, Color.GRAY, Color.RED};
        StdDraw.setXscale(a-1,b+1);
        StdDraw.setYscale(0,b*b);
        for (int i = 0; i < func.length; i++) {
            plot(func[i], a, b, n, col[i]);
        }
        StdDraw.save("ComplexityGraph.png");
    }

}
