public class StringEq {
    public static void main(String[] args) {
        String a = "hi";
	    String b = new String(a);
	    String c = args[0];

	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    System.out.println("c = " + c);
	    System.out.println("a == a " + (a == a));
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("b == c " + (b == c));

	    System.out.println("a.equals(a) " + (a.equals(a)));
	    System.out.println("a.equals(b) " + (a.equals(b)));
	    System.out.println("a.equals(c) " + (a.equals(c)));
	    System.out.println("b.equals(c) " + (b.equals(c)));
    }
}
