/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RandomWord.java
    Execution: java RandomWord < RandomWordIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Prints a random word from a list of words.

    $ more RandomWordIO.txt
    hi bye tie nye spy fight white red maroon george
    $ java RandomWord < RandomWordIO.txt
    bye
****************************************************************************************************/

public class RandomWord {
    public static void main(String[] args) {
        String ans = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String a = StdIn.readString();
            if (Math.random() < 1.0/i)
                ans = a;
            i++;
        }
        System.out.println(ans);
    }
}
