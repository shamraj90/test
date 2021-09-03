import java.util.Scanner;

public class IntegerToWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = sc.nextInt();
        String result = convertNumber(n);
        System.err.println("Result " + result);

    }

    public static String unitsAndTens(int number) {
        String s = "";
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number < 20) {
            s = units[number];
        } else if (number >= 20 && number < 100) {
            s = tens[number / 10] + " " + units[number % 10];
        }
        return s;
    }

    public static String convertNumber(int number) {
        String result = "";
        if (number < 100) {
            return unitsAndTens(number);
        } else if (number >= 100 && number < 1000) {
            result = unitsAndTens(number / 100) + " Hundred " + convertNumber(number % 100);
        } else if (number >= 1000 && number < 100000) {
            result = unitsAndTens(number / 1000) + " Thousand " + convertNumber(number % 1000);
        } else if (number >= 100000 && number < 10000000) {
            result = unitsAndTens(number / 100000) + " Lakh " + convertNumber(number % 100000);
        } else if (number >= 10000000 && number < 1000000000) {
            result = unitsAndTens(number / 1000000000) + " Crore " + convertNumber(number % 1000000000);
        }
        return result;
    }
}
