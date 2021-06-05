public static void collectionMystery3(HashMap<String, String> map) {
    ArrayList<String> list = new ArrayList<String>();
    for (String key : map.keySet()) {
        if (map.get(key).length() > key.length()) {
            list.add(map.get(key));
        } else {
            list.add(0, key);
            list.remove(map.get(key));
        }
    }
    System.out.println(list);
}

// {horse=cow, cow=horse, dog=cat, ok=yo} -> {ok, dog, horse, horse}
// {bye=hello, bird=dog, hi=hello, hyena=apple, fruit=meat} -> {fruit, hyena, bird, hello, hello}
// {a=b, c=d, e=a, ff=a, gg=c, hhh=ff} -> {hhh, gg, e}
