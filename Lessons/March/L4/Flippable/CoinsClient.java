/****************************************************************************************************
    Name: Mohammad Khan & Diya Rao & Si Ying Ding & Joseph Kim & Sydney Moy & Evelyn Zheng

    Compilation: javac CoinsClient.java
    Execution: java CoinsClient n
    Dependencies: Flippable.java Coin.java BiasedCoin.java

    Notes: Flips a regular and a biased coin n times and compares the probabilty of getting heads.

    > java CoinsClient 100
    Unbiased Coin:
    HHHTTTHHHTHTTHHHTTHTTHTTHTHHHTTHTTHTTTHHHHHHTTTHTHHTHTTHTTHHHHHTHTHTHHHHTTHHHHTTTTTHTTTTHHTHHHTHTTTH
    Observed head %: 52.0
    Biased Coin:
    THTTTTTTTTTTHTTHTTTTTHTTHTHTTTTTHTTTTTHTTTTTTHTTTTTTTTTHTTTTTTTTHHTHTTHTHTTHTTTTTTTTTTTTTTTHTHTTTTTT
    Observed head %: 18.0

    Questions (Tasks 2 and 3):
    1. Given code below, what is the chance of flipping a H? -> (0.5 * 0.5) + (0.2 * 0.5) -> 0.35
        if (Math.random() < 0.5) c = new Coin();
        else c = new BiasedCoin(0.2);
        c.flip();

    2. Will this code compile? Explain. -> This will not compile because the Object class has no
    reference to the flip method in its class (only the subclass has reference to flip).
        Object c = new Coin();
        c.flip();

    3. Will this compile? Explain. -> This will compile because the Flippable class has a direct
    reference to the flip method (its a method found in the interface).
        Flippable c = new BiasedCoin(0.2);
        c.flip();

    4. Will it run?  Explain. -> This will also run because the reference to flip will be checked
    across all subclasses of Flippable, and thus runtime will find the actual method in the BiasedCoin
    class and use that method to run the code.
        Flippable c = new BiasedCoin(0.2);
        c.flip();

    5. Given:  A a = new A(10);
          (a). a.f(); -> 12
          (b). a.g(); -> 8

    6. Given:  A b = new B(10);
          (a). b.f(); -> 3
          (b). b.g(); -> 30

    7. Given: C c = new C(10);
          (a). c.f(); -> 3
          (b). c.g(); -> 6
          (c). c.h(); -> 19

    8. Given: A c = new C(10);
          (a). c.f(); -> 3
          (b). c.g(); -> 6
          (c). c.h(); -> Does Not Compile

    9. Given: C d = new C(10);
          (a). ((A)d).f(); -> 3
          (b). ((A)d).g(); -> 6
          (c). ((A)d).h(); -> Does Not Compile

    10. Given:
            Interface1 t1 = new R();
            R t2 = (R)t1;
        Evaluate the following:
            (a). t1.f(1); -> 2
            (b). t2.f(1); -> 2
            (c). t1.g(1); -> Does Not Compile
            (d). t2.g(1); -> 10
            (e). t1.toString(); -> Howdy
            (f). t2.toString(); -> Howdy
****************************************************************************************************/

public class CoinsClient {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String ret1 = "", ret2 = "";
        int c1 = 0, c2 = 0;
        Coin c = new Coin();
        BiasedCoin bc = new BiasedCoin(0.2);
        for (int i = 0; i < n; i++) {
            ret1 += c.flip();
            ret2 += bc.flip();
            if (ret1.charAt(i) == 'H') c1++;
            if (ret2.charAt(i) == 'H') c2++;
        }
        System.out.println("Unbiased Coin:");
        System.out.println(ret1);
        System.out.println("Observed head %: " + c1 * 100.0 / n);
        System.out.println("Biased Coin:");
        System.out.println(ret2);
        System.out.println("Observed head %: " + c2 * 100.0 / n);
    }
}
