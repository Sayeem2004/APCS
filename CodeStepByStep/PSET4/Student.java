public class Student {
    private String name;
    private int id, units;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.units = 0;
    }

    public String getName() {
        return this.name;
    }
    public int getID() {
        return this.id;
    }
    public int getUnits() {
        return this.units;
    }

    public void incrementUnits(int units) {
        this.units += units;
    }
    public boolean hasEnoughUnits() {
        return units >= 180;
    }
    
    @Override
    public String toString() {
        return this.name + " (#" + this.id + ")";
    }
}
