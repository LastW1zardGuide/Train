package com.company;

public class Wagon {
    private static int counter = 0;
    private int id;
    private int number;
    private int weight = 1500;
    Wagon(){
        id = counter++;
    }
    public int getId(){
        return id;
    }
    public int getNumber(){
        return number;
    }
    public int getWeight(){
        return weight;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}



