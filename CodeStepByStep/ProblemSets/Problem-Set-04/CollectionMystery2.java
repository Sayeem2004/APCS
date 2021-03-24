public HashMap<String, String> collectionMystery(HashMap<String, Integer> map1, HashMap<Integer, String> map2) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (String s1 : map1) {
        if (map2.containsKey(map1.get(s1))) {
            result.put(s1,map2.get(map1.get(s1)));
        }
    }
    return result;
}

// map1={bar=1, baz=2, foo=3, mumble=4}, map2={1=earth, 2=wind, 3=air, 4=fire} ->
// {bar=earth, baz=wind, foo=air, mumble=fire}

// map1={five=105, four=104, one=101, six=106, three=103, two=102}, map2={99=uno, 101=dos, 103=tres, 105=cuatro} ->
// {five=cuatro, one=dos, three=tres}

// map1={a=42, b=9, c=7, d=15, e=11, f=24, g=7}, map2={1=four, 3=score, 5=and, 7=seven, 9=years, 11=ago} ->
// {b=years, c=seven, e=ago, g=seven}
