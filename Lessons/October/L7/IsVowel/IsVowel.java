/****************************************************************************************************
    Compilation: javac IsVowel.java
    Execution: java IsVowel s

    Notes: Returns true if s is a vowel and false if not. s has to be 1 character and can be
    lowercase or uppercase.

    % java IsVowel a
    vowel

    % java IsVowel A
    vowel

    % java IsVowel c
    not a vowel
****************************************************************************************************/

public class IsVowel {
    public static void main(String[] args) {
        switch(args[0]) {
            case "A": case "E": case "I": case "O": case "U":
                System.out.println("vowel");
                break;
            case "a": case "e": case "i": case "o": case "u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");
        }
    }
}
