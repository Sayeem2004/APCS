/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac BarCodes.java
    Execution: java BarCodes
    Dependencies: PostalBarCode.java

    Notes: Client to test PostalBarCode class.

    > java BarCodes
    Unsorted codes:
    11111: |:::||:::||:::||:::||:::||:|:|:|
    08451: |||:::|::|::|::|:|:|::::|||::|:|
    11701: |:::||:::|||:::|||::::::||||:::|
    10282: |:::||||:::::|:||::|:::|:|::||:|
    min code: 08451: |||:::|::|::|::|:|:|::::|||::|:|
    max code: 11701: |:::||:::|||:::|||::::::||||:::|
    Sorted codes:
    08451: |||:::|::|::|::|:|:|::::|||::|:|
    10282: |:::||||:::::|:||::|:::|:|::||:|
    11111: |:::||:::||:::||:::||:::||:|:|:|
    11701: |:::||:::|||:::|||::::::||||:::|
    binary search 11111: |:::||:::||:::||:::||:::||:|:|:| found at: 2
****************************************************************************************************/
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class BarCodes {
    public static void main(String [] args) {
	    List<PostalBarCode> codes = new ArrayList<PostalBarCode>();
	    codes.add(new PostalBarCode("11111"));
	    codes.add(new PostalBarCode("08451"));
	    codes.add(new PostalBarCode("11701"));
        codes.add(new PostalBarCode("10282"));

	    System.out.println("Unsorted codes: ");
	    for (PostalBarCode c : codes)
	        System.out.println(c);

	    System.out.println("min code: " + Collections.min(codes));
	    System.out.println("max code: " + Collections.max(codes));
	    Collections.sort(codes);

     	System.out.println("Sorted codes: ");
	    for (PostalBarCode c : codes)
	        System.out.println(c);

	    PostalBarCode code = new PostalBarCode("11111");
	    System.out.print("binary search " + code + " found at: ");
	    System.out.println(Collections.binarySearch(codes,code));
    }
}
