public class LambdaRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("Task 1 running"));
        Thread t2 = new Thread(()-> System.out.println("Task 2 running"));

        t1.start();
        t2.start();
    }
}
