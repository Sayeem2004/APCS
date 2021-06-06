public int wordCount(String s) {
    try {
        File f = new File(s);
        Scanner sc = new Scanner(f);
        Set<String> st = new HashSet<String>();
        while (sc.hasNextLine()) {
            String[] temp = sc.nextLine().split(" ");
            for (String t : temp) {
                if (!t.equals(""))
                    st.add(t);
            }
        }
        return st.size();
    } catch (FileNotFoundException e) {
        return -1;
    }
}
