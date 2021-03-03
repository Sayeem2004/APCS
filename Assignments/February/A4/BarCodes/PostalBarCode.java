/****************************************************************************************************
    Name: Mohammad Khan, Esteak Shapin, Jessica Eng, Michelle Liang, Evelyn Zheng, Caroline Leung

    Compilation: javac PostalBarCode.java
    Dependencies: none

    Notes: A class for creating a postal bar code from a zip.
****************************************************************************************************/

public final class PostalBarCode implements Comparable<PostalBarCode> {
    // Attributes
    private final String[] convert = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    private final String code;
    private final String zip;
    private final String newzip;

    // Constructors
    public PostalBarCode(String zip) {
        this.zip = zip;
        int sum = 0;
        for (int i = 0; i < zip.length(); i++) {
            sum += (int)zip.charAt(i)-48;
        }
        this.newzip = zip + Integer.toString(sum%10);
        String temp = "|";
        for (int i = 0; i < newzip.length(); i++) {
            temp += convert[(int)newzip.charAt(i)-48];
        }
        temp += "|";
        this.code = temp;
    }

    // Methods
    public String getZip() {
        return this.zip;
    }
    public String getBarCode() {
        return this.code;
    }

    // Override Methods
    @Override
    public String toString(){
        return zip + ": " + code;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PostalBarCode) {
            PostalBarCode v = (PostalBarCode) obj;
            return this.zip.equals(v.zip);
        }
        return false;
    }
    @Override
    public int compareTo(PostalBarCode obj) {
        return this.zip.compareTo(obj.zip);
    }
}
