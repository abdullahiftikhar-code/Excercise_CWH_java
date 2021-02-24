package com.company;

import java.util.Scanner;


public class Excercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We will ask marks of only 10 exams");
        System.out.print("What are the total marks ");
        int totalMarks = sc.nextInt();

        System.out.println("Marks of first exam");
        int firstExam = sc.nextInt();

        System.out.println("Marks of second exam");
        int secondExam = sc.nextInt();

        System.out.println("Marks of third exam");
        int thirdExam = sc.nextInt();

        System.out.println("Marks of fourth exam");
        int fourthExam = sc.nextInt();

        System.out.println("Marks of fifth exam");
        int fifthExam = sc.nextInt();

        System.out.println("Marks of sixth exam");
        int sixthExam = sc.nextInt();

        System.out.println("Marks of seventh exam");
        int seventhExam = sc.nextInt();

        System.out.println("Marks of eighth exam");
        int eighthExam = sc.nextInt();

        System.out.println("Marks of ninth exam");
        int ninthExam = sc.nextInt();

        System.out.println("Marks of tenth exam");
        int tenthExam = sc.nextInt();

        int marksGot = fifthExam + secondExam + thirdExam + fourthExam + fifthExam + sixthExam + seventhExam + eighthExam + ninthExam + tenthExam;

        System.out.print("Percentage is ");
        System.out.println(marksGot * 100 / 100);
    }
}
