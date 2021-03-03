/****************************************************************************************************
    Compilation: javac RollLoadedDie.java
    Execution: java RollLoadedDie

    Notes: Prints the result of a loaded die such that 1-5 have a probabilty of 1/8 and 6 has a
    probabilty of 3/8

    % java
****************************************************************************************************/

public class RollLoadedDie {
    public static void main(String[] args) {
        double chance = Math.random();
        if (chance < .125) System.out.println(1);
        else if (chance < .250) System.out.println(2);
        else if (chance < .375) System.out.println(3);
        else if (chance < .500) System.out.println(4);
        else if (chance < .625) System.out.println(5);
        else System.out.println(6);
    }
}
