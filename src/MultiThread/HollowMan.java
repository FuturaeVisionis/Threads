package MultiThread;

/**
 * Created by ronald on 09/11/16.
 */
public class HollowMan extends Thread {

    public HollowMan(String name) {
        super(name);
    }

    public static void main(String[] args) {

        new HollowMan("Thread-One").start();

        new HollowMan("Thread-Two").start();

        new HollowMan("Thread-Three").start();


    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Choose " + i + " for " + getName());
            try {
                sleep(50);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Test finished for " + getName());


    }
}
