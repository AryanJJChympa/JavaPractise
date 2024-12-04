interface Interface {
    public void show();
}

class Student implements Interface{
    @Override
    public void show(){
        System.out.println("HELOOOOOOOOOOOOOO");
    }
};

class Teacher implements Interface{
    @Override
    
    public void show(){
        System.out.println("BYEEEEEEEEEEEEEE");
    }
};

public class interface {
    public static void main(String args[]){
        Interface i=new Interface() ;
        i.show();
    }
    
}
