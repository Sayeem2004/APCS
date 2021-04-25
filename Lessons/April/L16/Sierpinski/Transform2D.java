/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Dylan Hu & Caroline Leung & Esteak Shapin & Han Zhang

    Compilation: javac Transform2d.java
    Execution: java Transform2d
    Dependencies: none

    Notes: A program that implements various 2d transformations on double arrays and also tests these
    methods out.

    > java Transform2d
    Copy:
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    	cx = copy(x)
    	cy = copy(y)
    	cx: [0.0, 2.0, 4.0]
    	cy: [0.0, 3.4641016151377544, 0.0]
    	cx[1] = 5
    	x: [0.0, 2.0, 4.0]
    	cx: [0.0, 5.0, 4.0]
    Scale:
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    	scale(x, y, 5.0)
    	x: [0.0, 10.0, 20.0]
    	y: [0.0, 17.32050807568877, 0.0]
    	scale(x, y, 0.20)
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    Translate:
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    	translate(x, y, 5.0, -1.5)
    	x: [5.0, 7.0, 9.0]
    	y: [-1.5, 1.9641016151377544, -1.5]
    	translate(x, y, -5.0, 1.5)
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    Rotate:
    	x: [0.0, 2.0, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
    	rotate(x, y, 90)
    	x: [0.0, -3.4641016151377544, 2.4492935982947064E-16]
    	y: [0.0, 2.0, 4.0]
    	rotate(x, y, -90)
    	x: [0.0, 1.9999999999999998, 4.0]
    	y: [0.0, 3.4641016151377544, 0.0]
****************************************************************************************************/
import java.util.*;

public class Transform2D {
    public static double[] copy(double[] array) {
        return array.clone();
    }

    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] *= alpha;
            y[i] *= alpha;
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] += dx;
            y[i] += dy;
        }
    }

    public static void rotate(double[] x, double[] y, double theta) {
        theta = Math.toRadians(theta);
        double[] x1 = copy(x), y1 = copy(y);
        for (int i = 0; i < x.length; i++) {
            x[i] = x1[i]*Math.cos(theta) - y1[i]*Math.sin(theta);
            y[i] = y1[i]*Math.cos(theta) + x1[i]*Math.sin(theta);
        }
    }

    public static void main(String[] args) {
        double[] x = {0.0, 2.0, 4.0};
        double[] y = {0.0, 2.0*Math.sqrt(3), 0.0};

        // Testing Out Copy Function
        System.out.println("Copy: ");
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\tcx = copy(x)");
        System.out.println("\tcy = copy(y)");
        double[] cx = copy(x);
        double[] cy = copy(y);
        System.out.println("\tcx: " + Arrays.toString(cx));
        System.out.println("\tcy: " + Arrays.toString(cy));
        System.out.println("\tcx[1] = 5");
        cx[1] = 5;
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\tcx: " + Arrays.toString(cx));

        // Testing Out Scale Function
        System.out.println("Scale: ");
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\tscale(x, y, 5.0)");
        scale(x, y, 5.0);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\tscale(x, y, 0.20)");
        scale(x, y, 0.20);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));

        // Testing out Translate Function
        System.out.println("Translate: ");
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\ttranslate(x, y, 5.0, -1.5)");
        translate(x, y, 5.0, -1.5);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\ttranslate(x, y, -5.0, 1.5)");
        translate(x, y, -5.0, 1.5);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));

        // Testing out Rotate function
        System.out.println("Rotate: ");
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\trotate(x, y, 90)");
        rotate(x, y, 90);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
        System.out.println("\trotate(x, y, -90)");
        rotate(x, y, -90);
        System.out.println("\tx: " + Arrays.toString(x));
        System.out.println("\ty: " + Arrays.toString(y));
    }
}
