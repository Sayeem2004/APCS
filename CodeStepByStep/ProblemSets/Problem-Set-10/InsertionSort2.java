// index    0   1   2   3   4   5   6  7
// values {35, 33, 72, 13, 91, 42, 13, 2}
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(35, 33, 72, 13, 91, 42, 13, 2));
insertionSort(numbers);

// after pass 1	{33, 35, 72, 13, 91, 42, 13, 2}
// after pass 3	{13, 33, 35, 72, 91, 42, 13, 2}
// after pass 5	{13, 33, 35, 42, 72, 91, 13, 2}
