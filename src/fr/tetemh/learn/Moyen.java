package fr.tetemh.learn;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Moyen {

    private static Methode methode = new Methode();

    private static void nbtab() {
        for( int i = 0; i < nb.size(); i++) {
            int temp = (int) nb.get(i);
            int temp2 = (int) nb.get(i--);
            int temp3 = temp + temp2;
            System.out.println(temp3);
        }

    }

    private static ArrayList nb = new ArrayList<Integer>();

    public static void main(String[] args) {



        methode.pseudo();

        methode.print("tetemh");

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("how many numbers you want to use in your medium : ");
            int nbt = scanner.nextInt();

            for(int i = 0; i < nbt; i++) {
                int medium = scanner.nextInt();
                nb.add(medium);
            }
            nbtab();

        }
    }
}
