abstract class shape{
    abstract void draw();
}

class circle extends shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

public class Main2{
    public static void main(String[] args) {
        shape s=new circle();
        s.draw();   
    }
}
