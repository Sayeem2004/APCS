/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class StringMethods {
    public static String trim(String str) {
        int n = str.length();
        int end = n-1, start = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isWhitespace(str.charAt(i)) == false) {
                start = i;
                break;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if (Character.isWhitespace(str.charAt(i)) == false) {
                end = i;
                break;
            }
        }
        String ret = "";
        for (int i = start; i <= end; i++) {
            ret += str.charAt(i);
        }
        return ret;
    }
    public static String capitalize(String str) {
        String ret = "";
        ret += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            ret += Character.toLowerCase(str.charAt(i));
        }
        return ret;
    }
    public static int scrabble(String str) {
        int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            a -= 65;
            if (a >= 0 && a < 26) {
                ret += values[a];
            }
        }
        return ret;
    }
    public static String acronym(String str) {
        String ret = "";
        ret += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            boolean a = Character.isLetter(str.charAt(i));
            boolean b = Character.isLetter(str.charAt(i-1));
            if (a == true && b == false) {
                ret += Character.toUpperCase(str.charAt(i));
            }
        }
        return ret;
    }
    private static String removeCharacters(String str, String remove) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            if (remove.indexOf(str.charAt(i)) == -1) {
                ret += str.charAt(i);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        // System.out.println(trim("ABC   ")+"N");
        // System.out.println(trim("ABC D ")+"N");
        // System.out.println(trim("ABC DE   ")+"N");
        System.out.println(trim("\nABC D       \nD\n\n\n")+"N");
        // System.out.println(capitalize("BOOLEAN"));
        // System.out.println(capitalize("boolean"));
        // System.out.println(scrabble("FARM"));
        // System.out.println(scrabble("farMm!"));
        // System.out.println(acronym("Acquired Immune Deficiency Syndrome"));
        // System.out.println(acronym("self-contained+underwater4breathing.apparatus"));
        // System.out.println(removeCharacters("counterrevolutionaries", "aeiou"));
    }
}
