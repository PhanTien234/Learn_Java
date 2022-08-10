import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*for (int i = 0; i < 5; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k < 5; k++)
                    System.out.print(j);
            }
            System.out.println();
        }*/

        /*System.out.println("Enter min: ");
        int min =Integer.parseInt(sc.nextLine());
        System.out.println("Enter max: ");
        int max =Integer.parseInt(sc.nextLine());
        printSquare(min, max);*/

        /*int n = Integer.parseInt(sc.nextLine()) ;
        //check for every number from 1 to N
        for(int i=1; i<=n; i++){
            //check if current number is prime
            if(isPrime(i)) {

                System.out.print(i + " ");
            }
        }
        System.out.println();
        primeMultiples(n);*/
       /* System.out.println("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Sum of numeric in numbers "
                + n + " is "
                + sumOfDigits(n));*/
       /* System.out.println("Enter number");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Reverse of num is "
                + reverseDigits(num));

    }*/
        /*System.out.println("Enter a number to compare: ");
        Scanner object=new Scanner(System.in);
        int lid=object.nextInt();
        int result=0;
        System.out.println("Enter a number of array elements:");
        int num=object.nextInt();
        int arr[]=new int[num];
        int last[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Number"+(i+1)+":");
            arr[i]=object.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            last[i]=arr[1]%10;
        }
        for(int i=0;i<last.length;i++)
        {
            if(last[i]== lid)
            {
                result=last[i];
            }
            else{
                result=-1;
            }
        }

        System.out.print(result);*/
        /*smallestLargest();*/
        /*evenSum();*/
       /* int n;
        System.out.print("Enter the number of elements of the array: ");
        n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Enter the element %d : ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        median(arr);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num =Integer.parseInt(sc.nextLine());
        int arr[] = new int[num];
        int add[] = new int[num -1] ;
        int temp = 0;
        int min = 0;
        for (int i =0; i < num; i++)
        {
         System.out.printf("Number %d : ", i+1);
         arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i=0; i< arr.length - 1; i++)
        {
            for (int j = i+1; j <i+2; j++)
            {
                temp =arr[j] - arr[i];
                add[i] = temp;
            }
        }
        for (int i =0; i<add.length; i++)
        {
            min = add[0];
        }
        for ( int i=0; i < add.length; i++)
        {
            if(add[i] < min)
            {
                min = add[i];
            }
        }
            System.out.print(min);


    }
    /*public static int median(int[] arr) {
        Arrays.sort(arr);
        int median;
        if(arr.length%2==0){
            median=arr[arr.length/2];
        }else{
            median=arr[(arr.length-1)/2];
        }

        System.out.print(median);

        return median;
    }*/


    /*public static void smallestLargest() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int number = console.nextInt();
        System.out.print("Number 1: ");
        int firstNum = console.nextInt();
        int min = firstNum;
        int max = firstNum;

        for (int i = 2; i <= number; i++) {
            System.out.print("Number " + i + ": ");
            int num = console.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        System.out.printf("Smallest = %d\n", min);
        System.out.printf("Largest = %d\n", max);
    }*/

    /*public static void evenSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many integers? ");
        int number = sc.nextInt();
        int evenSum = 0;
        int evenMax = 0;
        for(int i = 1; i <= number; i++) {
            System.out.print("next integer? ");
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum += num;
            }
            if(num % 2 == 0) {
                if(num > evenMax) {
                    evenMax = num;
                }

            }
        }
        System.out.println("even sum = " + evenSum);
        System.out.println("even max = " + evenMax);
    }*/

   /* public static void printSquare(int min, int max) {
        for(int i = min; i <= max; i++) {
            for(int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for(int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }*/
        //function to check if a given number is prime
    /*static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0) return false;

        //Run a loop from 2 to n-1
        for(int i=2; i<=n/2; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }
    public static void primeMultiples(int n){
        int count =2;
        while (n>=count){
            if(n%count==0){
                if(n==count) System.out.println(count);
                else System.out.print(count+ "*");
                n=n/count;
            }
            else{
                count++;
            }
        }
        System.out.println();
    }*/


        // A utility function to compute sum
        // of digits in a given number x
   /* static int sumOfDigits(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum += n % 10;
            n   = n / 10;
        }
        return sum;
    }*/
 /* Iterative function to reverse
    digits of num*/
   /* static int reverseDigits(int num)
    {
        int rev_nu = 0;
        while (num > 0) {
            rev_nu = rev_nu * 10 + num % 10;
            num = num / 10;
        }
        return rev_nu;

    }*/





}


