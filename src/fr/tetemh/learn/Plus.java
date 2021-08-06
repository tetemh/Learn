package fr.tetemh.learn;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- somme ---");
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int result1 = one + two;
            System.out.println("Somme de " + one + " + " + two + " = " + result1);
        }
    }
}
