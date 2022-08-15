package Manage_Bill;

import java.util.Scanner;

public class BillList extends Bill {

   public static Bill[] myBillList = new Bill[11];
   protected int numberOfCus;
   public BillList(){
      numberOfCus = 0;
   }
   public void add(Bill customer){
      if(numberOfCus == 11) System.out.println("List is full! Can not add");
      else {
         myBillList[numberOfCus] = customer;
         numberOfCus++;
      }
   }
   public void displayAll(){
      for (int i=0; i < numberOfCus; i++){
         myBillList[i].display();
      }
   }
   public void remove(int customer_code){
      int index = -1;
      for (int i =0; i< numberOfCus; i++){
         if (myBillList[i].getCustomer_code()== customer_code){
            index=i;
         }
      }
      if(index==-1){
         System.out.println("There is no customer in the list with the code " +customer_code);
      }
      else {
         for (int i=0; i < numberOfCus-1; i++){
            myBillList[i] =myBillList[i+1];
         }
         System.out.println("remove success");
         numberOfCus--;
      }
   }
   public void totalBillSameType(String customer_type){
      int total =0;
      for (int i=0; i<numberOfCus; i++){
         if(myBillList[i].getCustomer_type().equals(customer_type)){
            total=total+myBillList[i].payment();
         }
      }
      System.out.println("Total: " +total);
   }
   public void maxPayment(){
      int maxPay =0;
      for (int i =0; i< numberOfCus; i++){
         if(myBillList[i].payment()>=maxPay){
            maxPay=myBillList[i].payment();
         }
      }
      System.out.println("Max payment: " + maxPay);
   }
   public static void main(String[] args){
      BillList customerList = new BillList();
      Bill bill1 = new Bill(1,"sdf",10,20,400);
      Bill bill2 = new Bill(2,"sdf",10,30,500);
      Bill bill3 = new Bill(3,"sdf1",10,40,300);
      Bill bill4 = new Bill(4,"sdf2",10,50,400);
      Bill bill5 = new Bill(5,"sdf1",10,60,500);
      Bill bill6 = new Bill(6,"sdf2",10,70,300);
      Bill bill7 = new Bill(7,"sdf",10,80,300);
      Bill bill8 = new Bill(8,"sdf3",10,90,400);
      Bill bill9 = new Bill(9,"sdf4",10,100,500);
      Bill bill10 = new Bill(10,"sdf",10,110,400);
      Bill bill11 = new Bill(11,"sdf",10,120,500);
      customerList.add(bill1);
      customerList.add(bill2);
      customerList.add(bill3);
      customerList.add(bill4);
      customerList.add(bill5);
      customerList.add(bill6);
      customerList.add(bill7);
      customerList.add(bill8);
      customerList.add(bill9);
      customerList.add(bill10);
      customerList.add(bill11);
      int choice;
      while (true){
         Scanner sc = new Scanner(System.in);

         System.out.println("1: Display all rank");
         System.out.println("2: Total bill with same customer type");
         System.out.println("3: Max payment");
         System.out.println("4: Remove bill with specified code");
         System.out.println("Enter your choice: ");
         choice = Integer.parseInt(sc.nextLine());
         switch (choice) {
            case 1:
               customerList.displayAll();
               break;
            case 2:
               System.out.print("Input type: ");
               String customer_type = sc.next();
               customerList.totalBillSameType(customer_type);
               break;
            case 3:
               customerList.maxPayment();
               break;
            case 4:
               System.out.print("Input Customer_code");
               int customer_code = Integer.parseInt(sc.nextLine());
               customerList.remove(customer_code);
               break;
            case 5: System.out.println("The program is the end!");
            return;
            default:
               System.out.println("Invalid option");

         }
      }



   }
}
