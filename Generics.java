package AdvanceJava;


import java.util.ArrayList;
import java.util.List;

public class Generics{

    static Character[] charArr = {'v','i','l','o'};
    static Integer[] intArr = {2,3};
    static Boolean[] boolArr = {true,false,false};

    public static <T> List<T> arraytoList(T[] array, List<T> list) {
        for(T object: array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {

        //Without Generics 
        List names = new ArrayList();
        names.add("Viraj");
        String name = (String) names.get(0);
        System.out.println("First name : " + name);

        //With Generics
        List<String> names2 = new ArrayList();
        names2.add("Sabhaya");
        String name2 = names2.get(0);
        System.out.println("Last name : " + name2);

        List<Character> charList = arraytoList(charArr, new ArrayList<>());
        List <Integer> intList = arraytoList(intArr, new ArrayList<>());
        List <Boolean> boolList = arraytoList(boolArr, new ArrayList<>());
    }
}