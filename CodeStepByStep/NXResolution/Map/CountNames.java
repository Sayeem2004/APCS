public class CountNames {
    public static void main(String args[]) {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter name: ");
            String a = sc.nextLine();
            if (a.equals("")) break;
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a)+1);
            } else {
                mp.put(a, 1);
            }
        }
        for (String s : mp.keySet()) {
            System.out.println("Entry [" + s + "] has count " + mp.get(s));
        }
    }
}
