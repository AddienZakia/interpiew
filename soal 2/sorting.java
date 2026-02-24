import java.util.ArrayList;

public class sorting {
    public static void main(String[] args) {
        int[][] given = { { 3, 2, 1 }, { 4, 6, 5 }, {}, { 9, 7, 8 } };
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[i].length; j++) {
                arr.add(given[i][j]);
            }
        }

        bubbleSort(arr);
        for (int v : arr) {
            System.out.println(v);
        }
    }

    // sebebasnya sorting algorithm
    public static void bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
