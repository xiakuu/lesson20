package homework;

//Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//ввести некорректные данные.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите положителное число");
        int i = sc1.nextInt();
        int sum = 0;

        if(i >= 0){
            for(int q = 0; q <= i; q++){
                sum = sum + q;
            }
            System.out.println(sum);

        }
        else{
            System.out.println("Введено неверное число");
        }
    }
}
