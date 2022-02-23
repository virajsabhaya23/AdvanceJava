package AdvancedDataStructures;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("V");
        myList.add("1");
        myList.add("S");
        myList.add(2,"V");

        System.out.println(myList);

        myList.remove("V");
        System.out.println(myList);

        
    }
}
