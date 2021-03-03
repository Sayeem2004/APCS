/****************************************************************************************************
    Name: Mohammad Khan & Esteak Shapin & Caroline Leung & Evelyn Zheng & Michelle Liang

    Compilation: javac FunctionClient.java
    Execution: java FunctionClient
    Dependencies: Function.java Square.java Half.java PredicateFunction.java IsEven.java

    Notes: Client to test out the files mentioned above.

    > java FunctionClient
    [3, 52, 23, 5, 21, 78]
    [9, 2704, 529, 25, 441, 6084]
    [1, 26, 11, 2, 10, 39]
    [52, 78]
****************************************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FunctionClient {
    public static List<Integer> map(Function f, List<Integer> list) {
        List<Integer> ret = new ArrayList<Integer>(list);
        for (int i = 0; i < ret.size(); i++) {
            ret.set(i,f.evaluate(list.get(i)));
        }
        return ret;
    }

    public static List<Integer> filter(PredicateFunction f, List<Integer> list) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (f.evaluate(list.get(i))) {
                ret.add(list.get(i));
            }
        }
        return ret;
    }

    public static void main(String [] args) {
        Integer [] array = {3,52,23,5,21,78};
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,array);

        System.out.println(list);  // [3, 52, 23, 5, 21, 78]

        System.out.println(map(new Square(), list));  // [9, 2704, 529, 25, 441, 6084]
        System.out.println(map(new Half(), list));  // [1, 26, 11, 2, 10, 39]
        System.out.println(filter(new IsEven(), list)); // [52, 78]
    }

}
