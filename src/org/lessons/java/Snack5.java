package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Chiedi per 6 volte all’utente di inserire un numero,
        // se è dispari mostrare questa informazione a video

        System.out.println("Inserisci 6 volte un numero: ");

        for (int i=0; i<=5; i++){
            int n = scan.nextInt();
            if (n % 2 != 0){
                System.out.println("Questo numero e disprari");
            }else{
                System.out.println("Questo numero e pari");
            }
        }
    }
}
