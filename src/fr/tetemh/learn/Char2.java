package fr.tetemh.learn;

import java.util.Scanner;

public class Char2 {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Saissisez un caractère");
        char caractere = saisie.next().charAt(0);
        System.out.println("Le successeur de " + caractere + " est " + --caractere + ".");
        saisie.close();

        //Laisser tomber
    }
}
