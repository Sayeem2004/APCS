/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RGBtoCMYK.java
    Execution: java RGBtoCMYK r g b

    Notes: Converts the RGB values into CMYK values and prints them.
    (Given that r, g, and b are integers between 0 and 255)

    % java RGBtoCMYK 75 0 130
    cyan    = 0.423076923076923
    magenta = 1.0
    yellow  = 0.0
    black   = 0.4901960784313726

    % java RGBtoCMYK 0 0 0
    cyan    = 0.0
    magenta = 0.0
    yellow  = 0.0
    black   = 1.0
****************************************************************************************************/

public class RGBtoCMYK {
    public static void main(String[] args) {
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);

        double white = Math.max(red/255, Math.max(green/255, blue/255));
        double cyan = (white - red/255) / white;
        double magenta = (white - green/255) / white;
        double yellow = (white - blue/255) / white;
        double black = 1 - white;

        if (white == 0) {
            System.out.println("cyan = " + (double)0);
            System.out.println("magenta = " + (double)0);
            System.out.println("yellow = " + (double)0);
            System.out.println("black = " + (double)1);
        } else {
            System.out.println("cyan = " + cyan);
            System.out.println("magenta = " + magenta);
            System.out.println("yellow = " + yellow);
            System.out.println("black = " + black);
        }
    }
}
