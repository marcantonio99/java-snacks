package org.lessons.java;

import java.util.Random;

public class NewSnack2 {
    public static void main(String[] args) {
        String[] nomi = {
                "Mauro", "Fabiana", "Pasquala", "Robert", "Sherlock",
                "Federica", "Geltruda", "Pierino", "Teresa", "Riccardo"
        };
        String[] cognomi = {
                "Totti", "Bolt", "Lorenzoni", "Barbascura", "Diana",
                "Rovazzo", "Franco", "Aresta", "Cippone", "Forcherio"
        };

        Random random = new Random();

        System.out.println("Falsa...ehm...vera lista degli invitati: ");
        for (int i = 0; i < 10; i++){
            String casualName = nomi[random.nextInt(nomi.length)];
            String casualSurname = cognomi[random.nextInt(cognomi.length)];
            System.out.println(casualName + " " + casualSurname);
        }
    }
}
