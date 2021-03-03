/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FourierSpikes.java
    Execution: java FourierSpikes n
    Dependencies: StdDraw.java

    Notes: Draws the fourier spikes function with input n from -10 to 10.

    > java FourierSpikes 10
    <ctrl-s + FourierSpikes.png>
    <open FourierSpikes.png>
****************************************************************************************************/

public class FourierSpikes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-10,10);
        StdDraw.setYscale(-1,1);
        StdDraw.enableDoubleBuffering();
        double[] a = new double[501];
        a[0] = 0;
        for (int i = 1; i <= 500; i++) {
            double sum = 0;
            for (int q = 1; q <= n; q++) {
                sum += Math.cos(q*(-10+(i/500.0*20)));
            }
            a[i] = sum/n;
            StdDraw.line(-10+(i-1)/500.0*20,a[i-1],-10+i/500.0*20,a[i]);
        }
        StdDraw.show();
    }
}
