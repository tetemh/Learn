package fr.tetemh.learn;

import java.util.Scanner;

public class Absolut {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int a = scanner.nextInt();
          int abs = Math.abs(a);
            System.out.println(abs);
        }
    }
}
