/****************************************************************************************************
    Names: Mohammad Khan, Asa Muhammad, Dylan Hu, Esteak Shapin, Caroline Leung, Jishan Chowdhury, Han Zhang

    Compilation: javac TimeStrings.java
    Execution: java TimeStrings
    Dependencies: StdOut.java Stopwatch.java

    Notes: Program to experimentally determine the time complexities of the following String methods:
    1. length() 2. charAt() 3. toLowerCase() 4. replace() 5. compareTo()
    6. equals() 7. startsWith() 8. endsWith() 9. indexOf() 10. substring()
    For each of these methods predictions and results are given and discussed.

    > java TimeStrings
    Average time(ms) for size:     1000000         2000000         4000000         8000000         16000000
    ---------------------------------------------------------------------------------------------------------
    length():                      0.000000        0.000000        0.000000        0.000000        0.000000
    charAt(0):                     0.000000        0.000000        0.000000        0.000000        0.000000
    charAt(N-1):                   0.000000        0.000000        0.000000        0.000000        0.000000
    toLowerCase():                 3.600000        3.100000        6.800000        12.800000       26.400000
    replace('B','A'):              1.100000        0.400000        0.800000        1.400000        2.900000
    replace('A','B'):              0.700000        0.800000        1.700000        3.600000        7.500000
    compareTo(str):                1.200000        0.600000        1.200000        2.200000        4.500000
    equals(str):                   0.700000        0.500000        1.000000        2.100000        4.200000
    startsWith(str):               1.500000        0.700000        1.200000        2.500000        5.000000
    endsWith(str):                 0.300000        0.600000        1.300000        2.500000        5.000000
    indexOf(str):                  1.700000        0.700000        1.300000        2.700000        5.400000
    substring(1,N-1):              0.100000        0.100000        0.200000        0.500000        1.100000
    substring(N/2):                0.000000        0.100000        0.200000        0.400000        0.900000
****************************************************************************************************/

public class TimeStrings {
    public static String generateStringLengthN(int n) {
        return new String(new char[n]).replace('\0', 'A');
    }

    public static void print(String func, double[] times) {
        System.out.printf("%-30s ",func+":");
        for (double avg : times){
            System.out.printf("%-15f ",avg);
        }
        System.out.println();
    }

    public static void testLength(String[] strings) {
        /********************************************************************************************
        Experiment For: length()

        Hypothesis: O(1) because the length of a string is stored in its own memory space and can
        easily be accessed.

        Experiment Description: For each size string the time to call length() and store it into an
        integer is recorded 10 times and averaged.

        Results:   1000000   2000000   4000000   8000000   16000000
        length():  0.000000  0.000000  0.000000  0.000000  0.000000

        Observations: Our hypothesis is right and length() is O(1) time because every time the string
        length doubled, the time remained constant.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                int n = strings[i].length();
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("length()",times);
    }

    public static void testCharAt(String[] strings) {
        /********************************************************************************************
        Experiment For: charAt()

        Hypothesis: O(1) because each char of a string is stored in its own memory space so only one
        specific memory location needs to be accessed.

        Experiment Description: For each string the time to call charAt(0) and charAt(string.length()-1)
        and store those values into a char is recorded 10 times and averaged.

        Results:      1000000   2000000   4000000   8000000   16000000
        charAt(0):    0.000000  0.000000  0.000000  0.000000  0.000000
        charAt(N-1):  0.000000  0.000000  0.000000  0.000000  0.000000

        Observations: Our hypothesis was right and charAt() is O(1) time because every time the string
        length doubled, the time needed remained constant.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                int n = strings[i].charAt(0);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("charAt(0)",times);
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                int n = strings[i].charAt(strings[i].length()-1);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("charAt(N-1)",times);
    }

    public static void testToLowerCase(String[] strings) {
        /********************************************************************************************
        Experiment For: toLowerCase()

        Hypothesis: O(N) because worst case is when every single character in the string is capitalized
        and then the function has to loop through the entire string.

        Experiment Description: For each string the time to call toLowerCase() is recorded 10 times
        and averaged.

        Results:        1000000   2000000   4000000   8000000   16000000
        toLowerCase():  3.600000  3.100000  6.800000  12.800000 26.400000

        Observations: Our hypothesis was right and toLowerCase() is O(N) because for every size other
        than the outlier of 1000000 as the string length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                String s = strings[i].toLowerCase();
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("toLowerCase()",times);
    }

    public static void testReplace(String[] strings) {
        /********************************************************************************************
        Experiment For: replace()

        Hypothesis: O(N) because worst case is when the entire content of the string has to be replaced
        which would mean the function has to loop through the entire string.

        Experiment Description: Each string is made of the letter A and nothing else, so for each string
        the time to replace none of the chars (best case ie replace('B','A')) and all of the chars
        (worst case ie replace('A','B')) is recorded 10 times and averaged

        Results:           1000000   2000000   4000000   8000000   16000000
        replace('B','A'):  1.100000  0.400000  0.800000  1.400000  2.900000
        replace('A','B'):  0.700000  0.800000  1.700000  3.600000  7.500000

        Observations: Our hypothesis was right and replace() is O(N) because for every size string,
        other than the outlier of 1000000, as the string length doubled, the time roughly doubled as
        well. This holds true for both the best case and the worst case so this further strengthens
        our hypothesis.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                String s = strings[i].replace('B','A');
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("replace('B','A')",times);
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                String s = strings[i].replace('A','B');
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("replace('A','B')",times);
    }

    public static void testCompareTo(String[] strings) {
        /********************************************************************************************
        Experiment For: compareTo()

        Hypothesis: O(N) becase the worst case is that the strings are exactly the same which would
        mean the function would have to loop through the entire string and compare each char.

        Experiment Description: For each size string, a copy is made and the time it takes to compare
        the original to the copy and store the resulting value in an integer is recorded 10 times and
        averaged.

        Results:         1000000   2000000   4000000   8000000   16000000
        compareTo(str):  1.200000  0.600000  1.200000  2.200000  4.500000

        Observations: Our hypothesis is correct and compareTo() is O(N) because for every size string,
        other than the outlier of 1000000, as the length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                String s = new String(strings[i]);
                Stopwatch timer = new Stopwatch();
                int n = strings[i].compareTo(s);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("compareTo(str)",times);
    }

    public static void testEquals(String[] strings) {
        /********************************************************************************************
        Experiment For: equals()

        Hypothesis: O(N) because worst case the strings are the exact same length so the function has
        to loop through every character in both strings to check whether or not they are the same.

        Experiment Description: For each size string, a copy is made and the time it takes to check the
        equality of the original and the copy and store the resulting value in an boolean is recorded
        10 times and averaged.

        Results:      1000000   2000000   4000000   8000000   16000000
        equals(str):  0.700000  0.500000  1.000000  2.100000  4.200000

        Observations: Our hypothesis is correct and equals() is O(N) because for every size string,
        other than the outlier of 1000000, as the length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                String s = new String(strings[i]);
                Stopwatch timer = new Stopwatch();
                boolean n = strings[i].equals(s);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("equals(str)",times);
    }

    public static void testStartsWith(String[] strings) {
        /********************************************************************************************
        Experiment For: startsWith()

        Hypothesis: startsWith() is a O(N) function because the worst case is the prefix string that
        it is checking for is the same size as the original string which would mean that the function
        has to loop through the entire string to confirm equality.

        Experiment Description: For each size string, a copy is made and the time it takes to run the
        startWith() function with the copy as the parameter and store the resulting value in an boolean
        is recorded 10 times and averaged.

        Results:          1000000   2000000   4000000   8000000   16000000
        startsWith(str):  1.500000  0.700000  1.200000  2.500000  5.000000

        Observations: Our hypothesis is correct and startsWith() is O(N) because for every size string,
        other than the outlier of 1000000, as the length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                String s = new String(strings[i]);
                Stopwatch timer = new Stopwatch();
                boolean n = strings[i].startsWith(s);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("startsWith(str)",times);
    }

    public static void testEndsWith(String[] strings) {
        /********************************************************************************************
        Experiment For: endsWith()

        Hypothesis: endsWith() is a O(N) function because the worst case is the suffix string that
        it is checking for is the same size as the original string which would mean that the function
        has to loop through the entire string to confirm equality.

        Experiment Description: For each size string, a copy is made and the time it takes to run the
        endsWith() function with the copy as the parameter and store the resulting value in an boolean
        is recorded 10 times and averaged.

        Results:        1000000   2000000   4000000   8000000   16000000
        endsWith(str):  0.300000  0.600000  1.300000  2.500000  5.000000

        Observations: Our hypothesis is correct and endssWith() is O(N) because for every size string
        as the length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                String s = new String(strings[i]);
                Stopwatch timer = new Stopwatch();
                boolean n = strings[i].endsWith(s);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("endsWith(str)",times);
    }

    public static void testIndexOf(String[] strings) {
        /********************************************************************************************
        Experiment For: indexOf()

        Hypothesis: indexOf() is a O(N) function because the worst case is the parameter string that
        is the same size as the original string which would mean that the function has to loop through
        the entire string to confirm equality.

        Experiment Description: For each size string, a copy is made and the time it takes to run the
        indexOf() function with the copy as the parameter and store the resulting value in an integer
        is recorded 10 times and averaged.

        Results:       1000000   2000000   4000000   8000000   16000000
        indexOf(str):  1.700000  0.700000  1.300000  2.700000  5.400000

        Observations: Our hypothesis is correct and indexOf() is O(N) because for every size string,
        other than the outlier of 1000000, as the length doubled, the time roughly doubled as well.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                String s = new String(strings[i]);
                Stopwatch timer = new Stopwatch();
                int n = strings[i].indexOf(s);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("indexOf(str)",times);
    }

    public static void testSubstring(String[] strings) {
        /********************************************************************************************
        Experiment For: substring()

        Hypothesis: substring() is a O(N) function because the worst case is the parameters are 0 and N
        which would mean that the function has to loop through the entire string to copy it.

        Experiment Description: For each size string, the time it takes to run substring(1,N-1) and
        substring(N/2) and store the resulting value in a string is recorded 10 times and averaged.

        Results:           1000000   2000000   4000000   8000000   16000000
        substring(1,N-1):  0.100000  0.100000  0.200000  0.500000  1.100000
        substring(N/2):    0.000000  0.100000  0.200000  0.400000  0.900000

        Observations: Our hypothesis is correct and substring() is O(N) because for every size string
        as the length doubled, the time roughly doubled as well. The fact that this held true for both
        the worst case and the average case strengthens our hypothesis.
        *********************************************************************************************/
        double[] times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                String s = strings[i].substring(1,strings[i].length()-1);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("substring(0,N-1)",times);
        times = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++) {
                Stopwatch timer = new Stopwatch();
                String s = strings[i].substring(strings[i].length()/2);
                sum += timer.elapsedTime()*1000;
            }
            times[i] = sum/10;
        }
        print("substring(N/2)",times);
    }

    public static void main(String[] args) {
        int[] size = {1000000, 2000000, 4000000, 8000000, 16000000};
        String[] testStrings = new String[size.length];
        for (int i = 0; i < size.length; i++) {
            testStrings[i] = generateStringLengthN(size[i]);
        }
        System.out.printf("%-30s %-15s %-15s %-15s %-15s %-15s \n","Average time(ms) for size: ",size[0],size[1],size[2],size[3],size[4]);
        System.out.printf("%s \n","---------------------------------------------------------------------------------------------------------");

        testLength(testStrings);
        testCharAt(testStrings);
        testToLowerCase(testStrings);
        testReplace(testStrings);
        testCompareTo(testStrings);
        testEquals(testStrings);
        testStartsWith(testStrings);
        testEndsWith(testStrings);
        testIndexOf(testStrings);
        testSubstring(testStrings);
    }
}
