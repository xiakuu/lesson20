package homework;

import java.util.Scanner;

//Задача 3:
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число от 10 до 20");
        int i = sc1.nextInt();

        if(i >=10 && i <=20){
            System.out.println(i * i);
        }
        else{
            System.out.println("Введено неверное число");
        }
    }
}
