import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SetofString {
    public static void main(String[] args) {
        String[] strings={"foo","foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};
        for (int i=0;i<strings.length;i++){
            if (strings[i].length()%2==0){
                strings= ArrayUtils.remove(strings,i);
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
