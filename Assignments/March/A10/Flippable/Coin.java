/****************************************************************************************************
    Name: Mohammad Khan & Diya Rao & Si Ying Ding & Joseph Kim & Sydney Moy & Evelyn Zheng

    Compilation: javac Coin.java
    Dependencies: Flippable.java

    Notes: Class for representing a fair coin toss
****************************************************************************************************/

public class Coin implements Flippable {
    private double prob;
    public Coin() {this.prob = 0.5;}
    public String flip() {return (Math.random() < prob) ? "H" : "T";}
}
