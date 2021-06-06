/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Dylan Hu, Han Zhang, Jishan Chowdhury, Sydney Moy,
    Caroline Leung

    Compilation: javac Tour.java
    Execution: java Tour
    Dependencies: Point.java StdDraw.java

    Notes: A class for representing and updating a tour of a traveling sales person problem. Uses two
    main heuristics, the nearest neighbor heuristic and the smallest insertion heuristic. The main
    function runs tests to make sure all methods in the class are working.

    > java Tour
    Empty Tour:
    0.0
    0

    Testing insertNearest:
    12.0
    4
    (1.0, 1.0) -> (1.0, 4.0) -> (4.0, 4.0) -> (4.0, 1.0) -> (1.0, 1.0)
    16.335087491092573
    5
    (1.0, 1.0) -> (1.0, 4.0) -> (4.0, 4.0) -> (5.0, 6.0) -> (4.0, 1.0) -> (1.0, 1.0)

    Testing insertSmallest:
    12.0
    4
    (1.0, 1.0) -> (1.0, 4.0) -> (4.0, 4.0) -> (4.0, 1.0) -> (1.0, 1.0)
    15.70820393249937
    5
    (1.0, 1.0) -> (1.0, 4.0) -> (5.0, 6.0) -> (4.0, 4.0) -> (4.0, 1.0) -> (1.0, 1.0)
    <Opens StdDraw Window> 
****************************************************************************************************/

public class Tour {
    // Nested Node Class
    private class Node {
        private Point point;
        private Node next;

        public Node(Point p) {
            next = null;
            point = p;
        }

        public Node(Point p, Node n) {
            next = n;
            point = p;
        }

        public Point data() {
            return point;
        }

        public Node next() {
            return next;
        }

        public String toString() {
            return point.toString();
        }

        public void drawTo() {
            if (next == null) return;
            point.drawTo(next.data());
        }
    }

    // Attributes
    private int size;
    private double length;
    private Node front;

    // Creates an empty tour.
    public Tour() {
        size = 0;
        length = 0;
    }

    // Creates the 4-point tour a->b->c->d->a (for debugging).
    public Tour(Point a, Point b, Point c, Point d) {
        insertAtPosition(a, 0);
        insertAtPosition(b, 1);
        insertAtPosition(c, 2);
        insertAtPosition(d, 3);
    }

    // Returns the number of points in this tour.
    public int size() {
        return size;
    }

    // Returns the length of this tour.
    public double length() {
        return length;
    }

    // Returns a string representation of this tour.
    public String toString() {
        if (front == null) return "";
        Node t = front;
        String ret = "";

        while (t.next != front) {
            ret += t;
            ret += " -> ";
            t = t.next;
        }

        ret += t;
        ret += " -> ";
        ret += front;

        return ret;
    }

    // Draws this tour to standard drawing.
    public void draw() {
        if (front == null) return;
        Node t = front;

        while (t.next != front) {
            t.drawTo();
            t = t.next;
        }

        t.drawTo();
    }

    private void insertAtPosition(Point p, int i) {
        if (i < 0 || i > size) throw new IllegalArgumentException("Pos " + i + " must be inside [0, size]");

        if (front == null) {
            front = new Node(p);
            front.next = front;
            size++;
            return;
        }

        int counter = 0;
        Node t = front;

        while (counter < i-1) {
          t = t.next;
          counter++;
        }

        t.next = new Node(p, t.next);
        size++;

        Node u = t.next;
        Node v = t.next.next;

        length += t.data().distanceTo(u.data()) + u.data().distanceTo(v.data()) - t.data().distanceTo(v.data());
    }

    // Inserts a point using the nearest neighbor heuristic.
    public void insertNearest(Point p) {
        int pos = -1;
        double min = Double.MAX_VALUE;

        if (front == null) {
            insertAtPosition(p, 0);
            return;
        }

        Node t = front;
        int counter = 1;

        while (t.next != front) {
            double len = p.distanceTo(t.data());
            if (len < min) {
                min = len;
                pos = counter;
            }
            counter++;
            t = t.next;
        }

        double len = p.distanceTo(t.data());
        if (len < min) {
            min = len;
            pos = counter;
        }

        insertAtPosition(p, pos);
    }

    // Inserts a point using the smallest increase heuristic.
    public void insertSmallest(Point p) {
        double tl = Double.MAX_VALUE;
        int pos = -1;

        if (front == null) {
            insertAtPosition(p,0);
            return;
        }

        Node t = front;
        int counter = 1;

        while (t.next != front) {
            double len = p.distanceTo(t.data()) + p.distanceTo(t.next.data()) - t.data().distanceTo(t.next.data());
            if (len < tl) {
                pos = counter;
                tl = len;
            }
            counter++;
            t = t.next;
        }

        double len = p.distanceTo(t.data()) + p.distanceTo(t.next.data()) - t.data().distanceTo(t.next.data());
        if (len < tl) {
            pos = counter;
            tl = len;
        }

        insertAtPosition(p, pos);
    }

    // Tests this class by calling all constructors and instance methods.
    public static void main(String[] args) {
        StdDraw.setXscale(0,10);
        StdDraw.setYscale(0,10);
        // Tests empty tour
        System.out.println("Empty Tour:");
        Tour empty = new Tour();
        System.out.println(empty.length());
        System.out.println(empty.size());
        empty.draw();

        // Tests a tour by adding using the insertNearest method using the four points in the problem statement (pg.3)
        System.out.println("\nTesting insertNearest:");
        Tour four_near = new Tour(new Point(1.0, 1.0), new Point(1.0, 4.0), new Point(4.0, 4.0), new Point(4.0, 1.0));
        System.out.println(four_near.length());
        System.out.println(four_near.size());
        System.out.println(four_near);
        four_near.insertNearest(new Point(5.0, 6.0));
        System.out.println(four_near.length());  // should be 16.33 units
        System.out.println(four_near.size());
        System.out.println(four_near);
        four_near.draw();

        // Tests a tour by adding using the insertSmallest method using the four points in the problem statement (pg.3)
        System.out.println("\nTesting insertSmallest:");
        Tour four_smallest = new Tour(new Point(1.0, 1.0), new Point(1.0, 4.0), new Point(4.0, 4.0), new Point(4.0, 1.0));
        System.out.println(four_smallest.length());
        System.out.println(four_smallest.size());
        System.out.println(four_smallest);
        four_smallest.insertSmallest(new Point(5.0, 6.0));
        System.out.println(four_smallest.length());  // should be 15.70 units
        System.out.println(four_smallest.size());
        System.out.println(four_smallest);
        four_smallest.draw();
    }
}
