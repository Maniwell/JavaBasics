package Lecture_3;

import java.util.Scanner;
public class User_Prompted_Exe {
    public static void main(String[] args) {

        /*
         * Program prompts users for two int inputs and
         * calculates the sum.
         */

//        Scanner input = new Scanner(System.in);
//        System.out.print("Input first number = ");
//        int x = input.nextInt();
//        System.out.print("Input second number = ");
//        int y = input.nextInt();
//
//        int sum = x + y;
//        System.out.printf("Sum of %d and %d = %d", x, y, sum);

        /*
         * Program prompts users for two int inputs and
         * calculates the diffrence.
         */


//        Scanner diff = new Scanner(System.in);
//        System.out.println("Input First number = ");
//        int x = diff.nextInt();
//        System.out.println("Input Second number = ");
//        int y = diff.nextInt();
//
//        int sub = x - y;
//        System.out.println("Diffrence = " + sub);

        /*
         * Program prompts users for int inputs and
         * identifies if the input is +ve,-ve or zero.
         */
//        Scanner var = new Scanner(System.in);
//        System.out.println("Enter Number = ");
//        int x = var.nextInt();
//
//        if (x > 0) {
//            System.out.println("Input is Positive.");
//        }
//        else if (x < 0) {
//            System.out.println("Input is Negative.");
//        }
//        else {
//            System.out.println("Input is Zero.");
//        }

        /*
         * Program prompts users for two int inputs and
         * identifies which is greater.
         */

        Scanner great = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = great.nextInt();
        System.out.println("Enter Second Number: ");
        int y = great.nextInt();

        if (x > y) {
            System.out.println("First No. is greater");
        }
        else if (x < y) {
            System.out.println("Second No. is greater");
        }
        else {
            System.out.println("Both are equal!");
        }




    }
}
