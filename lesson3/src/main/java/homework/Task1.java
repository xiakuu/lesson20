package homework;

//Задача 1:
//        Напишите программу, которая будет принимать на вход число из консоли и на выход
//        будет выводить сообщение четное число или нет. Для определения четности числа
//        используйте операцию получения остатка от деления (операция выглядит так: '% 2').

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число");
        int q = sc1.nextInt();

        int i = q%2;

        if(i > 0){
            System.out.println("Число не является четным");
        }
        else {
            System.out.println("Число является четным");
        }


    }
}
