import java.util.HashSet;

public class StringPermutation {

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(findStringPerm(str));

    }

    public static HashSet<String> findStringPerm(String str) {

        HashSet<String> hs = new HashSet<>();
        if (str == null)
            return null;
        else if (str.length() == 0) {
            hs.add("");
            return hs;
        }
        char firstChar = str.charAt(0);
        String rem = str.substring(1);

        HashSet<String> words = findStringPerm(rem);
        System.out.println("words"+words);

        for (String newStr : words) {
            for (int i = 0; i <= newStr.length(); i++) {
                hs.add(insertCharacter(newStr, firstChar, i));
            }
        }

        return hs;
    }

    public static String insertCharacter(String s, char c, int pos) {
        String begin = s.substring(0, pos);
        String end = s.substring(pos);

        return begin + c + end;
    }
}
