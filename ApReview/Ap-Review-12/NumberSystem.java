// Part A
public static int gcf(int a, int b) {
    if (a % b == 0) return b;
    return gcf(b, a%b);
}

// Part B
public static void reduceFraction(int numerator, int denominator) {
    int gcf = gfc(numerator, denominator);
    if (gcf == denominator) System.out.println(numerator + "/" + denominator + " reduces to " + numerator/denominator);
    else System.out.println(numerator + "/" + denominator + " reduces to " + numerator/gcf + "/" + denominator/gcf);
}
