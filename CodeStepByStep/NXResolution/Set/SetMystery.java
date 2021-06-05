TreeSet set = new TreeSet();
set.add(74);
set.add(12);
set.add(74);
set.add(74);
set.add(43);
set.remove(74);
set.remove(999);
set.remove(43);
set.add(32);
set.add(12);
set.add(9);
set.add(999);
System.out.println(set);

// {9, 12, 32, 999}
