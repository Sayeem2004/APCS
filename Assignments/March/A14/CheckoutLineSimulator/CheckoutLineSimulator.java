/****************************************************************************************************
    Name: Mohammad Khan & Sydney Moy & Aryan Patel & Diya Rao & Evelyn Zheng & Joseph Kim & Si Ying Ding

    Compilation: javac CheckoutLineSimulator.java
    Execution: java CheckoutLineSimulator  ARRIVAL_PROBABILITY  MIN_SERVICE_TIME  MAX_SERVICE_TIME  SIMULATION_TIME
    Dependencies: none;

    Notes: Simulates a checkout line using the queue data structure and some given parameters.

    > java CheckoutLineSimulator 0.004 3 5 60
    SIMULATION_TIME:              60 min
    MIN_SERVICE_TIME:              3 sec
    MAX_SERVICE_TIME:            300 sec
    ARRIVAL_PROBABILITY:       0.004

    Customers Served:             19
    Average Waiting Time:       1.04 min
    Average Queue Length:       0.33

    > java CheckoutLineSimulator 0.007 30 10 120
    SIMULATION_TIME:             120 min
    MIN_SERVICE_TIME:             30 sec
    MAX_SERVICE_TIME:            600 sec
    ARRIVAL_PROBABILITY:       0.007

    Customers Served:             21
    Average Waiting Time:      30.21 min
    Average Queue Length:      10.83
****************************************************************************************************/
import java.util.*;

public class CheckoutLineSimulator {
    public static void main(String[] args) {
        // Parsing Arguments
        double ap = Double.parseDouble(args[0]);
        int min = Integer.parseInt(args[1]);
        int max = 60*Integer.parseInt(args[2]);
        int time = 60*Integer.parseInt(args[3]);

        // Printing Out Parameters
        System.out.printf("%-25s %6d min\n","SIMULATION_TIME:",time/60);
        System.out.printf("%-25s %6d sec\n","MIN_SERVICE_TIME:",min);
        System.out.printf("%-25s %6d sec\n","MAX_SERVICE_TIME:",max);
        System.out.printf("%-25s %6.3f \n\n","ARRIVAL_PROBABILITY:",ap);

        // Initializing Counters And Data Structures
        int count = 0, wait = 0, customer = 0, length = 0, curr = 0;
        Queue<Integer> customers = new LinkedList<Integer>();

        // Running Iterations
        while (count < time) {
            // Checking To See If Customer Has Arrived
            if (Math.random() < ap) {
                customers.add(count);
            }

            // Updating The Total Length
            length += customers.size();

            // Servicing A Customer
            if (!customers.isEmpty() && curr == 0) {
                customer++;
                wait += count - customers.remove();
                curr = (int)(Math.random()*(max-min+1))+min;
            } else {
                curr = Math.max(0,curr-1);
            }

            // Updating Time
            count++;
        }

        // Accounting For Customers Still In Queue
        int n = customers.size();
        while (!customers.isEmpty()) {
            wait += time - customers.remove();
        }

        // Printing Out Results
        System.out.printf("%-25s %6d \n", "Customers Served: ", customer);
        System.out.printf("%-25s %6.2f min \n", "Average Waiting Time: ", (1.0 * wait / (customer+n) / 60.0));
        System.out.printf("%-25s %6.2f \n", "Average Queue Length: ", (1.0 * length / time));
    }
}
