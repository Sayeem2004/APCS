/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Point3dLab.java
    Execution: java Point3dLab
    Dependencies: Point3d.java StdIn.java StdOut.java

    Notes: Returns the area of a triangle formed by three 3d points.

    > java Point3dLab
    Enter a 3d point:
    1 2 3
    Enter a 3d point:
    6 5 4
    Enter a 3d point:
    7 8 9
    Area = 14.696938456699057
****************************************************************************************************/

public class Point3dLab {
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        if (a.equals(b)) throw new ArithmeticException("Point a is equal to Point b");
        if (b.equals(c)) throw new ArithmeticException("Point b is equal to Point c");
        if (a.equals(c)) throw new ArithmeticException("Point a is equal to Point c");
        double dist1 = a.distanceTo(b);
        double dist2 = b.distanceTo(c);
        double dist3 = a.distanceTo(c);
        double semi = (dist1+dist2+dist3)/2;
        return Math.sqrt(semi * (semi - dist1) * (semi - dist2) * (semi - dist3));
    }
    public static void main(String[] args) {
        StdOut.println("Enter a 3d point:");
        Point3d p1 = new Point3d(StdIn.readDouble(),StdIn.readDouble(),StdIn.readDouble());
        StdOut.println("Enter a 3d point:");
        Point3d p2 = new Point3d(StdIn.readDouble(),StdIn.readDouble(),StdIn.readDouble());
        StdOut.println("Enter a 3d point:");
        Point3d p3 = new Point3d(StdIn.readDouble(),StdIn.readDouble(),StdIn.readDouble());
        double area;
        try {
            area = computeArea(p1,p2,p3);
            System.out.println("Area = " + area);
        } catch(ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}
