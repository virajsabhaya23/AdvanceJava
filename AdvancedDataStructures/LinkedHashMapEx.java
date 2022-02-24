package AdvancedDataStructures;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);
                            //size, incereases when it's 75% full, asserted sort if->TRUE
                                                    //, sorted the way entered if FALSE.
        phonebook.put("V", 682704);
        phonebook.put("A", 469);
        phonebook.put("N", 444);
        System.out.println(phonebook);
        phonebook.put("A",938);
        System.out.println("A's phonenumber : "+ phonebook.get("A"));

        System.out.println("\nList of contatcs :");
        for(Map.Entry<String, Integer> entry : phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
