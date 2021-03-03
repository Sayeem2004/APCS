/****************************************************************************************************
    Compilation:
    Execution:

    Notes:

    % java

****************************************************************************************************/

public class NumbersToEnglish {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int l = args[0].length();
        String[] hundred = new String[] {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", "seven hundred ", "eight hundred ", "nine hundred "};
        String[] tens = new String[] {"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
        String[] weird = new String[] {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
        if (n < 0) {
            System.out.print("negative ");
            n *= -1;
            l--;
        }
        if (l == 9) {
            int k = n/100000000; k %= 10;
            System.out.print(hundred[k]);
            l--;
        }
        if (l == 8) {
            int k = n/10000000; k %= 10;
            int k2 = n/1000000; k2 %= 10;
            if (k < 2) {
                System.out.print(weird[k*10+k2] + "million ");
                l -= 2;
            } else {
                System.out.print(tens[k]);
                l--;
            }
        }
        if (l == 7) {
            int k = n/1000000; k %= 10;
            System.out.print(weird[k] + "million ");
            l--;
        }
        if (l == 6) {
            int k = n/100000; k %= 10;
            System.out.print(hundred[k]);
            l--;
        }
        if (l == 5) {
            int k = n/10000; k %= 10;
            int k2 = n/1000; k2 %= 10;
            if (k < 2) {
                System.out.print(weird[k*10+k2] + "thousand ");
                l -= 2;
            } else {
                System.out.print(tens[k]);
                l--;
            }
        }
        if (l == 4) {
            int k = n/1000; k %= 10;
            System.out.print(weird[k] + "thousand ");
            l--;
        }
        if (l == 3) {
            int k = n/100; k %= 10;
            System.out.print(hundred[k]);
            l--;
        }
        if (l == 2) {
            int k = n/10; k %= 10;
            int k2 = n/1; k2 %= 10;
            if (k < 2) {
                System.out.print(weird[k*10+k2]);
                l -= 2;
            } else {
                System.out.print(tens[k]);
                l--;
            }
        }
        if (l == 1) {
            int k = n/1; k %= 10;
            System.out.println(weird[k]);
            l--;
        }
    }
}
