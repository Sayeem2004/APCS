/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Caroline Leung & Dylan Hu & Esteak Shapin & Jishan Chowdhury

    Compilation: javac ScrabbleShooks.java
    Execution: java ScrabbleShooks
    Dependencies: In.java opsd.txt

    Notes: Prints out all words from the Scrabble Dictionary in alphabetical order that can be S-hooked
    from the front or from the back.

    > java ScrabbleShooks
    (Large List Of Words In Alphabetical Order)
****************************************************************************************************/
import java.util.*;

public class ScrabbleShooks {
    public static void main(String[] args){
        In in = new In("ospd.txt");

        Set<String> all = new HashSet<String>();
        Set<String> s = new TreeSet<String>();

        while (!in.isEmpty()) {
            String word = in.readLine();
            all.add(word);
        }

        for (String x : all) {
            if (all.contains("s"+x) && all.contains(x+"s")) {
                s.add(x);
            }
        }

        for (String x : s) {
            System.out.println(x);
        }
    }
}
