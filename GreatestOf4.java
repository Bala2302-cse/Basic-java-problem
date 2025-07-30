package BasicPrograms;

import java.util.Scanner;

public class GreatestOf4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int g=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        int[] arr={a,b,c,d};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>g)
                g=arr[i];
            if(arr[i]<s)
                s=arr[i];
        }
        System.out.println("The greater is: "+g);
        System.out.println("The Smaller is: "+s);

    }
}
