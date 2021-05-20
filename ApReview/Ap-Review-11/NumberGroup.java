public interface NumberGroup {
    public boolean contains(int n);
}

// Part A
public class Range implements NumberGroup() {
    private int min;
    private int max;

    public Range(int mi, int ma) {
        min = mi;
        max = ma;
    }

    public boolean contains(int n) {
        if (n >= mix && n <= max) return true;
        return false;
    }
}

// Part B
public boolean contains(int num) {
    for (NumberGroup x : groupList) {
        if (x.contains(num)) return true;
    }
    return false;
}
