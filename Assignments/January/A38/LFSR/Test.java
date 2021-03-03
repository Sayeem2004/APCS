public class Test {
    public static void main(String args[]) {
        LFSR lfsr = new LFSR("01101000010", 8);
        System.out.println(lfsr);
        System.out.println();

        lfsr = new LFSR("01101000010", 8);
        for (int i = 0; i < 10; i++) {
            int bit = lfsr.step();
            System.out.println(lfsr + " " + bit);
        }
        System.out.println();

        lfsr = new LFSR("01101000010", 8);
        for (int i = 0; i < 10; i++) {
            int r = lfsr.generate(5);
            System.out.println(lfsr + " " + r);
        }
        System.out.println();
    }
}
