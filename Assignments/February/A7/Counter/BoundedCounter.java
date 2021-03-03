/****************************************************************************************************
    Names: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac BoundedCounter.java
    Dependencies: Counter.java IntCounter.java

    Notes: A subclass of IntCounter with a bounded range.
****************************************************************************************************/

public class BoundedCounter extends IntCounter {
    // Attributes
    private final int BOUND;

    // Constructors
    public BoundedCounter(int bound) {
        super(0);
        if (bound <= 0) throw new IllegalStateException("bound is bad");
        this.BOUND = bound;
    }
    public BoundedCounter(int value, int bound) {
        super(value);
        if (bound <= 0) throw new IllegalStateException("bound is bad");
        if (value > bound) throw new IllegalStateException("value is bad");
        this.BOUND = bound;
    }

    // Methods
    public int getBound() {return this.BOUND;}

    // Mutator Methods
    public void increment() {
        if (super.getValue() == this.BOUND) return;
        super.increment();
    }

    // Override Methods
    @Override
    public String toString() {
        return Integer.toString(super.getValue()) + "[bounded by " + Integer.toString(this.BOUND) + "]";
    }
}
