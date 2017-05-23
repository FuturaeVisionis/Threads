package Runnable;

import java.util.Random;

/**
 * Created by ronald on 06/11/16.
 */
public class Tuna implements Runnable { // Runnable is an interface and has one method: run();

    String name;
    int time;
    Random random = new Random();


    public Tuna(String name) {
        this.name = name;
        time = random.nextInt();
    }

    @Override
    public void run() {  // Here you are implementing the run method.
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
        } catch (Exception e) {
        }

    }}

