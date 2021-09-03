public class ConsecutiveSequenceCount {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2};
        int[] sortedArr = sortArr(arr);
        System.out.println(findMaxConsecutiveSeqCount(sortedArr));

    }

    public static int findMaxConsecutiveSeqCount(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            if (second - first == 1) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;


            }

        }
        return maxCount;
    }

    public static int[] sortArr(int[] arr) {
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
        return arr;
    }
}
