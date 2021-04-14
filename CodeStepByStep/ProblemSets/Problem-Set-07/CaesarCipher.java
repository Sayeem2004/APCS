public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your message? ");
        String s = sc.next("\n").toUpperCase();
        System.out.println();
        System.out.print("Encoding key? ");
        int n = sc.nextInt();
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                System.out.print((char)(65+((int)s.charAt(i)-65+n+26)%26));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
