/****************************************************************************************************
    Names: Mohammad Khan & Bryan Zhang

    Compilation: javac LFSR.java
    Execution: java LFSR
    Dependencies: none

    Notes: Class for linear feedback shift register (LFSR) encryption.
****************************************************************************************************/
public class LFSR {
    // Attributes
    private String seed;
    private int tap;

    // Constructors
    public LFSR(String s, int t) {
        seed = s; tap = t;
    }

    // Mutators
    public int step() {
        int last = ((int) seed.charAt(seed.length()-tap-1)) ^ ((int) seed.charAt(0));
        seed = seed.substring(1) + Integer.toString(last);
        return last;
    }
    public int generate(int k) {
        int total = 0;
        for (int i = 0; i < k; i++) {
            total *= 2;
            total += this.step();
        }
        return total;
    }

    // Override Methods
    @Override
    public String toString() {
        return seed;
    }
}
