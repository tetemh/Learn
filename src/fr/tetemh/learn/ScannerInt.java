package fr.tetemh.learn;

import java.util.Scanner;

public class ScannerInt {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez entre un nombre :");
            int nb = scanner.nextInt();
            System.out.println("Vous avez entrer " + nb + "comme nombre");
        }
    }

}
