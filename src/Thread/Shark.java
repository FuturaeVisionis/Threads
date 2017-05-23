package Thread;

/**
 * Created by ronald on 06/11/16.
 */
public class Shark extends Thread {

    public int counter = 0;

    @Override
    public void run() {
        counter++;
        System.out.println("Shark spotted at beach: " + counter);

        }
    }
