/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ChromaticScale.java
    Execution: java ChromaticScale
    Dependencies: StdAudio.java PlayMusic.java

    Notes: Plays each note from the chromatic scale of 440 to 800 hertz for 1 second.

    > java ChromaticScale
    (Audio Plays)
****************************************************************************************************/

public class ChromaticScale {
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            double n = 440 * Math.pow(2,i/12.0);
            double[] v = new double[44100];
            for (int q = 0; q < 44100; q++) {
                double a = 2 * Math.PI * q/44100.0 * n;
                v[q] = Math.sin(a);
            }
            StdAudio.play(v);
        }
    }
}
