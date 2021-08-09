package fr.tetemh.learn;

import java.util.Scanner;

public class Puissance {

    private static int res;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int b = scanner.nextInt();
          int n = scanner.nextInt();

          if(n > 0){
              n = n--;

              for (int i = 0; i < n; i++) {

                  res = b * b;

              }
          }else{
              System.out.println("vous avez rentré un nombre négatife");
          }
            System.out.println(res);
        }
    }
}
