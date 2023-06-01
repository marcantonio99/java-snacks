package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        do {
            System.out.print("Inserisci un numero di 4 cifre: ");
            n = scan.nextInt();
        }while(n < 1000 || n > 9999);

        int somma = 0;
        int cifra;

        int temp = n;
        while (temp > 0) {
            cifra = temp % 10;
            somma += cifra;
            temp /= 10;
        }
        System.out.println("La somma delle cifre è: " + somma);

        scan.close();
    }
}
