package pl.edu.agh.kis.pz1;

public class Main {
    public static void main( String[] args ) {
        Reader read = new Reader();
        Writer write = new Writer();
        Thread t1 = new Thread(read);
        t1.setName("R1");
        Thread t2 = new Thread(read);
        t2.setName("R2");
        Thread t3 = new Thread(read);
        t3.setName("R3");
        Thread t4 = new Thread(read);
        t4.setName("R4");
        Thread t5 = new Thread(read);
        t5.setName("R5");
        Thread t6 = new Thread(read);
        t6.setName("R6");
        Thread t7 = new Thread(read);
        t7.setName("R7");
        Thread t8 = new Thread(read);
        t8.setName("R8");
        Thread t9 = new Thread(read);
        t9.setName("R9");
        Thread t10 = new Thread(read);
        t10.setName("R0");
        Thread t11 = new Thread(write);
        t11.setName("W1");
        Thread t12 = new Thread(write);
        t12.setName("W2");
        Thread t13 = new Thread(write);
        t13.setName("W3");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();

//        System.out.println( "Szablon projektu z metodą main i zależnościami wbudowanymi w wykonywalny jar" );
//        //wywołanie metody generującej hash SHA-512
//        System.out.println("HASH 512 dla słowa test: " + TextUtils.sha512Hash("test"));
    }
}
