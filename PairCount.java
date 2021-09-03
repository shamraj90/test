import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairCount {

    public static void main(String[] args) {
        int[] arrwithPairs = new int[]{2, 4, 2, 4, 4, 3, 5, 5, 5, 5, 7, 7, 7, 7, 7};
        System.err.println("Pairs " + getPairCountInAnArray(arrwithPairs));
        System.err.println("Pairs along with numbers " + findPairsAlongWithNumber(arrwithPairs));

    }

    public static int getPairCountInAnArray(int[] arr) {
        int pairs = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                pairs++;
                set.remove(arr[i]);
            } else
                set.add(arr[i]);
        }
        return pairs;
    }

    public static Map<Integer, Integer> findPairsAlongWithNumber(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> pairsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entry = hm.entrySet();

        for (Map.Entry<Integer, Integer> e : entry) {
            if (e.getValue() / 2 >= 1) {
                pairsMap.put(e.getKey(), e.getValue() / 2);
            }

        }
        return pairsMap;
    }
}
