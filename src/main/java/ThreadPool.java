import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    static int i = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int j = 0; j < 10; j++) {
            executorService.execute(new Thread(() -> yazVeBeklet()));
        }
        executorService.shutdown();

    }
    public static void yazVeBeklet(){
        System.out.println("Islem " + i + " " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
