/****************************************************************************************************
    Name: Mohammad Khan & Aryan Patel & Diya Rao & Evelyn Zheng & Joseph Kim & Rayyan Bhuiyan &
    Si Ying Ding & Sydney Moy

    Compilation: javac HotPotato.java
    Execution: java HotPotato prob
    Dependencies: none

    Notes: Simulates a Hot Potato game using a round robin scheduler. Prob is the probabilty that the
    potato becomes a hot potato in that turn.

    > java HotPotato 0.25
    Children: [Bobby, Sue, Amy, Mark, Danny, Kelly, Yuki]
    Potato: Bobby
    Children: [Sue, Amy, Mark, Danny, Kelly, Yuki, Bobby]
    Potato: Sue
    Children: [Amy, Mark, Danny, Kelly, Yuki, Bobby, Sue]
    Potato: Amy
    Children: [Mark, Danny, Kelly, Yuki, Bobby, Sue, Amy]
    Hot Potato: Mark
    Children: [Danny, Kelly, Yuki, Bobby, Sue, Amy]
    Hot Potato: Danny
    Children: [Kelly, Yuki, Bobby, Sue, Amy]
    Potato: Kelly
    Children: [Yuki, Bobby, Sue, Amy, Kelly]
    Hot Potato: Yuki
    Children: [Bobby, Sue, Amy, Kelly]
    Potato: Bobby
    Children: [Sue, Amy, Kelly, Bobby]
    Hot Potato: Sue
    Children: [Amy, Kelly, Bobby]
    Potato: Amy
    Children: [Kelly, Bobby, Amy]
    Potato: Kelly
    Children: [Bobby, Amy, Kelly]
    Potato: Bobby
    Children: [Amy, Kelly, Bobby]
    Potato: Amy
    Children: [Kelly, Bobby, Amy]
    Potato: Kelly
    Children: [Bobby, Amy, Kelly]
    Potato: Bobby
    Children: [Amy, Kelly, Bobby]
    Potato: Amy
    Children: [Kelly, Bobby, Amy]
    Potato: Kelly
    Children: [Bobby, Amy, Kelly]
    Potato: Bobby
    Children: [Amy, Kelly, Bobby]
    Hot Potato: Amy
    Children: [Kelly, Bobby]
    Potato: Kelly
    Children: [Bobby, Kelly]
    Potato: Bobby
    Children: [Kelly, Bobby]
    Potato: Kelly
    Children: [Bobby, Kelly]
    Potato: Bobby
    Children: [Kelly, Bobby]
    Potato: Kelly
    Children: [Bobby, Kelly]
    Hot Potato: Bobby
    Children: [Kelly]
    Winner: Kelly
****************************************************************************************************/
import java.util.*;

public class HotPotato {
    public static void main(String[] args) {
        double prob = Double.parseDouble(args[0]);
        Queue<String> children = new LinkedList<String>();
        children.add("Bobby");
        children.add("Sue");
        children.add("Amy");
        children.add("Mark");
        children.add("Danny");
        children.add("Kelly");
        children.add("Yuki");
        while (children.size() != 1) {
            System.out.println("Children: " + children);
            if (Math.random() < prob) {
                System.out.println("Hot Potato: " + children.remove());
            } else {
                String temp = children.remove();
                System.out.println("Potato: " + temp);
                children.add(temp);
            }
        }
        System.out.println("Children: " + children);
        System.out.println("Winner: " + children.remove());
    }
}
