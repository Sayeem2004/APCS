/****************************************************************************************************
    Name: Mohammad Khan & Diya Rao & Si Ying Ding & Joseph Kim & Sydney Moy & Evelyn Zheng

    Compilation: javac BiasedCoin.java
    Dependencies: Flippable.java Coin.java

    Notes: Class for representing an unfair coin toss
****************************************************************************************************/

public class BiasedCoin extends Coin {
    private double prob;
    public BiasedCoin(double prob) {this.prob = prob;}
    public String flip() {return (Math.random() < prob) ? "H" : "T";}
}
