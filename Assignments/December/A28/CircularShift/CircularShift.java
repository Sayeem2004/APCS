/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class CircularShift {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }
        System.out.println((a+a).indexOf(b) != -1);
    }
}
