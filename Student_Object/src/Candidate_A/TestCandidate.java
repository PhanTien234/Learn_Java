package Candidate_A;

import POINT_B.Point;

import javax.naming.Name;
import java.util.Scanner;

public class TestCandidate {
    public static Candidate[] myArray = new Candidate[10];
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            menu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    inputTenPoints();
                    break;
                case 2:
                    NumberOfStudentPass();
                    break;
                case 3:
                    DisplayStudentPass();
                    break;
                case 4:
                    System.out.println("Goodbye. See you again");
                    return;
                default: System.out.println("Invalid option");
            }
        }


    }
    private static void inputTenPoints() {
        for (int i=0;i<myArray.length;i++){
            System.out.println("Candidate number "+ (i+1));
            myArray[i] = new Candidate();
            myArray[i].input();
        }
    }
    private static void NumberOfStudentPass(){
        int count =0;
        for (int i=0; i< myArray.length; i++){
            if(myArray[i].TinhDiemTrungBinh()>=5){
                count++;
            }
        }
        System.out.println("The number student pass is: " + count);
    }
    private static void DisplayStudentPass(){
        System.out.printf("%-15s %-15s%-15s\n","Name","Average Score","Rank");
        for (int i=0; i< myArray.length; i++){
            if(myArray[i].TinhDiemTrungBinh()>=5){
                    myArray[i].XepLoaiHocLuc();

            }
        }
    }
    public static void menu(){
        System.out.println("Here is a program which provides the following functionality:");
        System.out.println("1. Input 10 Candidate");
        System.out.println("2. The number student pass");
        System.out.println("3. Display Student pass");
        System.out.println("4. Exit");
        System.out.println("Please tell us your choice");

    }
}
