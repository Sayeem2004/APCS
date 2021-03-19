/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Lexicon.java
    Execution: java Lexicon
    Dependencies: opsd.txt In.java

    Notes: Reads in words from the scrabble lexicon and stores them in a set and then prints out all
    7 letter words in the set.

    > java Lexicon
    (Prints Out All 7-Letter Words)
****************************************************************************************************/
import java.util.*;


public class Lexicon {
    public static void main(String[] args){
	    // official Scrabble lexicon
	    // one word per line

	    In in = new In("ospd.txt");
	    Set<String> lexicon = new TreeSet<String>();

	    while (!in.isEmpty()) {
	        String s = in.readLine();
	        lexicon.add(s);
	    }

	   for (String x : lexicon) {
           if (x.length() == 7) System.out.println(x);
       }
    }
}
