/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac CounterTester.java
    Execution: java CounterTester
    Dependencies: IntCounter.java Counter.java

    Notes: A client for testing IntCounter and Counter

    > java CounterTester
    counters: [0, 5]
    increment the counters
    counters: [1, 6]
    counters: [2, 7]
    counters: [3, 8]
    reset the counters
    counters: [0, 0]
****************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class CounterTester {
    public static void main(String [] args) {
	    List<Counter> counters = new ArrayList<Counter>();
	    counters.add(new IntCounter());
	    counters.add(new IntCounter(5));

	    System.out.println("counters: " + counters);

	    System.out.println("increment the counters");
	    for (int i = 0; i < 3; i++){
	        for(Counter c : counters) {
		        c.increment();
	        }
	        System.out.println("counters: " + counters);
	    }

	    System.out.println("reset the counters");
	    for (Counter c : counters){
	        c.reset();
	    }

	    System.out.println("counters: " + counters);
    }
}
