package fr.tetemh.learn;

import java.util.Scanner;

public class Boucle1 {
    private static int res;
    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//          int nb = scanner.nextInt();
//          scanner.close();
//          for( ; ; ){
//              res = nb--;
//              System.out.println(res);
//              Thread.sleep(400);
//              if(res == -100) {
//                  System.out.println(" vous avez eteind -100");
//                  return;
//              }
//          }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        try (Scanner scanner = new Scanner(System.in)) {
//            Methode.pseudo();
//
//            System.out.print("valeur a decopter -> ");
//            int value = scanner.nextInt();
//
//            while(true){
//                value--;
//                System.out.println(value);
//                if(value == 0){
//                    return;
//                }
//                Thread.sleep(200);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try (Scanner scanner = new Scanner(System.in);){

            Methode.pseudo();

            System.out.println();
        }

    }
}
