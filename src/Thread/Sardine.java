package Thread;

/**
 * Created by ronald on 06/11/16.
 */
public class Sardine extends Thread {

    static int number = 0;

    @Override
    public void run() {
        number ++;
        System.out.println("Fish is full of protein." + number);

    }

    public static void main(String[] args) throws InterruptedException {


        Thread fish1 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Shark spotted at beach: ");
            }});
        fish1.start();

        Sardine sardine = new Sardine();

        Thread fish2 = new Thread(sardine);
        fish2.start();

        Thread fish3 = new Thread(sardine);
        fish3.start();

    }}
