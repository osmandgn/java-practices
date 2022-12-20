import java.util.List;

public class MailChecker {
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message();
        new Thread(() -> {
            try {
                message.getMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> message.sendMessage("Selam")).start();


    }
}

class Message {
    List<String> mailBox;

    public void getMessage() throws InterruptedException {
        if (this.mailBox != null) {
            for (String mail : this.mailBox) {
                System.out.println(mail);
            }
        } else {
            System.out.println("Mail Bekleniyor");
            wait();
            System.out.println("Mailler Aliniyor");
            Thread.sleep(5000);
            getMessage();
        }

    }

    public void sendMessage(String message) {
        System.out.println("Mail Gonderiliyor");
        mailBox.add(message);
        notify();
    }


}

