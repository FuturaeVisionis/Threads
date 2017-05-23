package CaveMultiThread;

/**
 * Created by ronald on 09/11/16.
 */
public class Firefly {

    private int count = 0;

    public static void main(String[] args) {

        Firefly firefly = new Firefly();
        firefly.makeNoise();
    }

    public synchronized void increment() {
        count++;
    }

    private void makeNoise() {

        Thread fly = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        //The code below is exactly the same as the code above. We now only use the lambda expression.
        Thread bee = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        fly.start();
        bee.start();

        try {
            fly.join();
            bee.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total is: " + count);
    }
}
