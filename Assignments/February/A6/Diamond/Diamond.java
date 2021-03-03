/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac Diamond.java
    Dependencies: none

    Notes: A class for containing the attributes of a diamond.
****************************************************************************************************/

public final class Diamond implements Comparable<Diamond> {
    // Attributes
    private final String stockNumber; // a code 
    private final double carot; // size of the diamond
    private final String clarity; // clarity grade of the diamond
    private final char color; // color grade D-Z
    private final String cut; // name of the cut
    private final String[] clarities = {"FL", "IF", "VVS1", "VVS2", "VS1", "VS2", "SI1", "SI2", "I1", "I2", "I3"};

    // Constructor
    public Diamond(String s, double car, String clar, char col, String ct) {
        stockNumber = s;
        carot = car;
        clarity = clar;
        color = col;
        cut = ct;
    }

    // Accessor Methods
    String getStock()   {return stockNumber;}
    double getCarot()   {return carot;}
    String getClarity() {return clarity;}
    char   getColor()   {return color;}
    String getCut()     {return cut;}

    // Override Methods
    @Override
    public String toString(){
        return this.getStock() + "-" + this.getCarot() + "-" + this.getClarity() + "-" +
        this.getColor() + "-" + this.getCut();
    }
    @Override
    public int compareTo(Diamond other) {
        Double s = this.getCarot();
        Double s2 = other.getCarot();
        int a = s.compareTo(s2);
        int b = Math.min(cValue(this.getClarity()),((int)this.getColor()-68)/2);
        int c = Math.min(cValue(other.getClarity()),((int)other.getColor()-68)/2);
        if (a != 0) return a*-1;
        return b-c;
    }
    public int cValue(String clarity) {
        for (int i = 0; i < clarities.length; i++) {
            if (clarities[i].equals(clarity))
                return i;
        }
        return 11;
    }
}
