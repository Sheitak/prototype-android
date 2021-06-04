package com.example.prototype_android;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatesValues {

    public static void main(String[] args) {

        // Stocker dans un tableau des valeurs entières entrées par l'utilisateur,
        List<Integer> valuesTabInteger = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numberToArray = 3;
        System.out.print("Entrer jusqu'à " + numberToArray + " entiers : ");
        int number = scan.nextInt();
        valuesTabInteger.add(number);
        do {
            System.out.print("Entrer jusqu'à " + numberToArray + " entiers : ");
            number = scan.nextInt();
            valuesTabInteger.add(number);
        } while (valuesTabInteger.size() != numberToArray);
        System.out.println(valuesTabInteger);

        // Somme de toutes les valeurs de la liste,
        int totalValues = 0;
        for (int i : valuesTabInteger) {
            totalValues = totalValues + i;
        }
        System.out.println(totalValues);

        // Calcule de la moyenne de ces valeurs,
        float average = (float) totalValues / valuesTabInteger.size();
        System.out.println("Moyenne = " + average);

        // Rechercher la plus grandes valeur,

        // Détérminer sa position,

        // Afficher le nombre de valeurs supérieurs à la moyenne,

    }
}
