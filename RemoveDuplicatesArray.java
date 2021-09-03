import java.util.Arrays;

public class RemoveDuplicatesArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 9, 7, 5, 5, 5, 4, 9};
        removeDuplicates(arr);
        System.err.println("count of duplicates "+countDuplicates(arr));
    }

    private static void removeDuplicates(int[] a) {
        Arrays.sort(a);
        int[] result = new int[a.length];
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                result[count] = a[i - 1];
                count++;
            }
            if ((i == a.length - 1 && a[i - 1] != a[i])) {
                result[count] = a[i];
            }

        }
        int uniqueArr[] = new int[count];
        for (int k = 0; k < count; k++) {
            uniqueArr[k] = result[k];

        }
        System.out.println(Arrays.toString(uniqueArr));

    }

    public static int countDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[j] + ", at index " + j);
                    count++;
                }
            }
        }
        return count;
    }


}
