package org.example;

import java.util.Scanner;

public class Block1Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int i = 1;

        do{
            System.out.println("Введите первое значение");
            int i1 = sc1.nextInt();
            System.out.println("Введите второе значение");
            int i2 = sc2.nextInt();

            System.out.println(i1 * i2);
            System.out.println("Продолжить? 1 - да, 2 - нет");
            int i3 = sc3.nextInt();
            switch (i3){
                case 1:
                    break;

                case 2:
                    i = 2;
                    break;

                default:
                    System.out.println("Введено неверное значение");
                    break;
                }
            }

        while(i <= 1);
        }

    }
