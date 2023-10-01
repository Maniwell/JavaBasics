package Lecture_2;

public class School_grading {
    public static void main(String[] args) {
        /*
         * Program grades students based on their results
         */

        int score = 39;
//        String grade = null;
//        switch (score/10){
//            case 10:
//            case 9:
//            case 8:
//                grade = "A";
//            //System.out.println("A");
//            break;
//            case 7:
//            case 6:
//                grade = "B";
//            //System.out.println("B");
//            break;
//            case 5:
//                grade = "C";
//            //System.out.println("C");
//            break;
//            case 4:
//                grade = "D";
//           // System.out.println("D");
//            break;
//            case 2:
//                grade = "E";
//          //  System.out.println("E");
//            break;
//            default:
//                grade = "F";
//           // System.out.println("F");
//        }
//        System.out.println("Grade " + grade);
        if (score >= 80){
            System.out.println("Grade = A");
        }
        else if (score >= 60){
            System.out.println("Grade = B");
        }
        else if (score >= 50){
            System.out.println("Grade = C");
        }
        else if (score >= 45){
            System.out.println("Grade = D");
        }
        else if (score >= 25 ){
            System.out.println("Grade = E");
        }
        else if (score >= 0 ){
            System.out.println("Grade = F");
        }
        else{
            System.out.println("NG");
        }
    }
}
