public int absoluteDay() {
    int[] month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    return month[this.month-1] + this.day;
}
