package com.benoit;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // Method to get users name
    public static void greetUser(String name) {
        String greeting = "Welcome " + name + "!" + " Are you ready for your quiz?";
        System.out.println(greeting);
    }
    // Method to ask questions
    public static void printQuestions(int num1, int num2, String op) {
        String question = "What is " + num1 +  op  + num2 + "?";
        System.out.println(question);
    }

    public static void answerFeedback(int userAnswer, int correctAnswer){
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + correctAnswer);
    }

    public static void printResults(String name){
        String goodbye = "Thanks for taking the quiz " + name + "! ";
        System.out.println(goodbye);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // gets random number for questions
        Random random = new Random();
        int num1;
        int num2;
        String op;
        //String question;
        int userAnswer;
        //String goodbye;
        int correctAnswer;

        // personalized greeting
        System.out.println("what is your name?");
        String name = scan.nextLine();
        greetUser(name);

        // Question 1
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " + ";
        printQuestions(num1, num2, op);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 + num2;

        // Feedback
        answerFeedback(userAnswer, correctAnswer);




        // Question 2
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " - ";
        printQuestions(num1, num2, op);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 - num2;

        // Feedback
        answerFeedback(userAnswer, correctAnswer);




        // Question 3
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " / ";
        printQuestions(num1, num2, op);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 / num2;

        // Feedback
        answerFeedback(userAnswer, correctAnswer);




        // Question 4
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " + ";
        printQuestions(num1, num2, op);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 + num2;

        // Feedback
        answerFeedback(userAnswer, correctAnswer);



        // Question 5
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " * ";
        printQuestions(num1, num2, op);

        // Input for question1
        System.out.print("Answer is: ");
        userAnswer = scan.nextInt();

        // Compute the correct answer
        correctAnswer = num1 * num2;

        // Feedback
        answerFeedback(userAnswer, correctAnswer);


        // Farewell message
        printResults(name);
    }
}