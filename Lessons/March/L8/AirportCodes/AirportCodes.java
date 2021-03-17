/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac AirportCodes.java
    Execution: java AirportCodes
    Dependencies: StdIn.java StdOut.java In.java, Airports.csv

    Notes: This program looks up a three-letter airport code in a Map. Reads a data file representing
    airport codes and creates a map linking the airport code with the corresponding city names. Each
    line in the data file must consist of a three-letter code, an equal sign, and the city name for
    that airport. This code, however, does not check that the line is properly formatted. Use -1 to
    stop the program.

    > $ java AirportCodes
    Airport code: lga
    LGA is  New York La Guardia

    Airport code: jfk
    JFK is  New York John F. Kennedy International

    Airport code: Atl
    ATL is  Atlanta William B. Hartsfield International

    Airport code: BOw
    There is no such airport code

    Airport code: bos
    BOS is  Boston Logan International

    Airport code: -1
****************************************************************************************************/
import java.util.*;

public class AirportCodes {
    public static void main(String[] args) {
        // Creating A Map From The Data
        In in = new In("airports.csv");
	    Map <String,String> airportCodes = new HashMap<String,String>();
	    while (!in.isEmpty()) {
	        String line = in.readLine();
	        int i = line.indexOf(",");
	        String code = line.substring(0,i);
	        String city = line.substring(i+1);
	        airportCodes.put(code,city);
	    }

        // Looking Up Values In The Map
	    while (true) {
	        System.out.print("Airport code: ");
	        String code = StdIn.readString().toUpperCase();
	        if (code.equals("-1")) break;
	        if (airportCodes.containsKey(code)) {
		        System.out.println(code + " is  " + airportCodes.get(code));
	        } else {
		        System.out.println("There is no such airport code");
	        }
            System.out.println();
	    }
    }
}
