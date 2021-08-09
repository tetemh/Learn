package fr.tetemh.learn;

import java.util.ArrayList;
import java.util.Scanner;

public class TableMultiplications {

//    private static int nb;
//
//    private static ArrayList one = new ArrayList<Integer>();
//
//    private static void one(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void two(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void three(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void four(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void five(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void six(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void seven(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void eight(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//    private static void nine(){
//        int res;
//        for(int i = 0; i < 10; i++){
//            res = i * nb;
//            one.add(res);
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            nb = scanner.nextInt();
//
//            if(nb == 1) one();
//            if(nb == 2) two();
//            if(nb == 3) three();
//            if(nb == 4) four();
//            if(nb == 5) five();
//            if(nb == 6) six();
//            if(nb == 7) seven();
//            if(nb == 8) eight();
//            if(nb == 9) nine();
//            System.out.println(one.toString());
//
//        }
//    }

    private static ArrayList result = new ArrayList<Integer>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Veuillez entrer une table de multiplication : ");
            int nb = scanner.nextInt();
            System.out.println("jusqu'à où voulez vous aller");
            int nb2 = scanner.nextInt();
            nb2 = nb2++;

            int res;
            for(int i = 0; i < nb2; i++){
                res = i * nb;
                result.add(res);
                System.out.println(i + " x " + nb + " = " + res);
            }

        }
    }
}
