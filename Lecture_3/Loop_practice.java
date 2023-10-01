package Lecture_3;

import java.util.Scanner;

public class Loop_practice {
    public static void main (String[] argc){

        /*
         * program takes an integer input from user and
         * calculates its factorial.
         */
//        Scanner fact = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int x = fact.nextInt();
//        int prod = 1;
//        int i;
//        for ( i = -1; i <= x; ++i){
//            prod *= i;
//        }
//        System.out.println("The factoral of " + x + " is: " + prod);
//        System.out.println(i-1);

        /*
         * program takes an integer input from user and
         * calculates the sum and average of the numbers in between.
         */

//        Scanner sumave = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        int x = sumave.nextInt();
//        System.out.println("Enter Second Number: ");
//        int y = sumave.nextInt();
//        double sum = 0;
//        int i;
//        for (i = x; i <= y; i++) {
//            sum += i;
//        }
//        double average = sum/(i);
//
//        System.out.println("The sum of numbers between " + x + " and " + y + " is: " + sum);
//        System.out.println("The sum of numbers between " + x + " and " + y + " is: " + average);


        /*
         * program takes two integer input from user and
         * calculates the sum of odd numbers in between.
         */

//        Scanner odd = new Scanner(System.in);
//        System.out.println("Enter the First Number: ");
//        int x = odd.nextInt();
//        System.out.println("Enter the Second Number: ");
//        int y = odd.nextInt();
//        int sum = 0;
//
//        if (y < x) {
//            int temp = x;
//            x = y;
//            y = temp;
//        }
//
//        for (int i = x; i <= y; i++) {
//            if (i % 2 != 0){
//                sum+=i;
//            }
//        }
//        System.out.println("The sum of odd numbers between " + x + " and " + y + " is: " + sum);


        /*
         * program takes two integer input from user and
         * calculates the value of one number raised to the other.
         * (do not use java built-in method)
         */

//        Scanner exp = new Scanner(System.in);
//        System.out.println("Enter the base Number: ");
//        int x = exp.nextInt();
//        System.out.println("Enter the exponent Number: ");
//        int y = exp.nextInt();
//        int prod = 1;
//
//        for (int i = 1; i <= y; i++) {
//            prod *= x;
//        }
//        System.out.println(x + " The power of " + y + " equal to " + prod);

//        /*
//         * program takes specific amount of inputs from user and
//         * count the even and odd entries.
//         */
//
//        Scanner count = new Scanner(System.in);
//        System.out.println("Enter the number of integers: ");
//        int n = count.nextInt();
//        int counteven = 0;
//        int countodd = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Insert Integer " + i + ":");
//            int x = count.nextInt();
//            if (x % 2 == 0){
//                counteven++;
//            }
//            else {
//                countodd++;
//            }
//        }
//        System.out.println("Total count of even numbers is: " + counteven);
//        System.out.println("Total count of odd numbers is: " + countodd);

        /*
         * program takes specific amount of inputs from user and
         * count the even and odd entries.
         */

        Scanner count = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = count.nextInt();
        int countpos = 0;
        int countneg = 0;
        int countzero = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Insert Integer " + i + ":");
            int x = count.nextInt();
            if (x > 0){
                countpos++;
            }
            else if (x < 0) {
                countneg++;
            }
            else {
                countzero++;
            }
        }
        System.out.println("Total count of positive numbers is: " + countpos);
        System.out.println("Total count of negative numbers is: " + countneg);
        System.out.println("Total count of zero is: " + countzero);

    }
}
