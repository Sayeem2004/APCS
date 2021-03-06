/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ReverseWithStack.java
    Execution: java ReverseWithStack {a,b,c,d,..}
    Dependencies: StdIn.java StdOut.java

    Notes: Uses a stack to reverse the order of a random number of integers. To end the input type
    the number 0 into the console.

    > java ReverseWithStack
    > 1
    > 2
    > 3
    > 4
    > 0
    
    4
    3
    2
    1
****************************************************************************************************/
import java.util.*;

public class ReverseWithStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int a = StdIn.readInt();
        while (a != 0) {
            st.push(a);
            a = StdIn.readInt();
        }
        System.out.println();
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
