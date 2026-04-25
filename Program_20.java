class MyTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Program_20 {
    public static void main(String[] args) {

        MyTask task = new MyTask();      // create object of Runnable
        Thread t1 = new Thread(task);   // pass it to Thread

        t1.start(); 
    }
}