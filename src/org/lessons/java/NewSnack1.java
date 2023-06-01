package org.lessons.java;

import java.util.Scanner;

public class NewSnack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int n = scan.nextInt();

        if (n % 2 != 0){
            System.out.println(n + 1);
        }else {
            System.out.println(n);
        }
    }
}
