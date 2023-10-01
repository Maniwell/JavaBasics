package Lecture_5;

import java.util.Scanner;
public class MethodsExercise {
    public static void main (String[] args) {

        /*
         * Program takes 3 numbers from a user
         * to calculate and display their sum and average.
         * Program take inputs base and height of a triangle and
         * displays its area after calling printer method.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integer values: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        System.out.println("Enter the base and height of the triangle: ");
//        double s1 = input.nextDouble();
//        double s2 = input.nextDouble();

        int sumRes = smallest(num1,num2,num3);
        double aveRes = average(num1, num2, num3);

        System.out.println("The smallest number is: " + sumRes);
        System.out.println("The Average is: " + aveRes);
        printer(num1, num2, num3);

    }

    /*
     * Method  finds the smallest number among
     * three numbers.
     */
    public static int smallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        else if (b < a && b < c) {
            return b;
        }
        else {
            return c;
        }
    }

    /*
     * Method  finds the average of three numbers.
     */
   public static double average (int a, int b, int c) {
        double sum = (a + b + c);
        return sum/3;
    }

    /*
     * Method calculates the area of a triangle.
     */

//    static double triangle (double a, double b) {
//
//        return 0.5 * b * a;
//    }

    /*
     * Method print the results returned from the
     * method triangle.
     */
    public static void printer (double x, double y, double z) {
        double area = triangle(x, y, z);
        System.out.println(is_valid (x, y, z) ? "The area of the triangle is: " + area : "Invalid triangle dimensions.");
    }

    /*
     * Method to check if the dimensions of the triangle
     * are valid. (how? the sum of the of any two sides
     * must be greater than the third side.)
     */

    public static boolean is_valid (double x, double y, double z) {
        if (x + y > z && x + z > y && y + z > x) return true;
        else return false;
    }

    /*
     * Method calculates the area of a triangle from
     * given dimension of the three sides. (using the Heron's formula.)
     * s - is the semi-perimeter of the triangle.
     */
     public static double triangle(double x, double y, double z) {
        double s = (x + y + z)/2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        return area;
    }

}
