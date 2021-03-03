/****************************************************************************************************
    Names: Mohammad Khan & Kevin Cao & Evelyn Zheng & Aryan Patel & Xian Jun An & Noakai Aronesty

    Compilation: javac Simulator.java
    Execution: java Simulator bear-population fish-population river-length steps
    Dependencies: Animal.java Bear.java Fish.java

    Notes: A program for simulating a river ecosystem.

    > java Simulator 2 5 100 1
    # bears: 2
    # fish:  5
    |    F  F B        F         F                              B                                F       |
    # bears: 2
    # fish:  5
    |    F  F  B       F          F                             B                                F       |
****************************************************************************************************/
import java.util.*;

public class Simulator {
    public static ArrayList<Animal> updateRiver(ArrayList<Animal> river, int rl) {
        // Initializing The ArrayList That Is Going To Be Returned
        ArrayList<Animal> ret = new ArrayList<Animal>(rl);
        for (int i = 0; i < rl; i++) {
            ret.add(i,null);
        }
        for (int i = 0; i < rl; i++) {
            // If There Is No Animal No Movement Will Be Made
            if (river.get(i) == null) continue;
            river.get(i).move();
            int q = river.get(i).getPos();
            if (ret.get(q) == null) {
                // If There Is No Overlap Animal Can Move Immediately
                ret.set(q,river.get(i));
            } else {
                // If There Is Overlap There Are Two Cases: Are The Two Species The Same Or Not
                if (ret.get(q).equals(river.get(i))) {
                    // If They Are The Same Two Species Are They Different Genders Or Not
                    if (ret.get(q).getGender() == river.get(i).getGender()) {
                        if (ret.get(q).getStrength() > river.get(i).getStrength()) continue;
                        else ret.set(q,river.get(i));
                    } else {
                        // Pushing Animal On The Right Back To Original Position
                        river.get(i).goBack();
                        ret.set(river.get(i).getPos(),river.get(i));
                        // Attempting To Push Animal On The Left To Original Position
                        ret.get(q).goBack();
                        int r = ret.get(q).getPos();
                        if (ret.get(r) == null) ret.set(r,ret.get(q));
                        else if (ret.get(r).equals(ret.get(q))) {
                            if (ret.get(r).getGender() == ret.get(q).getGender()) {
                                int a = ret.indexOf(null);
                                if (a != -1) ret.set(a,ret.get(q));
                            } else {
                                if (ret.get(r).getStrength() > ret.get(q).getStrength()) continue;
                                else ret.set(r,ret.get(q));
                            }
                        } else {
                            if (ret.get(r).equals(new Bear())) continue;
                            else ret.set(r,ret.get(q));
                        }
                        // Attempting To Create New Animal
                        int b = ret.indexOf(null);
                        if (b != -1) ret.set(b,new Bear(b,rl,(Math.random()<0.5) ? true : false,(int)(Math.random()*101)));
                    }
                } else {
                    // If The Two Animals Are Different, The Position Will Be Occupied By A Bear
                    if (ret.get(q).equals(new Bear())) continue;
                    else ret.set(q,river.get(i));
                }
            }
        }
        return ret;
    }

    public static void printRiver(ArrayList<Animal> river, int rl) {
        // Initializing String Representing The River
        String ret = new String(new char[rl]).replace('\0',' ');
        int bp = 0, fp = 0;
        // Counting Populations And Updating The River String
        for (int i = 0; i < rl; i++) {
            ret = ret.substring(0,i) + ((river.get(i) == null) ? " " : river.get(i).toString()) + ret.substring(i+1);
            if (river.get(i) == null) continue;
            else if (river.get(i).equals(new Bear())) bp++;
            else fp++;
        }
        // Printing Everything Out
        System.out.println("# bears: " + bp);
        System.out.println("# fish:  " + fp);
        System.out.println("|" + ret + "|");
    }

    public static ArrayList<Animal> createRiver(int bp, int fp, int rl, int st) {
        // Initializing River
        ArrayList<Animal> river = new ArrayList<Animal>(rl);
        int[] pos = new int[rl];
        for (int i = 0; i < rl; i++)
            pos[i] = i;
        // Randomize Positions
        for (int i = 0; i < rl; i++) {
            int a = (int) (i + Math.random() * (rl - i - 1));
            int temp = pos[i];
            pos[i] = pos[a];
            pos[a] = temp;
        }
        // Setting Animals
        for (int i = 0; i < rl; i++) {
            boolean gen = (Math.random() < 0.5) ? true : false;
            int str = (int)(Math.random()*101);
            if (pos[i] < bp)
                river.add(i,new Bear(i,rl,gen,str));
            else if (pos[i] < bp+fp)
                river.add(i,new Fish(i,rl,gen,str));
            else
                river.add(i,null);
        }
        return river;
    }

    public static void main(String[] args) {
        // Parsing Arguments And Initializing River
        int bp = Integer.parseInt(args[0]);
        int fp = Integer.parseInt(args[1]);
        int rl = Integer.parseInt(args[2]);
        int st = Integer.parseInt(args[3]);
        if (bp+fp > rl) throw new ArithmeticException("Combined Population Size is greater than River Length");
        ArrayList<Animal> river = createRiver(bp, fp, rl, st);
        // Iterating And Printing Array
        printRiver(river,rl);
        for (int i = 0; i < st; i++) {
            river = updateRiver(river, rl);
            printRiver(river, rl);
        }
    }
}
