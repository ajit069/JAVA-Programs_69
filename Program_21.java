class Thread1Task implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Thread1");
            try {
                Thread.sleep(2000); // 2000 ms = 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2Task implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Thread2");
            try {
                Thread.sleep(4000); // 4000 ms = 4 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Program_21 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1Task());
        Thread t2 = new Thread(new Thread2Task());

        t1.start();
        t2.start();
    }
}