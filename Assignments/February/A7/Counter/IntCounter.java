/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac IntCounter.java
    Dependencies: Counter.java

    Notes: A counter subclass for specifically integers.
****************************************************************************************************/

public class IntCounter implements Counter {
    // Attributes
    private int count;

    // Constructors
    public IntCounter() {this.count = 0;}
    public IntCounter(int count) {this.count = count;}

    // Methods
    public int getValue() {return this.count;}

    // Mutator Methods
    public void reset() {this.count = 0;}
    public void increment() {this.count++;}

    // Override Methods
    @Override
    public String toString() {return Integer.toString(count);}
}
