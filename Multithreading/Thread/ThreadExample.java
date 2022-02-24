package Multithreading.Thread;

public class ThreadExample extends Thread {
    @Override
    public void run(){
        int i = 1;
        while(1 <= 100){
            System.out.println(i+" "+this.getName());
            i++;
        }
    }
}
