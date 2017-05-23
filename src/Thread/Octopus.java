package Thread;

/**
 * Created by ronald on 06/11/16.
 */
public class Octopus {
    public static void main(String[] args) throws InterruptedException {

        //One object is shared by multiple threads.

        Thread.sleep(5000);
        Shark shark = new Shark();
        Thread one = new Thread(shark);
        one.start();

        Thread.sleep(3000);
        Thread two = new Thread(shark);
        two.start();

        //can also create a new instance for every thread (Each of the threads creates a
        // unique object and associated with it.

        Thread.sleep(2000);
        Shark shark1 = new Shark();
        shark1.start();

        (new Shark()).start();

        Shark shark2 = new Shark();
        shark2.start();

    }
}
