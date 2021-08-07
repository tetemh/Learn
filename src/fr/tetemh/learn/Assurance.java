package fr.tetemh.learn;

import java.util.Scanner;

public class Assurance {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int prix = scanner.nextInt();
          int franch = prix / 100 * 10;

          if(franch >= 4000) {
              System.out.println("La franchise est trop haute dommage elle est de " + franch);
          }else {
              System.out.println("la franchise est de " + franch + "les dommage a payer et de " + (prix - franch));
          }
        }
    }
}
