class outer {
    private int a=10;
    
    class inner{
        public void display(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        outer i=new outer();
        outer.inner inner=i.new inner();
        inner.display(); 
    }

}
