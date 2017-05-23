package Vogella;

/**
 * Created by ronald on 11/11/16.
 */
public class MyRunnable {

    private long countUntil = 12;
    private long sum;
    private long i;


    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.RunUsAlong();
    }

    public synchronized void sum() {
        sum++;

    }

    public void RunUsAlong() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (i = 1; i < countUntil; i++) {
                    sum();
                }

                System.out.println(sum);
                System.out.println("Thread One finished");
            }

        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (i = 1; i < countUntil; i++) {
                    sum();
                }

                System.out.println(sum);

                System.out.println("Thread Two finished");

            }

        });
        t1.start();
        t2.start();

    }
}