package CaveMultiThread;


import java.util.Scanner;

/**
 * Created by ronald on 09/11/16.
 */
public class Processor extends Thread {

    public volatile boolean running = true;

    // the volatile keyword prevents threads to cache variables when they are not changed.
    // Volatile is used to indicate that variable's value will be modified by different threads.
    // Threads modify data and there is no guarantee that the thread will use the modified variable, but if u force it
    // with Volatile, it must!!

    @Override
    public
    void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        running = false;
    }

    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();
        System.out.println("Press return to stop...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc1.shutDown();
    }
}
