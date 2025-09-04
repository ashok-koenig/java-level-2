public class ThreadLifeCycleDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycleDemo thread = new ThreadLifeCycleDemo(); // New
        System.out.println("Thread state after creation: "+ thread.getState());

        thread.start(); // Runnable

        thread.join();

        System.out.println("Thread state after completion: "+ thread.getState());
    }
}
