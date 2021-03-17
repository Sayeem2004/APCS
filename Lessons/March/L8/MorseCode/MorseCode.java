/****************************************************************************************************
    Names: Mohammad Khan & Jishan Chowdhury & Dylan Hu & Asa Muhammad & Caroline Leung & Esteak Shapin

    Compilation: javac MorseCode.java
    Execution: java MorseCode
    Dependencies: In.java StdIn.java StdOut.java morse.txt

    Notes: A program that accepts character and morse code sequences and translates them. This program
    only accepts letters and morse code for letters and ignores all other characters. If a morse code
    is given for a non-letter character the program will print out null instead of the character. 

    > java MorseCode
    Morse Code Translator
    > SOS TITANTIC
      ... --- ... - .. - .- -. - .. -.-.
    > WE ARE SINKING FAST
      .-- . .- .-. . ... .. -. -.- .. -. --. ..-. .- ... -
    > .... . .- -.. .. -. --. ..-. --- .-. -.-- --- ..-
      HEADINGFORYOU
    > ...?. .? .?- -?.. .?. -?. -?-. .?.-. -?-?- .?-. ?-.-?- --?- .?.-
      HEADINGFORYOU
    > -1
****************************************************************************************************/

import java.util.*;

public class MorseCode {
    public static void main(String[] args) {
        // Creating A Map From The Data
        In in = new In("morse.txt");
	    Map <Character,String> toMorse = new HashMap<Character,String>();
	    Map <String,Character> fromMorse = new HashMap<String,Character>();

        // Configuring The Map To Only Include Characters
	    while (!in.isEmpty()) {
	        String line = in.readLine();
            if (line.length() < 3) continue;
            if ('A' <= line.charAt(0) && 'Z' >= line.charAt(0)) {
                int a = (line.indexOf('-') == -1) ? 10 : line.indexOf("-");
                int b = (line.indexOf('.') == -1) ? 10 : line.indexOf(".");
                int c = (line.lastIndexOf('-') == -1) ? 0 : line.lastIndexOf("-");
                int d = (line.indexOf('.') == -1) ? 0 : line.lastIndexOf(".");
	            char letter = line.charAt(0);
	            String morse = line.substring(Math.min(a,b),Math.max(c,d)+1);
	            toMorse.put(letter,morse);
                fromMorse.put(morse,letter);
            }
	    }

        // Reading In From Console
        System.out.println("Morse Code Translator");
        while (true) {
            System.out.print("> ");
            String a = StdIn.readLine();
            a = a.toUpperCase();
            if (a.substring(0,2).equals("-1")) break;
            char f = a.charAt(0);

            if ('A' <= f && f <= 'Z') {
                System.out.print("  ");
                for (int i = 0; i < a.length(); i++) {
                    char t = a.charAt(i);
                    if ('A' <= t && t <= 'Z') System.out.print(toMorse.get(t)+" ");
                }
            }

            if (f == '.' || f == '-') {
                System.out.print("  ");
                String b = "";
                for (int i = 0; i < a.length(); i++) {
                    char t = a.charAt(i);
                    if (t == ' ') {
                        System.out.print(fromMorse.get(b));
                        b = ""; continue;
                    }
                    if (t == '-' || t == '.') b += t;
                }
                System.out.print(fromMorse.get(b));
            }

            System.out.println();
        }
    }
}
