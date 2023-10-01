package Lecture_3;

import java.util.Scanner;
public class Prompt_if_else {
    public static void main (String[] args){
        /*
         * program takes values of length and width of a rectangle
         * from user and checks if it is square or not.
         */

//        Scanner dimension = new Scanner(System.in);
//        System.out.println("Rectangle length: ");
//        int length = dimension.nextInt();
//        System.out.println("Rectangle length: ");
//        int width = dimension.nextInt();
//
//        if (length == width) {
//            System.out.println("The rectangle is a square!");
//        }
//        else {
//            System.out.println("The rectangle is not a square!");
//        }

        /*
         * program takes 3 int values from user and prints
         * the greatest among them.
         */

//        Scanner cmpr = new Scanner(System.in);
//        System.out.println("Value of first No.: ");
//        int x = cmpr.nextInt();
//        System.out.println("Value of second No.: ");
//        int y = cmpr.nextInt();
//        System.out.println("Value of third No.: ");
//        int z = cmpr.nextInt();
//
//        if (x > y && x > z) {
//            System.out.println("The Greatest value is " + x);
//        }
//        if (y > x && y > z) {
//            System.out.println("The Greatest value is " + y);
//        }
//        if (z > x && z > y) {
//            System.out.println("The Greatest value is " + z);
//        }

        /*
         * program prints absolute value of a number entered by user.
         */

//        Scanner abs = new Scanner(System.in);
//        System.out.println("Insert number: ");
//        int x = abs.nextInt();
//
//        if (x >=0) {
//            System.out.println("Absolute value of input is " + x);
//        }
//        else {
//            System.out.println("Absolute value of input is " + (-x));
//        }

        /*
         * program prints the correct grade for the input mark/score.
         */

//        Scanner grade = new Scanner(System.in);
//        System.out.println("Please enter your score: ");
//        int score = grade.nextInt();
//
////        do {
////            System.out.println("Invalid input! (Note use values from 0 - 100)");
////            System.out.println("Please enter a correct score: ");
////            score = grade.nextInt();
////        } while (score > 100 && score < 0);
//
//        if (score > 80 && score <= 100){
//            System.out.println("Your Grade is A");
//        }
//        else if (score > 60 && score <= 80){
//            System.out.println("Your Grade is B");
//        }
//        else if (score > 50 && score <= 60){
//            System.out.println("Your Grade is C");
//        }
//        else if (score > 45 && score <= 50){
//            System.out.println("Your Grade is D");
//        }
//        else if (score > 25 && score <= 45){
//            System.out.println("Your Grade is E");
//        }
//        else if (score > 0 && score <=25){
//            System.out.println("Your Grade is F");
//        }
//        else {
//            System.out.println("Invalid input! (Note use values from 0 - 100)");
//        }

        /*
         * program applies discount to customers purchasing
         * more than 1000 quantity. unit cost is 100.
         */

        Scanner shop = new Scanner(System.in);
        System.out.println("Enter total units purchased: ");
        int x = shop.nextInt();
        int buy = 100 * x;

        if (x >= 10) {
            double discnt = 0.9 * buy;
            System.out.println("Your total cost is " + discnt);
        }
        else if (x >= 0 && x < 10) {
            System.out.println("Your total cost is " + buy);
        }
        else {
            System.out.println("Invalid input");
        }




    }
}
