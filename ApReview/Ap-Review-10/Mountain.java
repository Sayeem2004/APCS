// Part A
public static int getPeakIndex(int[] array) {
    int ret = -1;
    for (int i = 1; i < array.length-1; i++) {
        if (array[i-1] < array[i] && array[i+1] < array[i]) return i;
    }
    return ret;
}

// Part B
public static boolean isMountain(int[] array) {
    nt pos = getPeakIndex(array);
    if (!isIncreasing(array, pos)) return false;
    if (!isDecreasing(array,pos)) return false;
    return true;
}
