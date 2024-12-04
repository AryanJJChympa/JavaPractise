
class Animal {
    public void sound(){
        System.out.println("Animal Sound");
    }
};

class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
};

class Cat extends Animal {
    public void sound(){
        System.out.println("Meow");
    }
};

public class Main1 {
    
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
        Dog d= new Dog();
        d.sound();
        Animal a=new Animal();
        a.sound();
    }
    
}


