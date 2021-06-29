package com.example.prototype_android.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String lastname;
    private String firstname;
    private ArrayList<Double> notes;

    public Student(String lastname, String firstname) {

        ArrayList<Double> notes = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Saisir les notes de l'élève jusqu'à 3 :");
            Double note = scan.nextDouble();
            notes.add(note);
        } while (notes.size() < 3);

        this.firstname = firstname;
        this.lastname = lastname;
        this.notes = notes;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public ArrayList<Double> getnotes() {
        return notes;
    }

    public void setnotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Doe", "John");

        displayStudent(student1);
        averageCalculate(student1);
    }

    private static void displayStudent(Student student) {
        System.out.println("Etudiant : " + student.firstname + " " + student.lastname + " et ayant les notes suivantes : ");
        for (Double note : student.notes) {
            System.out.println(note);
        }
    }

    private static void averageCalculate(Student student) {
        double totalNotation = 0;
        int notationSize = student.notes.size();
        for (Double note : student.notes) {
            totalNotation = totalNotation + note;
        }
        System.out.println("Somme total des notations de l'étudiant : " + totalNotation);
        double average = totalNotation / notationSize;
        System.out.println("Moyenne de l'étudiant : " + average);
    }
}
