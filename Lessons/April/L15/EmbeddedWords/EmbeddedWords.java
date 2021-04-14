/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac EmbeddedWords.java
    Execution: java EmbeddedWords word
    Dependencies: In.java word.utf-8.txt

    Notes: Creates all ordered subsets of a given word and prints out the subsets that are in the
    English dictionary.

    > java EmbeddedWords happy
    The embedded words are:
    a
    ap
    app
    ay
    h
    ha
    hap
    happy
    hay
    hp
    hy
    p
    pp
    y
****************************************************************************************************/
import java.util.*;

public class EmbeddedWords {
    public static Set<String> createEmbeds(Set<String> embeds, String word) {
        if (word.length() == 0) return embeds;
        Set<String> ret = new TreeSet<String>();
        for (String s : embeds) {
            ret.add(s + word.charAt(0));
            ret.add(s);
        }
        return createEmbeds(ret, word.substring(1));
    }

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        In in = new In("words.utf-8.txt");
        while (!in.isEmpty()) {
            String w = in.readLine();
            words.add(w);
        }

        String word = args[0];
        Set<String> embeds = new TreeSet<String>();
        embeds.add("");
        embeds = createEmbeds(embeds, word);
        embeds.remove("");
        System.out.println("The embedded words are:");
        for (String s : embeds) {
            if (words.contains(s))
                System.out.println(s);
        }
    }
}
