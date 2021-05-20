// Part A
private String recombine(String word1, String word2) {
    int a = word1.length()/2, b = word2.length()/2;
    return word1.substring(0,a) + word2.substring(b);
}

// Part B
private String[] mixedWords(String[] words) {
    String[] ret = new String[words.length];
    for (int i = 0; i < words.length; i+=2) {
        ret[i] = recombine(words[i], words[i+1]);
        ret[i+1] = recombine(words[i+1], words[i]);
    }
    return ret;
}
