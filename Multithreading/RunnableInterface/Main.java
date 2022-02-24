package Multithreading.RunnableInterface;

public class Main {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        // Thread thread2 = new Thread(new Runnable(){
        //     @Override
        //     public void run() {
        //         int i=0;
        //         while(i<=100){
        //             System.out.println(i+" "+Thread.currentThread().getName());
        //             i++;
        //         }
        //     }
        // });
        //OR THE ABOVE COMMENTED CAN BE WRITTEN USING LAMBDA AS WELL
        Thread thread2 = new Thread(() -> {
                int i=0;
                while(i<=100){
                    System.out.println(i+" "+Thread.currentThread().getName());
                    i++;
                }
        });
        thread2.start();

    }
}
