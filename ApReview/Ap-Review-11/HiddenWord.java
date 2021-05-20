// Part A
public class HiddenWord {
    private String word;
    public HiddenWord(String w) {
        word = w;
    }
    public String getHint(String g) {
        String ret = "";
        for (int i = 0; i < g.length(); i++) {
            if (g.substring(i,i+1).equals(word.substring(i,i+1))) {
                ret += g.substring(i,i+1);
            } else if (word.indexOf(g.substring(i,i+1)) != -1) {
                ret += "+";
            } else {
                ret += "*";
            }
        }
        return ret;
    }
}
