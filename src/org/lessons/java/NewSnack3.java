package org.lessons.java;

public class NewSnack3 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 4, 1, 9, 6, 8, 3, 5};

        int somma = 0;

        for (int i = 1; i < numbers.length; i += 2){
            somma += numbers[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);
    }
}
