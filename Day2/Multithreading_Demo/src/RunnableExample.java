class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable running: "+ Thread.currentThread().getName());
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}
