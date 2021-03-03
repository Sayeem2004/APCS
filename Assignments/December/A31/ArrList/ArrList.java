/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/
import java.util.*;

public class ArrList {
    public static ArrayList<String> append(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> ret = new ArrayList<String>();
        for (int i = 0; i < list1.size(); i++) {
            ret.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            ret.add(list2.get(i));
        }
        return ret;
    }
    public static void reverse(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n/2; i++) {
            String a = list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1,a);
        }
    }
    public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2) {
        int n = list1.size(); int m = list2.size();
        int i = 0; int j = 0;
        ArrayList<String> ret = new ArrayList<String>();
        while (i < n && j < m) {
            String a = list1.get(i);
            String b = list2.get(j);
            if (a.compareTo(b) < 0) {
                ret.add(a);
                i++;
            } else {
                ret.add(b);
                j++;
            }
        }
        if (i < n) {
            for (int q = i; q < n; q++) {
                ret.add(list1.get(q));
            }
        } else {
            for (int r = j; j < m; j++) {
                ret.add(list2.get(j));
            }
        }
        return ret;
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
        // ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b"));
        // ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("c","d"));
        // System.out.println("list1 = " + list1);
        // System.out.println("list2 = " + list2);
        // System.out.println("append(list1,list2) = " + append(list1,list2));
    
        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        // System.out.println("list = " + list);
        // reverse(list);
        // System.out.println("reverse(list)");
        // System.out.println("list = " + list);

        // ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","c"));
        // ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("b","d","e"));
        // System.out.println("list1 = " + list1);
        // System.out.println("list2 = " + list2);
        // System.out.println("merge(list1,list2) = " + merge(list1,list2));

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        // System.out.println("list = " + list);
        // addStars(list);
        // System.out.println("addStars(list)");
        // System.out.println("list = " + list);

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        // System.out.println("list = " + list);
        // deleteDuplicates(list);
        // System.out.println("deleteDuplicates(list)");
        // System.out.println("list = " + list);

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        // System.out.println("list = " + list);
        // mirror(list);
        // System.out.println("mirror(list)");
        // System.out.println("list = " + list);

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "b", "b", "a", "b"));
        // System.out.println("list = " + list);
        // removeAll(list,"b");
        // System.out.println("removeAll(list,'b')");
        // System.out.println("list = " + list);

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("hi", "there", "how", "is", "it", "going", "good", "sirs"));
        // System.out.println("list = " + list);
        // removeEvenLength(list);
        // System.out.println("removeEvenLength(list)");
        // System.out.println("list = " + list);

        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("how","are","you?"));
        // System.out.println("list = " + list);
        // repeat(list,4);
        // System.out.println("repeat(list,4)");
        // System.out.println("list = " + list);
    }
}
