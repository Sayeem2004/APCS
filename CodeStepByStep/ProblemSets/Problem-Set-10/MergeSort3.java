// index    0   1   2  3   4   5   6   7
// values {15, 56, 24, 5, 39, -4, 27, 10}
ArrayList<Integer> v1 = new ArrayList<Integer>(Arrays.asList(15, 56, 24, 5, 39, -4, 27, 10));
selectionSort(v1);

ArrayList<Integer> v2 = new ArrayList<Integer>(Arrays.asList(15, 56, 24, 5, 39, -4, 27, 10));
mergeSort(v2);

// selection sort runtime	1400
// merge sort runtime	     800
