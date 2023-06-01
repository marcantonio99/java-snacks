package org.lessons.java;
import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            int cubo = i * i * i;
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }

        input.close();
    }
}