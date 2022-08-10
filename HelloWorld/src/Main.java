import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age: ");
        //int age = sc.nextInt();
        int age = Integer.parseInt(sc.nextLine());
        /* doc het dong*/
        System.out.println("Enter your Grade: ");
        double grade = sc.nextDouble();
        sc.nextLine();
        // /*them dong de tranh loi xuong dong*/
        System.out.println("Enter your address: ");
        String address =sc.nextLine();
        System.out.println(name + "is"+ age +"years old and get" + grade + "grades"+ address+ "address");
        int x;
        x= 5/3;
        System.out.println(x);
    }
}

