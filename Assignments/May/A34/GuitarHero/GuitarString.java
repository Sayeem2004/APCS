/****************************************************************************************************
    Name: Mohammad Khan, Dylan Hu, Asa Muhamamd, Caroline Leung, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac GuitarString.java
    Execution: java GuitarString n
    Dependencies: RingBuffer.java

    Notes: Class to simulate a guitar string, the main function is used just to test this class out.

    > java GuitarString 25
     0   0.2000
     1   0.4000
     2   0.5000
     3   0.3000
     4  -0.2000
     5   0.4000
     6   0.3000
     7   0.0000
     8  -0.1000
     9  -0.3000
    10   0.2982
    11   0.4473
    12   0.3976
    13   0.0497
    14   0.0994
    15   0.3479
    16   0.1491
    17  -0.0497
    18  -0.1988
    19  -0.0009
    20   0.3705
    21   0.4199
    22   0.2223
    23   0.0741
    24   0.2223
****************************************************************************************************/

public class GuitarString {
    private RingBuffer buffer;
    private int tics;
    private int size;

    public GuitarString(double frequency) {
        double sz = 44100 / frequency;
        if ((int)sz != sz) size = (int)sz + 1;
        else size = (int)sz;

        buffer = new RingBuffer(size);

        for (int i = 0; i < size; i++) {
            buffer.enqueue(0);
        }
    }

    public GuitarString(double[] init) {
        buffer = new RingBuffer(init.length);

        for (double d : init) buffer.enqueue(d);
    }

    public void pluck() {
        for (int i = 0; i < size; i++) {
            double a = buffer.dequeue();
            buffer.enqueue(Math.random()-0.5);
        }
    }

    public void tic() {
        double first  = buffer.dequeue();
        double second = buffer.peek();

        buffer.enqueue(0.994 * (first + second) / 2);
        tics++;
    }

    public double sample() {
        return buffer.peek();
    }

    public int time() {
        return tics;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] samples = { .2, .4, .5, .3, -.2, .4, .3, .0, -.1, -.3 };
        GuitarString testString = new GuitarString(samples);

        for (int i = 0; i < N; i++) {
            int t = testString.time();
            double sample = testString.sample();
            System.out.printf("%6d %8.4f\n", t, sample);
            testString.tic();
        }
    }

}
