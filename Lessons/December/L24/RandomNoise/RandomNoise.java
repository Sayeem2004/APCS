/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class RandomNoise {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < 44100*n; i++) {
            StdAudio.play(-1+(Math.random()*2));
        }
    }
}
