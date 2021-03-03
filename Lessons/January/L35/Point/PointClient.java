/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class PointClient {
    public static void testPoint() {
        Point p = new Point(0,0);
        System.out.println("p = " + p);
        System.out.println("p.move(1,1)");
        p.move(1,1);
        System.out.println("p = " + p);
        System.out.println("p.translate(1,1)");
        p.translate(1,1);
        System.out.println("p = " + p.getLocation());
        System.out.println();

        Point p1 = new Point(5,6);
        Point p2 = p1.getLocation();
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1.equals(p1) = " + p1.equals(p1));
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p1) = " + p2.equals(p1));
        System.out.println("p1.equals(null) = " + p1.equals(null));
        System.out.println();
    }
    public static double distance(Point a, Point b) {
        int x = Math.abs(a.getX()-b.getX());
        int y = Math.abs(a.getY()-b.getY());
        return Math.sqrt(x * x + y * y);
    }
    public static void main(String[] args) {
        testPoint();
        Point a = new Point(6,12);
        Point b = new Point(5,3);
        System.out.println(distance(a,b));
    }
}
