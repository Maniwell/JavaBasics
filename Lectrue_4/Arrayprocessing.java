package Lectrue_4;

import java.util.Scanner;

public class Arrayprocessing {
    public static void main (String[] args){
        /*
         * Program initializes an array variable values to zero.
         */

//        int[] value = new int[10];
//        for (int i = 0; i < value.length; i++){
//            value[i] = 0;
//            System.out.print(value[i] + ", ");
//        }

        /*
         * Program initializes an array variable  by accepting
         * temperature values from user.
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of temprature values: ");
//        int n = input.nextInt();
//
//        double[] temp = new double[n];
//        for (int i = 0; i < temp.length; i++){
//           System.out.println("Value of temp" + i + " :");
//            temp[i] = input.nextDouble();
//        }
//
//        for (int i = 0; i < temp.length; i++){
//            System.out.print((i+1) + ". " + temp[i] + "\n");
//        }

        /*
         * Program prints the sum of numbers given by a
         * user.
         */

//        Scanner add = new Scanner(System.in);
//        System.out.println("Enter amount of numbers to be added: ");
//        int n = add.nextInt();
//
//        int sum = 0;
//        double[] values = new double[n];
//        for (int i = 0; i < values.length; i++){
//            System.out.println("Enter digit " + (i+1) + " :");
//            values[i] = add.nextDouble();
//            sum += values[i];
//        }
//
//        System.out.println("The sum of entered numbers is: " + sum);

        /*
         * The program accepts numbers/strings from a user to create an array and checks
         * if that array contains a certain value.
         */

        Scanner strcheck = new Scanner(System.in);
        System.out.println("Enter the size strings/numbers database: ");
        int n = strcheck.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < str.length; i++){
            System.out.println("Enter the" + (i + 1) + "content of the database: ");
            str[i] = strcheck.next();
        }

        System.out.println("Content to be checked: ");
        String strin = strcheck.next();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (str[i].equals(strin)) {
                found = true;
                break;
            }
        }

            if (found) {
                System.out.println("The content " + strin + " is in the database.");
            }
            else {
                System.out.println("The content " + strin + " is not in the database.");
            }



    }
}
