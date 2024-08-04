package com.benoit;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // gets random number for questions
        Random random = new Random();
        int num1;
        int num2;
        String op;
        String question;
        int userAnswer;
        String goodbye;
        int correctAnswer;

        // personalized greeting
        System.out.println("what is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!" + " Are you ready for your quiz?");

        // Questions
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " + ";
        question = "What is " + num1 +  op  + num2 + "?";
        System.out.println(question);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 + num2;

        // Feedback
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("Your answer is: " + correctAnswer);



    }
}