//    index        0   1  2   3   4   5   6   7   8   9  10  11  12  13
int[] numbers = {-23, -5, 9, 14, 15, 18, 23, 24, 25, 29, 34, 62, 85, 87}
int index1 = sequentialSearch(numbers, 27);
int index2 = binarySearch(numbers, 27);
// sequential search examines 0, 1, 2, 3, 4, 5, 6, 7, 8, 9; returns 9
// binary search examines 6, 10, 8, 9; returns 9
