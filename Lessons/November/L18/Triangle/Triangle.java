/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Triangle.java
    Execution: java Triangle
    Dependencies: StdDraw.java

    Notes: Creates an equilateral triangle and a point inside the equilateral triangle.

    > java Triangle
    <ctrl-s + Triangle.png>
    <open Triangle.png>
****************************************************************************************************/

public class Triangle {
    public static void main(String[] args) {
        StdDraw.line(0,.1,1,.1);
        StdDraw.line(0,.1,.5,.1+.5*Math.sqrt(3));
        StdDraw.line(.5,.1+.5*Math.sqrt(3),1,.1);
        StdDraw.setPenRadius(.05);
        StdDraw.point(.5,.5);
    }
}
