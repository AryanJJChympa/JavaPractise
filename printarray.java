import java.util.Scanner;
class printarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter "+size+" elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int elements : arr){
            System.out.print(elements+" ");
        }
    }    
}
