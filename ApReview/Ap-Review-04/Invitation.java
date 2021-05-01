public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    // part A
    public String getHost() {
        return hostName;
    }

    // part B
    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    // part C
    public String invite(String inv) {
        return "Dear " + inv + ", please attend my event at " + address + ". See you then, " + hostName;
    }

    // part D
    public Invitation(String add) {
        address = add;
        hostName = "Host";
    }
}
