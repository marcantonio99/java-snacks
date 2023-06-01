package org.lessons.java;

import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String word1 = scan.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String word2 = scan.nextLine();

        if (word1.length() < word2.length()){
            System.out.println("Parola piu corta: " + word1);
            System.out.println("Parola piu lunga: " + word2);
        }else if (word1.length() > word2.length()){
            System.out.println("Parola piu corta: " + word2);
            System.out.println("Parola piu lunga: " + word1);
        }else{
            System.out.println("Le due parole hanno la stessa lunghezza");
        }

        scan.close();
    }
}
