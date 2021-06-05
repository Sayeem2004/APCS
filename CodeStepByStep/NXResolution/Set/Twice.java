public Set<Integer> twice(List<Integer> lt) {
    Set<Integer> ret = new HashSet<Integer>();
    Set<Integer> temp = new HashSet<Integer>();
    Set<Integer> bad = new HashSet<Integer>();
    for (int i = 0; i < lt.size(); i++) {
        if (temp.contains(lt.get(i))) {
             if (!ret.contains(lt.get(i)) && !bad.contains(lt.get(i))) {
                 ret.add(lt.get(i));
             } else if (ret.contains(lt.get(i))) {
                 ret.remove(lt.get(i));
                 bad.add(lt.get(i));
             }
        } else {
            temp.add(lt.get(i));
        }
    }
    return ret;
}
