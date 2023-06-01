package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci due numeri in successione: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int maxValue = Math.max(n1, n2);
        System.out.println(maxValue);
        scan.close();
    }
}
