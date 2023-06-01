package org.lessons.java;

import java.util.Scanner;

public class NewSnack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        do {
            System.out.print("Inserisci una stringa o 0 per chiudere: ");
            input = scan.nextLine();

            if (!input.equals("0")){
                int alphabethicCount = 0;
                int numericCount = 0;
                int symbolCount = 0;

                for (char ch : input.toCharArray()){
                    if (Character.isLetter(ch)){
                        alphabethicCount++;
                    }else if (Character.isDigit(ch)){
                        numericCount++;
                    }else {
                        symbolCount++;
                    }
                }
                System.out.println("Caratteri alfabetici; " + alphabethicCount);
                System.out.println("Numeri; " + numericCount);
                System.out.println("Simboli; " + symbolCount);
            }
        }while(!input.equals("0"));
        System.out.println("Fine");
    }
}
