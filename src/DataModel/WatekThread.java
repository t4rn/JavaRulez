package DataModel;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kwitkowski on 2017-04-29.
 */
public class WatekThread extends Thread{

//	   private class Watek1 extends Thread{

    public WatekThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i <4; i++){
            System.out.println("Watek : " + this.getName());

            Lock l = new ReentrantLock();
            try {
                l.lock();
                Zmienna.zmienna++;
                int wartosc = Zmienna.zmienna;
                System.out.println("Zmienna wynosi "+ wartosc);
            }
            finally {
                l.unlock();
            }


            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
//	   }
}