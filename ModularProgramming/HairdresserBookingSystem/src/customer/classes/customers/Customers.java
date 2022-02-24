/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customers;
import scheduling.Scheduler;
/**
 *
 * @author virajsabhaya
 */
public class Customers {
    public static void main(String[] args){
        Scheduler scheduler = new Scheduler();
        scheduler.bookHaircut("Harry", "Monday");
        scheduler.bookHaircut("Jill", "Friday");
    }
}
