package com.example.prototype_android.fundamentals;
import java.util.Scanner;

public class WordsChecker {

    public static void main(String[] args) {

        String word = "", wordGrand = "", wordSmall = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer vos mots : ");
        word = scan.next();
        wordGrand = word ;
        wordSmall = word ;
        do {
            if (word.compareTo(wordGrand) < 0) wordGrand = word ;
            if (word.compareTo(wordSmall) > 0) wordSmall = word ;
            System.out.print("Entrer vos mots (Ecrivez 'FIN' pour sortir) : ") ;
            word = scan.next();
        } while (!word.equalsIgnoreCase("FIN") );
        System.out.println("Plus grand mot par ordre alphabétique : " + wordGrand) ;
        System.out.println("Plus petit mot par ordre alphabétique : " + wordSmall) ;
    }
}
