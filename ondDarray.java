import java.util.Scanner;

class ondDarray{
    public static void main(String[] args) {
        int arr[];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();

        arr = new int[50];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        System.out.print("Enter Position where you want to insert an element");
        int pos = sc.nextInt();
        System.out.print("Entere elment");
        int elem = sc.nextInt();
        System.out.print("before Array");
        for(int i=0;i<size;i++){
            System.out.print("|"+arr[i]+"|");
        }

        for(int i=size-1;i>=pos-1;i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=elem;
       size++;  
        System.out.print("After Array");
        for(int i=0;i<size;i++){
            System.out.print("|"+arr[i]+"|");
        }


    }
}

