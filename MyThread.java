class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);  // Thread sleeps for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();  // Output: 1 2 3 4 5 (with 1-second interval)
        t2.start();  // Output: 1 2 3 4 5 (with 1-second interval)
    }
}
   