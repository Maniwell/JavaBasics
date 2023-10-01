package Lecture_2;

public class Assignment_2 {
    public static void main(String[] args) {
        /*
         * the program compares the age of three people
         * to determine who is the youngest.
         */
//        int a = 12;
//        int b = 50;
//        int c = 23;
//        if (a < b && a < c){
//            System.out.println("a is the youngest");
//        }
//        else if (b < a && b < c){
//            System.out.println("b is the youngest");
//        }
//        else {
//            System.out.println("c is the youngest");
//        }


        /*
         * the program prints the absolute value of
         * negative and positive inputs.
         */
//        int i = -9810;
//        if (i >= 0){
//            System.out.println("The absolute value of i = " + i);
//        }
//        else {
//            System.out.println("The absolute value of i = " + (-(i)));
//        }

        /*
         * the program determines is a student can sit for exam
         * based on their class attendance
         */
//        double tot_clss = 70;
//        double att = 71;
//        double per_att = ((att/tot_clss)*100);
//
//        System.out.println("The percentage of class attended is = " + per_att);
//
//        if (per_att >= 80 && per_att <= 100) {
//            System.out.println("Student can sit in exam.");
//        }
//        else if (per_att > 100) {
//            System.out.println("Error! total attended class more than classes held.");
//        }
//        else {
//            System.out.println("Student can not sit in exam.");
//        }

        /*
         * is a program that uses the switch case use to check
         * capital and small letters from a to f (A to F)
         */
        String letter = "";
        letter = "z";

        switch (letter){
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
                System.out.println("The letter is = " + letter);
                break;
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                System.out.println("The letter is = " + letter);
                break;
            default:
                System.out.println("Error! Invalid input. (Note: letters only a through f.)");
        }


    }
}
