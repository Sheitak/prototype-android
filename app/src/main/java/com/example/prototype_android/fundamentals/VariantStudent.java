package com.example.prototype_android.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class VariantStudent {

    private final ArrayList<Double> notes = new ArrayList<Double>();

    public VariantStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le prénom de l'étudiant : ");
        String firstname = scan.next();
        System.out.println("Entrer le nom de l'étudiant : ");
        String lastname = scan.next();
        System.out.println("Combien de notes pour l'étudiant " + firstname + " " + lastname + " : ");
        int number = scan.nextInt();
        
        for (int i = 0; i < number; i ++) {
            System.out.print("Entrer la note n° " + (i + 1) + " : ");
            notes.add(
                    scan.nextDouble()
            );
        }
        System.out.print("L'étudiant " + firstname + " " + lastname + " a les notes suivante : ");
        for (Double note : notes) {
            System.out.print(note + ", ");
        }
    }

    public static void main(String[] args) {
        VariantStudent variantStudent = new VariantStudent();
        System.out.println("");
        variantStudent.averageCalculate(variantStudent);
    }

    private void averageCalculate(VariantStudent variantStudent) {
        double totalNotation = 0;
        for (Double note : notes) {
            totalNotation = totalNotation + note;
        }
        double average = totalNotation / notes.size();
        System.out.println("La moyenne de l'étudiant est : " + average);
    }
}
