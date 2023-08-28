package org.example;

import org.w3c.dom.ls.LSOutput;

public class Block2Task4 {
    public static void main(String[] args) {
        double a = 3.4232;
        int b = (int)a;
        double c = a - b;
        if(c > 0.5) {
            System.out.println(b + 1);
        }
        else{
            System.out.println(b);
        }
    }
}
