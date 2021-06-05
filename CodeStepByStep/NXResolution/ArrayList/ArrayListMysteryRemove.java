ArrayList<Integer> vec = new ArrayList<Integer>();
for (int i = 1; i <= 8; i++) {
    vec.add(10 * i); // {10, 20, 30, 40, 50, 60, 70, 80}
}
for (int i = 0; i < vec.size(); i++) {
    vec.remove(i);
}
System.out.println(vec);

// {20, 40, 60, 80}
