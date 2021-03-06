/****************************************************************************************************
    Name: Mohammad Khan & Diya Rao & Si Ying Ding & Joseph Kim & Sydney Moy & Evelyn Zheng &
    Rayyan Bhuiyan & Aryan Patel

    Compilation: javac Matching.java
    Execution: java Matching string
    Dependencies: StdIn.java StdOut.java

    Notes: Uses a stack to check if a string has balanced brackets, paranthesis, and curly braces.
    Type q into console to quit the program.

    > java Matching
    > { s = 2 * ( a[2] + 3); x = (1 + (2)); }
    Matched Bracketing Operators
    > (([])
    Mismatched Bracketing Operators
    > )(
    Mismatched Bracketing Operators
    > {(})
    Mismatched Bracketing Operators
    > q
****************************************************************************************************/
import java.util.*;

public class Matching {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        String a = StdIn.readLine();
        while (!a.equals("q")) {
            int n = a.length();
            boolean br = false;
            for (int i = 0; i < n; i++) {
                if ("{[(".indexOf(a.charAt(i)) != -1) st.push(a.charAt(i));
                int b = "}])".indexOf(a.charAt(i));
                if (b != -1) {
                    if (st.isEmpty() || st.pop() != "{[(".charAt(b)) {
                        System.out.println("Mismatched Bracketing Operators");
                        br = true; break;
                    }
                }
            }
            if (!br && st.isEmpty()) {
                System.out.println("Matched Bracketing Operators");
            } else if (!br) {
                System.out.println("Mismatched Bracketing Operators");
            }
            st.clear();
            a = StdIn.readLine();
        }
    }
}
