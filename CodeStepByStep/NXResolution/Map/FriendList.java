public TreeMap<String, TreeSet<String>> friendList(String f) {
    try {
        File file = new File(f);
        Scanner in = new Scanner(file);
        TreeMap<String, TreeSet<String>> mp = new TreeMap<String, TreeSet<String>>();
        while (in.hasNextLine()) {
            String[] name = in.nextLine().split(" ");
            if (mp.containsKey(name[0])) {
                TreeSet<String> temp = mp.get(name[0]);
                temp.add(name[1]);
                mp.put(name[0], temp);
            } else {
                TreeSet<String> temp = new TreeSet<String>();
                temp.add(name[1]);
                mp.put(name[0], temp);
            }
            if (mp.containsKey(name[1])) {
                TreeSet<String> temp = mp.get(name[1]);
                temp.add(name[0]);
                mp.put(name[1], temp);
            } else {
                TreeSet<String> temp = new TreeSet<String>();
                temp.add(name[0]);
                mp.put(name[1], temp);
            }
        }
        return mp;
    } catch (FileNotFoundException e) {
        return null;
    }
}
