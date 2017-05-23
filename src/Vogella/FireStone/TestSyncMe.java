package Vogella.FireStone;

/**
 * Created by ronald on 11/11/16.
 */
public class TestSyncMe {
    public static void main(String[] args) {

        Table obj = new Table();

        Thread t3 = new Thread() {
            @Override
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                obj.printTable(100);
            }
        };

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(50);
            }
        });

        Table.MyThread1 myThread1 = new Table.MyThread1(obj);
        myThread1.start();

        (new Table.MyThread2(obj)).start();

        t3.start();
        t4.start();
        t5.start();

    }
}

