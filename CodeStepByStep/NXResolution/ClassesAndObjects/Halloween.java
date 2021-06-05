public class Halloween {
    public static void main(String[] args) {
        int halloweenTown = 10;
        Skeleton bones = new Skeleton("bones");
        Pumpkin king = new Pumpkin(halloweenTown, bones);
        Skeleton skellington = bones;
        skellington.setName("skellington");
        halloweenTown = 5;
        System.out.println(king.toString());
    }
}

public class Pumpkin {
    private int x;
    private Skeleton y;

    public Pumpkin(int z, Skeleton w) {
        x = z;
        y = w;
    }

    public String toString() {
        return y.getName() + " " + x;
    }
}

public class Skeleton() {
    private String name;

    public Skeleton(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(string newName) {
        name = newName;
    }
}

// skellington 10
