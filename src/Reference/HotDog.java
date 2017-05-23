package Reference;

/**
 * Created by ronald on 12/11/16.
 */
public class HotDog {

    public static void main(String[] args) {

        HotDog hot = new HotDog();

        hot.footlong("chilly dogs.");
        hot.doubleDog(2);

        new HotDog.PepperDog(hot); // you use this guy to enter static class
        hot.new Tabasco(hot); // you use this guy to enter teh Non-Static nested class.
        hot.new Tabasco(hot).new Eat(hot); // same here (non static nested class)


    }

    public void footlong(String a) {
        System.out.println("I like all " + a);
    }

    public void doubleDog(int b) {
        System.out.println("I like " + b + " double hot dogs, please.");
    }

    static class PepperDog { // is a nested class
        /* Now, let's look at it like this. The nested class PepperDog is constructed in such a way that it holds
        a special "key" so that it can enter the footlong and doubleDog methods. But first we need to build this
        key. And we do that by creating an object of the class HotDog. The instance variable "barking" is then used
        to enter the methods. But we are not there yet! In main you need to create a PepperDog object and pass the
        instance variable "hot" into it.
         */

        HotDog barking = new HotDog();

        public PepperDog(HotDog barking) {
            this.barking = barking;

            barking.footlong("mustard dogs.");
            barking.doubleDog(4);


        }

    }

    class Tabasco {

        HotDog tomato;

        public Tabasco(HotDog tomato) {
            this.tomato = tomato;
            tomato.footlong("spicy dogs.");
            tomato.doubleDog(9);
        }

        class Eat {
            HotDog fork;

            public Eat(HotDog fork) {
                this.fork = fork;
                fork.footlong("junk food that doesn't need a fork to eat.");
            }
        }
    }
}



