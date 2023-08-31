package org.example;

public class Block1Task3 {
    public static void main(String[] args) {
        String str = new String();
        for (int i = 1; i <= 20; i++) {
            i++;
            if(i > 10){
                str = str + i + " ";
            }
        }
        System.out.println(str);

    }
}
