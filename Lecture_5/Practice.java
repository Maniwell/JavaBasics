package Lecture_5;

import java.util.Scanner;

public class Practice {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the date: ");
        int day = input.nextInt();
        weekDay(day);

        System.out.println("Enter the number of input values: ");
        int num = input.nextInt();
        int[] values = new int[num];

        for (int i = 0; i < num; i++){
            System.out.println("Enter value " + (i + 1) + ": ");
            values[i] = input.nextInt();
        }
        printer(values);

    }

    /*
     * Method return the date of the week for
     * the entered number of the week date.
     */

    public static void weekDay (int a) {
        switch (a) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }

    /*
     * Method takes specific amount of int inputs
     * and returns the count of positive, negative
     * numbers and zeros.
     */

    public static int[] counts(int[] a) {
        int[] result = new int[3];
        int countPos = 0;
        int countNeg = 0;
        int zeros = 0;
        for (int i = 0; i < a.length; i++){

            if (a[i] > 0) {
                countPos++;
            }
            else if (a[i] < 0) {
                countNeg++;
            }
            else{
                zeros++;
            }
        }
        result[0] = countPos;
        result[1] = countNeg;
        result[2] = zeros;
        return result; //or return new int[] {countPos, countNeg, zeros};
    }

    /*
     * Method prints the results of the
     * counts method.
     */

    public static void printer (int[] a) {
        a = counts(a);
        System.out.println("Number of positive integers is: " + a[0]);
        System.out.println("Number of negative integers is: " + a[1]);
        System.out.println("Number of zeros is: " + a[2]);
    }

}
