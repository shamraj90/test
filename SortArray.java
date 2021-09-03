

public class SortArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 9, 7, 5};
        for (int i : arr) {
            System.err.println("before " + i);

        }
        sortArrayInAsc(arr);



    }

    public static void sortArrayInAsc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.err.println("after " + i);

        }

    }
}
