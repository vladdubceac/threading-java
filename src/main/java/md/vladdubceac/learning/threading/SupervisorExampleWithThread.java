package md.vladdubceac.learning.threading;

public class SupervisorExampleWithThread {
    public static void main(String[] args) {
        ParallelWorker1 p1 = new ParallelWorker1();
        ParallelWorker2 p2 = new ParallelWorker2();
        p1.start();
        p2.start();
    }
}

class ParallelWorker1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println("Worker 1 is executing task " + (i + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ParallelWorker2 extends Thread {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(100);
                System.out.println("Worker 2 is executing task " + (i+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}