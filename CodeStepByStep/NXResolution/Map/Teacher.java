public HashMap<String, String> teacher(HashMap<String, Integer> names, HashMap<Integer, String> grades) {
    HashMap<String, String> ret = new HashMap<String, String>();
    for (String s : names.keySet()) {
        int g = names.get(s);
        ret.put(s,"F");
        for (Integer i : grades.keySet()) {
            if (i <= g) {
                ret.put(s,grades.get(i));
            }
        }
    }
    return ret;
}
