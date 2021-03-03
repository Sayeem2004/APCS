public class C extends B {
    private int z;
    public C(int z) {
        super(2);
	    this.z = z;
    }
    public int h() { return f() + g() + z; }
}
