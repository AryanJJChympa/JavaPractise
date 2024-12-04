public class factorial{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        int result=fact(num);
        System.out.println(
        "Factorial of "+num+" is: "+result
        );
    }
};


