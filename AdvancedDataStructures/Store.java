package AdvancedDataStructures;
import java.util.LinkedList;
public class Store {
    public static void main(String[] args) {
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Viraj"));
        queue.add(new Customer("Mr. Sabhaya"));
        queue.add(new Customer("Virji"));
        queue.add(new Customer("VooS"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
}
