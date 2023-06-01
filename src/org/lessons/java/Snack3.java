package org.lessons.java;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somma = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Inserisci un numero: ");
            int n = scan.nextInt();
            somma += n;
        }

        System.out.println("La somma di tutti i numeri è: " + somma);
    }

}
