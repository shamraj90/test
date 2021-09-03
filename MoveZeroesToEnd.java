public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 0, 1, 5};

        int[] outArr = moveZeroesToEnd(arr);
        printArray(outArr);
    }

    public static int[] moveZeroesToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i] + " ");
        }
    }

       public static int[] moveZeroesToFront(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }
}
