/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ArrListMethods.java
    Execution: java ArrListMethods
    Dependencies: none

    Notes:

    > java ArrListMethods
    list = [28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25]
    countInRange(list,10,30) = 4

    list = [1, 1, 2, 3, 5]
    cumulative(list)
    list = [1, 2, 4, 7, 12]

    findKeithNumbers(47,742):
    47: [4, 7, 11, 18, 29, 47]
    61: [6, 1, 7, 8, 15, 23, 38, 61]
    75: [7, 5, 12, 17, 29, 46, 75]
    197: [1, 9, 7, 17, 33, 57, 107, 197]
    742: [7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742]

    list1 = [1, 6, 1, 2, 1, 4, 1, 2, 1, 2, 1, 8]
    list2 = [1, 2, 1]
    indexOfAll(list1,list2) = [2, 6, 8]

    list1 = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]]
    list2 = [4, 8]
    insertInterval(list1,list2) = [[1, 2], [3, 10], [12, 16]]



****************************************************************************************************/
import java.util.*;

public class ArrListMethods {
    public static int countInRange(ArrayList<Integer> list, int mn, int mx) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (mn <= x && x >= mx) count++;
        }
        return count;
    }
    public static void cumulative(ArrayList<Integer> list) {
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            list.set(i,sum);
        }
        return;
    }
    public static void findKeithNumbers(int mn, int mx) {
        for (int i = mn; i <= mx; i++) {
            ArrayList<Integer> list = checkKeithNumber(i);
            String str = Integer.toString(i);
            if (list.size() > str.length()) {
                System.out.println(i + ": " + list);
            }
        }
    }
    public static ArrayList<Integer> checkKeithNumber(int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        String str = Integer.toString(n);
        int s = str.length();
        for (int i = 0; i < s; i++) {
            temp.add(Character.getNumericValue(str.charAt(i)));
        }
        while (temp.get(temp.size()-1) < n) {
            int sum = 0;
            for (int i = 0; i < s; i++) {
                sum += temp.get(temp.size()-1-i);
            }
            temp.add(sum);
        }
        if (temp.get(temp.size()-1) == n) {
            return temp;
        } else {
            return ret;
        }
    }
    public static ArrayList<Integer> indexOfAll(ArrayList<Integer> list, ArrayList<Integer> sublist) {
        ArrayList<Integer> ret =  new ArrayList<Integer>();
        int l = list.size(), s = sublist.size();
        for (int i = 0; i < l-s; i++) {
            boolean add = true;
            for (int q = 0; q < s; q++) {
                if (list.get(i+q) != sublist.get(q))
                    add = false;
            }
            if (add) ret.add(i);
        }
        return ret;
    }
    public static ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> interval) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < intervals.size(); i++) {
            ArrayList<Integer> t = intervals.get(i);
            temp.add(t.get(0));
            temp.add(t.get(1));
        }
        int a = interval.get(0), b = interval.get(1), q = 0;
        for (int i = 0; i < temp.size()-q; i++) {
            if (temp.get(i) >= a && temp.get(i) <= b) {
                temp.remove(i); q++; i--;
            }
        }
        int pos = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > a) {
                pos = i; break;
            }
        }
        if (pos%2 == 0) {
            ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
            if (temp.size()%2 == 1) {
                temp.add(pos,a);
            } else {
                temp.add(pos,b); temp.add(pos,a);
            }
            for (int i = 0; i < temp.size(); i+=2) {
                ArrayList<Integer> t = new ArrayList<Integer>(Arrays.asList(temp.get(i),temp.get(i+1)));
                ret.add(t);
            }
            return ret;
        } else {
            ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
            if (temp.size()%2 == 1) temp.add(pos,b);
            for (int i = 0; i < temp.size(); i+=2) {
                ArrayList<Integer> t = new ArrayList<Integer>(Arrays.asList(temp.get(i),temp.get(i+1)));
                ret.add(t);
            }
            return ret;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25));
        System.out.println("list = " + list);
        System.out.println("countInRange(list,10,30) = " + countInRange(list,10,30));
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5));
        System.out.println("list = " + list2);
        cumulative(list2);
        System.out.println("cumulative(list)");
        System.out.println("list = " + list2);
        System.out.println();

        System.out.println("findKeithNumbers(47,742):");
        findKeithNumbers(47,742);
        System.out.println();

        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 6, 1, 2, 1, 4, 1, 2, 1, 2, 1, 8));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 2, 1));
        System.out.println("list1 = " + list3);
        System.out.println("list2 = " + list4);
        System.out.println("indexOfAll(list1,list2) = " + indexOfAll(list3,list4));
        System.out.println();

        ArrayList<ArrayList<Integer>> list5 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(1,2));
        list5.add(temp);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(Arrays.asList(3,5));
        list5.add(temp2);
        ArrayList<Integer> temp3 = new ArrayList<Integer>(Arrays.asList(6,7));
        list5.add(temp3);
        ArrayList<Integer> temp4 = new ArrayList<Integer>(Arrays.asList(8,10));
        list5.add(temp4);
        ArrayList<Integer> temp5 = new ArrayList<Integer>(Arrays.asList(12,16));
        list5.add(temp5);
        ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(4,8));
        System.out.println("list1 = " + list5);
        System.out.println("list2 = " + list6);
        System.out.println("insertInterval(list1,list2) = " + insertInterval(list5,list6));
        System.out.println(); System.out.println(); System.out.println();
    }
}
