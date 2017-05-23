package MultiThread;

/**
 * Created by ronald on 09/11/16.
 */
public class CaveMan implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted! " + e);
            }
        }
        System.out.println("Child thread finished.");
    }


    public static void main(String[] args) {

        Thread t = new Thread(new CaveMan(), "My Thread");

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted! " + e);
            }
        }
        System.out.println("Main thread finished.");

        t.start();
    }

}
