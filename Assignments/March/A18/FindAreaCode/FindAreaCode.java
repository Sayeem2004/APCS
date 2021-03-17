/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac FindAreaCode.java
    Execution: java FindAreaCode
    Dependencies: phone-na.csv In.java StdIn.java StdOut.java

    Notes: A program that creates two maps out of area codes and state names using data from
    phone-na.csv. If an area code is inputed the program will output the state that area code belongs
    to. If a state is given the program will output all area codes that belong to that state. If a
    code or name is not found a notification will be printed. Input -1 to stop the program.

    > java FindAreaCode
    Enter area code or state name: 650
    California
    Enter area code or state name: 202
    District of Columbia
    Enter area code or state name: 778
    British Columbia
    Enter area code or state name: Oregon
    503
    541
    971
    Enter area code or state name: -1
****************************************************************************************************/
import java.util.*;

public class FindAreaCode {
    public static void main(String[] args) {
        // Initializing Maps
        In in = new In("phone-na.csv");
	    Map<Integer,String> code = new HashMap<Integer,String>();
	    Map<String,String> area = new HashMap<String,String>();

        // Filling In The Maps With Data
        int q = 0;
        while (!in.isEmpty()) {
            String line = in.readLine();
            if (q == 0) {q++; continue;}
            String[] parts = line.split(",");
            code.put(Integer.parseInt(parts[0]),parts[2]);
            if (area.containsKey(parts[2])) {
                area.put(parts[2],area.get(parts[2])+","+parts[0]);
            } else {
                area.put(parts[2],parts[0]);
            }
        }

        // Reading In Input From Console
        while (true) {
            System.out.print("Enter area code or state name: ");
            String a = StdIn.readLine();
            if (a.substring(0,2).equals("-1")) break;

            if (area.containsKey(a)) {
                String[] nums = area.get(a).split(",");
                System.out.println(nums[0]);
                for (int i = 1; i < nums.length; i++) {
                    if (!nums[i].equals(nums[i-1]))
                        System.out.println(nums[i]);
                }
                continue;
            }
            try {
                if (code.containsKey(Integer.parseInt(a))) {
                    System.out.println(code.get(Integer.parseInt(a)));
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Area code or state name not found");
                continue;
            }
            System.out.println("Area code or state name not found");
        }
    }
}
