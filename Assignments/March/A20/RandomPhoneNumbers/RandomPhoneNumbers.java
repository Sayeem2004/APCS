/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RandomPhoneNumbers.java
    Execution: java RandomPhoneNumbers n
    Dependencies: In.java phone-na.csv

    Notes: Prints n random phone numbers of the form (xxx) xxx-xxxx.

    > java RandomPhoneNumbers 5
    (250) 114-3319
    (614) 904-3303
    (727) 787-6253
    (918) 844-3585
    (956) 168-6677
****************************************************************************************************/
import java.util.*;

public class RandomPhoneNumbers {
    public static String createNumber(ArrayList<String> ac) {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String num = "(";
        int n = (int)(Math.random()*ac.size());
        num += ac.get(n);
        num += ") ";
        for (int i = 0; i < 7; i++) {
            int q = (int)(Math.random()*10);
            num += digits[q];
            if (i == 2) num += "-";
        }
        return num;
    }

    public static void main(String[] args) {
        // Reading In Area Codes
        Set<String> area = new HashSet<String>();
        In in = new In("phone-na.csv");
        int s = 0;
        while (!in.isEmpty()) {
            String code = in.readLine();
            if (s == 0) {
                s++; continue;
            }
            String[] parts = code.split(",");
            area.add(parts[0]);
        }
        ArrayList<String> ac = new ArrayList<String>();
        for (String x : area) ac.add(x);

        // Creating Random Phone Numbers
        Set<String> numbers = new TreeSet<String>();
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            String num = createNumber(ac);
            while (numbers.contains(num)) {
                num = createNumber(ac);
            }
            numbers.add(num);
        }
        for (String x : numbers)
            System.out.println(x);
    }
}
