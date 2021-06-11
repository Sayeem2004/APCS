public static void collectionMystery5(ArrayList<String> list1, ArrayList<String> list2) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (int i = 0; i < list1.size(); i++) {
        String s1 = list1.get(i);
        String s2 = list2.get(i);

        if (!result.containsKey(s1)) {
            result.put(s1, s2);
        } else if (!result.containsKey(s2)) {
            result.put(s2, s1);
        } else {
            result.put(s1 + s2, s1);
        }
    }
    System.out.println(result);
}

// list1 = ["cat", "cat",  "long", "long", "longcat"]
// list2 = ["mew", "purr", "cat",  "cat",  "purr"   ]
// {cat = mew, purr = cat, long = cat, longcat = long, longcatpurr = longcat}

// list1 = ["a", "b", "a", "ab", "ab", "y",   "abb"]
// list2 = ["b", "c", "b", "b",  "c",  "abb", "y"  ]
// {a = b, b = c, ab = a, abb = ab, c = ab, y = abb, abby = abb}
