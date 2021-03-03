/****************************************************************************************************
    Names: Mohammad Khan & Kevin Cao & Evelyn Zheng & Aryan Patel & Xian Jun An & Noakai Aronesty

    Compilation: javac Animal.java
    Dependencies: none

    Notes: An interface for an animal type
****************************************************************************************************/

public abstract class Animal {
    // Attributes
    private int position, max, prev, strength;
    private boolean gender;

    // Constructors
    public Animal() {
        this.position = 0;
        this.max = 0;
        this.gender = true;
        this.strength = 0;
    }
    public Animal(int position, int max, boolean gender, int strength) {
        this.position = position;
        this.max = max;
        this.gender = gender;
        this.strength = strength;
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
    public int getStrength() {return this.strength;}
    public boolean getGender() {return this.gender;}
    public void goBack() {this.position = this.prev;}
    public Animal create(int pos, int rl) {
        boolean gen = (Math.random() < 0.5) ? true : false;
        int str = (int)(Math.random()*101);
        if (this.equals(new Bear())) return new Bear(pos,rl,gen,str);
        else return new Fish(pos,rl,gen,str);
    }
}
