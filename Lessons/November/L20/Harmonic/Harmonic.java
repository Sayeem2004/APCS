public class Harmonic {
    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println("\tsum = " + sum);
        }
        System.out.println("\treturn " + sum);
        return sum;
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("i = " + i);
            int arg = Integer.parseInt(args[i]);
            System.out.println("arg = " + arg);
            System.out.println("harmonic(" + arg + ")");
            double value = harmonic(arg);
            System.out.println("value = " + value);
            System.out.println();
        }
    }
}
