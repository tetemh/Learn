package fr.tetemh.learn;

import java.util.Scanner;

public class Moyen {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            double nb1 = scanner.nextDouble();
            double nb2 = scanner.nextDouble();
            double nb3 = scanner.nextDouble();

            //ope
            double temp = nb1+ nb2 + nb3;
            double result = temp / 3;
            System.out.println(result);
        }
    }
}
