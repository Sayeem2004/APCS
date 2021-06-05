public class Eve {
    public void a() {
        System.out.print("Eve a  ");
    }

    public void b() {
        System.out.print("Eve b  ");
    }

    public String toString() {
        return "Eve ts";
    }
}

public class Sam extends Eve {
    public void b() {
        a();
        System.out.print("Sam b  ");
    }

    public String toString() {
        return "Sam ts";
    }
}

public class Lucas extends Sam {
    public void a() {
        System.out.print("Lucas a  ");
        System.out.print(toString() + "  ");
    }

    public String toString() {
        String sup = super.toString();
        return sup + " " + sup;
    }
}

public class Josh extends Lucas {
    public void b() {
        System.out.print("Josh b  ");
        super.b();
    }

    public String toString() {
        return "Josh ts";
    }
}

Eve[] elements = { new Eve(), new Sam(), new Lucas(), new Josh() };
for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    elements[i].a();
    System.out.println();
    elements[i].b();
    System.out.println();
    System.out.println();
}

/*
element 0
Eve ts
Eve a
Eve b

element 1
Sam ts
Eve a
Eve a  Sam b

element 2
Sam ts Sam ts
Lucas a  Sam ts Sam ts
Lucas a  Sam ts Sam ts Sam b

element 3
Josh ts
Lucas a Josh ts
Josh b Lucas a Josh ts Sam b
*/
