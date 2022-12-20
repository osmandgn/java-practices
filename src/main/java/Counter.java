public class Counter {
    public static int counter = 0;
}

class RunnerClass {
    public static void main(String[] args) {
        new Thread(() -> counter()).start();
        new Thread(() -> counter()).start();
    }
    public synchronized static void counter() {
        for (int i = 0; i < 1000; i++) {
            Counter.counter++;
        }
        System.out.println("Son Deger : " + Counter.counter + " TH Name: " + Thread.currentThread().getName());
    }
}
