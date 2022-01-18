package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n;
            System.out.println("Выберите действие: ");
            System.out.println("1.Добавить вагон ");
            System.out.println("2.Удалить вагон(id) ");
            System.out.println("3.Просмотр вагонов ");
            System.out.println("4.Завершить программу ");
            n = sc.nextInt();
            if (n == 4) {
                System.out.println("Программа завершена! ");
                break;
            } else {
                switch (n) {
                    case 1:
                            Train.addTrain();
                            break;
                    case 2:
                            Train.wagons.remove(sc.nextInt());
                            break;
                    case 3:
                            Train.allInformation();
                            break;
                    default:
                        System.out.println("Ошибка!Попробуйте снова! ");
                }
            }
        }
    }
}
