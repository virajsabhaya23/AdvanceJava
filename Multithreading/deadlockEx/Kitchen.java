package Multithreading.deadlockEx;

public class Kitchen {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {

        Thread cook1 = new Thread(() ->{
           synchronized (spoon){
               System.out.println("Cook1: Hodling the spoon...");
               System.out.println("Cook1: waiting for the bowl...");

               synchronized (bowl){
                   System.out.println("Cook1: Holding the spoon and the bowl.");
               }
           }
        });
        Thread cook2 = new Thread(() -> {
            synchronized (bowl){    //This can be FIXED by replacing the bowl with spoon! i.e. let both pick one item first together.
                System.out.println("Cook2: Hodling the bowl...");
                System.out.println("Cook2: waiting for the spoon...");

                synchronized (spoon){
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
