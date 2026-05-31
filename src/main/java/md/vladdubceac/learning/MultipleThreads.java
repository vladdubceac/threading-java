package md.vladdubceac.learning;

public class MultipleThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread 1");
        Thread thread2 = new Thread("Thread 2");

        thread1.start();
        thread2.start();

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
}
