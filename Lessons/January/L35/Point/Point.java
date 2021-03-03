/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class Point {
    private int x, y;

    // Constructors
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point v) {
        this.x = v.x;
        this.y = v.y;
    }

    // Accessor Methods
    public Point getLocation() {
        return new Point(this);
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    // Mutator Methods
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setLocation(Point v) {
        this.x = v.x;
        this.y = v.y;
    }
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Calculation Methods
    public double distance(Point v) {
        int a = Math.abs(this.x-v.x);
        int b = Math.abs(this.y-v.y);
        return Math.sqrt(a*a+b*b);
    }

    // Override Methods
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public boolean equals(Point v) {
        return v != null && v.x == this.x && v.y == this.y;
    }
}
