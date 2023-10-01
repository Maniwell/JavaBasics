package Lectrue_4;

import java.util.Scanner;

public class Assignment {
    public static void main (String[] args){

        /*
         * The program takes 5 integers as inputs from user
         * and stores them in an array and print them to screen.
         */

//        Scanner input = new Scanner(System.in);
//
//        int n = 5;
//        int[] num = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            System.out.println("Enter Digit " + (i+1) + ":");
//            num [i] = input.nextInt();
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.print("Value " + (i+1) + ": \n" + num [i]);
//        }

        /*
         * program takes 10 integer inputs for user and prints:
         * number of positive,negative, even, odd numbers
         * and zeros.
         *
         */

//        Scanner input = new Scanner(System.in);
//        int n = 10;
//        int[] num = new int[n];
//
//        int countPos = 0;
//        int countNeg = 0;
//        int countEven = 0;
//        int countOdd = 0;
//        int countZero = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter Digit " + (i+1) + ":");
//            num [i] = input.nextInt();
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] > 0) {
//                countPos++;
//            } else if (num[i] < 0) {
//                countNeg++;
//            }
//            else if (num[i] == 0) {
//                countZero++;
//            }
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                countEven++;
//            } else if (num[i] % 2 != 0) {
//                countOdd++;
//            }
//        }
//
//        System.out.println("Out of the " + n + " Numbers " + countEven + " are even.");
//        System.out.println("Out of the " + n + " Numbers " + countOdd + " are odd.");
//        System.out.println("Out of the " + n + " Numbers " + countPos + " are positive.");
//        System.out.println("Out of the " + n + " Numbers " + countNeg + " are negative.");
//        System.out.println("Out of the " + n + " Numbers " + countZ   ero + " are zeros.");

        /*
         * Program accepts 5 number inputs from user, stores the values in an array
         * and then copies the values to another array and prints it.
         */

//        Scanner input = new Scanner(System.in);
//        int n = 5;
//        int[] num1 = new int[n];
//        int[] num2 = new int[n];
//
//        for (int i = 0; i < num1.length; i++) {
//            System.out.println("Enter Digit " + (i+1) + ": ");
//            num1[i] = input.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            num2[i] = num1[i];
//            System.out.println((i+1) + ". value of copied array is: " + num2[i]);
//        }

        /*
         * Program accepts 5 number inputs from user, stores the values in an array
         * and then copies the values to another array in reverse and prints it.
         */

//        Scanner input = new Scanner(System.in);
//        int n = 5;
//        int[] num1 = new int[n];
//        int[] num2 = new int[n];
//
//        for (int i = 0; i < num1.length; i++) {
//            System.out.println("Enter Digit " + (i+1) + ": ");
//            num1[i] = input.nextInt();
//        }
//
//        for ( int i = 0; i < num1.length; i++) {
//            num2[i] = num1[num1.length - (i + 1)];
//            System.out.println( (i + 1) + ". Value of reversed array is: " + num2[i]);
//        }

        /*
         * Program finds the max and min values from an
         * array of 20 elements.
         */

//        Scanner input = new Scanner(System.in);
//        int n = 20;
//        int[] num = new int[n];
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter Digit " + (i + 1) + ":");
//            num[i] = input.nextInt();
//        }
//        int max = num[0];
//        int min = num[0];
//
//        for (int i = 1; i < num.length; i++) {
//            if (num[i] < min) {
//                min = num[i];
//            }
//            if (num[i] > max) {
//                max = num[i];
//            }
//        }
//        System.out.println("The Maximum Value is: " + max);
//        System.out.println("The Minimum Value is: " + min);


        /*
         * The program accepts numbers/strings from a user to create an array and checks
         * if that array contains a certain value.
         */

//        Scanner input = new Scanner(System.in);
//        boolean isString = true;
//        boolean isNotString = false;
//        System.out.println("is the value string? (y/n): ");
//        String answer = input.nextLine().toLowerCase();
//        boolean response;
//
//        switch (answer){
//            case "y":
//                response = isString;
//                break;
//            case "n":
//                response = isNotString;
//                break;
//            default:
//                System.out.println("Invalid Answer! Use only y/n.");
//                return;
//        }
//        System.out.println("Enter the size of data base to be created");
//        int size = input.nextInt();
//
//        if (response == isString) {
//
//            String[] strData = new String[size];
//
//            for (int i = 0; i < strData.length; i++) {
//                System.out.println("Enter Data " + (i+1) + ": ");
//                strData[i] = input.next();
//            }
//
//            System.out.println("Data to be checked: ");
//            String strCheck = input.next();
//            boolean found = false;
//
//            for (int i =0; i < size; i++) {
//                if (strData[i].equals(strCheck)) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                System.out.println("The string " + strCheck + " is in the database.");
//            }
//            else {
//                System.out.println("The string " + strCheck + " is not in the database.");
//            }
//
//        }
//        if (response == isNotString) {
//
//            double[] numData = new double[size];
//
//            for (int i = 0; i < numData.length; i++) {
//                System.out.println("Enter data " + (i+1) + ": ");
//                numData[i] = input.nextDouble();
//            }
//
//            System.out.println("Data to be checked: ");
//            double numChecked = input.nextDouble();
//            boolean found = false;
//
//            for (int i = 0; i < size; i++) {
//                if (numData[i] == numChecked) {
//                    found = true;
//                    break;
//                }
//            }
//
//            if (found) {
//                System.out.println("The number " + numChecked + " is in the database.");
//            }
//            else {
//                System.out.println("The number " + numChecked + " is not in the database.");
//            }
//        }

        /*
         * program finds the duplicate values of an array of integers.
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of Array: ");
//        int array = input.nextInt();
//        int[] num = new int[array];
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter the " + (i+1) + " value: ");
//            num[i] = input.nextInt();
//        }
//
//        System.out.println("Enter the value to be checked for duplicates: ");
//        int dup = input.nextInt();
//        int count = 0;
//
//        while (true) {
//            boolean found = false;
//            for (int j : num) { //replaced by enhanced for loop.
//                if (dup == j) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                break;
//            }
//            else {
//                System.out.println("Error! Enter the value to be checked for duplicates: ");
//                dup = input.nextInt();
//            }
//        }
//
////        for (int i = 0; i < num.length; i++) {
////            if (dup == num[i]) {
////                break;
////            }
////            else {
////                System.out.println("Inserted value is invalid.");
////                return;
////            }
////        }
//
//        for (int i = 0; i < num.length; i++) {
//            if (dup == num[i]) {
//                count++;
//            }
//        }
//        System.out.println("The array value " + dup + " has " + (count - 1) + " duplicate/s.");
//
//
////        for (int i = 0; i < num.length; i++) {
////            int count = 0;
////            for (int j = 0; j < num.length; j++){
////                if (j != i) {
////                    if (num[i] == num[j]){
////                        count++;
////                    }
////                }
////            }
////            System.out.println("The array value " + num[i] + " has " + count + " Duplicates.");
////            }

        /*
         * program inserts an element in a specific location in an
         * array.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        String[] strIn = new String[size];

        for (int i = 0; i < strIn.length; i++) {
            System.out.println("Enter content " + (i+1) + ": ");
            strIn[i] = input.next();
        }

        System.out.println("Enter the replacement content: ");
        String strRep = input.next();
        System.out.println("Specify the content to replace " + 0 + " to " + (size - 1) + ": ");
        int strIndex = input.nextInt();

        while (true) {
            boolean found = strIndex >= 0 && strIndex <= size;
            if (found) {
                String temp = strIn[strIndex];
                strIn[strIndex] = strRep;
                System.out.println("The content " + temp + " has been replaced by " + strRep);
                break;
            }
            else {
                System.out.println("ERROR! Specify the content to replace " + 0 + " to " + size + ": ");
                strIndex = input.nextInt();
            }
        }
        System.out.println("Array's " + strIndex + " index value is " + strIn[strIndex]);

    }
}
