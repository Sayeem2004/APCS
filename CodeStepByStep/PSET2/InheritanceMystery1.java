public class A extends B {
    public void method2() {
        System.out.print("a 2  ");
        method1();
    }
}

public class B extends C {
    public String toString() {
        return "b";
    }

    public void method2() {
        System.out.print("b 2  ");
        super.method2();
    }
}

public class C {
    public String toString() {
        return "c";
    }

    public void method1() {
        System.out.print("c 1  ");
    }

    public void method2() {
        System.out.print("c 2  ");
    }
}

public class D extends B {
    public void method1() {
        System.out.print("d 1  ");
    }
}

public class InheritanceMystery1 {
    public static void main(String[] args) {
        C[] elements = {new A(), new B(), new C(), new D()};
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            System.out.println();
            elements[i].method2();
            System.out.println();
            System.out.println();
        }
    }
}

/*
element 0:
b
c 1
a 2
c 1

element 1:
b
c 1
b 2
c 2

element 2:
c
c 1
c 2

element 3:
b
d 1
b 2
c 2
b 2
c 2
*/
