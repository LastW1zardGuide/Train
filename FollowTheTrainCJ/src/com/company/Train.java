package com.company;

import java.util.ArrayList;

public class Train {
    static ArrayList<Wagon> wagons = new ArrayList<Wagon>();

    public static void addTrain(){
        Wagon wagon = new Wagon();
        wagon.setNumber(Passager.random());
        wagon.setWeight(2000 - (wagon.getNumber()*80));
        wagons.add(wagon);
    }
    public static void allInformation(){
            for (int i = 0; i < wagons.size();i++){
            System.out.println("Id: " + wagons.get(i).getId() + " Passagers: " + wagons.get(i).getNumber() +" Грузоподьемность(осталось): " + wagons.get(i).getWeight());
        }
    }
}

