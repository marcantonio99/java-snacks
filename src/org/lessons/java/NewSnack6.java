package org.lessons.java;

import java.util.Scanner;

public class NewSnack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero come stringa: ");
        String numberString = scan.nextLine();

        int number = convertStringToInt(numberString);
        System.out.println(number);
    }
    public static int convertStringToInt(String numberString){
        int result = 0;
        int multiplier = 1;

        for (int i = numberString.length() - 1; i >= 0; i--){
            char digitChar = numberString.charAt(i);

            if (digitChar >= '0' && digitChar <= '9'){
                int digit = digitChar - '0';
                result += digit * multiplier;
                multiplier *= 10;
            }else {
                throw new IllegalArgumentException("La stringa contiene caratteri non validi" + numberString);
            }
        }
        return result;
    }
}
