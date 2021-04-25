public static void banish(int[] a1, int[] a2) {
    for (int i = 0; i < a1.length; i++) {
        for (int q = 0; q < a2.length; q++) {
            if (a1[i] == a2[q]) {
                for (int r = i; r < a1.length-1; r++) {
                    a1[r] = a1[r+1];
                }
                a1[a1.length-1] = 0;
                i--; break;
            }
        }
    }
}
