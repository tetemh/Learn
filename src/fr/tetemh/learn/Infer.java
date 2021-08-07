package fr.tetemh.learn;

import java.util.Scanner;

public class Infer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a < b && a < c){
                System.out.println(a);
            }
            if(b < a && b < c){
                System.out.println(b);
            }
            if(c < a && c < b){
                System.out.println(c);
            }
/*              autre possibiliter!!
            int min = a;
            if(b < min){
                min = b;
            }
            if(c < min){
                min = c;
            }
*/
        }
    }
}
