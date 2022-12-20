package pl.edu.agh.kis.pz1;
import java.lang.Thread;
import java.util.Random;

public class Reader  extends Threads implements Runnable{
    public void run() {
        while(true) {
            try {
                Random rand = new Random();
                int sleepyhead = rand.nextInt(5000) + 10000;
                Thread.sleep(sleepyhead);
                System.out.println("Reader " + Thread.currentThread().getName() + " is waiting");

                Library.requestRead();
                System.out.println("Reader " + Thread.currentThread().getName() + " is READING");

                sleepyhead = rand.nextInt(3000) + 2000;
                Thread.sleep(sleepyhead);

                Library.finishRead();
                System.out.println("Reader " + Thread.currentThread().getName() + " is leaving");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}