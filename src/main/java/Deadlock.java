public class Deadlock {

    public static void main(String[] args) {
        String kasik = "Kasik";
        String bicak = "Bicak";

        new Thread(() -> {
            synchronized (kasik) {
                System.out.println(kasik + " Kullaniliyor");

                synchronized (bicak) {
                    System.out.println(bicak + " Kullaniliyor");
                }
            }
        }).start();


        new Thread(() -> {
            synchronized (bicak) {
                System.out.println(bicak + " Kullaniliyor");

                synchronized (kasik) {
                    System.out.println(kasik + " Kullaniliyor");
                }
            }
        }).start();


    }
}
