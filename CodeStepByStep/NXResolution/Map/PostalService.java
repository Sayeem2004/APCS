public HashMap<String, String> postalService(HashMap<String, Integer> people, HashMap<Integer, String> cities) {
    HashMap<String, String> ret = new HashMap<String, String>();
    for (String s : people.keySet()) {
        String city = cities.get(people.get(s));
        String[] name = s.split(" ");
        String last = name[name.length-1];
        if (ret.containsKey(city)) {
            ret.put(city, ret.get(city) + " and " + last);
        } else {
            ret.put(city, last);
        }
    }
    return ret;
}
