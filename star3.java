import java.util.Scanner;

class star3
{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number of line: ");

    int line= sc.nextInt();

    for(int i=1; i<=line; i++){
        for(int j=1; j<=line; j++){
            System.out.print(" *");
        }
        System.out.println();
    }

    }
};
