package fr.tetemh.learn;

import java.util.Scanner;

public class Permut1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez entrer 4 nombres");
            int nb1 = scanner.nextInt();
            int nb2 = scanner.nextInt();
            int nb3 = scanner.nextInt();
            int nb4 = scanner.nextInt();
            System.out.println(nb1 + "//");
            System.out.println(nb2 + "//");
            System.out.println(nb3 + "//");
            System.out.println(nb4 + "//");

            int temp1 = nb1;
            int temp2 = nb2;
            int temp3 = nb3;
            int temp4 = nb4;
            nb1 = nb3;
            nb2 = nb4;
            nb3 = temp1;
            nb4 = temp2;

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println(nb1 + "//");
            System.out.println(nb2 + "//");
            System.out.println(nb3 + "//");
            System.out.println(nb4 + "//");



        }
    }
}
