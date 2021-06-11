public static void collectionMyster3(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    for (int i = 0; i < size; i++) {
        int n = q.remove();
        if (n % 2 == 0) {
            s.push(n);
        } else {
            q.add(n);
        }
    }
    System.out.println("q=" + q);
    System.out.println("s=" + s);
}
/*
{1, 2, 3, 4, 5, 6}
q={1, 3, 5}
s={2, 4, 6}
*/

/*
{42, -3, 4, 15, 9, 71}
q={-3, 15, 9, 71}
s={42, 4}
*/

/*
{30, 20, 10, 60, 50, 40, 3, 0}
q={3}
s={30, 20, 10, 60, 50, 40, 0}
*/
