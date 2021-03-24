public class TimeSpan {
    private int hours, minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
        this.hours += this.minutes/60;
        this.minutes %= 60;
    }

    public void add(TimeSpan other) {
        this.hours += other.hours;
        this.minutes += other.minutes;
        this.hours += this.minutes/60;
        this.minutes %= 60;
    }

    public double getTotalHours() {
        return (double)this.hours + this.minutes/60.0;
    }

    public String toString() {
        return this.hours + "h" + this.minutes + "m";
    }
}
