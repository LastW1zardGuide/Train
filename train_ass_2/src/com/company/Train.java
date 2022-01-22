package com.company;

public class Train {
    private String name;
    private int car;
    private int seat;


    public Train(String name, int car, int seat) {
        this.name = name;
        this.car = car;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


}
