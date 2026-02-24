public class multidimensional {
    public static void main(String[] args) {
        // Object[] nested = {
        // "a",
        // "b",
        // new Object[] {
        // "c",
        // "d",
        // new Object[] {
        // "e"
        // }
        // }
        // };

        Object[] nested = new Object[] {
                new Object[] { "a" },
                new Object[] { "b", "c" },
                new Object[] { "d", new Object[] { "e", "f" } }
        };

        boolean v = nestedSearch(nested, "f");
        System.out.println(v);

    }

    public static boolean nestedSearch(Object[] list, String target) {
        // linear search + recursive
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof Object[]) {
                boolean x = nestedSearch((Object[]) list[i], target);

                if (x) {
                    return true;
                }
            } else if (list[i].equals(target)) {
                return true;
            }
        }

        return false;
    }
}
