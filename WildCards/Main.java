package WildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuilding(buildings);
        
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuilding(offices);

        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuilding(houses);

        addHouseToList(houses);
        addHouseToList(buildings);
    }

    //allows to let me use Line 17&25
    public static void printBuilding(List<? extends Building> buildings) {
        for(int i = 0;i<buildings.size();i++){
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
    }

    public static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }
}
