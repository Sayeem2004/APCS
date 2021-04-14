public static void collectionMystery4(HashMap<String, String> map, ArrayList<String> list) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        if (result.containsKey(s)) {
            result.put(s, result.get(s) + result.get(s));
        } else if (map.containsKey(s)) {
            result.put(map.get(s), s);
        }
    }
    System.out.println(result);
}

// map = {Marty=Stepp, Cynthia=Lee, Keith=Schwarz, Bruce=Lee, Mehran=Sahami};
// list = [Cynthia, Bruce, Lee, Eric, Schwarz, Keith, Sahami]
// result = {Lee=BruceBruce, Schwarz=Keith}

// map = {dog=woof, cat=meow, horse=whinny, frog=ribbit, duck=dog};
// list = [dog, horse, dog, woof, meow, cat, meow, woof]
// result = {woof=dogdogdogdog, whinny=horse, meow=catcat}
