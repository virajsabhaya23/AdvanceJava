package AdvancedDataStructures;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("V", 682704);
        phonebook.put("A", 469);
        System.out.println(phonebook);
        phonebook.put("A",938);
        System.out.println(phonebook);

        if(phonebook.containsKey("A"))
            phonebook.remove("A");
        
        System.out.println(phonebook);
        phonebook.clear();
        System.out.println(phonebook);

    }
}
