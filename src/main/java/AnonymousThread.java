public class AnonymousThread {
    public static void main(String[] args) {

        for (int i=1; i <= 5; i++) {
            System.out.println("run() method: " + i + " " + Thread.currentThread().getName());
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i <= 5; i++) {
                    System.out.println("run() method: " + i + " " + Thread.currentThread().getName());
                }
            }
        });
        thread.start();




        new Thread(() -> {
            Thread.currentThread().setName("Isim");
            for (int i=1; i <= 5; i++) {
                System.out.println("Lambda : " + i + " " + Thread.currentThread().getName());
            }
        }).start();




    }
}
