import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(
                "   \\/\n" +
                "  \\\\//\n" +
                " \\\\\\///\n" +
                " ///\\\\\\\n" +
                "  //\\\\\n" +
                "   /\\");
        System.out.println("\"Several slashes are sometimes seen,\"\n" +
                "said Sally. \"I've said so.\" See?\n" +
                "\\ / \\\\ // \\\\\\ ///");
        System.out.println(
                "*****\n" +
                "*****\n" +
                " * *\n" +
                "  *\n" +
                " * *\n" +
                "*****\n" +
                "*****\n" +
                " * *\n" +
                "  *\n" +
                " * *\n" +
                "*****\n" +
                "*****\n" +
                "  *\n" +
                "  *\n" +
                "  *\n" +
                "*****\n" +
                "*****\n" +
                " * *\n" +
                "  *\n" +
                " * *");*/
       /* System.out.println("A \"quoted\" String is\n" +
                "'much' better if you learn\n" +
                "the rules of \"escape sequences.\"\n" +
                "Also, \"\" represents an empty String.\n" +
                "Don't forget: use \\\" instead of \" !\n" +
                "'' is not the same as \"");*/
        //BIEN_BAO();
        /*Tinh_Toan();*/
        /*Nhap_Thang_Phan_Hoi_English();*/
        In_Quy_Trong_Thang();
        /*Kiem_Tra_Tam_Giac();*/
        /*Nhap_Thang_Nam_KiemTra_NamNhuan();*/
        /*Input_DAY_MONTH_YEAR();*/
        /*Rank_Student();*/
        /*Mo_Ta_Mau_Bang_Ki_Tu();*/


    }
    /*public static void BIEN_BAO(){
        System.out.println(
                "  ______\n" +
                " /      \\\n" +
                "/        \\\n" +
                "\\        /\n" +
                " \\______/\n" +
                "  ______\n" +
                " /      \\\n" +
                "/        \\\n" +
                "\\        /\n" +
                " \\______/\n" +
                "+--------+\n" +
                "  ______\n" +
                " /      \\\n" +
                "/        \\\n" +
                "| STOP   |\n" +
                "\\        /\n" +
                " \\______/\n" +
                "+--------+");
    }*/
  /*public static void Tinh_Toan() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a");
       int a = Integer.parseInt(sc.nextLine());
       System.out.println("Enter b");
       int b = Integer.parseInt(sc.nextLine());
       System.out.println("Sum " + a + " va " + b + " = " + (a + b));
       System.out.println("Subtraction " + a + " va " + b + " = " + (a - b));
       System.out.println("Product " + a + " va " + b + " = " + (a * b));
       System.out.println("Remainder of division " + a + " va " + b + " = " + (a % b));
       System.out.println("Division " + a + " va " + b + " = " + (a / b));
   }*/
    /*public static void Nhap_Thang_Phan_Hoi_English() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1 to 12 to get the month name: ");
        int month =Integer.parseInt(sc.nextLine());
        switch(month) {
            case 1 : System.out.println("January"); break;
            case 2 : System.out.println("February"); break;
            case 3 : System.out.println("March"); break;
            case 4 : System.out.println("April"); break;
            case 5 : System.out.println("May"); break;
            case 6 : System.out.println("June"); break;
            case 7 : System.out.println("July"); break;
            case 8 : System.out.println("August"); break;
            case 9 : System.out.println("September"); break;
            case 10 :System.out.println("October"); break;
            case 11 :System.out.println("November"); break;
            case 12 :System.out.println("December"); break;
            default :
                System.out.println("Input a number between 1 to 12.");
        }
    }*/
   public static void In_Quy_Trong_Thang() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number between 1 to 12 to get the month name: ");
            int month =Integer.parseInt(sc.nextLine());
            switch(month) {
                case 1, 2, 3 -> System.out.println("Quater 1");
                case 4, 5, 6 -> System.out.println("Quater 2");
                case 7, 8, 9 -> System.out.println("Quater 3");
                case 10, 11, 12 -> System.out.println("Quater 4");
                default -> System.out.println("Please enter 1 to 12 ");
            }
        }
   /* public static void Kiem_Tra_Tam_Giac(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a =Integer.parseInt(sc.nextLine());
        System.out.println("Enter b: ");
        int b =Integer.parseInt(sc.nextLine());
        System.out.println("Enter c: ");
        int c =Integer.parseInt(sc.nextLine());
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("Ba canh tao thanh mot tam giac");
            }
            else {
                System.out.println("Ba canh nay khong the tao thanh tam giac");
            }

    }
    */

    /*public static void Nhap_Thang_Nam_KiemTra_NamNhuan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month =Integer.parseInt(sc.nextLine());
        System.out.println("Enter year");
        int year =Integer.parseInt(sc.nextLine());
        if ((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0) {
            System.out.println( year + " la nam nhuan.");
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Month have 31 days");
                case 4, 6, 9, 11 -> System.out.println("Month have 30 day");
                case 2 -> System.out.println("Month have 29 day");
            }
        }
        else {
            System.out.println( year + " khong phai la nam nhuan");

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Month have 31 days");
                case 4, 6, 9, 11 -> System.out.println("Month have 30 day");
                case 2 -> System.out.println("Month have 28 day");
            }
        }
    }*/
   /* public static void Input_DAY_MONTH_YEAR()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        Integer day = Integer.parseInt(sc.nextLine());
        System.out.println("Enter month: ");
        Integer month = Integer.parseInt(sc.nextLine());
        System.out.println("Enter year: ");
        Integer year = Integer.parseInt(sc.nextLine());
        //check year
        if(year>=1 && year<=9999)
        {
            //check month
            if(month>=1 && month<=12)
            {
                //check days
                if((day>=1 && day<=31) && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))
                    System.out.println("Date is valid.");
                else if((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11))
                    System.out.println("Date is valid.");
                else if((day>=1 && day<=28) && (month==2))
                    System.out.println("Date is valid.");
                else if(day==29 && month==2 && (year%400==0 ||(year%4==0 && year%100!=0)))
                    System.out.println("Date is valid.");
                else
                    System.out.println("Day is not invalid.");
            }
            else
            {
                System.out.println("Month is not valid.");
            }
        }
        else
        {
            System.out.println("Year is not valid.");
        }

    }*/
    /*public static void Rank_Student()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your average score Ranking: ");
        Float scoreStudent = Float.parseFloat(sc.nextLine());
        if(scoreStudent < 5){
            System.out.println("bad");
        }
        else if(scoreStudent >=5 && scoreStudent<7){
            System.out.println("average");
        }
        else if(scoreStudent >=7 && scoreStudent <8){
            System.out.println("good");
        }
        else if(scoreStudent >=8 && scoreStudent <9){
            System.out.println("very good");
        }
        else{
            System.out.println("excellent");
        }
    }*/
    /*public static void Mo_Ta_Mau_Bang_Ki_Tu(){
        Scanner sc =new Scanner(System.in);
        System.out.print("What color do you want?");
        String color = sc.next();
        if(color.equalsIgnoreCase("R")){
            System.out.println("You have chosen Red");
        }
        else if(color.equalsIgnoreCase("G")){
            System.out.println("You have chosen Green");
        }
        else if(color.equalsIgnoreCase("B")){
            System.out.println("You have chosen Blue");
        }
        else {
            System.out.println("Unknown color: " + color);
        }

    }*/
}