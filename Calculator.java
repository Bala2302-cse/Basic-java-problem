package BasicPrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=20;
        int b=10;
        System.out.println("t: add(+)\ns: sub(-)\nm: mul(*)\nd: div(/)\nu: mod(%)" );
        System.out.println("Enter your choice: ");
        String c=sc.nextLine();
        char f=c.charAt(0);
        switch (f){
            case 't':
                System.out.println("Addition: "+(a+b));
                break;
            case 's':
                System.out.println("Subtraction: "+(a-b));
                break;
            case 'm':
                System.out.println("Multiplication: "+(a*b));
                break;
            case 'd':
                System.out.println("Division: "+(a/b));
                break;
            case 'u':
                System.out.println("Modulus: "+(a%b));
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
