public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
        findMissingNumber(arr);

    }

    public static void findMissingNumber(int[] arr) {
        int[] register = new int[arr.length];

        for (int i : arr) {
            register[i] = 1;
        }

        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println("missing numbers in given array");
                System.out.println(i);

            }
        }


    }

}
