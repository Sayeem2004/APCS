/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac AudioCollage.java
    Execution: java AudioCollage
    Dependencies: StdAudio.java chimes.wav exposure.wav harp.wav piano.wav singer.wav

    Notes: Plays an audio collage of noises from the 5 wav files listed above.

    > java AudioCollage
    (Audio Plays)
****************************************************************************************************/

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] ret = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[i] * alpha;
        }
        return ret;
    }
    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] ret = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length-i-1];
        }
        return ret;
    }
    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] ret = new double[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ret[a.length+i] = b[i];
        }
        return ret;
    }
    // Returns a new array that is the sum of a[] and b[], padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] ret = new double[Math.max(a.length,b.length)];
        for (int i = 0; i < ret.length; i++) {
            if (i >= a.length) {
                ret[i] = b[i];
                continue;
            }
            if (i >= b.length) {
                ret[i] = a[i];
                continue;
            }
            ret[i] = a[i]+b[i];
        }
        return ret;
    }
    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] ret = new double[(int)(a.length/alpha)];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = a[(int)(i*alpha)];
        }
        return ret;
    }
    // Creates an audio collage and plays it on standard audio. See below for the requirements.
    public static void main(String[] args) {
        double[] exposure = StdAudio.read("exposure.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] singer = StdAudio.read("singer.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] p1 = mix(amplify(exposure,5),changeSpeed(merge(chimes,chimes),1.5));
        double[] p2 = mix(merge(changeSpeed(piano,0.85),changeSpeed(piano,0.85)),singer);
        double[] p3 = mix(mix(merge(amplify(piano,0.8),amplify(piano,0.8)),changeSpeed(harp,0.5)),changeSpeed(reverse(singer),1.5));
        double[] Final = merge(merge(p1,p2),p3);
        StdAudio.play(Final);
    }
}
