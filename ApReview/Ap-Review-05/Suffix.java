String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
for (String x : words) {
    if (x.substring(x.length()-3).equals("ing"))
        System.out.println(x);
}
// Output:
// fading
// trailing
// batting
