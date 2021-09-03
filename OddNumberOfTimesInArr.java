import java.util.HashMap;
import java.util.Map;

public class OddNumberOfTimesInArr {

    public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        //findOddTimesInAnArr(arr);
        findOddTimesInAnArrUsingXor(arr);
    }

    public static void findOddTimesInAnArr(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else
                hm.put(arr[i], hm.get(arr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
            if (en.getValue() % 2 == 1) {
                System.out.println(en.getKey() + " is occuring odd no of times ");
            }

        }

    }

    public static void findOddTimesInAnArrUsingXor(int[] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println(result + " is occuring odd no of times ");
    }
}
