/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class TitiusBode {
    public static double titius(int n) {
        return (bode(n) + 4.0) / 10.0;
    }
    public static int bode(int n) {
        if (n == 1) return 1;
        if (n == 2) return 3;
        return 2 * bode(n-1);
    }
    public static void main(String[] args) {
        String[] v = {"Mercury","Venus","Earth","Mars","Asteroid Belt","Jupiter","Saturn","Uranus","Neptune"};
        for (int i = 1; i < 10; i++) {
            System.out.println(v[i-1] + ": " + titius(i) + "AU");
        }
        System.out.println(titius(10));
    }
}
