package HeadFirst;

/**
 * Created by ronald on 09/11/16.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top of the stack");
    }

    public static void main(String[] args) {

        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("back in main.");
    }
}
