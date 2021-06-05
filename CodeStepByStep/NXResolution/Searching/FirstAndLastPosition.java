public static int[] firstAndLastPosition(int[] a, int b) {
    int[] ret = new int[2];
    int l = 0, r = a.length, m = 0;
    boolean br = false;
    while (l <= r) {
        m = (l+r)/2;
        if (m < 0 || m >= a.length) {br = true; break;}
        if (a[m] > b) r = m-1;
        if (a[m] < b) l = m+1;
        if (a[m] == b) {
            if (m > 0 && a[m-1] == b) r = m-1;
            else break;
        }
        if ((l+r)/2 == m) {br = true; break;}
    }
    if (!br && a[(l+r)/2] == b) ret[0] = (l+r)/2;
    else ret[0] = -1;
    l = 0; r = a.length; m = 0;
    br = false;
    while (l <= r) {
        m = (l+r)/2;
        if (m < 0 || m >= a.length) {br = true; break;}
        if (a[m] > b) r = m-1;
        if (a[m] < b) l = m+1;
        if (a[m] == b) {
            if (m < a.length-1 && a[m+1] == b) l = m+1;
            else break;
        }
        if ((l+r)/2 == m) {br = true; break;}
    }
    if (!br && a[(l+r)/2] == b) ret[1] = (l+r)/2;
    else ret[1] = -1;
    return ret;
}
