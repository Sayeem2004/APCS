/****************************************************************************************************
    Name: Mohammad Khan, Bryan Zhang, Jessica Eng, Frank Wang, Janice Min, Ryan Wang

    Compilation: javac Permutations,java
    Execution: java Permutations word
    Dependencies: none

    Notes: Prints out all the permutations of the word using 3 different methods.

    > java Permutations ABC
    [ABC, ACB, BAC, BCA, CAB, CBA]
    [ABC, ACB, BAC, BCA, CAB, CBA]
    ABC
    ACB
    BAC
    BCA
    CBA
    CAB
****************************************************************************************************/
import java.util.*;

public class Permutations {
    public static TreeSet<String> generatePermutations(String s) {
	    TreeSet<String> ans = new TreeSet<String>();
	    if (s.length() <= 1) ans.add(s);
	    else {
	        for (int i = 0; i < s.length(); i++){
		        String letter = s.substring(i,i+1);
		        String rest = s.substring(0,i) + s.substring(i+1);
		        for (String str : generatePermutations(rest))
		           ans.add(letter + str);
	         }
	    }
	    return ans;
    }

    public static TreeSet<String> generatePermutations2(String s) {
        TreeSet<String> ans = new TreeSet<String>();
        if (s.length() <= 1) ans.add(s);
        else {
            char letter = s.charAt(0);
            String rest = s.substring(1);
            for (String str : generatePermutations2(rest)) {
                for (int i = 0; i < str.length(); i++) {
                    ans.add(str.substring(0,i)+letter+str.substring(i));
                }
                ans.add(str+letter);
            }
        }
        return ans;
    }

    public static void listPermutations(String str) {
        char[] ch = str.toCharArray();
        listPermutations(ch, 0);
    }

    public static void listPermutations(char[] ch, int index) {
        if (index == ch.length) {
            System.out.println(new String(ch));
            return;
        }
        for (int i = index; i < ch.length; i++) {
            char t = ch[i]; ch[i] = ch[index]; ch[index] = t;
            listPermutations(ch,index+1);
            ch[index] = ch[i]; ch[i] = t;
        }
    }

    public static void main(String [] args) {
	    if (args.length == 0) {
	        System.out.println(generatePermutations(""));
            System.out.println(generatePermutations2(""));
            listPermutations("");
	    } else {
	        System.out.println(generatePermutations(args[0]));
            System.out.println(generatePermutations2(args[0]));
            listPermutations(args[0]);
        }
    }
}
