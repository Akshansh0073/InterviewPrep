package InterviewQuestions;


import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }
}

public class Atomicity {

    public static void main(String[] args) {
        
        SharedCounter counter = new SharedCounter();

        // Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 started");
            for (int i = 0; i < 500000; i++) {
                counter.increment();
            }
            System.out.println("Thread 1 completed");
        }).start();

        // Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            for (int i = 0; i < 500000; i++) {
                counter.increment();
            }
            System.out.println("Thread 2 completed");
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
