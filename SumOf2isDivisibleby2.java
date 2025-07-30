package BasicPrograms;

import java.util.Scanner;

public class SumOf2isDivisibleby2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        if(c%2==0)
            System.out.println(c+" is divisible by 2");
        else
            System.out.println(c+" is Not divisible by 2");
    }
}
