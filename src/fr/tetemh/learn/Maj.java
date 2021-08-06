package fr.tetemh.learn;

import java.util.Locale;
import java.util.Scanner;

public class Maj {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            str = str.toUpperCase(Locale.ROOT);
            System.out.println(str);
        }
    }
}
