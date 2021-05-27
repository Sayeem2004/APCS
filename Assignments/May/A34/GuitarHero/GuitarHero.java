/****************************************************************************************************
    Name: Mohammad Khan, Dylan Hu, Asa Muhamamd, Caroline Leung, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac GuiterHero.java
    Execution: java GuitarHero
    Dependencies: GuitarString.java RingBuffer.java StdAudio.java StdDraw.java

    Notes: Simulates a guitar with your keyboard, can play up to 37 notes. 

    > java GuitarHero
    <Opens Up StdDraw Window And Allows You To Play Notes>
****************************************************************************************************/

public class GuitarHero {
    public static void main(String[] args) {
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

            for (int i = 0; i < 37; i++) guitar[i].tic();
        }
    }
}
