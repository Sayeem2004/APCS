/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac TakagiFunction.java
    Execution: java TakagiFunction
    Dependencies: StdDraw.java

    Notes: Draws the Takagi Function on the interval [0,1]. Takagi Function has the property that
    it is continuous but nowhere differentiable.

    > java TakagiFunction
    <ctrl-s + TakagiFunction.png>
    <open TakagiFunction.png>
****************************************************************************************************/

public class TakagiFunction {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        for (double i = 0; i <= 1; i+=.00001) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                double a = Math.pow(2,q);
                a *= i;
                a = Math.min(a-(int)a,(int)a+1-a);
                a /= Math.pow(2,q);
                sum += a;
            }
            StdDraw.point(i,sum);
        }
        StdDraw.show();
    }
}
