package pl.edu.agh.kis.pz1;
import java.lang.Thread;
import java.util.Random;

public class Writer extends Threads implements Runnable{
    public void run() {
        while(true) {
            try {
                Random rand = new Random();
                int sleepyhead = rand.nextInt(5000) + 10000;
                Thread.sleep(sleepyhead);
                System.out.println("Writer " + Thread.currentThread().getName() + " is waiting");

                Library.requestWrite();
                System.out.println("Writer " + Thread.currentThread().getName() + " is WRITING");


                sleepyhead = rand.nextInt(3000) + 2000;
                Thread.sleep(sleepyhead);

                Library.finishWrite();
                System.out.println("Writer " + Thread.currentThread().getName() + " is leaving");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
