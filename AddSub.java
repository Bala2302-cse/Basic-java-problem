package BasicPrograms;

import java.util.Scanner;

public class AddSub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=Math.abs(a-b);
        System.out.println("Sum is: "+c);
        System.out.println("Sub is: "+d);
    }
}
