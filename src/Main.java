import DataModel.WatekRunnable;
import DataModel.WatekThread;
import Services.KrisLogger;
import Services.MainService;


public class Main {
    
    public static int zmienna = 0;
    
    public static void main(String[] args) {

        KrisLogger log = new KrisLogger(KrisLogger.EnumLogType.KNT);

        try {
            new MainService(log).startProcessing();
        }
        catch (Exception ex) {
            log.error(ex.toString());
        }
        finally {
            System.out.println("Finally...");
        }
    }

    private void test(){

        //
        // Tworzenie i ruchamianie w�tk�w
        //
        Thread thread1 = new WatekThread("TH Thread");
        thread1.start();

        Thread thread2 = new Thread(new WatekRunnable("TH Runnable", 4), "Watek2");
        thread2.start();

//	      Thread thread3 = new Thread(exampleWorker3, "Worker3");
//	      thread3.start();
    }
}