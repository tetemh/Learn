package fr.tetemh.learn;

import java.util.Scanner;

public class ValeursDistin2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int db = 3;

            if(a == b) {
                db--;
            }
            if(a == c){
                db--;
            }
            if(b == c){
                db--;
            }


            System.out.println("Il y a " + db + " valeurs distinctes.");

        }
    }
}
