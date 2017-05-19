package DataModel;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kwitkowski on 2017-04-29.
 */
public class WatekRunnable implements Runnable {

    private int numer;
    private String name;
    private int counter = 0;

    public WatekRunnable(String name, int numer){
        this.name = name;
        this.numer = numer;
    }

    @Override
    public void run() {
        for (int i = 1; i < numer; i++) {
            System.out.println(name + " " + i);

            Lock l  = new ReentrantLock();

            try {
                l.lock();
                Zmienna.zmienna++;
                int wartosc = Zmienna.zmienna;
                System.out.println("Zmienna wynosi "+ wartosc);


                Thread.yield();
            }
            finally {
                l.unlock();
            }
        }
    }
}
