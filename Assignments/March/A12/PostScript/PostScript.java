/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac PostScript.java
    Execution: java PostScript n k
    Dependencies: none

    Notes: Performs a roll operation on a stack of size 4. (4 >= n >= 0, k >= 0).

    > java PostScript 4 1
    Initial : [A, B, C, D]
    after roll(4, 1): [D, A, B, C]

    > java PostScript 3 2
    Initial : [A, B, C, D]
    after roll(3, 2): [A, C, D, B]

    > java PostScript 2 4
    Initial : [A, B, C, D]
    after roll(2, 4): [A, B, C, D]
****************************************************************************************************/
import java.util.*;

public class PostScript {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        Stack<String> s = new Stack<String>();
        s.push("A"); s.push("B"); s.push("C"); s.push("D");
        System.out.println("Initial : " + s);
        roll(s,n,k);
        System.out.println("after roll(" + n + ", " + k + "): " + s);
    }

    public static void roll(Stack<String> stack, int n, int k){
        if (n < 0 || k < 0 || n > stack.size()) throw new RuntimeException("roll: argument out of range");
        List<String> temp = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            temp.add(i,stack.pop());
        }
        if (n == 0) k = 0;
        else k %= n;
        List<String> add = new ArrayList<String>(n);
        add.addAll(temp.subList(k,n));
        add.addAll(temp.subList(0,k));
        for (int i = n-1; i >= 0; i--) {
            stack.push(add.get(i));
        }
    }
}
