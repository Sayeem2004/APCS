public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)

    // Part A
    public double computeBonusThreshold() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : itemsSold) {
            if (x < min) min = x;
            if (x > max) max = x;
            sum += x;
        }
        return (1.0 * (sum-min-max)) / (itemsSold.length-2);
    }

    // Part B
    public void computeWages(double fixedWage, double perItemWage) {
        double bonus = computeBonusThreshold();
        for (int i = 0; i < wages.length; i++) {
            wages[i] = fixedWage + perItemWage * itemsSold[i];
            if (itemsSold[i] > bonus) wages[i] *= 1.1;
        }
    }
}
