/******************************************************************************
 *  Compilation:  javac TimePrimitives.java
 *  Execution:    java TimePrimitives n
 *  Dependencies: StdOut.java
 *
 *  Determine the amount of time it takes to call +, %, Math.random(),
 *  Math.sin, Math.sqrt(), Math.pow() on your system.
 *
 *  Dificulty since compiler may optimize away some code.
 *
 *  % java TimePrimitives 1000000
 *
 *
 ******************************************************************************/

public class TimePrimitives {
    private static int k = 0;
    private static boolean b = false;

    // to time how long it takes to make a function call
    private static int f(int i, int j) {
        return 0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Stopwatch timer = new Stopwatch();
        double freq, elapsed;

        StdOut.println("Nanoseconds per operation");

       /***************************************************************
        * empty loop
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                ;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("empty loop:" + "\t" + freq);


       /***************************************************************
        * integer addition
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = j + k;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer addition:" + "\t" + freq);

       /***************************************************************
        * integer subtraction
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = j - k;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer subtraction:" + "\t" + freq);


       /***************************************************************
        * integer multiplication
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = j * k;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer multiply:" + "\t" + freq);


       /***************************************************************
        * comparison
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                b = i < j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer comparison:" + "\t" + freq);


       /***************************************************************
        * remainder
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = i % j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer remainder:" + "\t" + freq);


       /***************************************************************
        * integer division
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = i / j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer division:" + "\t" + freq);


       /***************************************************************
        * floating-point addition
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            double k;
            double fi = i;
            for (int j = 1; j <= n; j++) {
                k = fi + j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("floating-point addition:" + "\t" + freq);


       /***************************************************************
        * floating-point subtraction
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n; i++) {
            double k;
            double fi = i;
            for (double j = 1; j <= n; j++) {
                k = fi - j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("floating-point subtraction:" + "\t" + freq);


       /***************************************************************
        * floating-point division
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n; i++) {
            double k;
            double fi = i;
            for (double j = 1; j <= n; j++) {
                k = fi / j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("floating-point division:" + "\t" + freq);


       /***************************************************************
        * floating-point multiplication
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n; i++) {
            double fi = i;
            double k;
            for (double j = 1; j <= n; j++) {
                k = fi * j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("floating-point multiplication:" + "\t" + freq);


       /***************************************************************
        * Empty integer function call
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            int k;
            for (int j = 1; j <= n; j++) {
                k = f(i, j);
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("function call:" + "\t" + freq);


       /***************************************************************
        * Math.sin()
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n/10.0; i++) {
            double k;
            for (double j = 1; j <= n; j++) {
                k = Math.sin(i + j);
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n * 10;
        StdOut.println("Math.sin:" + "\t" + freq);

       /***************************************************************
        * Math.atan2()
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n/10.0; i++) {
            double k;
            for (double j = 1; j <= n; j++) {
                k = Math.atan2(i, j);
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n * 10;
        StdOut.println("Math.atan2:" + "\t" + freq);

       /***************************************************************
        * Math.random()
        ***************************************************************/
        timer = new Stopwatch();
        for (double i = 1; i <= n/10.0; i++) {
            double k;
            for (double j = 1; j <= n; j++) {
                k = Math.random();
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n * 10;
        StdOut.println("Math.random:" + "\t" + freq);

       /***************************************************************
        * integer addition
        ***************************************************************/
        timer = new Stopwatch();
        for (int i = 1; i <= n; i++) {
            int k;
            for (int j = 1; j <= n; j++) {
                k = i + j;
            }
        }
        elapsed = timer.elapsedTime();
        freq = 1.0E9 * elapsed / n / n;
        StdOut.println("integer addition:" + "\t" + freq);
    }

}
