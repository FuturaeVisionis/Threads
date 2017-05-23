package Runnable;

/**
 * Created by ronald on 06/11/16.
 */
public class Catfish {

    public static void main(String[] args) {

        /*You are providing a runnable object.
        You can use one of the three ways beneath to execute.
         */

        (new Thread(new Tuna("one"))).start();

        Thread t1 = new Thread(new Tuna("two")); // passing a runnable object as a parameter
        t1.start();

        Tuna tuna = new Tuna("three");
        Thread t2 = new Thread(tuna);
        t2.start();


    }}
