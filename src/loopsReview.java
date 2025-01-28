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

            count++;
            sum += grade;
        }
    }
}