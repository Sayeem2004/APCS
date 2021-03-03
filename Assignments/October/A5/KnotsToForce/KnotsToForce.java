/****************************************************************************************************
    Name: Mohammad Khan
    
    Compilation: javac KnotsToForce.java
    Execution: java KnotsToForce n

    Notes: Returns the force of a wind with a wind speed n(n >= 0).

    % java KnotsToForce 45
    9

    % java KnotsToForce 51
    10
****************************************************************************************************/

public class KnotsToForce {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        switch (n) {
            case 0:
                System.out.println(0);
                break;
            case 1: case 2: case 3:
                System.out.println(1);
                break;
            case 4: case 5: case 6:
                System.out.println(2);
                break;
            case 7: case 8: case 9: case 10:
                System.out.println(3);
                break;
            case 11: case 12: case 13: case 14: case 15: case 16:
                System.out.println(4);
                break;
            case 17: case 18: case 19: case 20: case 21:
                System.out.println(5);
                break;
            case 22: case 23: case 24: case 25: case 26: case 27:
                System.out.println(6);
                break;
            case 28: case 29: case 30: case 31: case 32: case 33:
                System.out.println(7);
                break;
            case 34: case 35: case 36: case 37: case 38: case 39: case 40:
                System.out.println(8);
                break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47:
                System.out.println(9);
                break;
            case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55:
                System.out.println(10);
                break;
            case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63:
                System.out.println(11);
                break;
            default:
                System.out.println(12);
                break;
        }
    }
}
