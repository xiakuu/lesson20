package homework;

//Задача 2:
//        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//       Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число");
        int t = sc1.nextInt();

        if(t > -5){
            System.out.println("Warm");
        }
        if(t <= -5 && t > -20){
            System.out.println("Normal");
        }
        if(t <=-20){
            System.out.println("Cold");
        }

    }
}
