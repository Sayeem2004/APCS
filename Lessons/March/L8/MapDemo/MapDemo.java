/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac MapDemo.java
    Execution: java MapDemo n
    Dependencies: StdIn.java StdOut.java

    Notes: The program MapDemo takes an integer command-line arguement, n, and allows the user to
    store n key-value pairs.

    > java MapDemo 5
        hash map : {}
        tree map : {}
    Enter variable name -> wt
    Enter a floating-point value -> 235.5

        hash map : {wt=235.5}
        tree map : {wt=235.5}
    Enter variable name -> ht
    Enter a floating-point value -> 73.2

        hash map : {ht=73.2, wt=235.5}
        tree map : {ht=73.2, wt=235.5}
    Enter variable name -> age
    Enter a floating-point value -> 55.3

        hash map : {ht=73.2, wt=235.5, age=55.3}
        tree map : {age=55.3, ht=73.2, wt=235.5}
    Enter variable name -> wt
    Enter a floating-point value -> 240.4

        hash map : {ht=73.2, wt=240.4, age=55.3}
        tree map : {age=55.3, ht=73.2, wt=240.4}
    Enter variable name -> shoeSize
    Enter a floating-point value -> 11.5

        hash map : {shoeSize=11.5, ht=73.2, wt=240.4, age=55.3}
        tree map : {age=55.3, ht=73.2, shoeSize=11.5, wt=240.4}
    sum the values: 380.40000000000003
****************************************************************************************************/
import java.util.*;

public class MapDemo {
    public static double sum(Map<String,Double> map){
    	double sum = 0;
	    for (String variable: map.keySet()){
	        sum += map.get(variable);
	    }
	    return sum;
    }

    // Keys are Strings, Values are floating-point values.
    public static void main(String[] args) {
	    int n = Integer.parseInt(args[0]);

	    // Declare and Instantiate Two Maps
	    Map<String,Double> varTable1 = new HashMap<String,Double>();
	    Map<String,Double> varTable2 = new TreeMap<String,Double>();

	    for (int i = 0; i < n; i++) {
	        // print the Maps
	        System.out.println("\thash map : " + varTable1);
	        System.out.println("\ttree map : " + varTable2);

	        // read input from the user
	        System.out.print("Enter variable name -> ");
	        String variable = StdIn.readString();
	        System.out.print("Enter a floating-point value -> ");
	        double value = StdIn.readDouble();

	        // store the association
	        varTable1.put(variable, value);
	        varTable2.put(variable, value);
            System.out.println();
	    }

	    System.out.println("\thash map : " + varTable1);
        System.out.println("\ttree map : " + varTable2);
        System.out.println("\tsum the values: " + sum(varTable1));
    }
}
