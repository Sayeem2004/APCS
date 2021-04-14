import java.util.*;

public class Mnemonics {
    static HashMap<Character, String> hash;
    public static void main(String[] args) {
        hash = new HashMap<Character, String>();
        hash.put('0',"");
        hash.put('1',"");
        hash.put('2',"ABC");
        hash.put('3',"DEF");
        hash.put('4',"GHI");
        hash.put('5',"JKL");
        hash.put('6',"MNO");
        hash.put('7',"PQRS");
        hash.put('8',"TUV");
        hash.put('9',"WXYZ");

        System.out.println("Number: " + args[0]);
        for (String s : listMnemonics(args[0]))
            System.out.println(s);
    }

    static ArrayList<String> listMnemonics(String s) {
        ArrayList<String> arr = new ArrayList<String>();
        if (s.length() == 0) {
            arr.add("");
            return arr;
        }
        char c = s.charAt(0);
        if (c == '1' || c == '0') {
            return listMnemonics(s.substring(1));
        }
        for (char i : hash.get(c).toCharArray()) {
            for (String x : listMnemonics(s.substring(1))) {
                arr.add(Character.toString(i)+x);
            }
        }
        return arr;
    }
}
