package fr.tetemh.learn;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int old = scanner.nextInt();
          if(old < 18)
              System.out.println("tu es mineur PAS DE PORNO");
          else if(old > 18)
              System.out.println("tu es majeur A TOI LA PORNO");
          else
              System.out.println("tu as tous pille 18 ans yes");

        }
    }
}
