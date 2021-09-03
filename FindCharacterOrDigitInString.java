public class FindCharacterOrDigitInString {

    public static void main(String[] args) {
        String str= "-123S#strong wrrd";
        findCharacterOrDigitOrCharacter(str);
        System.err.println("String to Integer :"+stringToInteger(str));

    }

    public static void findCharacterOrDigitOrCharacter(String str){

        for(int index=0; index<str.length();index++){
            char c=str.charAt(index);
            
            if(c>='0' && c<='9')
                System.err.println("Number");
            else if((c>='a' && c<='Z') || (c>='A' && c<='Z'))
                System.err.println("Character");
            else
                System.err.println("Symbol");
        }

    }

    public static int stringToInteger(String s){
        int result=0;
        int sign=0;
        for(int index=0;index<s.length();index++){
            char c= s.charAt(index);
             if(c>='0' && c<='9'){
                 result=result*10 + c -'0';
             }else{
                 sign =(c == '-') ? -1 :1;

             }

        }
        return result*sign;
    }
}
