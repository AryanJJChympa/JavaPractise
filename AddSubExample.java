class AddSub {
    int a,b;
    public AddSub(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int add(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }
};

class MulDiv extends AddSub{
    public MulDiv(int a, int b){
        super(a,b);
    }

    public int mul(){
        return a*b;
    }

    public int div(){
        if(b==0){
            System.out.println("Error: ");
            return 0;
        }
        return a/b;
    }
};

public class AddSubExample {
    public static void main(String[] args) {
        int num1=10, num2=5;
        AddSub addSub=new AddSub(num1, num2);
        MulDiv mulDiv=new MulDiv(num1, num2);

        int sum=addSub.add();
        int difference=addSub.sub();
        int multiply=mulDiv.mul();
        int divide=mulDiv.div();

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Multiply: "+multiply);
        System.out.println("Divide: "+divide);
    }
    
}
