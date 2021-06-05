public static void collectionMystery1(HashMap<String, String> map) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (String k : map.ketSet()) {
        String v = map.get(k);
        if (k.charAt(0) <= v.charAt(0)) {
            result.put(k, v);
        } else {
            result.put(v, k);
        }
    }
    System.out.println(result);
}

// {two=deux, five=cinq, one=un, three=trois, four=quatre} ->  {deux=two, cinq=five, one=un, three=trois, four=quatre}
// {skate=board, drive=car, program=computer, play=computer} -> {board=skate, car=drive, computer=play}
// {siskel=ebert, girl=boy, heads=tails, ready=begin, first=last, begin=end} -> {ebert=siskel, boy=girl, heads=tails, begin=end, first=last}
// {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton} -> {cotton=rain, tree=violin, seed=tree, light=tree}
