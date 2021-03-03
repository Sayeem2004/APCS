public class Factorial implements Function {
    public double evaluate(double x) {
        double total = 1;
        for (double i = x; i > 0; i-=.5) {
            total *= i;
            if (total > 10000000) break;
        }
        return total;
    }
}
