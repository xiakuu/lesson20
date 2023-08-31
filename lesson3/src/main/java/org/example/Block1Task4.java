package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Block1Task4 {
    public static void main(String[] args) {
        int percent = 0;
        int sum;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество денег");
        int money = sc1.nextInt();
        System.out.println("Введите количество месяцев");
        int month = sc2.nextInt();

        for (int i = 1; i < month; i++){
            percent = percent + money*7/100;
            System.out.println("За " + i + " месяц накапало " + percent);
        }
        sum = money + percent;
        System.out.println(sum);
    }

}
