// index    0   1  2   3   4  5   6   7
// values {29, 17, 3, 94, 46, 8, -4, 12}
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(29, 17, 3, 94, 46, 8, -4, 12));
mergeSort(numbers);

// 1st split	{29, 17, 3, 94} {46, 8, -4, 12}
// 2nd split	{29, 17} {3, 94} {46, 8} {-4, 12}
// 3rd split	{29} {17} {3} {94} {46} {8} {-4} {12}
// 1st merge	{17, 29} {3, 94} {8, 46} {-4, 12}
// 2nd merge	{3, 17, 29, 94} {-4, 8, 12, 46}
// 3rd merge	{-4, 3, 8, 12, 17, 29, 46, 94}
