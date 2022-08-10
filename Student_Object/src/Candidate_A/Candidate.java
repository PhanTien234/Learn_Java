package Candidate_A;

import java.util.Scanner;

public class Candidate {
    public static Scanner sc = new Scanner(System.in);
    private Integer codeID;
    private String name;
    private String dOB;
    private double test_mark1;
    private double test_mark2;
    private double test_mark;


    public Candidate(Integer codeID, String name, String dOB, double test_mark1, double test_mark2, double test_mark)
    {
        this.codeID = codeID;
        this.name = name;
        this.dOB = dOB;
        this.test_mark1 =test_mark1;
        this.test_mark2 = test_mark2;
        this.test_mark = test_mark;

    }
    public Candidate(){

    }


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Integer getCodeID() {return codeID;}

    public void setCodeID(Integer codeID) {this.codeID = codeID;}

    public String getdOB() {return dOB;}

    public void setdOB(String dOB) {this.dOB = dOB;}

    public double getTest_mark1() {return test_mark1;}

    public void setTest_mark1(double test_mark1) {this.test_mark1 = test_mark1;}

    public double getTest_mark2() {return test_mark2;}

    public void setTest_mark2(double test_mark2) {this.test_mark2 = test_mark2;}

    public double getTest_mark3() {return test_mark;}

    public void setTest_mark3(double test_mark3) {this.test_mark = test_mark3;}

    public void input() {
        System.out.println("Enter codeID: ");
        this.codeID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name: ");
        this.name = sc.nextLine();
        System.out.println(("Day of Birthday: "));
        this.dOB = sc.nextLine();
        System.out.println("Enter mark 1: ");
        this.test_mark1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter mark 2: ");
        this.test_mark2 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter mark : ");
        this.test_mark = Double.parseDouble(sc.nextLine());

    }
    public double TinhDiemTrungBinh(){
        return (((test_mark1 + test_mark2)/2) + (test_mark*2))/3;
    }

    public void XepLoaiHocLuc(){
        String classification;
        double averageGrade = this.TinhDiemTrungBinh();
            if (averageGrade >= 8 && averageGrade <= 10) classification = "Good";
            else if (averageGrade >= 7 && averageGrade < 8) classification = "Fairy good";
            else if (averageGrade >= 5 && averageGrade < 7) classification = "Average";
            else classification = "Failed";
            System.out.printf("%-15s %-15.2f%-15s\n",name,averageGrade,classification);
    }

    public void DisplayInformation(){
        System.out.printf("CodeID: " + codeID);
        System.out.printf("\nName: " + name);
        System.out.printf("\nDay of Birth: " + dOB);
        System.out.printf("\nTest mark 1: " + test_mark1);
        System.out.printf("\nTest mark 2: " + test_mark2);
        System.out.printf("\nTest mark 3: " + test_mark);


    }

}
