/****************************************************************************************************
    Names: Mohammad Khan & Bryan Zhang

    Compilation: javac PhotoMagic.java
    Execution: java PhotoMagic picture seed tap
    Dependencies: Picture.java LFSR.java

    Notes: Creates a file "X"+picture that is the image encrypted using LFSR.

    > java PhotoMagic pipe.png 01101000010100010000 16
    <creates Xpipe.png>
    <open Xpipe.png>
****************************************************************************************************/
import java.awt.Color;

public class PhotoMagic {
    public static void main(String[] args) {
        String pic = args[0];
        String seed = args[1];
        int tap = Integer.parseInt(args[2]);

        Picture picture = new Picture(pic);
        int width  = picture.width();
        int height = picture.height();
        LFSR temp = new LFSR(seed,tap);

        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int pixel = picture.getRGB(col,row);
                Color color = new Color(pixel, true);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                red ^= temp.generate(8);
                green ^= temp.generate(8);
                blue ^= temp.generate(8);
                Color next = new Color(red,green,blue);
                picture.setRGB(col,row,next.getRGB());
            }
        }

        picture.save("X"+pic);
        Picture end = new Picture("X"+pic);
        end.show();
    }
}
