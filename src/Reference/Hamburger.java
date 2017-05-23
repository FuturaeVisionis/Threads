package Reference;

/**
 * Created by ronald on 12/11/16.
 */
public class Hamburger {

    public static void main(String[] args) {

        Hamburger ham = new Hamburger();
        ham.cheese("cheddar cheese Burgers.");

        new Hamburger.BigMac(ham);


    }

    public void cheese(String a) {
        System.out.println("I like all " + a);
    }

    static class BigMac {

        Hamburger hammy = new Hamburger();

        public BigMac(Hamburger hammy) {
            this.hammy = hammy;

            hammy.cheese("plain Burgers.");
        }

    }
}

