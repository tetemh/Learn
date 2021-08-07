package fr.tetemh.learn;

import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int db = 0;

            if(a == b) {
                System.out.println(a + " / " + b);
                db++;
            }
            if(a == c){
                System.out.println(a + " / " + c);
                db++;
            }
            if(b == c){
                System.out.println(b + " / " + c);
                db++;
            }


            System.out.println("Il y a " + db + " doublon");

        }
    }
}
