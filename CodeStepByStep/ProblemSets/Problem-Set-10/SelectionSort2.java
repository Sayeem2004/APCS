// index    0   1   2  3   4   5   6   7
// values {23, 16, 11, 1, 28, 30, 35, 52}
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(23, 16, 11, 1, 28, 30, 35, 52));
selectionSort(numbers);

// after pass 1	{1, 16, 11, 23, 28, 30, 35, 52}
// after pass 2	{1, 11, 16, 23, 28, 30, 35, 52}
// after pass 3	{1, 11, 16, 23, 28, 30, 35, 52}
