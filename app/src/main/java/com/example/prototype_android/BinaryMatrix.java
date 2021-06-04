package com.example.prototype_android;

public class BinaryMatrix {

    public static void main(String[] args) {

        // Initialisation de la matrice 7 * 7,
        int [][] Star = new int[7][7];
        for (int i = 0; i < Star.length; i++) {
            for (int j = 0; j < Star[0].length; j++) {
                Star[i][i] = 1;
                Star[3][i] = 1;
                Star[i][3] = 1;
                Star[i][6-i] = 1;
            }
        }

        // Affichage de la matrice,
        for (int i = 0; i < Star.length; i++) {
            for (int j = 0; j < Star[0].length; j++) {
                System.out.print(Star[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        // Remplace 0 par un (" ") et 1 par un ("*"),
        for (int[] ints : Star) {
            for (int j = 0; j < Star[0].length; j++) {
                if (ints[j] == 0) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
    }
}
