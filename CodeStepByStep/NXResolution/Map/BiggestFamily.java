public void biggestFamily(String f) {
    try {
        File file = new File(f);
        Scanner in = new Scanner(file);
        TreeMap<String, TreeSet<String>> mp = new TreeMap<String, TreeSet<String>>();
        while (in.hasNextLine()) {
            String[] name = in.nextLine().split(" ");
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
        int mx = 0;
        for (String s : mp.keySet()) {
            if (mp.get(s).size() > mx) {
                mx = mp.get(s).size();
            }
        }
        for (String s : mp.keySet()) {
            if (mp.get(s).size() == mx) {
                System.out.print(s + " family: ");
                TreeSet<String> temp = mp.get(s);
                for (String t : temp) {
                    System.out.print(t + " ");
                }
                System.out.println();
            }
        }
    } catch (FileNotFoundException e) {

    }
}
