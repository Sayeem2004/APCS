/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Caroline Leung & Dylan Hu & Esteak Shapin & Jishan Chowdhury

    Compilation: javac GPA.java
    Execution: java GPA
    Dependencies: StdIn.java StdOut.java

    Notes: This program reads letter grades and calculates the average GPA. Input -1 to terminate
    the program. If a letter grade is not recognized an error will be outputted and it wont be
    counted towards the average.

    > java GPA
    > A+
    > A+
    > A+
    > A
    > -1
    Average GPA: 4.24750
****************************************************************************************************/
import java.util.*;

public class GPA {
    public static void main(String[] args) {
        Map<String,Double> conversion = new HashMap<String,Double>();
        conversion.put("A+",4.33); conversion.put("A",4.00); conversion.put("A-",3.67);
        conversion.put("B+",3.33); conversion.put("B",3.00); conversion.put("B-",2.67);
        conversion.put("C+",2.33); conversion.put("C",2.00); conversion.put("C-",1.67);
        conversion.put("D",1.00); conversion.put("F",0.00);

        int count = 0;
        double total = 0;

        while (true) {
            System.out.print("> ");
            String a = StdIn.readLine();
            if (a.equals("-1")) break;
            if (conversion.containsKey(a)) {
                count++; total += conversion.get(a);
            } else {
                System.out.println("Symbol not found");
            }
        }

        System.out.printf("Average GPA: %-10.5f \n",(total/count));
    }
}
