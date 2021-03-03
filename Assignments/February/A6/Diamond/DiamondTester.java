/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac DiamondTester.java
    Execution: java DiamondTester
    Dependencies: Diamond.java

    Notes: A client for testing Diamond.java

    > java DiamondTester
    ------- Diamond Ranking----------
    A3747-3.1-SI2-W-baguette
    C5619-2.8-VVS1-E-pear
    D9836-2.8-IF-E-princess
    B3598-2.4-VVS2-D-pear
    E6393-2.3-VS2-I-brilliant
    E1046-2.2-FL-E-rose
    A1844-2.1-VS2-D-lozenge
    G3459-2.1-VS2-H-rose
    D2381-1.7-I3-G-brilliant
    D8307-1.6-SI1-H-brilliant
    E8348-1.4-VS2-G-brilliant
    C9253-1.3-VS2-H-baguette
    A5911-1.1-VVS2-G-rose
    C5427-1.0-VS1-D-princess
    A1023-1.0-VS1-F-brilliant
    B4825-0.3-I1-D-rose
****************************************************************************************************/
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DiamondTester {
    public static void main ( String[] args ) {
	    List<Diamond> stones = new ArrayList<Diamond>();

	    stones.add(new Diamond("A1023", 1.0, "VS1",  'F', "brilliant"));
	    stones.add(new Diamond("A5911", 1.1, "VVS2", 'G', "rose"));
	    stones.add(new Diamond("C5427", 1.0, "VS1",  'D', "princess"));
	    stones.add(new Diamond("D8307", 1.6, "SI1",  'H', "brilliant"));
	    stones.add(new Diamond("B4825", 0.3, "I1",   'D', "rose"));
	    stones.add(new Diamond("A1844", 2.1, "VS2",  'D', "lozenge"));
	    stones.add(new Diamond("A3747", 3.1, "SI2",  'W', "baguette"));
     	stones.add(new Diamond("E6393", 2.3, "VS2",  'I', "brilliant"));
	    stones.add(new Diamond("C5619", 2.8, "VVS1", 'E', "pear"));
	    stones.add(new Diamond("E8348", 1.4, "VS2",  'G', "brilliant"));
	    stones.add(new Diamond("D2381", 1.7, "I3",   'G', "brilliant"));
	    stones.add(new Diamond("C9253", 1.3, "VS2",  'H', "baguette"));
	    stones.add(new Diamond("G3459", 2.1, "VS2",  'H', "rose"));
	    stones.add(new Diamond("B3598", 2.4, "VVS2", 'D', "pear"));
	    stones.add(new Diamond("D9836", 2.8, "IF",   'E', "princess"));
	    stones.add(new Diamond("E1046", 2.2, "FL",   'E', "rose"));

	    Collections.sort(stones);
	    System.out.println("------- Diamond Ranking ----------");
	    for (Diamond stone: stones)
	        System.out.println(stone);
    }
}
