/****************************************************************************************************
    Names: Mohammad Khan & Kevin Cao & Evelyn Zheng & Aryan Patel & Xian Jun An & Noakai Aronesty

    Compilation: javac Animal.java
    Dependencies: none

    Notes: An interface for an animal type
****************************************************************************************************/

public abstract class Animal {
    // Attributes
    private int position, max, prev;

    // Constructors
    public Animal() {
        this.position = 0;
        this.max = 0;
    }
    public Animal(int position, int max) {
        this.position = position;
        this.max = max;
    }

    // Methods
    public void move() {
        double a = Math.random();
        this.prev = this.position;
        if (a < 1.0 / 3) {
            if (this.position > 0) this.position--;
        }
        if (a < 2.0 / 3) {
            if (this.position < this.max-1) this.position++;
        }
    }
    public int getPos() {return this.position;}
    public void goBack() {this.position = this.prev;}
    public Animal create(int pos, int rl) {
        if (this.equals(new Bear())) return new Bear(pos,rl);
        else return new Fish(pos,rl);
    }
}
