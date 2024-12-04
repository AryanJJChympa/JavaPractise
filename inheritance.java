public class Inheritance {
    public void display(){
        System.out.println("Aryan");
    }
}

public class child extends Inheritance{
    public void display(){
        System.out.println("AChaaaaaa");
    }
}

public class inheritance{
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        child c=new child();
        i.display();
        c.display();  
    }
}