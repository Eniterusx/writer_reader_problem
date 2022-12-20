package pl.edu.agh.kis.pz1;

public class Library {
    static int readCount = 0;

    public static void requestRead(){
        try {
            Threads.writerWaitingLock.acquire();
            Threads.writerWaitingLock.release();
            Threads.fullLock.acquire();
            Threads.readLock.acquire();
            readCount++;
            if(readCount==1){
                Threads.writeLock.acquire();
            }
            Threads.readLock.release();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void finishRead() {
        try {
            Threads.readLock.acquire();
            readCount--;
            if (readCount == 0) {
                Threads.writeLock.release();
            }
            Threads.fullLock.release();
            Threads.readLock.release();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void requestWrite(){
        try {
            Threads.writerWaitingLock.acquire();
            Threads.writeLock.acquire();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void finishWrite(){
        Threads.writeLock.release();
        Threads.writerWaitingLock.release();
    }
}
