/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac RanDupInt.java
    Execution: java RanDupInt
    Dependencies: none

    Notes: Returns 10 values duplicated anywhere from 0 to 10 times.

    > java RanDupInt
    16 16 16 16 16 16 98 98 98 98 98 24 24 85 16 16 16 16 89 89 89 89 89 89 53 53 53 53 53 53 53 28
    28 28 28 28 28 46 46 46 46 46 46 46 46
****************************************************************************************************/

public class RanDupInt {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 10);
            for (int q = 0; q < b; q++)
                System.out.print(a + " ");
        }
        System.out.println();
    }
}
