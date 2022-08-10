import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Use_Map {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("be");
        stringList.add("be");
        stringList.add("is");
        stringList.add("not");
        stringList.add("or");
        stringList.add("question");
        stringList.add("that");
        stringList.add("the");
        stringList.add("to");
        stringList.add("to");
        stringList.add("to");

        System.out.println(checkContain3(stringList));


    }
    public static boolean checkContain3(List<String> list){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String str : list){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
                if(map.get(str) == 3 ){
                    return true;

                }

            }
            else {
                map.put(str, 1);
            }

        }
        return false;
    }
}
