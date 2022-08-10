import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "   Welcome    ";
        String string3 = String.valueOf(40.5);
//        System.out.println((string1.substring(1,3)));
//        System.out.println(string2);
//        string2 = string2.trim();
//        string1 = string2 +string3;
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string2.startsWith("te"));
//        string2 =string1.replaceAll("[aoiu]", "@");
        String[] strings = string1.split("");
      System.out.println(Arrays.toString(strings));
      StringBuffer word = new StringBuffer();
      word.setCharAt(0,'D');
      word.setCharAt(1, 'i');

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(54);
        list.add(32);
        System.out.println(list);
        list.size();


    }
}