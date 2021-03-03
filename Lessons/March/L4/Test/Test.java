public class Test {
    public static void main(String[] args) {
        // 5
        A a = new A(10);
        System.out.println(a.f()); // -> 12
        System.out.println(a.g()); // -> 10
        // 6
        A b = new B(10);
        System.out.println(b.f()); // -> 3
        System.out.println(b.g()); // -> 30
        // 7
        C c = new C(10);
        System.out.println(c.f()); // -> 3
        System.out.println(c.g()); // -> 6
        System.out.println(c.h()); // -> 19
        // 8
        A d = new C(10);
        System.out.println(d.f()); // -> 3
        System.out.println(d.g()); // -> 6
        // System.out.println(d.h()); // -> Does Not Compile
        // 9
        C e = new C(10);
        System.out.println(((A)d).f()); // -> 3
        System.out.println(((A)d).g()); // -> 6
        // System.out.println(((A)d).h()); // -> Does Not Compile
        // 10
        Interface1 t1 = new R();
        R t2 = (R)t1;
        System.out.println(t1.f(1)); // -> 2
        System.out.println(t2.f(1)); // -> 2
        // System.out.println(t1.g(1)); // -> Does Not Compile
        System.out.println(t2.g(1)); // -> 10
        System.out.println(t1.toString()); // -> Howdy
        System.out.println(t2.toString()); // -> Howdy
    }
}
