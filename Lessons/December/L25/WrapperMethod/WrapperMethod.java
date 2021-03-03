/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class WrapperMethod {
    public static double sum(double[] v) {
        return sum(v,0);
    }
    public static double sum(double[] v, int index) {
        if (index == v.length-1) return v[index];
        return v[index] + sum(v,index+1);
    }
    public static void main(String[] args) {
        double[] v = {0.1,0.2,0.3,0.4};
        System.out.println(sum(v));
    }
}
