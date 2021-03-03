/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/
import java.util.ArrayList;

public class ArrList {
    public static void test() {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());

        list.add("a");
        System.out.println("\nlist.add('a')");
	    System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());

        System.out.println("\nlist.get(0) = " + list.get(0));
        list.set(0,"b");
        System.out.println("list.set(0,'b')");
        System.out.println("list.get(0) = " + list.get(0));

        list.add("c");
        System.out.println("\nlist = " + list);
        list.add(2,"a");
        System.out.println("list.add(2,'a')");
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list.remove(1)");
        System.out.println("list = " + list);
        list.remove("a");
        System.out.println("list.remove('a')");
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list.clear()");
        System.out.println("list = " + list);

        list.add("b"); list.add("b");
        System.out.println("\nlist = " + list);
        System.out.println("list.contains('a') = " + list.contains("a"));
        System.out.println("list.indexOf('b') = " + list.indexOf("b"));
        System.out.println("list.lastIndexOf('b') = " + list.lastIndexOf("b"));
    }
    public static void swap(ArrayList<String> list, int i , int j) {
        list.set(i,list.set(j,list.get(i)));
    }

    public static void main(String [] args) {
        // test();

        ArrayList<String> list = new ArrayList<String>();
        list.add("a"); list.add("b"); list.add("c");
        System.out.println("list = " + list);
        System.out.println("swap(list,0,2)");
        swap(list,0,2);
        System.out.println("list = " + list);
    }
}
