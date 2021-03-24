public class Date {
    private int month, day;
    private final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int m, int d) {
        this.month = m;
        this.day = d;
    }

    public int daysInMonth() {
        return months[this.month-1];
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public void nextDay() {
        if (this.day == months[this.month-1]) {
            this.month++;
            if (this.month == 13) this.month = 1;
            this.day = 1;
        } else {
            this.day++;
        }
    }

    @Override
    public String toString() {
        return ((this.month / 10 == 1) ? "" : "0") + this.month + "/" + ((this.day / 10 >= 1) ? "" : "0") + this.day;
    }
}
