package fr.tetemh.learn;

import java.util.Scanner;

public class ScannerPseudo {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez rentrer votre pseudo :");
            String pseudo = scanner.nextLine();
            System.out.println("votre pseudo est -> " + pseudo);
            scanner.close();
        }

    }
}
