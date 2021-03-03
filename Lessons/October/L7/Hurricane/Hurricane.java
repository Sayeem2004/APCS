/****************************************************************************************************
    Compilation: javac Hurricane.java
    Execution: java Hurricane speed

    Notes: Given an integer returns if it is a hurricane or not, and if it is the category of
    Hurrican it is.

    % java Hurricane 25
    Not a hurricane

    % java Hurricane 135
    Class 4 hurricane
****************************************************************************************************/

public class Hurricane {
    public static void main(String[] args) {
        int speed = Integer.parseInt(args[0]);
        if (speed < 74)
            System.out.println("Not a hurricane");
        else if (speed <= 95)
            System.out.println("Class 1 hurricane");
        else if (speed <= 110)
            System.out.println("Class 2 hurricane");
        else if (speed <= 130)
            System.out.println("Class 3 hurricane");
        else if (speed <= 155)
            System.out.println("Class 4 hurricane");
        else
            System.out.println("Class 5 hurricane");
    }
}
