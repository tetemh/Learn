package fr.tetemh.learn;

import java.util.Scanner;

public class Air {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = a * b;
            System.out.println(result);
        }
    }
}
