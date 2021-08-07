package fr.tetemh.learn;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisis ta note : ");
            int note = scanner.nextInt();
            scanner.close();
            if (note >= 10)
                System.out.println("Admis !");
            else
                if (note >= 8)
                    System.out.println("Rattrapge.");
                else
                    System.out.println("Ajourné... :-(");
        }

    }
}