package BasicPrograms;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is Greater");
        else if(b>c && b>a)
            System.out.println(b+" is Greater");
        else
            System.out.println(c+" is Greater");
    }
}
