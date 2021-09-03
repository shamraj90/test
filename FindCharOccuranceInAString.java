import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCharOccuranceInAString {

    public static void main(String[] args) {
        String input = "shamsravs";
        Stream.of(input.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + " -->" + e.getValue() + " ")
                .forEach(System.out::print);

        String str = "Hello Manash";
        Map<Character, Long> hm = str.chars().mapToObj(c ->
                (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(hm);


        List<Character> chars = Arrays.asList('h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd');
        Map<Character, Long> map = chars.stream().map(c -> c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }
}
