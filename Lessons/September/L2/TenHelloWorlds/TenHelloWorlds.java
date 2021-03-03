/****************************************************************************************************
    Compilation: javac TenHellowWorlds.java
    Execution: java TenHelloWorlds

    Notes: Prints "Hello, World" 10 times.

    % java TenHelloWorlds
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World
    Hello, World

****************************************************************************************************/

public class TenHelloWorlds {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("Hello World!");
    }
}
