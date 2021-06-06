TreeMap map = new TreeMap();
map.put("K", "Schwarz");
map.put("C", "Lee");
map.put("M", "Sahami");
map.put("M", "Stepp");
map.remove("Stepp");
map.remove("K");
map.put("J", "Cain");
map.remove("C, Lee");
System.out.println(map)

// {C = Lee, J = Cain, M = Stepp}
