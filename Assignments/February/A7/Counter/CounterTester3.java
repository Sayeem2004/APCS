/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac CounterTester3.java
    Execution: java CounterTester3
    Dependencies: Counter.java IntCounter.java ModularCounter.java BoundedCounter.java

    Notes: An updated client for testing BoundedCounter.java

    > java CounterTester3
    counters: [0, 0 (5), 0[bounded by 7]]
    increment the counters
    counters: [1, 1 (5), 1[bounded by 7]]
    counters: [2, 2 (5), 2[bounded by 7]]
    counters: [3, 3 (5), 3[bounded by 7]]
    counters: [4, 4 (5), 4[bounded by 7]]
    counters: [5, 0 (5), 5[bounded by 7]]
    counters: [6, 1 (5), 6[bounded by 7]]
    counters: [7, 2 (5), 7[bounded by 7]]
    counters: [8, 3 (5), 7[bounded by 7]]
    counters: [9, 4 (5), 7[bounded by 7]]
    counters: [10, 0 (5), 7[bounded by 7]]
    reset the counters
    counters: [0, 0 (5), 0[bounded by 7]]
****************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class CounterTester3 {

    public static void main(String [] args){
        List<Counter> counters = new ArrayList<Counter>();

        counters.add(new IntCounter());
        counters.add(new ModularCounter(5));
        counters.add(new BoundedCounter(7));

        System.out.println("counters: " + counters);

        System.out.println("increment the counters");
        for (int i = 0; i < 10; i++){
            for(Counter c : counters){
                c.increment();
            }
            System.out.println("counters: " + counters);
        }

        System.out.println("reset the counters");
        for(Counter c : counters){
            c.reset();
        }

        System.out.println("counters: " + counters);
    }
}
