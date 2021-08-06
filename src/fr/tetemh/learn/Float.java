package fr.tetemh.learn;

import java.util.Scanner;

public class Float {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float nb = scanner.nextFloat();
            System.out.println(nb);
        }
    }
}
