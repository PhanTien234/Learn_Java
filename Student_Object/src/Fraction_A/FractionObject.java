package Fraction_A;

public class FractionObject {
    public static void main(String[] args){
        Fraction f1 =new Fraction();
        f1.input();
        Fraction f2 =new Fraction();
        f2.input();
        System.out.println(f1 + "+"+ f2 +"=" +(f1.add(f2)));
        System.out.println(f1 + "-"+ f2 +"=" +(f1.subtraction(f2)));
        System.out.println(f1 + "*"+ f2 +"=" +(f1.multiply(f2)));
        System.out.println(f1 + ":"+ f2 +"=" +(f1.divide(f2)));
        f1.displayFractionNumber();
        f1.displayDecimal();



    }




}
