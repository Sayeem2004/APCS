/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class StringMethods {
    public static String scramble(String s) {
        String str = s;
        for (int i = 0; i < s.length()-1; i++) {
            int q = i+1+(int)(Math.random() * (s.length()-i-1));
            str = str.substring(0,i) + str.charAt(q) + str.substring(i+1,q) + str.charAt(i) + str.substring(q+1);
        }
        return str;
    }
    public static int indof(String a, String b, int ind) {
        if (b.length() > a.length()) return -1;
        for (int i = ind; i <= a.length()-b.length(); i++) {
            int count = 0;
            for (int q = 0; q < b.length(); q++) {
                if (a.charAt(i+q) == b.charAt(q)) count++;
            }
            if (count == b.length()) return i;
        }
        return -1;
    }
    public static int indof(String a, char b, int ind) {
        for (int i = ind; i < a.length(); i++) {
            if (a.charAt(i) == b) return i;
        }
        return -1;
    }
    public static int indof(String a, String b) {
        if (b.length() > a.length()) return -1;
        for (int i = 0; i <= a.length()-b.length(); i++) {
            int count = 0;
            for (int q = 0; q < b.length(); q++) {
                if (a.charAt(i+q) == b.charAt(q)) count++;
            }
            if (count == b.length()) return i;
        }
        return -1;
    }
    public static int indof(String a, char b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) return i;
        }
        return -1;
    }
    public static boolean endWith(String str, String suffix) {
        int a = suffix.length(), b = str.length();
        for (int i = b-a; i < b; i++) {
            if (str.charAt(i) != suffix.charAt(i-(b-a))) return false;
        }
        return true;
    }
    public static String lastword(String[] s) {
        String str = s[0];
        for (int i = 1; i < s.length; i++) {
            if (str.compareTo(s[i]) < 0) {
                str = s[i];
            }
        }
        return str;
    }
    public static void test() {
        System.out.println("ABC".equals("abc"));
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".compareTo("ABC"));
        System.out.println("ABC".compareTo("AB"));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("ABC".endsWith("c"));
    }
    public static int countSpaces2(String str) {
        int count = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (str.substring(i-1,i).equals(" ")) count++;
        }
        return count;
    }
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String[] s = {"A","B","C","CA"};
        // System.out.println(countSpaces(str));
        // System.out.println(countSpaces2(str));
        // test();
        // System.out.println(lastword(s));
        // System.out.println(endwith("ABC","BC"));
        // System.out.println(indof("ABC",'C'));
        // System.out.println(indof("ABC","BC"));
        // System.out.println(indof("ABC",'A',1));
        // System.out.println(indof("ABC","BC",2));
        System.out.println(scramble("ABCDEFGHIJKL"));
    }
}
