package priority_queue_demo;

import java.util.PriorityQueue;

class Task implements Comparable<Task>{
    private String title;
    private int priority; // Higher number = higher priority

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return o.priority - this.priority;
    }
}

public class TaskScheduler {

    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Write Project report", 2));
        tasks.add(new Task("Complete the project", 3));
        tasks.add(new Task("Clean workspace", 1));

        System.out.println("Tasks executed in priority order:");
        while (!tasks.isEmpty()){
            System.out.println(tasks.poll());
        }
    }
}
