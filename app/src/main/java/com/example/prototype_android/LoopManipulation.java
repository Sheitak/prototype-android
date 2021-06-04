package com.example.prototype_android;

public class LoopManipulation {

    public static void main(String [] argument) {
        int i;
        int[] valeur = new int[6];
        valeur[0] = 1;
        for (i = 1; i < valeur.length; i++) {
            valeur[i] = valeur[i - 1] + 2;
        }
        for (i = 0; i < valeur.length; i++) {
            System.out.println("valeur[" + i + "] = " + valeur[i]);
        }
        System.out.println("");
        int j = 0;
        for (int v : valeur) {
            System.out.println("valeur[" + j++ + "] = " + v);
        }
    }
    /* • Qu’affiche le programme suivant ?

         valeur[0] = 1
         valeur[1] = 3
         valeur[2] = 5
         valeur[3] = 7
         valeur[4] = 9
         valeur[5] = 11

         valeur = 1
         valeur = 3
         valeur = 5
         valeur = 7
         valeur = 9
         valeur = 11

     • Quelles différences constatez-vous dans l’utilisation des deux dernières boucles ?

        Non présence des index dans les tableaux

     • Quelle instruction faudrait-il ajouter pour obtenir exactement le même affichage ?

         Initialisation de : int j = 0;
         Ajout de : valeur[" + j++ + "]
    */
}
