package AdvancedDataStructures;

public class Customer {
    
    private String name;
    private boolean hasBeenServed;
    
    public Customer(String name){
        this.name = name;
    }

    public void serve(){
        System.out.println(name + " hasBeenServed");
    }

    @Override
    public String toString(){
        return name ;
    }
}
