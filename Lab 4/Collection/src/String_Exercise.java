import java.util.Scanner;
import java.util.regex.Pattern;

public class String_Exercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = sc.nextLine();
        System.out.println("Number of non space character is "+ numberNonSpaceCharacter(string));
        printReverseString(string);
        if (string.length()>=3){
            System.out.println("Third character of string is "+string.substring(2,3));
            System.out.println("Third character of string is "+string.charAt(3));

        }else{
            System.out.println("undefined");
        }
        System.out.println("Enter string 1: ");
        String s1 = sc.nextLine() ;
        System.out.println("Enter string to find: ");
        String s2 = sc.nextLine();
        containString(s1,s2);
        System.out.println("Enter string 3");
        String s3 = sc.nextLine();
        countCharacter(s3);
        String s4 = "Tone of voice id, with a question, for example; to quite quickly";
        String[] words =  s4.split("[ ,;.]+");
        System.out.println("Number of words: "+words.length);
        System.out.println("Upper case is: " + string.toUpperCase());
        System.out.println("Lower case is: " + string.toLowerCase());
        System.out.println("Enter string 5");
        String s5 = sc.nextLine();
        replaceIdenticalCharacter(s5);
        System.out.println("Enter string 6: ");
        String string6 = sc.nextLine();
        RemoveDoubleSpace(string6);
        System.out.println("Enter string");
       String str = sc.nextLine();
       getOccuringChar(str);
        System.out.println("Title Case: " + convertToTitleCaseIteratingChars(str));
            String result = reverseEachWord(string);
            System.out.println(result);


    }


    public static int numberNonSpaceCharacter(String string){
        int count =0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void printReverseString(String string){

       System.out.print("The reverse of Number is: ");
        for (int i =string.length()-1;i>=0;i--)
        {
           char temp = string.charAt(i);
            System.out.print(temp);
        }

        System.out.println();

    }
    public static void containString(String s1, String s2){
        if (s1.contains(s2)){
            for (int i=0;i<s1.length();i++){
                if (s1.substring(i).startsWith(s2)){
                    System.out.println("Substring found at position "+(i+1));
                }
            }
        }else {
            System.out.println("Substring not found in the string");
        }
    }
    public static void countCharacter(String input){
        int countNumber=0;
        int countVowel = 0;
        int countConsonant = 0;
        int countSpecial = 0;
        for (int i =0;i<input.length();i++){
            String temp = input.substring(i, i+1);
            if (temp.matches("[0-9]"))
            {
                countNumber++;
            }
            else if(temp.matches("[a-zA-Z]"))
            {
                if (temp.matches("[aouieAOUIE]"))
                {
                    countVowel++;
                }
                else{
                    countConsonant++;
                }
            }else {
                countSpecial++;
            }
        }
        System.out.println("Number of numeral character: "+countNumber);
        System.out.println("Number of vowel character: "+countVowel);
        System.out.println("Number of consonant character: "+countConsonant);
        System.out.println("Number of special character: "+countSpecial);
    }
    public static void replaceIdenticalCharacter(String string){
        for (int i=0;i<string.length()-1;i++){
            boolean check = true;
            int nextIndex = i+1;
            String ch = String.valueOf(string.charAt(i));
            do{
                if (nextIndex!=string.length()&&string.substring(nextIndex).startsWith(ch)){
                    nextIndex++;
                }else{
                    check = false;
                }
            }while(check);
            string = string.substring(0,i+1) +string.substring(nextIndex);
        }
        System.out.println(string);
    }
    public static void RemoveDoubleSpace(String string6)
    {
        String strNew = string6.replace("  ", " ");
        System.out.println("String after changed is: " + strNew);
    }
    static final int MAX_CHAR = 256;
    static void getOccuringChar(String str)
    {
    //creating an array of size 256 (ASCII_SIZE)
        int count[] = new int[MAX_CHAR];
    //finds the length of the string
        int len = str.length();
    //initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
    //create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++)
        {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++)
            {
        //if any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
        //prints occurrence of the character
                System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);
        }
    }
    public static String convertToTitleCaseIteratingChars(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder converted = new StringBuilder();

        boolean convertNext = true;
        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }

        return converted.toString();
    }
    public static String reverseEachWord(String string){
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(string);
        String result = "";
        for(int i = 0; i< temp.length; i++)
        {
            if(i== temp.length-1){
                result = temp[i] +result;
            }
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

}
