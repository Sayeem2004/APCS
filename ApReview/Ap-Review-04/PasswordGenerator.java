public class PasswordGenerator {
    private String prefix;
    private int length;
    private static int count;

    public PasswordGenerator(int len, String pre) {
        length = len;
        prefix = pre;
    }

    public PasswordGenerator(int len) {
        length = len;
        prefix = "A";
    }

    public int pwCount() {
        return count;
    }

    public String pwGen() {
        count++;
        String ret = prefix + ".";
        for (int i = 0; i < length; i++) {
            ret += (int)(Math.random()*10);
        }
        return ret;
    }
}
