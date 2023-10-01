package Lecture_2;

public class Assignment_1 {
    public static void main (String[] args){
        /*
         * Question what is the value of num?
         * int num = 8*4-4/8-12*6
         *
         */
//        int num;
//        System.out.println("The value of num is = " + (num=(8*(4-4))/((8-12)*6)));

        /*
         * Question what is the value of res?
         * int x = 6, y = 4;
         * boolean res = !(12==x*y);
         *
         */
//        int x = 6, y = 4;
//        boolean res;
//        System.out.println("the value of res is " + (res = !(12 == x*y)));

        /*
         * Question what is the value of res?
         * boolean x = 9;
         * boolean res = (x < 6) && (x > 2)
         *
         */
//        int x = 6;
//        boolean res;
//        System.out.println("the value of res is " + (res = (x < 6) && (x > 2)));

        /*
         * Question what is the value of allCars?
         * blueCars = 8
         * greenCars = 12
         * allCars = greenCars++ + blueCars + ++greenCars
         */

        int blueCars = 8;
        int greenCars = 12;

        int allCars = greenCars++ + blueCars + ++greenCars;
        System.out.println("Value of allCars is " + allCars);
    }
}
