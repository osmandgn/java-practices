import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Car car1 = new Car(latch);
        Car car2 = new Car(latch);
        Car car3 = new Car(latch);
        car1.start();
        car2.start();
        car3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } // Yukaridaki üç thread sonlanmadan, diğer thread'ler çalışamaz.
        // Bu sebeple aşağıdaki main thread'in yazdıracağı yazı en son çalışacak.
        // Main thread 3 thread'in tamamlanmasini bekleyecek.

        System.out.println("Sayac sifirlandi Main thread calisti");


    }
}

class Car extends Thread{
    CountDownLatch latch;

    public Car(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " numarali thread calisti");
        try {
            Thread.sleep(3000);
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
