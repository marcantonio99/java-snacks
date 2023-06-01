package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        String[] guests = {"Fabio", "Gino", "Carmelo", "Valentina", "Gianpaola"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisca il suo nome: ");
        String name = scan.nextLine();

        boolean guest = false;

        for (int i = 0; i < guests.length; i++){
            if (guests[i].equals(name)){
                guest = true;
            }
        }
        if (guest){
            System.out.println("Sei stato invitato alla festa del Grande Gatsby");
        }else{
            System.out.println("Mi dispiace, non trovo il suo nome in elenco");
        }
    }
}
