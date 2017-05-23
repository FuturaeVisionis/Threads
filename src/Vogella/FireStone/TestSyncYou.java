package Vogella.FireStone;

/**
 * Created by ronald on 11/11/16.
 */
public class TestSyncYou {

    public static void main(String[] args) {

        Table obj = new Table();

        Table.MyThread1 t1 = new Table.MyThread1(obj);
        Table.MyThread2 t2 = new Table.MyThread2(obj);

        t1.start();
        t2.start();
    }
}

