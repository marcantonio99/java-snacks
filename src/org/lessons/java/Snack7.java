package org.lessons.java;

public class Snack7 {
    public static void main(String[] args) {
        System.out.println("Potenze di 2 fino a 100");
        long power = 1;
        int exp = 0;

        while(power * 2 < 1000){
            if (exp > 0){
                power = power * 2 ;
            }
            System.out.println("2^" + exp + "=" + power);
            exp++;
        }
    }
}
