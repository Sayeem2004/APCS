// index    0  1  2  3   4   5   6  7
// values {15, 2, 8, 1, 17, 10, 12, 5}
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(15, 2, 8, 1, 17, 10, 12, 5));
insertionSort(numbers);

// after pass 1	{2, 15, 8, 1, 17, 10, 12, 5}
// after pass 3	{1, 2, 8, 15, 17, 10, 12, 5}
// after pass 5	{1, 2, 8, 10, 15, 17, 12, 5}
