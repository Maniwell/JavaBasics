package Lecture_2;

public class Exercises_2 {
    public static void main(String[] args) {

        /*
         * Programs that write numbers from 1 - 10
         */

//        int n = 10;
//        for (int i = 1; i <= n; i++){
//            System.out.println(i);
//        }

//        int i = 1;
//        while (i <= n){
//            System.out.println(i);
//            i++;
//        }

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while(i <= n);

        /*
         * Program to calculate the sum of first 10 natural numbers
         */

//        int n = 10;
//        int sum = 0;
//        int i = 1;
//        for (i; i <= n; i++){
//            sum += i;
//        }
//        System.out.println("SUM = " + sum);

//        while (i <= n){
//            sum += i;
//            i++;
//        }
//        System.out.println("SUM = " + sum);

//        do {
//            sum += i;
//            i++;
//        } while (i <= n);
//        System.out.println("SUM = " + sum);

        /*
         * Program to find the factorial value of a number n.
         */

//        int n = 5;
//        int fact = 1;
//
//        for (int i = 1; i <= n; i++){
//            fact *= i;
//        }
//        System.out.printf("Factorial of %d = %d", n, fact);

//        int i = 1;
//        while (i <= n) {
//            fact *= i;
//            i++;
//        }
//        System.out.printf("Factorial of %d = %d", n, fact);

//        int i = 0;
//        do {
//            fact *= i;
//            i++;
//        } while (i <= n);
//        System.out.printf("Factorial of %d = %d", n, fact);

        /*
         * Program that finds the sum of numbers between 20 and 100.
         */

//        int n = 25;
//        int sum = 0;

//        for (int i = 100; i >= n; i--) {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);


//        int i = 100;
//        while (i >= n) {
//            sum += i;
//            i--;
//        }
//        System.out.println("Sum = " + sum);

//        int i = 100;
//        do {
//            sum += i;
//            i--;
//        } while (i >= n);
//        System.out.println("Sum = " + sum);

        /*
         * Program that finds th numbers between 1 and 100
         * that are divisible by 5.
         */

        int n = 100;

//        for (int i = 1; i <= n; i++) {
//            if (i%5 == 0){
//                System.out.printf("%d is divisible by 5 \n", i);
//            }
//        }

//        int i = 1;
//        while (i <= n) {
//            if (i%5 == 0){
//                System.out.printf("%d is divisible by 5 \n", i);
//            }
//            i++;
//        }

        int i = 1;
        do {
            if (i%5 == 0){
                System.out.printf("%d is divisible by 5 \n", i);
            }
            i++;
        } while (i <= n);
    }
}
