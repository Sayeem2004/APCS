/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Rumors.java
    Execution: java Rumors n trials

    Notes: Alice is throwing a party with n other guests, including Bob. Bob starts a rumor about
    Alice by telling it to one of the other guests. A person hearing this rumor for the first time
    will immediately tell it ot one other guest, chosen uniformly at random from all the people at
    the party except Alice and the person from whom they heard it. If a person (including Bob) hears
    the rumor for a second time, he or she will not propagate it further. Write a program to
    estimate the probability that everyone at the party (except Alice) will hear the rumor before it
    stops propagating. Also calculate an estimate of the expected number of people to hear the rumor.
    Takes two command line arguments: n-the number of people at the party and trials-the number of
    times to simulate this spread of a rumor. 

    $ java Rumors 1 100
    P(all heard) : 1.0
    expected number of people who heard rumor: 1.0

    $ java Rumors 2 100
    P(all heard): 1.0
    expected number of people who heard rumor: 2.0

    $ java Rumors 3 100
    P(all heard): 1.0
    expected number of people who heard rumor: 3.0

    $ java Rumors 4 100000
    P(all heard): 0.49899
    expected number of people who heard rumor: 3.49899

    $ java Rumors 5 100000
    P(all heard): 0.22234
    expected number of people who heard rumor: 3.88803
****************************************************************************************************/

public class Rumors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long expected = 0;
        int prob = 0;
        for (int t = 0; t < trials; t++) {
            if (n == 1) {
                expected++;
                prob++;
                continue;
            }
            boolean[] heard = new boolean[n];
            heard[0] = true;
            int count = 2;
            int prev = 0;
            int curr = 1+(int)(Math.random()*(n-1));
            heard[curr] = true;
            while (count < n) {
                int m = (int)(Math.random() * n);
                while (m == prev || m == curr)
                    m = (int)(Math.random() * n);
                if (heard[m]) {
                    break;
                } else {
                    heard[m] = true;
                    prev = curr;
                    curr = m;
                    count++;
                }
            }
            expected += count;
            if (count == n)
                prob++;
        }
        System.out.println("P(all heard): " + (1.0 * prob / trials));
        System.out.println("expected number of people who heard the rumor: " + (1.0 * expected / trials));
    }
}
