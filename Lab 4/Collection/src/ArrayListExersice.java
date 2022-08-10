import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ArrayListExersice {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter the number of string: ");
//        int numOfString = Integer.parseInt(sc.nextLine());
        ArrayList<String> listString = new ArrayList<>();
//        String[] stringArray = new String[numOfString];
//        for (int i = 0; i < stringArray.length; i++){
//            System.out.println("Please enter string: " + i);
//            stringArray[i] = sc.nextLine();
//        }
//        // Adding to list
//        System.out.println();
//        Collections.addAll(listString, stringArray);
//        // calling the function
//        removeEvenLength(listString);
//        for (String result : listString){
//            System.out.println(result);
//        }
//        doubleList(listString);
//        removeDuplicates(listString);
//        for(String temp: listString){
//            System.out.println(temp);
//        }
//        Set<String> setOfSting = new HashSet<String>();
//        setOfSting.add("foo");
//        setOfSting.add("buzz");
//        setOfSting.add("bar");
//        setOfSting.add("fork");
//        setOfSting.add("bort");
//        setOfSting.add("spoon");
//        setOfSting.add("!");
//        setOfSting.add("dude");
//        listString.add("how");
//        listString.add("are");
//        listString.add("you");
//        rmEvenStrProvided(setOfSting);
        listString.add("be");
        listString.add("be");
        listString.add("is");
        listString.add("not");
        listString.add("or");
        listString.add("question");
        listString.add("that");
        listString.add("the");
        listString.add("to");
        listString.add("to");
//        doubleList(listString);
        removeDuplicates(listString);
        for (String item : listString)
        {
            System.out.println(item);
        }

    }
    public static void doubleList(ArrayList<String> listString){
        for (int i=0;i<listString.size();i+=2){
            listString.add(i,listString.get(i));
        }
    }
    public static void removeEvenLength(ArrayList<String> listString){
        for (int i=0;i<listString.size();i++){
            if (listString.get(i).length()%2==0){
                listString.remove(i);
                i--;
            }
        }
    }
    public static void removeDuplicates(ArrayList<String> list){
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i).equals(list.get(i+1))){
                list.remove(i);
                i--;
            }
        }
    }
    public static void rmEvenStrProvided(Set<String> setOfString){
        Iterator<String> i = setOfString.iterator();
        while (i.hasNext()){
            String word = i.next();
            if (word.length() % 2 == 0){
                i.remove();
            }
        }
    }
}
