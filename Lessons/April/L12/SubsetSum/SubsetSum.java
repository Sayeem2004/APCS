/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Caroline Leung & Dylan Hu & Esteak Shapin & Jishan Chowdhury

    Compilation: javac SubsetSum.java
    Execution: java SubsetSum a b c d ...
    Dependencies: StdIn.java StdOut.java

    Notes: Takes in a sample set and a target value and outputs whether the target can be reached by
    a subset of the sample set and the number of distinct subsets that achieve this target value.

    > java SubsetSum 1 3 4 5
    Enter target value: 5
    Set: [1, 3, 4, 5]
    Target: 5
    Subset exists? true
    Subset sum ways: 2

    > java SubsetSum 1 3 4 5
    Enter target value: 11
    Set: [1, 3, 4, 5]
    Target: 11
    Subset exists? false
    Subset sum ways: 0
****************************************************************************************************/
import java.util.*;

public class SubsetSum {
    public static int subsetSumWays(TreeSet<Integer> set, int target) {
        if (set.isEmpty()) return (target == 0 ? 1 : 0);
        int first = set.first();
        TreeSet<Integer> rest = new TreeSet<Integer>(set);
	    rest.remove(first);
        return subsetSumWays(rest, target-first) + subsetSumWays(rest, target);
    }

    public static boolean subsetExists(TreeSet<Integer> set, int target) {
	    if (set.isEmpty()) return target == 0;
	    int first = set.first();
     	TreeSet<Integer> rest = new TreeSet<Integer>(set);
	    rest.remove(first);
	    return subsetExists(rest, target-first) || subsetExists(rest, target);
    }

    public static void main(String [] args) {
	    TreeSet<Integer> set = new TreeSet<Integer>();
	    for (String s : args)
	        set.add(Integer.parseInt(s));
	    System.out.print("Enter target value: ");
	    int target = StdIn.readInt();

	    System.out.println("Set: " + set);
	    System.out.println("Target: " + target);
	    System.out.println("Subset exists? " + subsetExists(set,target));
        System.out.println("Subset sum ways: " + subsetSumWays(set,target));
    }
}
