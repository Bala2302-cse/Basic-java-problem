import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Ly = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int m = Ly.nextInt();
        if( (m%4==0 && m%100!=0) || m%400==0) {
            System.out.println(m + " is Leap Year");
        }
        else{
            System.out.println(m+ " is not Leap Year");
        }
    }
}