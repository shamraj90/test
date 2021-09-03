public class StringToInteger {

    public static void main(String[] args) {
        int result = convertToInteger("123");
        System.out.println("Result in integer " + result);
        System.out.println("Result in String " + convertToString(result));
    }

    public static int convertToInteger(String number) {
        int intResult = 0;
        for (int i = 0; i < number.length(); i++) {
            intResult = intResult * 10 + number.charAt(i) - '0';
        }
        return intResult;

    }

    public static String convertToString(int number){

        StringBuilder sb= new StringBuilder();

        while(number>0){
           int singleDigit= number%10;
           sb.append(singleDigit);
        }
        return sb.reverse().toString();
    }
}
