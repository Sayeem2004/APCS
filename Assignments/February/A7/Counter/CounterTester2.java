/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac CounterTester2.java
    Execution: java CounterTester2.java
    Dependencies: Counter.java IntCounter.java ModularCounter.java

    Notes: An updated client for testing ModularCounter.java

    > java CounterTester2
    counters: [0, 0 (5)]
    increment the counters
    counters: [1, 1 (5)]
    counters: [2, 2 (5)]
    counters: [3, 3 (5)]
    counters: [4, 4 (5)]
    counters: [5, 0 (5)]
    counters: [6, 1 (5)]
    counters: [7, 2 (5)]
    counters: [8, 3 (5)]
    counters: [9, 4 (5)]
    counters: [10, 0 (5)]
    reset the counters
    counters: [0, 0 (5)]
****************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class CounterTester2 {
    public static void main(String [] args) {
        List<Counter> counters = new ArrayList<Counter>();

        counters.add(new IntCounter());
        counters.add(new ModularCounter(5));

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
