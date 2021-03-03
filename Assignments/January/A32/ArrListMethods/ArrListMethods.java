/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ArrListMethods.java
    Execution: java ArrListMethods
    Dependencies: none

    Notes:

    > java ArrListMethods
    list = [the, quick, brown, fox]
    addStars(list)
    list = [*, the, *, quick, *, brown, *, fox, *]

    list = [be, be, is, not, or, question, that, the, to, to]
    deleteDuplicates(list)
    list = [be, is, not, or, question, that, the, to]

    list = [a, b, c]
    mirror(list)
    list = [a, b, c, c, b, a]

    list = [a, b, c, b, b, a, b]
    removeAll(list,'b')
    list = [a, c, a]

    list = [hi, there, how, is, it, going, good, sirs]
    removeEvenLength(list)
    list = [there, how, going]

    list = [how, are, you?]
    repeat(list,4)
    list = [how, how, how, how, are, are, are, are, you?, you?, you?, you?]
****************************************************************************************************/
import java.util.*;

public class ArrListMethods {
    public static void addStars(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i <= n*2; i+=2)
            list.add(i,"*");
    }
    public static void deleteDuplicates(ArrayList<String> list) {
        int n = list.size(), c = 0;
        for (int i = 0; i < n-c; i++) {
            String a = list.get(i);
            while (list.lastIndexOf(a) != i) {
                list.remove(a);
                c++;
            }
        }
    }
    public static void mirror(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.add(n,list.get(i));
        }
    }
    public static void removeAll(ArrayList<String> list, String rem) {
        while (list.indexOf(rem) != -1) {
            list.remove(rem);
        }
    }
    public static void removeEvenLength(ArrayList<String> list) {
        int n = list.size(), c = 0;
        for (int i = 0; i < n-c; i++) {
            String a = list.get(i);
            if (a.length()%2 == 0) {
                list.remove(i);
                c++; i--;
            }
        }
    }
    public static void repeat(ArrayList<String> list, int k) {
        int n = list.size();
        for (int i = 0; i < n*k; i+=k) {
            for (int q = 0; q < k-1; q++) {
                list.add(i,list.get(i));
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("the", "quick", "brown", "fox"));
        System.out.println("list = " + list);
        addStars(list);
        System.out.println("addStars(list)");
        System.out.println("list = " + list);
        System.out.println();

        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        System.out.println("list = " + list2);
        deleteDuplicates(list2);
        System.out.println("deleteDuplicates(list)");
        System.out.println("list = " + list2);
        System.out.println();

        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a","b","c"));
        System.out.println("list = " + list3);
        mirror(list3);
        System.out.println("mirror(list)");
        System.out.println("list = " + list3);
        System.out.println();

        ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("a", "b", "c", "b", "b", "a", "b"));
        System.out.println("list = " + list4);
        removeAll(list4,"b");
        System.out.println("removeAll(list,'b')");
        System.out.println("list = " + list4);
        System.out.println();

        ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("hi", "there", "how", "is", "it", "going", "good", "sirs"));
        System.out.println("list = " + list5);
        removeEvenLength(list5);
        System.out.println("removeEvenLength(list)");
        System.out.println("list = " + list5);
        System.out.println();

        ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("how","are","you?"));
        System.out.println("list = " + list6);
        repeat(list6,4);
        System.out.println("repeat(list,4)");
        System.out.println("list = " + list6);
    }
}
