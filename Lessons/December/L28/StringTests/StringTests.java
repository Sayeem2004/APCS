/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:
    Execution:
    Dependencies:

    Notes:

    > java

****************************************************************************************************/

public class StringTests {
    public static String reverseDomain(String domainName) {
        String ret = "";
        int prev = 0;
        for (int i = 0; i < domainName.length(); i++) {
            if (prev == 0 && domainName.charAt(i) ==  '.') {
                ret = "."+domainName.substring(prev,i)+ret;
                prev = i;
                continue;
            }
            if (i == domainName.length()-1) {
                ret = domainName.substring(prev+1,domainName.length()) + ret;
                continue;
            }
            if (domainName.charAt(i) == '.') {
                ret = domainName.substring(prev,i) + ret;
                prev = i;
                continue;
            }
        }
        return ret;
    }
    public static String topLevelDomain(String domainName){
    	int split = 0;
        for (int i = 0; i < domainName.length(); i++) {
            if (domainName.charAt(i) == '.')
                split = i;
        }
        return domainName.substring(split+1);
    }
    public static void filename(String str) {
        int split = str.indexOf('.');
        System.out.println("filename: " + str.substring(0,split));
        System.out.println("fileextension: " + str.substring(split+1));
    }
    public static String secondHalf(String str) {
        return str.substring(str.length()/2);
    }
    public static void test(String str) {
        System.out.println(str+"!");
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("l",5));
        System.out.println(str.replace('h','3'));
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(7));
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3,3));
    }
    public static void main(String[] args) {
        String str = "cs.princeton.edu";
        System.out.println(reverseDomain(str));
    }
}
