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

    public static String chooseOperator(int opNum){
        if(opNum == 1){
            return " - ";
        }
        else if(opNum == 2){
            return " + ";
        }
        else if(opNum == 3){
            return " / ";
        }
        else{
            return " * ";
        }
    }

    public static int calculateAnswer(int num1, int num2, String op){
        int results = 0;
        if(op == " - "){

            return num1 - num2;
        }
        else if(op == " + "){

            return num1 + num2;
        }
        else if(op == " * "){

            return num1 * num2;
        }
        else if(op == " / "){

            return (int)(num1 / num2);
        }
        else{
            return -1;

        }
    }

    public static void printResults(String name, int score){
        String goodbye = "Thanks for taking the quiz " + name + "! " + "Your score is " + score;
        System.out.println(goodbye);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int num1;
        int num2;
        int opNum = 0 ;
        String op = "";
        int userAnswer;
        int correctAnswer;
        int score = 0;
        int totalScore = 0;
        int totalQuestions = 0;

        // personalized greeting
        System.out.println("what is your name?");
        String name = scan.nextLine();
        greetUser(name);

        // Questions
        while( totalQuestions < 5) {

            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
            opNum = random.nextInt(4) + 1;
            op = chooseOperator(opNum);
            printQuestions(num1, num2, op);
            System.out.print("Ans: ");
            userAnswer = scan.nextInt();
            correctAnswer = calculateAnswer(num1, num2, op);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score = score + 1;
            } else {
                System.out.println("Sorry. The correct answer was " + correctAnswer);
            }
            totalQuestions = totalQuestions + 1;
        }

        // Farewell message
        printResults(name, score);
    }
}