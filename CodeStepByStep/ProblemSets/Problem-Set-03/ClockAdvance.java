public void advance(int min) {
    int n = min/720;
    boolean ap = (this.amPm.equals("PM")) ? true : false;
    if (n%2 == 1) ap = !ap;
    min %= 720;
    int curr = ((this.hour == 12) ? 0 : this.hour*60) + this.minute;
    int hour, minute;
    if (curr+min >= 720) {
        ap = !ap;
        hour = (curr+min-720)/60;
        min = (curr+min-720)%60;
    } else {
        hour = (curr+min)/60;
        min = (curr+min)%60;
    }
    if (ap) this.amPm = "PM";
    else this.amPm = "AM";
    this.hour = (hour == 0) ? 12 : hour;
    this.minute = min;
}
