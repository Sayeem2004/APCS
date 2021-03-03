/****************************************************************************************************
    Name: Mohammad Khan & Esteak Shapin & Caroline Leung & Evelyn Zheng & Michelle Liang

    Compilation: javac IsEven.java
    Dependencies: PredicateFunction.java

    Notes: Returns true if the given value is even else false.
****************************************************************************************************/

public class IsEven implements PredicateFunction {
    public boolean evaluate(int x) {return x%2 == 0;}
    public boolean evaluate(double x) {return false;}
}
