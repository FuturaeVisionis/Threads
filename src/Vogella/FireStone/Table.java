package Vogella.FireStone;

/**
 * Created by ronald on 11/11/16.
 */
public class Table {

    synchronized void printTable(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i); // the loop multiplies eg. 1 x n, 2 x n ect, ect)
            try {
                Thread.sleep(100); // sleeps for a hundred of a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            class PrintNext {
                public void Fanta(String n) {
                    System.out.println("Next " + n);
                }
            }
            PrintNext printme = new PrintNext();
            printme.Fanta("number please:");

        }

    }

    static class MyThread1 extends Thread {

        Table t = new Table(); // or just "Table t;"

        public MyThread1(Table t) { // creating a constructor with variable t.
            this.t = t;
        }

        @Override
        public void run() {
            t.printTable(5); // you can't reach this guy if you don't create an object or make printable static.

        }
    }

    static class MyThread2 extends Thread {
        Table t;

        public MyThread2(Table t) {
            this.t = t;
        }

        @Override
        public void run() {
            t.printTable(100);
        }
    }
}


