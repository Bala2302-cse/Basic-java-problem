package BasicPrograms;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%100==0)
            System.out.println(a+" is divisible by 100");
        else
            System.out.println(a+" is not divisible by 100");
    }
}
