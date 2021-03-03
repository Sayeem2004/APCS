/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ArrList.java
    Execution: java ArrList
    Dependencies: none

    Notes:

    > java ArrList
    Integer x = 5
    Integer y = 5
    x == y: false
    x < y: false
    x > y: false
    x.equals(y): true
    x+y = 10

    list = [40, 20, 60, 1, 80, 30]
    example1(list)
    list = [20, 1, 30, 60, 40, 80]

    list = [2, 4, 6, 8, 10]
    example2(list)
    list = [42, 42, 42, 42, 42, 2, 4, 6, 8, 10]

    list = [10, 20, 30, 40, 50, 60, 70, 80]
    example3(list)
    list = [20, 40, 60, 80]

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

public class ArrList {
    public static void example1(ArrayList<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            if (n % 10 == 0) {
                v.remove(i);
                v.add(n);
            }
        }
    }
    public static void example2(ArrayList<Integer> vec) {
        int size = vec.size();
        for (int i = 0; i < size; i++) {
          vec.add(i, 42);    // add 42 at index i
        }
    }
    public static void example3(ArrayList<Integer> vec) {
        for (int i = 0; i < vec.size(); i++) {
            vec.remove(i);
        }
    }
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
        Integer x = 5;
        Integer y = new Integer(x);
        System.out.println("Integer x = " + x);
        System.out.println("Integer y = " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("x+y = " + (x+y));
        System.out.println();

        ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(40,20,60,1,80,30));
        System.out.println("list = " + v);
        example1(v);
        System.out.println("example1(list)");
        System.out.println("list = " + v);
        System.out.println();

        ArrayList<Integer> vec = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            vec.add(2 * i);         // {2, 4, 6, 8, 10}
        }
        System.out.println("list = " + vec);
        example2(vec);
        System.out.println("example2(list)");
        System.out.println("list = " + vec);
        System.out.println();

        ArrayList<Integer> vec2 = new ArrayList<Integer>();
        for (int i = 1; i <= 8; i++) {
        	vec2.add(10 * i);   //   0   1   2   3   4   5   6   7
        }                      // {10, 20, 30, 40, 50, 60, 70, 80}
        System.out.println("list = " + vec2);
        example3(vec2);
        System.out.println("example3(list)");
        System.out.println("list = " + vec2);
        System.out.println();

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
