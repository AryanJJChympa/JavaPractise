// class SuperClass {
//     void display(){
//         System.out.println("Eii Jii Sun ye Gaaaaaa");
//     }
// }

// class ParentClass extends SuperClass {
//     void display(){
//         super.display();
//         System.out.println("Nhi Jii");
//     }

//     public static void main(String[] args) {
//         ParentClass p =new ParentClass();
//         p.display();
//     }
// }

class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        // Output: Parent method
        //         Child method
    }
}
