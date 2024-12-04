import java.util.Scanner;  

class Prime {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter num: "); 
    int num=Sc.nextInt();
    int count=0;
    int rem;
    for(int i=1;i<=num;i++){
      rem=num%i;
      if (rem==0){
        count++;
      }
    }
    if(count==2){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not Prime");
    }

   }
}