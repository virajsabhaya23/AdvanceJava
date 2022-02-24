/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduling;

import java.util.ArrayList;
import java.util.HashMap;
import employees.Hairdresser;

/**
 *
 * @author virajsabhaya
 */
public class Scheduler {
    
    private static HashMap<String, Hairdresser> hairdressers = new HashMap<>();
    
    public Scheduler(){
        Hairdresser harry = new Hairdresser("Harry");
        Hairdresser jill = new Hairdresser("Jill");
        harry.setDaysAvailable("Monday","Tuesday");
        jill.setDaysAvailable("Wednesday");
        
        hairdressers.put("Harry",harry);
        hairdressers.put("Jill",jill);
    }
    
    public void bookHaircut (String hairdresserName, String day){
        
        Hairdresser hairdresser = hairdressers.get (hairdresserName);
        ArrayList<String> days = hairdresser.getDaysAvailable();
        if (days. contains (day)){
            System.out.println("You have booked " + hairdresserName + " on " + day + ".");
            hairdresser.removeDay (day) ;
        }else
            System.out.println (hairdresserName + " is not available on " + day );
    }

}
