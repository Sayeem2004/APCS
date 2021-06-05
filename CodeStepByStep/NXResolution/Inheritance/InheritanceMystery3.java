public class George extends Elaine {
    public void method1() {
        System.out.print("George 1 ");
    }
}

public class Jerry {
    public void method1() {
        System.out.print("Jerry 1 ");
    }
    public void method2() {
        System.out.print("Jerry 2 ");
    }
    pulbic String toString() {
        return "Jerry";
    }
}

public class Elaine extends Kramer {
    public string toString() {
        return "Elaine " + super.toString();
    }
}

public class Kramer extends Jerry {
    public void method1() {
        super.method1();
        System.out.print("Kramer 1 ");
    }
    public void method2() {
        System.out.print("Kramer 2 ");
        method1();
    }
    public String toString() {
        return "Kramer";
    }
}

public class InheritanceMystery3 {
    public static void main(String[] args) {
        Jerry[] seinfeld = { new George(), new Kramer(), new Jerry(), new Elaine() };
        for (int i = 0; i < seinfeld.length; i++) {
            seinfeld[i].method1();
            System.out.println();
            seinfeld[i].method2();
            System.out.println();
            System.out.println(seinfeld[i]);
            System.out.println();
        }
    }
}

/*
element 0
George 1
Kramer 2 George 1
Elaine Kramer

element 1
Jerry 1 Kramer 1
Kramer 2 Jerry 1 Kramer 1
Kramer

element 2
Jerry 1
Jerry 2
Jerry

element 3
Jerry 1 Kramer 1
Kramer 2 Jerry 1 Kramer 1
Elaine Kramer 
*/
