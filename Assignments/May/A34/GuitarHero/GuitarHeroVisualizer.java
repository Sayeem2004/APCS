/****************************************************************************************************
    Name: Mohammad Khan, Dylan Hu, Asa Muhamamd, Caroline Leung, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac GuiterHeroVisualizer.java
    Execution: java GuitarHeroVisualizer
    Dependencies: GuitarString.java RingBuffer.java StdAudio.java StdDraw.java

    Notes: Simulates a guitar with your keyboard, can play up to 37 notes, also shows the audio wave
    in a StdDraw window.

    > java GuitarHeroVisualizer
    <Opens Up StdDraw Window And Allows You To Play Notes>
****************************************************************************************************/
import java.util.*;

public class GuitarHeroVisualizer {
    public static void main(String[] args) {
        int n = 1200;
        ArrayList<Double> draw = new ArrayList<Double>();

        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0,n-1);
        StdDraw.setYscale(-3,3);

        String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        GuitarString[] guitar = new GuitarString[37];
        for (int i = 0; i < 37; i++) {
            guitar[i] = new GuitarString(440 * Math.pow(2, (i-24.0)/12.0));
        }

        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();

                if (keyboard.indexOf(key) != -1) {
                    guitar[keyboard.indexOf(key)].pluck();
                }
            }

            double sample = 0;
            for (int i = 0; i < 37; i++) sample += guitar[i].sample();

            StdAudio.play(sample);

            if (draw.size() == n-1) {
                draw.add(sample);
                StdDraw.clear();
                for (int i = 0; i < n-1; i++) {
                    StdDraw.line(i,draw.get(i),i+1,draw.get(i+1));
                }
                StdDraw.show();
                draw.clear();
            } else {
                draw.add(sample);
            }

            for (int i = 0; i < 37; i++) guitar[i].tic();
        }
    }
}
