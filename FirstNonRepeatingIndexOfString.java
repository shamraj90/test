import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingIndexOfString {

    public static void main(String[] args) {
        String s="shamshrr";
        System.err.println(findFirstNonRepeatingIndexWithoutCollections(s));

    }

    public static int findFirstNonRepeatingIndex(String arr) {
       HashMap<Character, Integer> mp = new HashMap<>();
        int index = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (mp.get(arr.charAt(i)) == null) {
                mp.put(arr.charAt(i), 1);
            } else {
                mp.put(arr.charAt(i), mp.get(arr.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < arr.length(); i++) {
            if (mp.get(arr.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

     public static int findFirstNonRepeatingIndexWithoutCollections(String arr){
         char count[]= new char[256];
         int index=0;
         for(int i=0;i<arr.length();i++)
             count[arr.charAt(i)]++;

         for(int j=0;j<arr.length();j++){
             if(count[arr.charAt(j)]==1) {
                 index = j;
                 break;
             }
         }

         return index;
     }
}
