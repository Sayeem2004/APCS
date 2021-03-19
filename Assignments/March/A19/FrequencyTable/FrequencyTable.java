/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Caroline Leung & Dylan Hu & Esteak Shapin & Jishan Chowdhury

    Compilation: javac FrequencyTable.java
    Execution: java FrequencyTable
    Dependencies: In.java words.utf-8.txt

    Notes: Reads in a list of words from words.utf-8.txt and creates a frequency table based on the
    size of the words.

    > java FrequencyTable
    Length Of Word  Frequency
    -------------------------
    0               1
    1               52
    2               1218
    3               6288
    4               13862
    5               29016
    6               51899
    7               72459
    8               86532
    9               87659
    10              78939
    11              65467
    12              50480
    13              36145
    14              25100
    15              16436
    16              10437
    17              6132
    18              3474
    19              1958
    20              934
    21              428
    22              186
    23              87
    24              46
    25              18
    26              5
    27              7
    28              3
    29              5
    30              3
    31              3
    32              1
    33              1
    34              2
    36              1
    45              2
    47              1
    58              1
    60              1
****************************************************************************************************/
import java.util.*;

public class FrequencyTable {
    public static void main(String[] args) {
        Map<Integer,Integer> lengths = new HashMap<Integer,Integer>();
        int min = 100000, max = 0;

        In in = new In("words.utf-8.txt");
        while (!in.isEmpty()) {
            String word = in.readLine();
            int sz = word.length();

            if (lengths.containsKey(sz))
                lengths.put(sz,lengths.get(sz)+1);
            else
                lengths.put(sz,1);
            min = Math.min(min,sz);
            max = Math.max(max,sz);
        }

        System.out.printf("%-18s %-18s \n","Length Of Word","Frequency");
        System.out.println("-------------------------------");
        for (int i = min; i <= max; i++) {
            if (lengths.containsKey(i)) {
                System.out.printf("%-18d %-18d \n",i,lengths.get(i));
            }
        }
    }
}
