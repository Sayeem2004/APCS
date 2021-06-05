ArrayList<Integer> vec = new ArrayList<Integer>();
for (int i = 0; i <= 5; i++) {
    vec.add(2 * i);  // {2, 4, 6, 8, 10}
}
int size = vec.size():
for (iint i = 0; i < size; i++) {
    vec.add(i, 42);
}
System.out.println(vec);

// {42, 42, 42, 42, 42, 2, 4, 6, 8, 10}
