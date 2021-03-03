/****************************************************************************************************
    Name: Mohammad Khan & Bryan Zhang

    Compilation: javac Point3d.java
    Execution: java Point3d
    Dependencies: none

    Notes: contains 3 private integers as its attributes and has methods to change the integers. Also
    has a calculation method for calculating the distance between two points. 
****************************************************************************************************/

public class Point3d {
    // Attributes
    private double x, y, z;

    // Constructors
    public Point3d(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public Point3d() {
        this(0.0,0.0,0.0);
    }
    public Point3d(Point3d v) {
        this(v.x,v.y,v.z);
    }

    // Accessor Methods
    public Point3d getLocation() {
        return new Point3d(this);
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }

    // Mutator Methods
    public void move(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public void move(Point3d v) {
        this.move(v.x,v.y,v.z);
    }
    public void setLocation(double x, double y, double z) {
        this.move(x,y,z);
    }
    public void setLocation(Point3d v) {
        this.move(v.x,v.y,v.z);
    }
    public void changeX(double x) {
        this.x = x;
    }
    public void changeY(double y) {
        this.y = y;
    }
    public void changeZ(double z) {
        this.z = z;
    }
    public void translate(double dx, double dy, double dz) {
        this.x += dx; this.y += dy; this.y += dz;
    }
    public void translateX(double dx) {
        this.x += dx;
    }
    public void translateY(double dy) {
        this.y += dy;
    }
    public void translateZ(double dz) {
        this.z += dz;
    }

    // Calculation Methods
    public double distanceTo(Point3d v) {
        double a = Math.abs(v.x - this.x);
        double b = Math.abs(v.y - this.y);
        double c = Math.abs(v.z - this.z);
        return Math.sqrt(a*a + b*b + c*c);
    }

    // Override Methods
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point3d) {
            Point3d v = (Point3d) obj;
            return (v.x == this.x) && (v.y == this.y) && (v.z == this.z);
        }
        return false;
    }
}
