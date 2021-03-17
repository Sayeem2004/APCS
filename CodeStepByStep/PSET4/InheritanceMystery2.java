public class Brienne extends Oberyn {
    public void a() {
        System.out.print("Brienne-a   ");
    }
}

public class Arya {
    public void a() {
        System.out.print("Arya-a   ");
    }
    public void b() {
        a();
        System.out.print("Arya-b   ");
    }
    public String toString() {
        return "Arya";
    }
}

public class Tyrion extends Arya {
    public void a() {
        super.a();
        System.out.print("Tyrion-a   ");
    }
}

public class Oberyn extends Arya {
    public void b() {
        System.out.print("Oberyn-b   ");
        super.b();
    }
    public String toString() {
        return "Oberyn";
    }
}

public class InheritanceMystery2 {
    public static void main(String[] args) {
        Arya[] thrones = {new Oberyn(), new Arya(), new Brienne(), new Tyrion()};
        for (int i = 0; i < 4; i++) {
            thrones[i].a();
            System.out.println();
            System.out.println(thrones[i]);
            thrones[i].b();
            System.out.println();
            System.out.println();
        }
    }
}

/*
element 0:
Arya-a
Oberyn
Oberyn-b   Arya-a   Arya-b


element 1:
Arya-a
Arya
Arya-a   Arya-b


element 2:
Brienne-a
Oberyn
Oberyn-b   Brienne-a   Arya-b


element 3:
Arya-a   Tyrion-a
Arya
Arya-a   Tyrion-a   Arya-b
*/
