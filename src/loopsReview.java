package src;

import java.util.Scanner;

public class loopsReview {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double grade = 0;

        while(grade >= 0){
            System.out.println("Please enter a grade from 0 to 110 (Enter -1 to terminate)");
            grade = input.nextDouble();

            if(grade > 110){
                System.out.println("Invalid number, try again");
            }
            else{
                if(grade > -1) {
                    count++;
                    sum += grade;
                }
            }

        }
//        System.out.println("The average of all the grades is " + (sum/count));
        getLetterGrade(grade);
    }

    public static void getLetterGrade(double avg){
        String letterGrade = "";
        if(avg > 100){
        letterGrade = "A+";
        }
        else if((avg <= 100) && (avg >= 90)){
            letterGrade = "A";
        }
        else if((avg < 90) && (avg >= 80)){
            letterGrade = "B";
        }
        else if((avg < 80) && (avg >= 70)){
            letterGrade = "C";
        }
        else if((avg < 70) && (avg >= 60)){
            letterGrade = "D";
        }
        else if(avg < 60){
            letterGrade = "F";
        }

        System.out.println("The average grade is " + avg + ". This equates to the letter grade '" + letterGrade + "'");
    }
}