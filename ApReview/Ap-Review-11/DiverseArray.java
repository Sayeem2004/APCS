// Part A
public static int arraySum(int[] arr) {
    int sum = 0;
    for (int x : arr) sum += x;
    return sum;
}

// Part B
public static int[] rowSums(int[][] arr2D) {
    int[] sums = new int[arr2D.length];
    for (int i = 0; i < arr2D.length; i++) {
        sums[i] = arraySum(arr2D[i]);
    }
    return sums;
}

// Part C
public static boolean isDiverse(int[][] arr2D) {
    int[] sums = rowSums(arr2d);
    for (int i = 0; i < sums.length; i++) {
        if (sums.indexOf(sums[i]) != i) return false;
    }
    return true;
}
