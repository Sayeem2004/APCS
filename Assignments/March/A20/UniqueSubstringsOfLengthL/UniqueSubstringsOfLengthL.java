/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac UniqueSubstringsOfLengthL.java
    Execution: java UniqueSubstringsOfLengthL
    Dependencies: StdIn.java StdOut.java

    Notes: Takes a string s and an integer l from standard input and prints the number of distinct
    substrings of s with length l. If l > s.length() or l < 0 or l is not an integer and error will
    be produced. Input -1 into the Text or Length of Substring section to terminate the program.

    > java UniqueSubstringsOfLengthL
    Text: cgcgggcgcg
    Length Of Substring: 1
    2

    Text: cgcgggcgcg
    Length Of Substring: 2
    3

    Text: cgcgggcgcg
    Length Of Substring: 3
    5

    Text: -1
****************************************************************************************************/
import java.util.*;

public class UniqueSubstringsOfLengthL {
    public static void main(String[] args) {
        Set<String> sub = new HashSet<String>();
        String s; int l;

        while (true) {
            System.out.print("Text: ");
            s = StdIn.readLine();
            if (s.equals("-1")) break;

            System.out.print("Length Of Substring: ");
            try {
                l = Integer.parseInt(StdIn.readLine());
                if (l == -1) break;
                if (l > s.length()) {
                    System.out.println("Substring can not be larger than original string");
                    System.out.println();
                    continue;
                }
                if (l < 0) {
                    System.out.println("Substring can not have a negative length");
                    System.out.println();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Length given was not an integer");
                System.out.println();
                continue;
            }

            for (int i = 0; i <= s.length()-l; i++) {
                sub.add(s.substring(i,i+l));
            }
            System.out.println(sub.size());
            System.out.println();
            sub.clear();
        }
    }
}
