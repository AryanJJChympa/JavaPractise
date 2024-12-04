import java.util.Scanner;
public class sumn {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number : ");
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);
    }
}