package fr.tetemh.learn;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int note = scanner.nextInt();
            if (note <= 8) {
                System.out.println("ajourné");
            } else if (note > 8 && note < 10) {
                System.out.println("rattrapage");
            } else if (note >= 10) {
                System.out.println("admis");
            }

        }
    }
}
