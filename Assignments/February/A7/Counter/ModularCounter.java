/****************************************************************************************************
    Names: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac ModularCounter.java
    Dependencies: IntCounter.java Counter.java

    Notes: A subclass of IntCounter for specifying a modular value(modulo).
****************************************************************************************************/

public class ModularCounter extends IntCounter {
    // Attributes
    private final int MODULO;

    // Constructors
    public ModularCounter(int modulo) {
        super(0);
        if (modulo <= 0) throw new IllegalStateException("modulus is bad");
        this.MODULO = modulo;
    }
    public ModularCounter(int value, int modulo) {
        super(value);
        if (modulo <= 0) throw new IllegalStateException("modulus is bad");
        if (value < 0 || value >= modulo) throw new IllegalStateException("value is bad");
        this.MODULO = modulo;
    }

    // Methods
    public int getModulus() {return this.MODULO;}

    // Mutator Methods
    public void increment() {
        super.increment();
        if (super.getValue() == this.MODULO) super.reset();
    }

    // Override Methods
    @Override
    public String toString() {
        return Integer.toString(super.getValue()) + " (" + Integer.toString(this.MODULO) + ")";
    }

}
