package AdvanceJava;


public class Varargs {
    public static void main(String[] args) {
        
        String item1 = "Apple";
        String item2 = "Fruit";
        String item3 = "Punch";
        String[] shopping = {"break", "break", "break", "break", "break"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);
    }

    public static void printShoppingList(String... shopping) {
        System.out.println();
        for(int i = 0; i < shopping.length; i++) {
            System.out.println(1+i + ": " + shopping[i]);
        }
        System.out.println();
    }
}
