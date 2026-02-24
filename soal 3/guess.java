import java.util.ArrayList;

public class guess {
    public static void main(String[] args) {
        String[] list = { "ab", "cba", "abc", "axbxc", "ddd", "abc", "cxab", "aabbcc" };
        String target = "abc";

        ArrayList<String> kata = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            boolean valid = true;
            for (int j = 0; j < target.length(); j++) {
                if (!list[i].contains(Character.toString(target.charAt(j)))) {
                    valid = false;
                }
            }

            if (valid) {
                kata.add(list[i]);
            }
        }

        System.out.println(kata);
    }
}