package pl.edu.agh.kis.pz1;

import java.util.concurrent.Semaphore;

public class Threads {
    static Semaphore readLock = new Semaphore(1);
    static Semaphore writeLock = new Semaphore(1);
    static Semaphore fullLock = new Semaphore(5);
    static Semaphore writerWaitingLock = new Semaphore(1);
}
