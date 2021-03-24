public static int evenDigits(int n) {
    if (n == 0) return 0;
    if (n%2 == 0) return 10*evenDigits(n/10) + n%10;
    return evenDigits(n/10);
}
