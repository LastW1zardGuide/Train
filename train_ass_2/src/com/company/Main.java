package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int path =0;
        ArrayList<Train> Train=new ArrayList<>();
        Train.add(new Train("Ildar", 1, 7));
        Train.add(new Train("Almas", 2, 5));
        Train.add(new Train("Akzhol", 3, 13));
        System.out.println("1. To add");
        System.out.println("2. To delete");
        System.out.println("3. Show all");
        System.out.println("4. Exit");
        while (path!=4){
            path = sc.nextInt();
            switch (path){
                case (1):
                    boolean check=false;
                    System.out.println("Input name:");
                    String name=sc.next();
                    System.out.println("Input car:");
                    int car=sc.nextInt();
                    while(car>10){
                        System.out.println("This car does not exist");
                        car=sc.nextInt();
                    }
                    System.out.println("Input seat:");
                    int seat=sc.nextInt();
                    while(seat>20){
                        System.out.println("This seat does not exist");
                        seat=sc.nextInt();
                    }
                    for(int i=0;i<Train.size();++i){
                        if(car==Train.get(i).getCar()){
                            if (seat == Train.get(i).getSeat()){
                                System.out.println("This seat is engaged");
                                check=true;
                                break;
                            }
                        }
                    }
                    if(check==false) {
                        Train.add(new Train(name, car, seat));
                    }
                    break;
                case(2):
                    System.out.println("Input car:");
                    int delcar=sc.nextInt();
                    while(delcar>10){
                        System.out.println("This car does not exist");
                        delcar=sc.nextInt();
                    }
                    System.out.println("Input seat:");
                    int delseat=sc.nextInt();
                    while(delseat>20){
                        System.out.println("This seat does not exist");
                        delseat=sc.nextInt();
                    }
                    for(int i=0;i<Train.size();++i){
                        if(delcar==Train.get(i).getCar()){
                            if (delseat == Train.get(i).getSeat()){
                                Train.remove(i);
                                System.out.println("Removed");
                                break;
                            }
                            else{
                                System.out.println("Place is free\n");
                                break;
                            }
                        }
                        else{
                            System.out.println("Place is free\n");
                            break;
                        }
                    }
                    break;
                case (3):
                    for(Train el: Train){
                        System.out.print(el.getName()+" ");
                        System.out.print(el.getCar()+" ");
                        System.out.println(el.getSeat());
                    }
                    break;
                case(4):
                    System.exit(0);
                default:
                    System.out.println("Incorrect choice, try again");
                    System.out.println();
                    System.out.println("1. To add");
                    System.out.println("2. To delete");
                    System.out.println("3. Show all");
                    System.out.println("4. Exit");
            }
            System.out.println("1. To add");
            System.out.println("2. To delete");
            System.out.println("3. Show all");
            System.out.println("4. Exit");
        }
    }

}