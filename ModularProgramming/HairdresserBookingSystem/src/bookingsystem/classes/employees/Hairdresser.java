/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;
import java.util.ArrayList;
/**
 *
 * @author virajsabhaya
 */
public class Hairdresser {
    
    private String name;
    private ArrayList<String> daysAvailable = new ArrayList<>();
    
    public Hairdresser(String name){
        this.name=name;
    }
    
    public void setDaysAvailable(String...days){
        for(String day:days){
            daysAvailable.add(day);
        }
    }
    
    public void removeDay(String day){
        if(daysAvailable.contains(day)){
            daysAvailable.remove(day);
        }
    }
    
    public ArrayList<String> getDaysAvailable(){
        return daysAvailable;
    }
    
    public String getName(){
        return name;
    }
    
}
