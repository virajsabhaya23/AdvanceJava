package Multithreading.Thread;

public class Main {
    public static void main(String[] args) {
        
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My frist thread!");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My 2nd thread!");
        thread2.start();
    }
}
