/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ActivationFunction.java
    Execution: java ActivationFunction n
    Dependencies: none

    Notes: Returns the values of some common activation fucntions given an input of a double n. If n
    is NaN all functions return NaN.

    > java ActivationFunction 1.0
    heaviside(1.0) = 1.0
      sigmoid(1.0) = 0.7310585786300049
         tanh(1.0) = 0.7615941559557649
     softsign(1.0) = 0.5
         sqnl(1.0) = 0.75

    > java ActivationFunction -0.5
    heaviside(-0.5) = 0.0
      sigmoid(-0.5) = 0.3775406687981454
         tanh(-0.5) = -0.4621171572600098
     softsign(-0.5) = -0.3333333333333333
         sqnl(-0.5) = -0.4375
****************************************************************************************************/

public class ActivationFunction {
        // Returns the Heaviside function of x.
        public static double heaviside(double x) {
            if (Double.isNaN(x) == true) return Double.NaN;
            if (x < 0) return 0;
            if (x == 0) return 0.5;
            return 1;
        }
        // Returns the sigmoid function of x.
        public static double sigmoid(double x) {
            if (Double.isNaN(x) == true) return Double.NaN;
            return 1 / (1 + Math.exp(-x));
        }
        // Returns the hyperbolic tangent of x.
        public static double tanh(double x) {
            if (Double.isNaN(x) == true) return Double.NaN;
            return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        }
        // Returns the softsign function of x.
        public static double softsign(double x) {
            if (Double.isNaN(x) == true) return Double.NaN;
            return x / (1 + Math.abs(x));
        }
        // Returns the square nonlinearity function of x.
        public static double sqnl(double x) {
            if (Double.isNaN(x) == true) return Double.NaN;
            if (x <= -2) return -1;
            if (x < 0) return x + x*x/4;
            if (x < 2) return x - x*x/4;
            return 1;
        }
        // Takes a double command-line argument x and prints each activation function, evaluated, in the format (and order) given below.
        public static void main(String[] args) {
            double n = Double.parseDouble(args[0]);
            System.out.println("heaviside(" + n + ") = " + heaviside(n));
            System.out.println("  sigmoid(" + n + ") = " + sigmoid(n));
            System.out.println("     tanh(" + n + ") = " + tanh(n));
            System.out.println(" softsign(" + n + ") = " + softsign(n));
            System.out.println("     sqnl(" + n + ") = " + sqnl(n));
        }
}
