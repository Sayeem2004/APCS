public class Poe extends Kylo {
    public void method2() {
        super.method2();
        System.out.print("Poe 2  ");
    }

    public String toString() {
        return "Poe " + super.toString();
    }
}

public class Kylo extends Finn {
    public void method1() {
        System.out.print("Kylo 1  ");
    }

    public String toString() {
        return "Kylo";
    }
}

public class Finn extends Rey {
    public void method2() {
        System.out.print("Finn 2  ");;
        method1();
    }
}

public class Rey {
    public String toString() {
        return "Rey";
    }

    public void method1() {
        System.out.print("Rey 1  ");
    }

    public void method2() {
        System.out.print("Rey 2  ");
    }
}

Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };
for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    elements[i].method1();
    System.out.println();
    elements[i].method2();
    System.out.println();
    System.out.println();
}

/*
Element 0
Rey
Rey 1
Finn 2  Rey 1
*/

/*
Element 1
Rey
Rey 1
Rey 2
*/

/*
Element 2
Poe Kylo
Kylo 1
Finn 2  Kylo 1  Poe 2
*/

/*
Element 3
Kylo
Kylo 1
Finn 2  Kylo 1
*/
