// index    0   1  2   3   4  5   6   7
// values {29, 17, 3, 94, 46, 8, -4, 12}
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(29, 17, 3, 94, 46, 8, -4, 12));
selectionSort(numbers);

// after pass 1	{-4, 17, 3, 94, 46, 8, 29, 12}
// after pass 2	{-4, 3, 17, 94, 46, 8, 29, 12}
// after pass 3	{-4, 3, 8, 94, 46, 17, 29, 12}
