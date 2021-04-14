public static int digitSum(int n) {
    if (n > -10 && n < 10) return n;
    return (n < 0 ? (Math.abs(n)%10)*-1 : n%10) + digitSum(n/10);
}
